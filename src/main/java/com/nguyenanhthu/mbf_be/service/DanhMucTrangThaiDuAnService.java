package com.nguyenanhthu.mbf_be.service;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucTrangThaiDuAn;

import java.util.List;

public interface DanhMucTrangThaiDuAnService {
    DanhMucTrangThaiDuAn saveDanhMucTrangThaiDuAn(DanhMucTrangThaiDuAn danhMucTrangThaiDuAn);

    void saveListDanhMuc(List<DanhMucTrangThaiDuAn> danhMucTrangThaiDuAnList);
}
