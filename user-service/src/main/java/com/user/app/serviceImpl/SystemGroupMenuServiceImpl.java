package com.user.app.serviceImpl;

import com.user.app.entity.SystemGroupMenuEntity;
import com.user.app.repository.SystemGroupMenuRepo;
import com.user.app.service.SystemGroupMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemGroupMenuServiceImpl implements SystemGroupMenuService {

    @Autowired
    private SystemGroupMenuRepo systemGroupMenuRepo;

    @Override
    public List<SystemGroupMenuEntity> getSystemGroupMenus() {
        return systemGroupMenuRepo.findAll();
    };
}
