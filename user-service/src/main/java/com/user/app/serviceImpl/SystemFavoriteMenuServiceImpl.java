package com.user.app.serviceImpl;

import com.user.app.entity.SystemFavoriteMenuEntity;
import com.user.app.repository.SystemFavoriteMenuRepo;
import com.user.app.service.SystemFavoriteMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemFavoriteMenuServiceImpl implements SystemFavoriteMenuService {

    @Autowired
    private SystemFavoriteMenuRepo systemFavoriteMenuRepo;

    @Override
    public List<SystemFavoriteMenuEntity> getSystemFavoriteMenus() {

        return systemFavoriteMenuRepo.findAll();
    }
}
