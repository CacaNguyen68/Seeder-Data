package com.nguyenanhthu.mbf_be.service.impl;

import com.nguyenanhthu.mbf_be.dto.RolePermissionDto;
import com.nguyenanhthu.mbf_be.model.Permission;
import com.nguyenanhthu.mbf_be.model.Role;
import com.nguyenanhthu.mbf_be.repository.PermissionRepository;
import com.nguyenanhthu.mbf_be.repository.RoleRepository;
import com.nguyenanhthu.mbf_be.service.PermissionService;
import com.nguyenanhthu.mbf_be.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PermissionService permissionService;

    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void saveListRole(List<Role> roleList) {
        roleRepository.saveAll(roleList);
    }

    @Override
    public Role addPermission(List<RolePermissionDto> rolePermissionDtoList) {
        Role role = roleRepository.findRoleByRoleKey(rolePermissionDtoList.get(0).getRoleKey());
        String[] permissionArray = rolePermissionDtoList.get(0).getPermissions().split(",");
        Set<String> permissionSet = new HashSet<>(Arrays.asList(permissionArray));
        Set<Permission> permissionList = permissionRepository.findByPermissionKeyIn(permissionSet);
        if (role != null) {
            role.setPermissions(permissionList);
        }
        return roleRepository.save(role);
    }
}
