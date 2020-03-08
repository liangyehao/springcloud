package com.liang.controller;

import com.liang.pojo.Dept;
import com.liang.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/3/7 11:35
 * @content
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/add")
    public int add(@RequestBody Dept dept){
        return deptService.add(dept);
    }


    @GetMapping("/get/{id}")
    public Dept get(@PathVariable("id") Integer id){
        return deptService.get(id);
    }


    @GetMapping("/list")
    public List<Dept> list(){
        return deptService.list();
    }

    @GetMapping("/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        System.out.println("微服务列表:"+services);
        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOULD-DEPT");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getServiceId() + "\t"
                    + instance.getHost() + "\t" + instance.getPort() + "\t"
                    + instance.getUri());
        }
        return this.discoveryClient;
    }
}
