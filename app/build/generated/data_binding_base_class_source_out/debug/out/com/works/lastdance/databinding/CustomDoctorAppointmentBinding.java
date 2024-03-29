// Generated by view binder compiler. Do not edit!
package com.works.lastdance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.works.lastdance.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CustomDoctorAppointmentBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView rAppDDate;

  @NonNull
  public final TextView rAppDHour;

  @NonNull
  public final ImageView rAppDImg;

  @NonNull
  public final TextView rAppDName;

  @NonNull
  public final TextView rAppDNote;

  private CustomDoctorAppointmentBinding(@NonNull LinearLayout rootView,
      @NonNull TextView rAppDDate, @NonNull TextView rAppDHour, @NonNull ImageView rAppDImg,
      @NonNull TextView rAppDName, @NonNull TextView rAppDNote) {
    this.rootView = rootView;
    this.rAppDDate = rAppDDate;
    this.rAppDHour = rAppDHour;
    this.rAppDImg = rAppDImg;
    this.rAppDName = rAppDName;
    this.rAppDNote = rAppDNote;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomDoctorAppointmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomDoctorAppointmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.custom_doctor_appointment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomDoctorAppointmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.r_appDDate;
      TextView rAppDDate = ViewBindings.findChildViewById(rootView, id);
      if (rAppDDate == null) {
        break missingId;
      }

      id = R.id.r_appDHour;
      TextView rAppDHour = ViewBindings.findChildViewById(rootView, id);
      if (rAppDHour == null) {
        break missingId;
      }

      id = R.id.r_appDImg;
      ImageView rAppDImg = ViewBindings.findChildViewById(rootView, id);
      if (rAppDImg == null) {
        break missingId;
      }

      id = R.id.r_appDName;
      TextView rAppDName = ViewBindings.findChildViewById(rootView, id);
      if (rAppDName == null) {
        break missingId;
      }

      id = R.id.r_appDNote;
      TextView rAppDNote = ViewBindings.findChildViewById(rootView, id);
      if (rAppDNote == null) {
        break missingId;
      }

      return new CustomDoctorAppointmentBinding((LinearLayout) rootView, rAppDDate, rAppDHour,
          rAppDImg, rAppDName, rAppDNote);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
