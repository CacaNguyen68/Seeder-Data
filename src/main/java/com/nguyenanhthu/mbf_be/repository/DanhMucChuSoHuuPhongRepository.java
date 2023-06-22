package com.nguyenanhthu.mbf_be.repository;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucChuSoHuuPhong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DanhMucChuSoHuuPhongRepository extends JpaRepository<DanhMucChuSoHuuPhong, Long> {
}
