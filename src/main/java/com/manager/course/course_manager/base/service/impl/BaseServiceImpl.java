package com.manager.course.course_manager.base.service.impl;

import com.manager.course.course_manager.base.Base;
import com.manager.course.course_manager.base.repository.BaseRepo;
import com.manager.course.course_manager.base.service.BaseService;

import java.io.Serializable;

public class BaseServiceImpl<T extends Base<ID>,
        ID extends Serializable,R extends BaseRepo<T,ID>> implements BaseService<T,ID> {
    protected final R baseRepo;

    public BaseServiceImpl(R baseRepo) {
        this.baseRepo = baseRepo;
    }
}
