package com.cse27.foodbee.Controller;

import android.widget.Toast;

import androidx.annotation.NonNull;

import com.cse27.foodbee.Model.LoginModel;
import com.cse27.foodbee.View.LoginViewInterface;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginController implements LoginControllerInterface{

    LoginViewInterface loginView;
    public FirebaseAuth loginAuth;

    public LoginController(LoginViewInterface loginView) {
        this.loginView = loginView;
    }

    @Override
    public void onLogin(String email, String password) {
        LoginModel loginModel= new LoginModel(email, password);
        int loginCode = loginModel.isLoginValid();
        if (loginCode == 0){
            loginView.onLoginError("Please Enter Email");
        }else if (loginCode == 1){
            loginView.onLoginError("Please Enter Valid Email");
        }else if (loginCode == 2){
            loginView.onLoginError("Please Enter Password");
        }else if (loginCode == 3){
            loginView.onLoginError("Password Should Be More Than 6 Characters");
        }else {
            loginAuth = FirebaseAuth.getInstance();
            loginAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        loginView.onLoginSuccess("Login Successful");
                    } else {
                        loginView.onLoginError("Wrong Password or Email");
                    }
                }
            });
        }
    }
}
