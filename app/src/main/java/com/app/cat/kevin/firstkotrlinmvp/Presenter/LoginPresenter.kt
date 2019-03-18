package com.app.cat.kevin.firstkotrlinmvp.Presenter

import com.app.cat.kevin.firstkotrlinmvp.Model.User
import com.app.cat.kevin.firstkotrlinmvp.View.ILoginView

class LoginPresenter(internal var iLoginView: ILoginView): ILoginPresenter {

    override fun onLogin(email: String, password: String) {
        val user = User(email, password)
        val isLoginSuccess = user.isDataValid

        if(isLoginSuccess)
            iLoginView.onLoginResult("success")
        else
            iLoginView.onLoginResult("error")
    }
}