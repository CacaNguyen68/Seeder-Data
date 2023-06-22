package com.nguyenanhthu.mbf_be.service;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucLoaiPhong;

import java.util.List;

public interface DanhMucLoaiPhongService {
    DanhMucLoaiPhong saveDanhMucLoaiPhong(DanhMucLoaiPhong danhMucLoaiPhong);

    void saveListDanhMuc(List<DanhMucLoaiPhong> danhMucLoaiPhongList);
}
