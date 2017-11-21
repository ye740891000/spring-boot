package com.jin.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author jzh
 * @date2017/11/21 0021下午 2:24
 */
@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;


    //查询所有
    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }

     //添加
    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestParam("cupSize")String cupSize,
                          @RequestParam("age")Integer age){
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);

        return girlRepository.save(girl);
    }

    //查询一个
    @GetMapping(value = "/girls/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id){
        return girlRepository.findOne(id);
    }
    //更新
    @PutMapping(value = "/girls/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id,
                           @RequestParam("cupSize") String cupSize,
                            @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);

       return girlRepository.save(girl);
    }
    //删除
    @DeleteMapping(value = "/girls/{id}")
    public void girlDelete(@PathVariable("id")Integer id){
        girlRepository.delete(id);
    }
    //通过age查询
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl>girlListByAge(@PathVariable("age")Integer age){
        return girlRepository.findByAge(age);
    }


    @PostMapping(value = "/girls/two")
    public void girlTwo(){
        girlService.insertTwo();
    }
}
