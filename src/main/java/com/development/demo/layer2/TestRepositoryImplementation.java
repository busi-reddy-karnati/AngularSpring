package com.development.demo.layer2;

import com.development.demo.layer1.Test;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
@Repository
public class TestRepositoryImplementation implements TestRepository{
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<Test> getAllTests() {
        Query query = entityManager.createQuery(" from Test");
        List<Test> testList;
        testList = query.getResultList();
        return testList;
    }

    @Override
    public List<Test> getTest(int id) {
        return null;
    }

    @Override
    public String addTest(Test test) {
        return null;
    }

    @Override
    public String updateTest(Test test) {
        return null;
    }

    @Override
    public String deleteTest(int id) {
        return null;
    }
}
