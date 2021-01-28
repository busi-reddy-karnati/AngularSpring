package com.development.demo.layer3;

import com.development.demo.layer1.Test;
import com.development.demo.layer2.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestServiceImplementation implements TestService{
    @Autowired
    TestRepository testRepository;
    @Override
    public List<Test> getAllTestsService() {
        return testRepository.getAllTests();
    }

    @Override
    public Test getTestService(int id) {

        return testRepository.getTest(id);
    }

    @Override
    public String updateTestService(Test test) {
        try{
            return testRepository.updateTest(test);
        }
        catch(Exception e){
            return "fail";
        }

    }

    @Override
    public void addTestService(Test test) {
        testRepository.addTest(test);
    }

    @Override
    public String deleteTestService(int id) {
        testRepository.deleteTest(id);
        return null;
    }
}
