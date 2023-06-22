package com.nguyenanhthu.mbf_be.service.impl;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucChuSoHuuPhong;
import com.nguyenanhthu.mbf_be.repository.DanhMucChuSoHuuPhongRepository;
import com.nguyenanhthu.mbf_be.service.DanhMucChuSoHuuPhongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucChuSoHuuPhongServiceImpl implements DanhMucChuSoHuuPhongService {
    @Autowired
    private DanhMucChuSoHuuPhongRepository danhMucChuSoHuuPhongRepository;

    @Override
    public DanhMucChuSoHuuPhong saveDanhMucChuSoHuuPhong(DanhMucChuSoHuuPhong danhMucChuSoHuuPhong) {
        return danhMucChuSoHuuPhongRepository.save(danhMucChuSoHuuPhong);
    }

    @Override
    public void saveListDanhMuc(List<DanhMucChuSoHuuPhong> danhMucChuSoHuuPhongList) {
        danhMucChuSoHuuPhongRepository.saveAll(danhMucChuSoHuuPhongList);
    }
}
