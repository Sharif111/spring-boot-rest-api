package com.user.app.serviceImpl;

import com.user.app.entity.SystemGroupEntity;
import com.user.app.repository.SystemGroupRepo;
import com.user.app.service.SystemGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemGroupServiceImpl implements SystemGroupService {

    @Autowired
    private SystemGroupRepo systemGroupRepo;

    @Override
    public List<SystemGroupEntity> getSystemGroups() {
        return systemGroupRepo.findAll();
    };
}
