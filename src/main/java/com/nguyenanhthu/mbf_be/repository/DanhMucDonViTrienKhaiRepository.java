package com.nguyenanhthu.mbf_be.repository;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucDonViTrienKhai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DanhMucDonViTrienKhaiRepository extends JpaRepository<DanhMucDonViTrienKhai, Long> {
}
