package com.nguyenanhthu.mbf_be.service.impl;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucTinh;
import com.nguyenanhthu.mbf_be.repository.DanhMucTinhRepository;
import com.nguyenanhthu.mbf_be.service.DanhMucTinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucTinhServiceImpl implements DanhMucTinhService {
    @Autowired
    private DanhMucTinhRepository danhMucTinhRepository;

    @Override
    public DanhMucTinh saveDanhMucTinh(DanhMucTinh danhMucTinh) {
        return danhMucTinhRepository.save(danhMucTinh);
    }

    @Override
    public void saveListDanhMuc(List<DanhMucTinh> danhMucTinhList) {
        danhMucTinhRepository.saveAll(danhMucTinhList);
    }
}
