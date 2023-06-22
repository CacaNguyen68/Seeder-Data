package com.nguyenanhthu.mbf_be.service;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucChuSoHuuPhong;

import java.util.List;

public interface DanhMucChuSoHuuPhongService {
    DanhMucChuSoHuuPhong saveDanhMucChuSoHuuPhong(DanhMucChuSoHuuPhong danhMucChuSoHuuPhong);

    void saveListDanhMuc(List<DanhMucChuSoHuuPhong> danhMucChuSoHuuPhongList);
}
