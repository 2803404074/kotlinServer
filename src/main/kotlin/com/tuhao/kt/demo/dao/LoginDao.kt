package com.tuhao.kt.demo.dao

import com.tuhao.kt.demo.model.UserMo
import org.apache.ibatis.annotations.Mapper
import org.springframework.web.bind.annotation.Mapping

@Mapper
interface LoginDao {
    fun login(nickName:String,icon:String,loginType:String):UserMo
}