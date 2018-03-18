package josim74.github.com.mvplogin.login;

import android.os.Handler;
import android.text.TextUtils;


/**
 * Created by JosimUddin on 14/03/2018.
 */

public class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void login(String username, String password, final onLoginFinishedListener listener) {
        if (TextUtils.isEmpty(username)) {
            listener.onUserNameError();
        } else if (TextUtils.isEmpty(password)) {
            listener.onPasswordError();
        } else if (username.equals("admin") && password.equals("12345")) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    listener.onSuccess();
                }
            }, 3000);
        }else {
            listener.onFailure("Invalid Credentials");
        }
    }
}
