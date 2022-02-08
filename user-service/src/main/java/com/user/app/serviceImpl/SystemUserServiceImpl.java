package com.user.app.serviceImpl;

import com.user.app.entity.SystemUserEntity;
import com.user.app.repository.SystemUserRepo;
import com.user.app.service.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemUserServiceImpl implements SystemUserService {

    @Autowired
    private SystemUserRepo systemUserRepo;

    @Override
    public List<SystemUserEntity> getSystemUsers() {
        return systemUserRepo.findAll();
    };
}
