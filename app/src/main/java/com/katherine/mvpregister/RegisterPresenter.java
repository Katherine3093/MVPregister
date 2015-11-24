package com.katherine.mvpregister;

/**
 * Created by katherine on 23/11/15.
 */
public class RegisterPresenter {
    private final MainActivity mMainActivity;
    private RegisterInteractor registerInteractor;
    private RegisterInteractorCallBack registerCallBack = new RegisterInteractorCallBack() {
        @Override
        public void onSuccess(boolean registered) {
            mMainActivity.showRegistered(registered);
        }
    };

    public RegisterPresenter(MainActivity mainActivity) {
        mMainActivity = mainActivity;
        registerInteractor = new RegisterInteractor();


    }

    public void register(String name, String email, String password, String passwordRepeat) {
        registerInteractor.register(name, email, password, passwordRepeat, registerCallBack);

    }
}
