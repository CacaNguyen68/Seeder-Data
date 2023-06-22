package com.nguyenanhthu.mbf_be.service.impl;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucTrangThaiDuAn;
import com.nguyenanhthu.mbf_be.repository.DanhMucTrangThaiDuAnRepository;
import com.nguyenanhthu.mbf_be.service.DanhMucTrangThaiDuAnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucTrangThaiDuAnServiceImpl implements DanhMucTrangThaiDuAnService {
    @Autowired
    private DanhMucTrangThaiDuAnRepository danhMucTrangThaiDuAnRepository;

    @Override
    public DanhMucTrangThaiDuAn saveDanhMucTrangThaiDuAn(DanhMucTrangThaiDuAn danhMucTrangThaiDuAn) {
        return danhMucTrangThaiDuAnRepository.save(danhMucTrangThaiDuAn);
    }

    @Override
    public void saveListDanhMuc(List<DanhMucTrangThaiDuAn> danhMucTrangThaiDuAnList) {
        danhMucTrangThaiDuAnRepository.saveAll(danhMucTrangThaiDuAnRepository.saveAll(danhMucTrangThaiDuAnList));
    }
}
