package com.firewizapp;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;

public class LoginSignupController {

    @FXML
    private Button loginButton;
    @FXML
    private Button signupButton;
    @FXML
    private Hyperlink guestLink;

    @FXML
    private void handleLogin() {
        System.out.println("Login button clicked");
        try {
            App.setRoot("login");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    private void handleSignup() {
        try {
            App.setRoot("signup");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleGuestLogin() {
        try {
            App.setRoot("homepage");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
