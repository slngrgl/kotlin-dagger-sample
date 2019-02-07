package com.sg.kotlindaggersample.ui.login

import com.sg.kotlindaggersample.ui.base.BasePresenterImpl

/**
 * Created by Selin on 6.02.2019.
 */
class LoginPresenterImpl(private var loginView: LoginView) : BasePresenterImpl(loginView), LoginPresenter {

    override fun login(phone: String?, password: String?) {
       // TODO : call login service
    }

    // TODO : login response
//    override fun onResponse(response: Response, request: Request) {
//        super.onResponse(response, request)
//        if (request.`is`(ServiceConstants.LOGIN)) {
//            val userResponse = response.data as UserResponse? ?: return
//            loginView?.resultLogin(user)
//        }
//    }
}