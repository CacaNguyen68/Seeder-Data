package com.nguyenanhthu.mbf_be.repository;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucLoaiThietBiRan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DanhMucLoaiThietBiRanRepository extends JpaRepository<DanhMucLoaiThietBiRan, Long> {
}
