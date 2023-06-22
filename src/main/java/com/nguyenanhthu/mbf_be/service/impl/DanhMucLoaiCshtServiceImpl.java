package com.nguyenanhthu.mbf_be.service.impl;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucLoaiCsht;
import com.nguyenanhthu.mbf_be.repository.DanhMucLoaiCshtRepository;
import com.nguyenanhthu.mbf_be.service.DanhMucLoaiCshtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucLoaiCshtServiceImpl implements DanhMucLoaiCshtService {

    @Autowired
    private DanhMucLoaiCshtRepository danhMucLoaiCshtRepository;

    @Override
    public DanhMucLoaiCsht saveDanhMucLoaiCsht(DanhMucLoaiCsht danhMucLoaiCsht) {
        return danhMucLoaiCshtRepository.save(danhMucLoaiCsht);
    }

    @Override
    public void saveListDanhMuc(List<DanhMucLoaiCsht> danhMucLoaiCshts) {
        danhMucLoaiCshtRepository.saveAll(danhMucLoaiCshts);
    }
}
