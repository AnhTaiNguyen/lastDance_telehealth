import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.chatapp.adapter.ViewPagerAdapter
import com.google.firebase.auth.FirebaseAuth
import com.works.lastdance.R
import com.works.lastdance.chatapp.activity.ChatActivity
import com.works.lastdance.chatapp.ui.ChatFragment
import com.works.lastdance.databinding.ActivityChatBinding

class MainChatActivity : AppCompatActivity() {

    private var binding: ActivityChatBinding? = null
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

//        if (savedInstanceState == null) {
//            // If the savedInstanceState is null, it means it's the first time the activity is created
//            // So, add the ChatFragment
//            supportFragmentManager.beginTransaction()
//                .replace(R.id.recycleView, ChatFragment())
//                .commit()
//        }

        val fragmentArrayList = ArrayList<Fragment>()
        fragmentArrayList.add(ChatFragment())

        // Remove the lines related to ViewPager and ViewPagerAdapter

        // Assuming you have a TabLayout with id "tabs" in your layout
        // binding!!.tabs.setupWithViewPager(binding!!.viewPager)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.chat -> {
                // Handle the click on the "Chat" menu item
                startActivity(Intent(this, ChatActivity::class.java))
                return true
            }
            // Add other cases if needed

            else -> return super.onOptionsItemSelected(item)
        }
    }
}
