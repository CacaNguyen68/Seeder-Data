package com.nguyenanhthu.mbf_be.service.impl;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucNhaSanXuatThietBi;
import com.nguyenanhthu.mbf_be.repository.DanhMucNhaSanXuatThietBiRepository;
import com.nguyenanhthu.mbf_be.service.DanhMucNhaSanXuatThietBiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucNhaSanXuatThietBiServiceImpl implements DanhMucNhaSanXuatThietBiService {
    @Autowired
    private DanhMucNhaSanXuatThietBiRepository danhMucNhaSanXuatThietBiRepository;

    @Override
    public DanhMucNhaSanXuatThietBi saveDanhMucNhaSanXuatThietBi(DanhMucNhaSanXuatThietBi danhMucNhaSanXuatThietBi) {
        return danhMucNhaSanXuatThietBiRepository.save(danhMucNhaSanXuatThietBi);
    }

    @Override
    public void saveListDanhMuc(List<DanhMucNhaSanXuatThietBi> danhMucNhaSanXuatThietBiList) {
        danhMucNhaSanXuatThietBiRepository.saveAll(danhMucNhaSanXuatThietBiList);
    }
}
