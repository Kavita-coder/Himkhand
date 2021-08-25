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
import android.widget.Toast;

import com.example.himkhand.ChooseArtists;
import com.example.himkhand.MainActivity;
import com.example.himkhand.R;

public class SignUpActivity extends AppCompatActivity {
      EditText edt_signup_email, edt_signup_pass, edt_username, edt_mobile;
      TextView tv_email_valid, tv_pass_valid, tv_username_valid, tv_mobile_valid, skipSignUp,signIn;
      Button btn_sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //This method will cover the entire Screen.

        edt_signup_email = findViewById(R.id.edit_text_email);
        edt_signup_pass = findViewById(R.id.edit_pwd_signup);
        edt_username = findViewById(R.id.editTextUserName);
        edt_mobile = findViewById(R.id.editTextMobile);
        btn_sign = findViewById(R.id.btn_signup);
        tv_email_valid = findViewById(R.id.tv_valid_email_signup);
        tv_pass_valid = findViewById(R.id.tv_valid_pass_signup);
        tv_username_valid = findViewById(R.id.tv_valid_username);
        tv_mobile_valid = findViewById(R.id.tv_valid_mobile);
        skipSignUp = findViewById(R.id.tv_skip_signUp);
        signIn = findViewById(R.id.tv_sign_in);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
            }
        });


        skipSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUpActivity.this, ChooseArtists.class));
            }
        });


        btn_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (validateusername() && validateemail() && validatemobile() && validatepassword()){
                   startActivity(new Intent(SignUpActivity.this, MainActivity.class));
                   finish();
               }else {
                   Toast.makeText(SignUpActivity.this, "Something went Wrong", Toast.LENGTH_SHORT).show();
               }
            }
        });
    }
    private Boolean validatepassword(){
        String password = edt_signup_pass.getText().toString().trim();
//        String password_Val = "^" +
//                "(?=.*[a-zA-Z])" +       //any letter
//                "(?=.*[@#$%^&+=])" +    // at least 1 special character
//                "(?=\\S+$)" +          // no white spaces
//                ".{4,}" +            // at least 4 characters
//                "$";

        if (password.isEmpty()){
            tv_pass_valid.setText("Password Filed can't be Empty");
            return false;
        }
        //else if (!password.matches(password_Val)){
          //  tv_pass_valid.setText("Password is too weak");
          //  return false;
       // }
            return true;
        }

    private Boolean validateemail(){
        String email = edt_signup_email.getText().toString().trim();
        String email_pattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";   // email pattern

        if (email.isEmpty()){
            tv_email_valid.setText("Email Filed can't be empty");
            return false;
        }else if (!email.matches(email_pattern)){
            tv_email_valid.setText("Email does not match the pattern");
            return  false;
        }
        return true;
    }

    private Boolean validateusername(){
        String username = edt_username.getText().toString().trim();
        String noWhiteSpace = "\\A\\w{4,20}\\z";

        if (username.isEmpty()){
            tv_username_valid.setText("Username Field can't be Empty");
            return false;
        }else if (username.length()>15){
            tv_username_valid.setText("Username too long");
            return false;
        }else if (!username.matches(noWhiteSpace)) {
            tv_username_valid.setText("White Spaces are not allowed");
            return false;
        }
        return true;
    }
    private  Boolean validatemobile(){
        String mobile = edt_mobile.getText().toString().trim();
       // String mobile_pattern = "^[+]?[0-9]{10,13}$";   //13 Digits

        if (mobile.isEmpty()) {
            tv_mobile_valid.setText("Mobile Field can't be Empty");
            return false;

       }else if (mobile.length() != 10){
            tv_mobile_valid.setText("Mobile Number length should be 10 digits only");
            return false;
        }
        return true;
   }
    public void ShowHide(View view) {
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
}