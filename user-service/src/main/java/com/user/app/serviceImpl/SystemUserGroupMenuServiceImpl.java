package com.user.app.serviceImpl;

import com.user.app.entity.SystemUserGroupMenuEntity;
import com.user.app.repository.SystemUserGroupMenuRepo;
import com.user.app.service.SystemUserGroupMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemUserGroupMenuServiceImpl implements SystemUserGroupMenuService {

    @Autowired
    private SystemUserGroupMenuRepo systemUserGroupMenuRepo;

    @Override
    public List<SystemUserGroupMenuEntity> getSystemUserGroupMenus() {
        return systemUserGroupMenuRepo.findAll();
    };

}
