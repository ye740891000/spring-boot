package com.jin.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;
//    @RequestMapping(value ={"/hello","/hi"},method = RequestMethod.GET)
//    @RequestMapping(value = "/say/{id}",method = RequestMethod.GET)
//    @RequestMapping(value = "/say",method = RequestMethod.GET)
    @GetMapping(value = "/say")

//    public String say(@PathVariable("id")Integer id){
    public String say(@RequestParam(value = "id",required = false,defaultValue = "0")Integer myId){
//        return "index";
//        return girlProperties.getCupSize();
        return "id:"+myId;
    }
}
