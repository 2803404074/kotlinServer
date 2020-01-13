package com.tuhao.kt.demo.service

import com.tuhao.kt.demo.model.UserMo

interface LoginService {
    fun login(nickName:String,icon:String,loginType:String):UserMo
}