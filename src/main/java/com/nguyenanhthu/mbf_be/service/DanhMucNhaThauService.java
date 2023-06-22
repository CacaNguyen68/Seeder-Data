package com.nguyenanhthu.mbf_be.service;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucNhaThau;

import java.util.List;

public interface DanhMucNhaThauService {
    DanhMucNhaThau saveDanhMucNhaThau(DanhMucNhaThau danhMucNhaThau);

    void saveListDanhMuc(List<DanhMucNhaThau> danhMucNhaThauList);
}
