package com.nguyenanhthu.mbf_be.service.impl;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucTinhTrangKyHopDongThueTram;
import com.nguyenanhthu.mbf_be.repository.DanhMucTinhTrangKyHopDongThueTramRepository;
import com.nguyenanhthu.mbf_be.service.DanhMucTinhTrangKyHopDongThueTramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucTinhTrangKyHopDongThueTramServiceImpl implements DanhMucTinhTrangKyHopDongThueTramService {

    @Autowired
    private DanhMucTinhTrangKyHopDongThueTramRepository danhMucTinhTrangKyHopDongThueTramRepository;

    @Override
    public DanhMucTinhTrangKyHopDongThueTram saveDanhMucTinhTrangKyHopDongThueTram(DanhMucTinhTrangKyHopDongThueTram danhMucTinhTrangKyHopDongThueTram) {
        return danhMucTinhTrangKyHopDongThueTramRepository.save(danhMucTinhTrangKyHopDongThueTram);
    }

    @Override
    public void saveListDanhMuc(List<DanhMucTinhTrangKyHopDongThueTram> danhMucTinhTrangKyHopDongThueTramList) {
        danhMucTinhTrangKyHopDongThueTramRepository.saveAll(danhMucTinhTrangKyHopDongThueTramList);
    }
}
