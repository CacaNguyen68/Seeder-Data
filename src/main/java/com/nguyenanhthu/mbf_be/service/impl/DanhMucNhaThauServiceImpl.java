package com.nguyenanhthu.mbf_be.service.impl;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucNhaThau;
import com.nguyenanhthu.mbf_be.repository.DanhMucNhaThauRepository;
import com.nguyenanhthu.mbf_be.service.DanhMucNhaThauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucNhaThauServiceImpl implements DanhMucNhaThauService {
    @Autowired
    private DanhMucNhaThauRepository danhMucNhaThauRepository;


    @Override
    public DanhMucNhaThau saveDanhMucNhaThau(DanhMucNhaThau danhMucNhaThau) {
        return danhMucNhaThauRepository.save(danhMucNhaThau);
    }

    @Override
    public void saveListDanhMuc(List<DanhMucNhaThau> danhMucNhaThauList) {
        danhMucNhaThauRepository.saveAll(danhMucNhaThauList);
    }
}
