package com.nguyenanhthu.mbf_be.repository;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucTinhTrangCsht;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DanhMucTinhTrangCshtRepository extends JpaRepository<DanhMucTinhTrangCsht, Long> {
}
