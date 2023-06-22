package com.nguyenanhthu.mbf_be.service;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucHuyen;
import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucTinh;

import java.util.List;

public interface DanhMucHuyenService {
    DanhMucHuyen saveDanhMucHuyen(DanhMucHuyen danhMucHuyen);

    void saveListDanhMuc(List<DanhMucHuyen> danhMucHuyenList);
}
