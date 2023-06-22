package com.nguyenanhthu.mbf_be.service.impl;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucLoaiDuAn;
import com.nguyenanhthu.mbf_be.repository.DanhMucLoaiDuAnRepository;
import com.nguyenanhthu.mbf_be.service.DanhMucLoaiDuAnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucLoaiDuAnServiceImpl implements DanhMucLoaiDuAnService {

    @Autowired
    private DanhMucLoaiDuAnRepository danhMucLoaiDuAnRepository;

    @Override
    public DanhMucLoaiDuAn saveDanhMucLoaiSuAn(DanhMucLoaiDuAn danhMucLoaiDuAn) {
        return danhMucLoaiDuAnRepository.save(danhMucLoaiDuAn);
    }

    @Override
    public void saveListDanhMuc(List<DanhMucLoaiDuAn> danhMucLoaiDuAnList) {
        danhMucLoaiDuAnRepository.saveAll(danhMucLoaiDuAnList);
    }
}
