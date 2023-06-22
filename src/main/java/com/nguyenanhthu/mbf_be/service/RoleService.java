package com.nguyenanhthu.mbf_be.service;

import com.nguyenanhthu.mbf_be.dto.RolePermissionDto;
import com.nguyenanhthu.mbf_be.model.Permission;
import com.nguyenanhthu.mbf_be.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
    Role saveRole(Role role);

    void saveListRole(List<Role> roleList);

    Role addPermission(List<RolePermissionDto> rolePermissionDtoList);

}
