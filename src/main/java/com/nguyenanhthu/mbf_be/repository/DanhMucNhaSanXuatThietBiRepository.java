package com.nguyenanhthu.mbf_be.repository;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucNhaSanXuatThietBi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DanhMucNhaSanXuatThietBiRepository extends JpaRepository<DanhMucNhaSanXuatThietBi, Long> {
}
