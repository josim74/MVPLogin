package josim74.github.com.mvplogin.login;

/**
 * Created by JosimUddin on 14/03/2018.
 */

public interface LoginView {

    void showProgress();
    void hideProgress();
    void setUserNameError();
    void setPasswordError();
    void navigateToMainActivity();
    void showAlert(String message);

}
