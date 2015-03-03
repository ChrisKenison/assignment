package controllers;
import com.sofi.models.dao.UserDao;

import org.springframework.beans.factory.annotation.Autowired;

import models.LegacyLoginForm;
import org.springframework.transaction.annotation.Transactional;
import play.Logger;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.auth.login;

@Transactional
@org.springframework.stereotype.Controller
public class Authentication extends Controller {

    @Autowired
    private UserDao userDao;


    public Result get() {
        // Going to hard code user is NOT logged in.
        boolean loggedIn = false;

        if (userDao != null) {
            Logger.debug("Creating user");
//            User user = userDao.createUser("chriskenison");
//                                           "ckension@sofi.org",
//                                           "password1");
        }
        else {
            Logger.debug("Did not create user. userDao is null.");
        }

        // If logged in
        if (loggedIn){
            return redirect(routes.Application.get());
        } else {
            Logger.info("Starting Login");
            return ok(login.render(Form.form(LegacyLoginForm.class)));
        }
    }

    public Result legacyLogin() {
        return redirect(routes.Application.get());
    }

}

