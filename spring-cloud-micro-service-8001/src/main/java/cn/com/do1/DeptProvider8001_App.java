package cn.com.do1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Classname cn.com.do1.DeptProvider8001_App
 * @Description TODO
 * @DAte 2019/10/15 20:45
 * Created by linminrui
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8001_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_App.class);
    }
}
