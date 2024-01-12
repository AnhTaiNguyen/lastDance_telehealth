package com.works.lastdance.doctor


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.bumptech.glide.Glide
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.works.lastdance.MainActivity
import com.works.lastdance.R
import com.works.lastdance.doctor.models.DoctorData

class DoctorProfileActivity : AppCompatActivity() {
    lateinit var txtDName: TextView
    lateinit var txtDSurname: TextView
    lateinit var txtDAge: TextView
    lateinit var txtDEmail: TextView
    lateinit var txtDField: TextView
    lateinit var btnDeleteDAccount: Button
    lateinit var btnEditProfile: Button
    lateinit var imgDoctorProfile : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_profile)

        val db = FirebaseFirestore.getInstance()
        val user = FirebaseAuth.getInstance().currentUser

        txtDName = findViewById(R.id.txtDName)
        txtDSurname = findViewById(R.id.txtDSurname)
        txtDAge = findViewById(R.id.txtDAge)
        txtDEmail = findViewById(R.id.txtDEmail)
        txtDField = findViewById(R.id.txtDField)
        btnDeleteDAccount = findViewById(R.id.btnDeleteAccount)
        btnEditProfile = findViewById(R.id.btnEditProfile)
        imgDoctorProfile = findViewById(R.id.imgDoctorProfilePicture)

        if (user != null) {
            db.collection("doctors").document(user.email!!)
                .get()
                .addOnSuccessListener { document ->
                    if (document != null) {
                        val doctorData = document.toObject(DoctorData::class.java)
                        if (doctorData != null) {
                            txtDName.text = "İsminiz: " + doctorData.first ?: "N/A"
                            txtDSurname.text = "Soyisminiz: " + doctorData.last ?: "N/A"
                            txtDAge.text = "Yaşınız: " + doctorData.age ?: "N/A"
                            txtDEmail.text = "Emailiniz: " + doctorData.email ?: "N/A"
                            txtDField.text = "Uzmanlık Alanınız: " + doctorData.field?: "N/A"
                            Glide.with(this).load(doctorData.image).into(imgDoctorProfile)
                        }
                    } else {
                        Log.d("DocumentSnapshot", "No such document")
                    }
                }.addOnFailureListener { exception ->
                    Log.d("get failed with ", exception.message.toString())
                }
        }

        btnDeleteDAccount.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle(
                        "Delete the account")
                .setMessage("Are you sure you want to delete your account?")
                .setPositiveButton("Yes") { _, _ ->

                    val user = FirebaseAuth.getInstance().currentUser
                    user?.delete()
                        ?.addOnCompleteListener { task ->
                            if (task.isSuccessful) {
                                Log.d(
                                    "FirebaseAuth",
                                    "The user account has been deleted."
                                )
                                val db = FirebaseFirestore.getInstance()
                                db.collection("doctors")
                                    .document(user.email!!)
                                    .delete()
                                    .addOnSuccessListener {
                                        Log.d(
                                            "Firestore",
                                            "\n" +
                                                    "The document has been deleted successfully!"
                                        )
                                    }
                                    .addOnFailureListener { e ->
                                        Log.w(
                                            "Firestore",
                                            "An error",
                                            e
                                        )
                                    }

                                val intent = Intent(this, MainActivity::class.java)
                                startActivity(intent)
                                finish()
                            } else {

                                Log.w(
                                    "Firestore",
                                    "An error",
                                    task.exception
                                )
                            }
                        }
                }
                .setNegativeButton("No", null)
                .show()
        }

        btnEditProfile.setOnClickListener {
            val intent = Intent(this, DoctorProfileEditActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onResume() {
        super.onResume()

        updateData()
    }

    private fun updateData() {
        val userEmail = FirebaseAuth.getInstance().currentUser?.email
        val db = FirebaseFirestore.getInstance()

        db.collection("doctors")
            .document(userEmail!!)
            .get()
            .addOnSuccessListener { document ->
                if (document != null && document.exists()) {
                    val doctorData = document.toObject(DoctorData::class.java)

                    txtDName.text = "First: ${doctorData?.first}"
                    txtDSurname.text = "Last: ${doctorData?.last}"
                    txtDAge.text = "Age: ${doctorData?.age}"
                    txtDEmail.text = "Email: ${doctorData?.email}"
                    txtDField.text = "Profession: ${doctorData?.field}"
                }
            }
            .addOnFailureListener { e ->
                Log.e("Firestore", "Error getting doctor data: ${e.message}", e)
            }
    }
}
