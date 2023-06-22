package com.nguyenanhthu.mbf_be.service.impl;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucNguonVon;
import com.nguyenanhthu.mbf_be.repository.DanhMucNguonVonRepository;
import com.nguyenanhthu.mbf_be.service.DanhMucNguonVonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucNguonVonServiceImpl implements DanhMucNguonVonService {

    @Autowired
    private DanhMucNguonVonRepository danhMucNguonVonRepository;

    @Override
    public DanhMucNguonVon saveDanhMucNguonVon(DanhMucNguonVon danhMucNguonVon) {
        return danhMucNguonVonRepository.save(danhMucNguonVon);
    }

    @Override
    public void saveListDanhMuc(List<DanhMucNguonVon> danhMucNguonVonList) {
        danhMucNguonVonRepository.saveAll(danhMucNguonVonList);
    }
}
