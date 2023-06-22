package com.nguyenanhthu.mbf_be.service.impl;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucLoaiPhong;
import com.nguyenanhthu.mbf_be.repository.DanhMucLoaiPhongRepository;
import com.nguyenanhthu.mbf_be.service.DanhMucLoaiPhongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucLoaiPhongServiceImpl implements DanhMucLoaiPhongService {
    @Autowired
    private DanhMucLoaiPhongRepository danhMucLoaiPhongRepository;

    @Override
    public DanhMucLoaiPhong saveDanhMucLoaiPhong(DanhMucLoaiPhong danhMucLoaiPhong) {
        return danhMucLoaiPhongRepository.save(danhMucLoaiPhong);
    }

    @Override
    public void saveListDanhMuc(List<DanhMucLoaiPhong> danhMucLoaiPhongList) {
        danhMucLoaiPhongRepository.saveAll(danhMucLoaiPhongList);
    }
}
