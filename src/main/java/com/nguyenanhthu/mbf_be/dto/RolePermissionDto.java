package com.nguyenanhthu.mbf_be.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RolePermissionDto {
    private String roleKey;
    private String permissions;
}
