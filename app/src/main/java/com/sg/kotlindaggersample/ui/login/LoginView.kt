package com.sg.kotlindaggersample.ui.login

import com.sg.kotlindaggersample.data.model.User
import com.sg.kotlindaggersample.ui.base.BaseView

/**
 * Created by Selin on 6.02.2019.
 */
interface LoginView: BaseView {

    fun resultLogin(user: User?)
}