package com.development.demo.layer2;

import com.development.demo.layer1.Test;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
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
    public Test getTest(int id) {

        String queryString = "select t from Test t where t.id ="+id;
        List<Test> testList = entityManager.createQuery(queryString).getResultList();
        return testList.get(0);
    }

    @Transactional//Adding this is important for persist
    public void addTest(Test test) {
        entityManager.persist(test);
    }

    @Transactional
    public String updateTest(Test test) {
        entityManager.merge(test);
        return "success";
    }

    @Transactional
    public String deleteTest(int id) {
        try {
            Test test = entityManager.find(Test.class,id);
            entityManager.remove(test);
            return "Success";
        }
        catch (Exception e){
            return "fail";
        }
    }
}
