package com.nguyenanhthu.mbf_be.service;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucHinhThucLap;

import java.util.List;

public interface DanhMucHinhThucLapService {
    DanhMucHinhThucLap saveDanhMucHinhThucLap(DanhMucHinhThucLap danhMucHinhThucLap);

    void saveListDanhMuc(List<DanhMucHinhThucLap> danhMucHinhThucLapList);
}
