package com.nguyenanhthu.mbf_be.service;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucChuSoHuuBe;

import java.util.List;

public interface DanhMucChuSoHuuBeService {
    DanhMucChuSoHuuBe saveDanhMucChuSoHuuBe(DanhMucChuSoHuuBe danhMucChuSoHuuBe);

    void saveListDanhMuc(List<DanhMucChuSoHuuBe> danhMucChuSoHuuBeList);
}
