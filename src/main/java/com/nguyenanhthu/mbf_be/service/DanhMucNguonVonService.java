package com.nguyenanhthu.mbf_be.service;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucNguonVon;

import java.util.List;

public interface DanhMucNguonVonService {
    DanhMucNguonVon saveDanhMucNguonVon(DanhMucNguonVon danhMucNguonVon);

    void saveListDanhMuc(List<DanhMucNguonVon> danhMucNguonVonList);
}
