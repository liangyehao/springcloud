package com.liang.service;

import com.liang.pojo.Dept;

import java.util.List;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/3/7 11:22
 * @content
 */
public interface DeptService {

    /**
     * 添加
     *
     * @param dept 部门
     * @return boolean
     */
    int add(Dept dept);

    /**
     * 得到
     *
     * @param id id
     * @return {@link Dept}
     */
    Dept get(Integer id);


    /**
     * 列表
     *
     * @return {@link List<Dept>}
     */
    List<Dept> list();
}
