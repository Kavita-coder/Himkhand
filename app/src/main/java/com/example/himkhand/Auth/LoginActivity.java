package com.example.himkhand.Auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.himkhand.ChooseArtists;
import com.example.himkhand.MainActivity;
import com.example.himkhand.R;

public class LoginActivity extends AppCompatActivity {
  EditText edt_email, edt_pass;
  TextView textview_sign_up, textview_forgot, tv_validEmail, tv_validPass, skipLogin ;
  Button btn_create_accnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        edt_email = findViewById(R.id.edit_text_email);
        edt_pass = findViewById(R.id.edit_pass);
        btn_create_accnt = findViewById(R.id.btn_login);
        textview_sign_up = findViewById(R.id.tv_sign_up);
        textview_forgot =findViewById(R.id.tv_forget);
        tv_validEmail =findViewById(R.id.tv_valid_email);
        tv_validPass =findViewById(R.id.tv_valid_pass);
        skipLogin =findViewById(R.id.tv_login_skip);

        skipLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, ChooseArtists.class));
            }
        });

        textview_forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, ForgotPasswordActivity.class));
            }
        });

        textview_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
            }
        });

        btn_create_accnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              if (validateemail() && validatepassword()){
                  startActivity(new Intent(LoginActivity.this, MainActivity.class));
                  finish();
              }else {
                 // Toast.makeText(LoginActivity.this, "Email or Password is Wrong", Toast.LENGTH_LONG).show();

              }
            }
        });
    }
    private Boolean validatepassword(){
        String password = edt_pass.getText().toString().trim();
//        String password_Val = "^" +
//                "(?=.*[a-zA-Z])" +       //any letter
//                "(?=.*[@#$%^&+=])" +    // at least 1 special character
//                "(?=\\S+$)" +          // no white spaces
//                ".{4,}" +            // at least 4 characters
//                "$";

        if (password.isEmpty()){
            tv_validPass.setText("Password Field can't be Empty");
            return false;
        }
//        else if (!password.matches(password_Val)){
//            tv_validPass.setText("Password is too weak");
//            return false;
//        }
            return true;
        }

    private Boolean validateemail(){
        String email = edt_email.getText().toString().trim();
        String email_pattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";   // email pattern

        if (email.isEmpty()){
            tv_validEmail.setText("Email Field Can't be Empty");
            return false;
        }else if (!email.matches(email_pattern)){
            tv_validEmail.setText("Invalid email address");
            return false;
        }
        return true;
    }

    public void ShowHidePass(View view) {
        EditText editText_password;
        editText_password = findViewById(R.id.edit_pass);

        if (view.getId() == R.id.show_pass_btn) {

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

