package com.nguyenanhthu.mbf_be.service;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucDonViTrienKhai;

import java.util.List;

public interface DanhMucDonViTrienKhaiService {
    DanhMucDonViTrienKhai saveDanhMucDonViTrienKhai(DanhMucDonViTrienKhai danhMucDonViTrienKhai);

    void saveListDanhMuc(List<DanhMucDonViTrienKhai> danhMucDonViTrienKhaiList);
}
