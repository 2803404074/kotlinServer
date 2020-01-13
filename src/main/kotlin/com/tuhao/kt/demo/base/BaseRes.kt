package com.tuhao.kt.demo.base

import org.omg.CORBA.Object
import java.io.Serializable

class BaseRes<T> :Serializable{
    var code:Int = 0
    var data :T ?=null
    var msg:String

    constructor(code:Int,data:T,msg:String){
        this.code = code
        this.data = data
        this.msg = msg
    }

    companion object{
        val MSG_SUCCESS = "success"
        val MSG_FAIL = "error"
        fun success(data:Any): BaseRes<*> {
            return BaseRes(0, data,MSG_SUCCESS)
        }

        fun error(errMsg:String):BaseRes<Any>{
            return BaseRes(0, errMsg,MSG_FAIL)
        }
    }
}

