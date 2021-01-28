package com.development.demo.layer2;

import com.development.demo.layer1.Test;

import java.util.List;

public interface TestRepository {
    List<Test> getAllTests();
    Test getTest(int id);
    void addTest(Test test);
    String updateTest(Test test);
    String deleteTest(int id);
}
