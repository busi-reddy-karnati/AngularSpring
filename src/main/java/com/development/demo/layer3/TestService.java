package com.development.demo.layer3;

import com.development.demo.layer1.Test;

import java.util.List;

public interface TestService {
    List<Test> getAllTestsService();
    List<Test> getTestService(int id);
    String updateTestService(Test test);
    String addTestService(Test test);
    String deleteTestService(int id);
}
