package com.nguyenanhthu.mbf_be.service;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucTinhTrangKyHopDongThueTram;

import java.util.List;

public interface DanhMucTinhTrangKyHopDongThueTramService {
    DanhMucTinhTrangKyHopDongThueTram saveDanhMucTinhTrangKyHopDongThueTram(DanhMucTinhTrangKyHopDongThueTram danhMucTinhTrangKyHopDongThueTram);

    void saveListDanhMuc(List<DanhMucTinhTrangKyHopDongThueTram> danhMucTinhTrangKyHopDongThueTramList);
}
