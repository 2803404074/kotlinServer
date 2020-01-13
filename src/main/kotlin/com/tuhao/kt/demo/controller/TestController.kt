package com.tuhao.kt.demo.controller

import com.tuhao.kt.demo.base.BaseRes
import com.tuhao.kt.demo.model.UserMo
import com.tuhao.kt.demo.service.LoginService
import org.omg.CORBA.Object
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import kotlin.math.log

@RestController

@RequestMapping(value = ["/api"])
class TestController {
    @Autowired
    lateinit var loginService:LoginService

    @PostMapping(value = ["/login"])
    fun hellow(@RequestParam(name = "nickName")nickName:String,
               @RequestParam(name = "icon")icon:String,
               @RequestParam(name = "loginType")loginType:String): BaseRes<*> {

        println("请求++++++++++++++++++")

        return BaseRes.success( loginService.login(nickName,icon, loginType))
    }

}