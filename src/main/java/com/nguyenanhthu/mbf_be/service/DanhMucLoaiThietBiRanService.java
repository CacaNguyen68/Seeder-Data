package com.nguyenanhthu.mbf_be.service;


import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucLoaiThietBiRan;

import java.util.List;

public interface DanhMucLoaiThietBiRanService {
    DanhMucLoaiThietBiRan saveDanhMucLoaiThietBiRan(DanhMucLoaiThietBiRan danhMucLoaiThietBiRan);

    void saveListDanhMuc(List<DanhMucLoaiThietBiRan> danhMucLoaiThietBiRanList);
}
