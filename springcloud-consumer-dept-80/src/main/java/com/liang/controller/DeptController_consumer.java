package com.liang.controller;

import com.liang.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/3/7 14:33
 * @content
 */
@RestController
public class DeptController_consumer {

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/get/{id}")
    public Dept get(@PathVariable("id") Integer id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/" + id, Dept.class);
    }

    @PostMapping("/consumer/add/")
    public Boolean add(@RequestBody Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add/", dept, Boolean.class);
    }

    @GetMapping("/consumer/list")
    public List list(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }

}
