package com.sg.flavorsample.ui.login

import com.sg.flavorsample.data.model.User
import com.sg.flavorsample.ui.base.BaseView

/**
 * Created by Selin on 6.02.2019.
 */
interface LoginView: BaseView {

    fun resultLogin(user: User?)
}