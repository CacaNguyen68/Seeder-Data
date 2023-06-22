package com.nguyenanhthu.mbf_be.service;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucNhaSanXuatThietBi;

import java.util.List;

public interface DanhMucNhaSanXuatThietBiService {
    DanhMucNhaSanXuatThietBi saveDanhMucNhaSanXuatThietBi(DanhMucNhaSanXuatThietBi danhMucNhaSanXuatThietBi);

    void saveListDanhMuc(List<DanhMucNhaSanXuatThietBi> danhMucNhaSanXuatThietBiList);
}
