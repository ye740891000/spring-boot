package com.jin.girl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author jzh
 * @date2017/11/21 0021下午 2:27
 */
public interface GirlRepository extends JpaRepository<Girl,Integer>{
    //通过年龄查询
    public List<Girl>findByAge(Integer age);
}
