package com.tuhao.kt.demo

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.tuhao.kt.demo"])
@MapperScan("com.tuhao.kt.demo.dao")
class DemoApplication
fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
