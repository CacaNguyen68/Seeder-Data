package com.nguyenanhthu.mbf_be.service.impl;

import com.nguyenanhthu.mbf_be.model.Permission;
import com.nguyenanhthu.mbf_be.repository.PermissionRepository;
import com.nguyenanhthu.mbf_be.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    public PermissionServiceImpl(PermissionRepository permissionRepository) {
        super();
        this.permissionRepository = permissionRepository;
    }

    @Override
    public Permission savePermission(Permission permission) {
        return permissionRepository.save(permission);
    }

    @Override
    public void saveListPermisson(List<Permission> permissionList) {
        permissionRepository.saveAll(permissionList);
    }

    @Override
    public Set<Permission> findAllByPermissionKeyIn(Set<String> keyList) {
        return permissionRepository.findByPermissionKeyIn(keyList);
    }

}
