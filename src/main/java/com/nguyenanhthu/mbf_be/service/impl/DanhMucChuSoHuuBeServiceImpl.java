package com.nguyenanhthu.mbf_be.service.impl;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucChuSoHuuBe;
import com.nguyenanhthu.mbf_be.repository.DanhMucChuSoHuuBeRepository;
import com.nguyenanhthu.mbf_be.service.DanhMucChuSoHuuBeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucChuSoHuuBeServiceImpl implements DanhMucChuSoHuuBeService {
    @Autowired
    private DanhMucChuSoHuuBeRepository danhMucChuSoHuuBeRepository;

    @Override
    public DanhMucChuSoHuuBe saveDanhMucChuSoHuuBe(DanhMucChuSoHuuBe danhMucChuSoHuuBe) {
        return danhMucChuSoHuuBeRepository.save(danhMucChuSoHuuBe);
    }

    @Override
    public void saveListDanhMuc(List<DanhMucChuSoHuuBe> danhMucChuSoHuuBeList) {
        danhMucChuSoHuuBeRepository.saveAll(danhMucChuSoHuuBeList);
    }
}
