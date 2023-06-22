package com.nguyenanhthu.mbf_be.service;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucTinhTrangCsht;

import java.util.List;

public interface DanhMucTinhTrangCshtService {
    DanhMucTinhTrangCsht saveDanhMucTinhTrangCSHT(DanhMucTinhTrangCsht danhMucTinhTrangCsht);

    void saveListDanhMuc(List<DanhMucTinhTrangCsht> danhMucTinhTrangCshtList);
}
