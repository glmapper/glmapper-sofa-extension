package com.glmapper.bridge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/2/13 11:03 AM
 * @since:
 **/
@SpringBootApplication
@ImportResource(locations= {"classpath:META-INF/spring/web-home.xml"})
public class SOFABootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SOFABootApplication.class,args);
    }
}
