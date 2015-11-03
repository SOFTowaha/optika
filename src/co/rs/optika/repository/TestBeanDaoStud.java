package co.rs.optika.repository;

import co.rs.optika.model.TestBean;

import java.util.ArrayList;
import java.util.List;

public class TestBeanDaoStud implements TestBeanDao {
    @Override
    public List<TestBean> findAll() {
        List<TestBean> result = new ArrayList<>();
        for (int i = 1; i < 120; i++) {
            result.add(new TestBean(i, "Test" + i, i * 10.1));
        }
        return result;
    }
}
