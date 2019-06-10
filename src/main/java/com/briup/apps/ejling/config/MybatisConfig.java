package com.briup.apps.ejling.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.briup.apps.ejling.dao")
public class MybatisConfig {

}
