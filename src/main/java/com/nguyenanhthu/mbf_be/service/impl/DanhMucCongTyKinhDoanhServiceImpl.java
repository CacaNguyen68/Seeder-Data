package com.nguyenanhthu.mbf_be.service.impl;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucCongTyKinhDoanh;
import com.nguyenanhthu.mbf_be.repository.DanhMucCongTyKinhDoanhRepository;
import com.nguyenanhthu.mbf_be.service.DanhMucCongTyKinhDoanhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucCongTyKinhDoanhServiceImpl implements DanhMucCongTyKinhDoanhService {
    @Autowired
    private DanhMucCongTyKinhDoanhRepository danhMucCongTyKinhDoanhRepository;

    @Override
    public DanhMucCongTyKinhDoanh saveDanhMucCongTyKinhDoanh(DanhMucCongTyKinhDoanh danhMucCongTyKinhDoanh) {
        return danhMucCongTyKinhDoanhRepository.save(danhMucCongTyKinhDoanh);
    }

    @Override
    public void saveListDanhMuc(List<DanhMucCongTyKinhDoanh> danhMucCongTyKinhDoanhList) {
        danhMucCongTyKinhDoanhRepository.saveAll(danhMucCongTyKinhDoanhList);
    }
}
