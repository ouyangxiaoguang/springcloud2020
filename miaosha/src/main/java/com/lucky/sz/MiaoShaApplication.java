package com.lucky.sz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Serializable;

/**
 * @FileName: MiaoShaApplication.java
 * @description:
 * @author: 欧阳小广
 * @Date: 2021-03-01
 **/
@SpringBootApplication
public class MiaoShaApplication implements Serializable {

    public static void main(String[] args) {
        SpringApplication.run(MiaoShaApplication.class, args);
    }
}
