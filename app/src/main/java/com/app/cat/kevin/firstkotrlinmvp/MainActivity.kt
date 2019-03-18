 package com.app.cat.kevin.firstkotrlinmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.cat.kevin.firstkotrlinmvp.Presenter.ILoginPresenter
import com.app.cat.kevin.firstkotrlinmvp.Presenter.LoginPresenter
import com.app.cat.kevin.firstkotrlinmvp.View.ILoginView
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_main.*

 class MainActivity : AppCompatActivity(), ILoginView {
     override fun onLoginResult(message: String) {
         //Toasty.info(this, message, Toasty.LENGTH_LONG).show()
     }

     internal lateinit var loginPresenter: ILoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginPresenter = LoginPresenter(this)

        buttonSend.setOnClickListener {
            loginPresenter.onLogin(email = emailEdt.text.toString(), password = passwordEdt.text.toString())
        }
    }
}
