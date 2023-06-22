package com.nguyenanhthu.mbf_be.service;

import com.nguyenanhthu.mbf_be.model.Permission;

import java.util.List;
import java.util.Set;

public interface PermissionService {
    Permission savePermission(Permission permission);

    void saveListPermisson(List<Permission> permissionList);

    Set<Permission> findAllByPermissionKeyIn(Set<String> keyList);
}
