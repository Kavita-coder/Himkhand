package com.example.himkhand.Auth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.himkhand.R;

public class SetNewPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_new_password);
    }

    public void Showpassword(View view) {
            EditText editText_password;
            editText_password = findViewById(R.id.edit_pwd_signup);

            if (view.getId() == R.id.btn_show_pass) {

                if (editText_password.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
                    ((ImageView) (view)).setImageResource(R.drawable.eye_open);

                    //Show Password
                    editText_password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                } else {
                    ((ImageView) (view)).setImageResource(R.drawable.eye_close);

                    //Hide Password
                    editText_password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
        }

    public void ShowHidePass(View view) {
        EditText editText_password;
        editText_password = findViewById(R.id.edit_pwd);

        if (view.getId() == R.id.btn_showpass) {

            if (editText_password.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
                ((ImageView) (view)).setImageResource(R.drawable.eye_open);

                //Show Password
                editText_password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            } else {
                ((ImageView) (view)).setImageResource(R.drawable.eye_close);

                //Hide Password
                editText_password.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }
}