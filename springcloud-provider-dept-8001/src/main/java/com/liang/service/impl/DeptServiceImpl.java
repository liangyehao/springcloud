package com.liang.service.impl;

import com.liang.mapper.DeptMapper;
import com.liang.pojo.Dept;
import com.liang.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/3/7 11:24
 * @content
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    /**
     * 添加
     *
     * @param dept 部门
     * @return boolean
     */
    @Override
    public int add(Dept dept) {
        return deptMapper.insert(dept);
    }

    /**
     * 得到
     *
     * @param id id
     * @return {@link Dept}
     */
    @Override
    public Dept get(Integer id) {
        return deptMapper.selectByPrimaryKey(id);
    }

    /**
     * 列表
     *
     * @return {@link List <Dept>}
     */
    @Override
    public List<Dept> list() {
        return deptMapper.selectAll();
    }
}
