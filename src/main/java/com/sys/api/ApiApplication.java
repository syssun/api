package com.sys.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {

        SpringApplication.run(ApiApplication.class, args);

//        ConfigurableApplicationContext context =
//
//                SpringApplication.run(ApiApplication.class, args);
//
//        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
//
//        List<Map<String, Object>> result =
//
//                jdbcTemplate.queryForList("SELECT * FROM USER");
//
//        System.out.println(result);


    }

}
