package cn.com.do1.controller;

import cn.com.do1.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Classname DeptController_Consumer
 * @Description TODO
 * @DAte 2019/10/15 21:15
 * Created by linminrui
 */
@RestController
public class DeptController_Consumer {

    private static final String REST_URL_PREFIX = "http://127.0.0.1:8001";


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @RequestMapping(value = "consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @RequestMapping(value = "consumer/dept/list")
    public List<Dept> get( ){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }


}
