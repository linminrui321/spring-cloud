package cn.com.do1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Classname DeptConsumer80_App
 * @Description TODO
 * @DAte 2019/10/15 21:29
 * Created by linminrui
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DeptConsumer80_App {
    public static void main(String[] args) {

        SpringApplication.run(DeptConsumer80_App.class);
    }
}
