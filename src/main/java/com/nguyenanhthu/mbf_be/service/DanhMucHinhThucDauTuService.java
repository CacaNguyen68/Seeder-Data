package com.nguyenanhthu.mbf_be.service;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucHinhThucDauTu;

import java.util.List;


public interface DanhMucHinhThucDauTuService{
    DanhMucHinhThucDauTu saveDanhMucHinhThucDauTu(DanhMucHinhThucDauTu danhMucHinhThucDauTu);

    void saveListDanhMuc(List<DanhMucHinhThucDauTu> danhMucHinhThucDauTuList);
}
