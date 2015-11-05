package co.rs.optika.repository.testBean;

import co.rs.optika.model.TestBean;

import java.util.List;

public interface TestBeanDao {
    List<TestBean> findAll();
}
