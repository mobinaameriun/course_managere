package com.manager.course.course_manager.base.repository;

import com.manager.course.course_manager.base.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.io.Serializable;

@Repository
@Transactional
public interface BaseRepo<T extends Base<ID>, ID extends Serializable> extends CrudRepository<T, ID> {


}
