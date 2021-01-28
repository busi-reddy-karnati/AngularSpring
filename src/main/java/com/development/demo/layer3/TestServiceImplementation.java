package com.development.demo.layer3;

import com.development.demo.layer1.Test;
import com.development.demo.layer2.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestServiceImplementation implements TestService{
    @Autowired
    TestRepository testRepository;
    @Override
    public List<Test> getAllTestsService() {
        return testRepository.getAllTests();
    }

    @Override
    public List<Test> getTestService(int id) {
        return null;
    }

    @Override
    public String updateTestService(Test test) {
        return null;
    }

    @Override
    public String addTestService(Test test) {
        return null;
    }

    @Override
    public String deleteTestService(int id) {
        return null;
    }
}
