package com.nguyenanhthu.mbf_be.repository;

import com.nguyenanhthu.mbf_be.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findRoleByRoleKey(String roleKey);
}
