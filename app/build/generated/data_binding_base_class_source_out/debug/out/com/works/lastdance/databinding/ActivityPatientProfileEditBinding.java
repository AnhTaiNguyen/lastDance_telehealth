// Generated by view binder compiler. Do not edit!
package com.works.lastdance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
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

public final class ActivityPatientProfileEditBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnSaveChanges;

  @NonNull
  public final EditText editNewPassword;

  @NonNull
  public final EditText editOldPassword;

  @NonNull
  public final EditText editPAge;

  @NonNull
  public final EditText editPName;

  @NonNull
  public final EditText editPSurname;

  @NonNull
  public final ImageView imgPatientProfilePicture;

  @NonNull
  public final TextView txtFooter;

  private ActivityPatientProfileEditBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnSaveChanges, @NonNull EditText editNewPassword,
      @NonNull EditText editOldPassword, @NonNull EditText editPAge, @NonNull EditText editPName,
      @NonNull EditText editPSurname, @NonNull ImageView imgPatientProfilePicture,
      @NonNull TextView txtFooter) {
    this.rootView = rootView;
    this.btnSaveChanges = btnSaveChanges;
    this.editNewPassword = editNewPassword;
    this.editOldPassword = editOldPassword;
    this.editPAge = editPAge;
    this.editPName = editPName;
    this.editPSurname = editPSurname;
    this.imgPatientProfilePicture = imgPatientProfilePicture;
    this.txtFooter = txtFooter;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPatientProfileEditBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPatientProfileEditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_patient_profile_edit, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPatientProfileEditBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSaveChanges;
      Button btnSaveChanges = ViewBindings.findChildViewById(rootView, id);
      if (btnSaveChanges == null) {
        break missingId;
      }

      id = R.id.editNewPassword;
      EditText editNewPassword = ViewBindings.findChildViewById(rootView, id);
      if (editNewPassword == null) {
        break missingId;
      }

      id = R.id.editOldPassword;
      EditText editOldPassword = ViewBindings.findChildViewById(rootView, id);
      if (editOldPassword == null) {
        break missingId;
      }

      id = R.id.editPAge;
      EditText editPAge = ViewBindings.findChildViewById(rootView, id);
      if (editPAge == null) {
        break missingId;
      }

      id = R.id.editPName;
      EditText editPName = ViewBindings.findChildViewById(rootView, id);
      if (editPName == null) {
        break missingId;
      }

      id = R.id.editPSurname;
      EditText editPSurname = ViewBindings.findChildViewById(rootView, id);
      if (editPSurname == null) {
        break missingId;
      }

      id = R.id.imgPatientProfilePicture;
      ImageView imgPatientProfilePicture = ViewBindings.findChildViewById(rootView, id);
      if (imgPatientProfilePicture == null) {
        break missingId;
      }

      id = R.id.txtFooter;
      TextView txtFooter = ViewBindings.findChildViewById(rootView, id);
      if (txtFooter == null) {
        break missingId;
      }

      return new ActivityPatientProfileEditBinding((ConstraintLayout) rootView, btnSaveChanges,
          editNewPassword, editOldPassword, editPAge, editPName, editPSurname,
          imgPatientProfilePicture, txtFooter);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
