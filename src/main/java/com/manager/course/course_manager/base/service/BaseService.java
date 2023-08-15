package com.manager.course.course_manager.base.service;

import com.manager.course.course_manager.base.Base;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public interface BaseService<T extends Base<ID>,ID extends Serializable> {
}
