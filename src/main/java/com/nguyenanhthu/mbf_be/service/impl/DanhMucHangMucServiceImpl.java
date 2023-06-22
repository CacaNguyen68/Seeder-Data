package com.nguyenanhthu.mbf_be.service.impl;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucHangMuc;
import com.nguyenanhthu.mbf_be.repository.DanhMucHangMucRepository;
import com.nguyenanhthu.mbf_be.service.DanhMucHangMucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucHangMucServiceImpl implements DanhMucHangMucService {

    @Autowired
    private DanhMucHangMucRepository danhMucHangMucRepository;

    @Override
    public DanhMucHangMuc saveDanhMucHangMuc(DanhMucHangMuc danhMucHangMuc) {
        return danhMucHangMucRepository.save(danhMucHangMuc);
    }

    @Override
    public void saveListDanhMuc(List<DanhMucHangMuc> danhMucHangMucList) {
        danhMucHangMucRepository.saveAll(danhMucHangMucList);
    }
}
