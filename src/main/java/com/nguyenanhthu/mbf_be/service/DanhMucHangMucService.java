package com.nguyenanhthu.mbf_be.service;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucHangMuc;

import java.util.List;

public interface DanhMucHangMucService {
    DanhMucHangMuc saveDanhMucHangMuc(DanhMucHangMuc danhMucHangMuc);

    void saveListDanhMuc(List<DanhMucHangMuc> danhMucHangMucList);
}
