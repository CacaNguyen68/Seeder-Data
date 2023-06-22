package com.nguyenanhthu.mbf_be.repository;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucCongTyKinhDoanh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DanhMucCongTyKinhDoanhRepository extends JpaRepository<DanhMucCongTyKinhDoanh, Long>{
}
