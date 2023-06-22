package com.nguyenanhthu.mbf_be.service.impl;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucLoaiThietBiRan;
import com.nguyenanhthu.mbf_be.repository.DanhMucLoaiThietBiRanRepository;
import com.nguyenanhthu.mbf_be.service.DanhMucLoaiThietBiRanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucLoaiThietBiRanServiceImpl implements DanhMucLoaiThietBiRanService {
    @Autowired
    private DanhMucLoaiThietBiRanRepository danhMucLoaiThietBiRanRepository;

    @Override
    public DanhMucLoaiThietBiRan saveDanhMucLoaiThietBiRan(DanhMucLoaiThietBiRan danhMucLoaiThietBiRan) {
        return danhMucLoaiThietBiRanRepository.save(danhMucLoaiThietBiRan);
    }

    @Override
    public void saveListDanhMuc(List<DanhMucLoaiThietBiRan> danhMucLoaiThietBiRanList) {
        danhMucLoaiThietBiRanRepository.saveAll(danhMucLoaiThietBiRanList);
    }
}
