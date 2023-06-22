package com.nguyenanhthu.mbf_be.service;


import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucLoaiCsht;

import java.util.List;

public interface DanhMucLoaiCshtService {
    DanhMucLoaiCsht saveDanhMucLoaiCsht(DanhMucLoaiCsht danhMucLoaiCsht);

    void saveListDanhMuc(List<DanhMucLoaiCsht> danhMucLoaiCshtList);
}
