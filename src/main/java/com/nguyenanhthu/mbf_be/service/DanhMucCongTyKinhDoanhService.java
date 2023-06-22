package com.nguyenanhthu.mbf_be.service;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucCongTyKinhDoanh;

import java.util.List;

public interface DanhMucCongTyKinhDoanhService {
    DanhMucCongTyKinhDoanh saveDanhMucCongTyKinhDoanh(DanhMucCongTyKinhDoanh danhMucCongTyKinhDoanh);

    void saveListDanhMuc(List<DanhMucCongTyKinhDoanh> danhMucCongTyKinhDoanhList);
}
