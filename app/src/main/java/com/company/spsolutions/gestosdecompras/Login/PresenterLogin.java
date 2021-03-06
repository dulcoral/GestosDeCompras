package com.company.spsolutions.gestosdecompras.Login;
/**
 * Created by coralRodriguez on 27/03/19.
 */

public interface PresenterLogin {
    void displayEmailError(String error);
    void displayPasswordError(String error);
    void displaySigninError(String error);
    void displayLoader(boolean loader);
    void successLogin();
}
