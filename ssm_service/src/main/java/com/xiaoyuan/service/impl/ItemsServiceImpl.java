package com.xiaoyuan.service.impl;

import com.xiaoyuan.dao.ItemsDao;
import com.xiaoyuan.domain.Items;
import com.xiaoyuan.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
