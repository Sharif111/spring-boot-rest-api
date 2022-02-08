package com.user.app.serviceImpl;

import com.user.app.entity.SystemMenuEntity;
import com.user.app.repository.SystemMenuRepo;
import com.user.app.service.SystemMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemMenuServiceImpl implements SystemMenuService {

    @Autowired
    private SystemMenuRepo systemMenuRepo;

    @Override
    public List<SystemMenuEntity> getSystemMenus() {
        return systemMenuRepo.findAll();
    };
}
