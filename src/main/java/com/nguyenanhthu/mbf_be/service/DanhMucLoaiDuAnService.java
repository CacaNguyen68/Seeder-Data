package com.nguyenanhthu.mbf_be.service;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucLoaiDuAn;

import java.util.List;

public interface DanhMucLoaiDuAnService {
    DanhMucLoaiDuAn saveDanhMucLoaiSuAn(DanhMucLoaiDuAn danhMucLoaiDuAn);

    void saveListDanhMuc(List<DanhMucLoaiDuAn> danhMucLoaiDuAnList);
}
