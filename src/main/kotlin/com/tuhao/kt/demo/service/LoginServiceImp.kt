package com.tuhao.kt.demo.service

import com.tuhao.kt.demo.dao.LoginDao
import com.tuhao.kt.demo.model.UserMo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service("LoginService")
class LoginServiceImp : LoginService{
    @Autowired
    lateinit var loginDao:LoginDao

    override fun login(nickName: String, icon: String, loginType: String): UserMo {
        return  loginDao.login(nickName,icon,loginType)
    }
}