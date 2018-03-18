package josim74.github.com.mvplogin.login;

/**
 * Created by JosimUddin on 14/03/2018.
 */

public interface LoginPresenter {

    void validateCred(String userName, String password);
    void onDestroy();
}
