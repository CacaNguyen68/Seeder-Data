package com.nguyenanhthu.mbf_be.service.impl;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucTinhTrangCsht;
import com.nguyenanhthu.mbf_be.repository.DanhMucTinhTrangCshtRepository;
import com.nguyenanhthu.mbf_be.service.DanhMucTinhTrangCshtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucTinhTrangCshtServiceImpl implements DanhMucTinhTrangCshtService {

    @Autowired
    private DanhMucTinhTrangCshtRepository danhMucTinhTrangCshtRepository;

    @Override
    public DanhMucTinhTrangCsht saveDanhMucTinhTrangCSHT(DanhMucTinhTrangCsht danhMucTinhTrangCsht) {
        return danhMucTinhTrangCshtRepository.save(danhMucTinhTrangCsht);
    }

    @Override
    public void saveListDanhMuc(List<DanhMucTinhTrangCsht> danhMucTinhTrangCshtList) {
        danhMucTinhTrangCshtRepository.saveAll(danhMucTinhTrangCshtList);
    }
}
