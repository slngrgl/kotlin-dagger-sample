package com.sg.kotlindaggersample.ui.login

import android.os.Bundle
import android.widget.Toast
import com.sg.kotlindaggersample.R
import com.sg.kotlindaggersample.data.model.User
import com.sg.kotlindaggersample.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject

/**
 * Created by Selin on 6.02.2019.
 */
class LoginActivity: BaseActivity(), LoginView {

    @Inject
    lateinit var presenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        btn_login.setOnClickListener { presenter.login("111111", "11111") }
    }

    override fun resultLogin(user: User?) {
        Toast.makeText(this, "Welcome " + user?.FirstName, Toast.LENGTH_LONG).show()
    }

    override fun getLayoutId(): Int = R.layout.activity_login

}