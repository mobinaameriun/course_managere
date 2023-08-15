package com.manager.course.course_manager.base.repository;

import com.manager.course.course_manager.base.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.io.Serializable;


@Transactional
public interface BaseRepo<T extends Base<ID>, ID extends Serializable> extends JpaRepository<T, ID> {


}
