package com.nguyenanhthu.mbf_be.service.impl;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucHuyen;
import com.nguyenanhthu.mbf_be.repository.DanhMucHuyenRepository;
import com.nguyenanhthu.mbf_be.service.DanhMucHuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucHuyenServiceImpl implements DanhMucHuyenService {
    @Autowired
    private DanhMucHuyenRepository danhMucHuyenRepository;

    @Override
    public DanhMucHuyen saveDanhMucHuyen(DanhMucHuyen danhMucHuyen) {
        return danhMucHuyenRepository.save(danhMucHuyen);
    }

    @Override
    public void saveListDanhMuc(List<DanhMucHuyen> danhMucHuyenList) {
        danhMucHuyenRepository.saveAll(danhMucHuyenList);
    }
}
