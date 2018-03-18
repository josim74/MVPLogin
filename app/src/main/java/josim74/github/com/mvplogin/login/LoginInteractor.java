package josim74.github.com.mvplogin.login;

/**
 * Created by JosimUddin on 14/03/2018.
 */

public interface LoginInteractor {
    interface onLoginFinishedListener{
        void onUserNameError();
        void onPasswordError();
        void onSuccess();
        void onFailure(String message);
    }

    void login(String username, String password, onLoginFinishedListener listener);
}
