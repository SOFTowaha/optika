package co.rs.optika.repository;

import co.rs.optika.model.TestBean;

import java.util.List;

/**
 * Created by dejan.tadic on 11/3/2015.
 */
public interface TestBeanDao {
    List<TestBean> selectAll();
}
