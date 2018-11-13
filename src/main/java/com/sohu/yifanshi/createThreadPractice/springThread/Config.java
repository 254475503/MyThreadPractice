package com.sohu.yifanshi.createThreadPractice.springThread;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration//申明这是一个配置文件类
@ComponentScan("com.sohu.yifanshi.createThreadPractice.springThread")
@EnableAsync//支持异步执行
public class Config {
}
