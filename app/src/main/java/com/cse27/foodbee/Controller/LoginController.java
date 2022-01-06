package com.cse27.foodbee.Controller;

import com.cse27.foodbee.Model.LoginModel;
import com.cse27.foodbee.View.LoginViewInterface;

public class LoginController implements LoginControllerInterface{

    LoginViewInterface loginView;

    public LoginController(LoginViewInterface loginView) {

        this.loginView = loginView;
    }

    @Override
    public void onLogin(String email, String password) {
        LoginModel loginModel= new LoginModel(email, password);
        int loginCode = loginModel.isValid();
        if (loginCode == 0){
            loginView.onLoginError("Please Enter Email");
        }else if (loginCode == 1){
            loginView.onLoginError("Please Enter Valid Email");
        }else if (loginCode == 2){
            loginView.onLoginError("Please Enter Password");
        }else if (loginCode == 3){
            loginView.onLoginError("Password Should Be More Than 6 Characters");
        }else{



            loginView.onLoginSuccess("Login Successful");
        }


    }
}
