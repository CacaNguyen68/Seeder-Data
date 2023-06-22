package com.nguyenanhthu.mbf_be.service;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucLoaiCsht;
import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucTinh;

import java.util.List;

public interface DanhMucTinhService {
    DanhMucTinh saveDanhMucTinh(DanhMucTinh danhMucTinh);

    void saveListDanhMuc(List<DanhMucTinh> danhMucTinhList);
}
