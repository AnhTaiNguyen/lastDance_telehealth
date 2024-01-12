// Generated by view binder compiler. Do not edit!
package com.works.lastdance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.works.lastdance.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDoctorRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton btnRDocConfirm;

  @NonNull
  public final Spinner spinnerField;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView txtFooter;

  @NonNull
  public final EditText txtRDoctorAge;

  @NonNull
  public final EditText txtRDoctorEmail;

  @NonNull
  public final EditText txtRDoctorName;

  @NonNull
  public final EditText txtRDoctorPassword;

  @NonNull
  public final EditText txtRDoctorSurname;

  private ActivityDoctorRegisterBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton btnRDocConfirm, @NonNull Spinner spinnerField,
      @NonNull TextView textView2, @NonNull TextView txtFooter, @NonNull EditText txtRDoctorAge,
      @NonNull EditText txtRDoctorEmail, @NonNull EditText txtRDoctorName,
      @NonNull EditText txtRDoctorPassword, @NonNull EditText txtRDoctorSurname) {
    this.rootView = rootView;
    this.btnRDocConfirm = btnRDocConfirm;
    this.spinnerField = spinnerField;
    this.textView2 = textView2;
    this.txtFooter = txtFooter;
    this.txtRDoctorAge = txtRDoctorAge;
    this.txtRDoctorEmail = txtRDoctorEmail;
    this.txtRDoctorName = txtRDoctorName;
    this.txtRDoctorPassword = txtRDoctorPassword;
    this.txtRDoctorSurname = txtRDoctorSurname;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDoctorRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDoctorRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_doctor_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDoctorRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnRDocConfirm;
      ImageButton btnRDocConfirm = ViewBindings.findChildViewById(rootView, id);
      if (btnRDocConfirm == null) {
        break missingId;
      }

      id = R.id.spinnerField;
      Spinner spinnerField = ViewBindings.findChildViewById(rootView, id);
      if (spinnerField == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.txtFooter;
      TextView txtFooter = ViewBindings.findChildViewById(rootView, id);
      if (txtFooter == null) {
        break missingId;
      }

      id = R.id.txtRDoctorAge;
      EditText txtRDoctorAge = ViewBindings.findChildViewById(rootView, id);
      if (txtRDoctorAge == null) {
        break missingId;
      }

      id = R.id.txtRDoctorEmail;
      EditText txtRDoctorEmail = ViewBindings.findChildViewById(rootView, id);
      if (txtRDoctorEmail == null) {
        break missingId;
      }

      id = R.id.txtRDoctorName;
      EditText txtRDoctorName = ViewBindings.findChildViewById(rootView, id);
      if (txtRDoctorName == null) {
        break missingId;
      }

      id = R.id.txtRDoctorPassword;
      EditText txtRDoctorPassword = ViewBindings.findChildViewById(rootView, id);
      if (txtRDoctorPassword == null) {
        break missingId;
      }

      id = R.id.txtRDoctorSurname;
      EditText txtRDoctorSurname = ViewBindings.findChildViewById(rootView, id);
      if (txtRDoctorSurname == null) {
        break missingId;
      }

      return new ActivityDoctorRegisterBinding((ConstraintLayout) rootView, btnRDocConfirm,
          spinnerField, textView2, txtFooter, txtRDoctorAge, txtRDoctorEmail, txtRDoctorName,
          txtRDoctorPassword, txtRDoctorSurname);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
