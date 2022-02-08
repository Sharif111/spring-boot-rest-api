package com.user.app.serviceImpl;

import com.user.app.entity.SystemRecentMenuEntity;
import com.user.app.repository.SystemRecentMenuRepo;
import com.user.app.service.SystemRecentMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemRecentMenuServiceImpl implements SystemRecentMenuService {

    @Autowired
    private SystemRecentMenuRepo systemRecentMenuRepo;

    @Override
    public List<SystemRecentMenuEntity> getSystemRecentMenus(){
        return systemRecentMenuRepo.findAll();
    };
}
