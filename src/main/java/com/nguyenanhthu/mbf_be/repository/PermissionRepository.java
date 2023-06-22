package com.nguyenanhthu.mbf_be.repository;

import com.nguyenanhthu.mbf_be.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;


@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {
    Set<Permission> findByPermissionKeyIn(Set<String> listPermission);
}
