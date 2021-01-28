package com.development.demo.layer4;

import com.development.demo.layer1.Test;
import com.development.demo.layer3.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TestController {
    @Autowired
    TestService testService;
    @RequestMapping("/getTests")
    @ResponseBody
    @CrossOrigin
    public List<Test> getAllTests(){
        List<Test> testList = (List<Test>) testService.getAllTestsService();
        return testList;
    }

    @PostMapping(path = "/addTest")
    @ResponseBody
    @CrossOrigin
    public String addTest(@RequestBody Test test){
        try {
            testService.addTestService(test);
            return "success";
        }
        catch (Exception e){
            return "fail";
        }
    }
}
