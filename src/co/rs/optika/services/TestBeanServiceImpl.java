package co.rs.optika.services;

import co.rs.optika.model.TestBean;
import co.rs.optika.repository.TestBeanDao;

import java.util.List;

public class TestBeanServiceImpl implements TestBeanService {

    private TestBeanDao testBeanDao;

    public TestBeanServiceImpl(){}

    public void setTestBeanDao(TestBeanDao testBeanDao) {
        this.testBeanDao = testBeanDao;
    }

    public List<TestBean> findAll(){
        return testBeanDao.findAll();
    }
}
