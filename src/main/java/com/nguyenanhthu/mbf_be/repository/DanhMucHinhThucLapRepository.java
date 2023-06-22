package com.nguyenanhthu.mbf_be.repository;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucHinhThucLap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DanhMucHinhThucLapRepository extends JpaRepository<DanhMucHinhThucLap, Long> {
}
