package com.itheima.service.impl;

import com.itheima.dao.CheckItemDao;
import com.itheima.entity.Result;
import com.itheima.pojo.CheckItem;
import com.itheima.service.CheckItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CheckItemServiceImpl implements CheckItemService {
    @Autowired
    private CheckItemDao checkItemDao;
    @Transactional
    @Override
    public void add(CheckItem checkItem) {
        checkItemDao.add(checkItem);
    }
}
