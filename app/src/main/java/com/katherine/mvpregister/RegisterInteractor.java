package com.katherine.mvpregister;


/**
 * Created by katherine on 23/11/15.
 */
public class RegisterInteractor {
    public void register(String name, String email, String password, String passwordRepeat, RegisterInteractorCallBack registerCallBack) {

        if (name.equals("")) {

            registerCallBack.onSuccess(false);

        } else if (!password.equals(passwordRepeat)) {
            registerCallBack.onSuccess(false);
        } else {
            registerCallBack.onSuccess(true);
        }

    }
}
