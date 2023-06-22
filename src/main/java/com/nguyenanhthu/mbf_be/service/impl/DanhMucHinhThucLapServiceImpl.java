package com.nguyenanhthu.mbf_be.service.impl;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucHinhThucLap;
import com.nguyenanhthu.mbf_be.repository.DanhMucHinhThucLapRepository;
import com.nguyenanhthu.mbf_be.service.DanhMucHinhThucLapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucHinhThucLapServiceImpl implements DanhMucHinhThucLapService {

    @Autowired
    private DanhMucHinhThucLapRepository danhMucHinhThucLapRepository;

    @Override
    public DanhMucHinhThucLap saveDanhMucHinhThucLap(DanhMucHinhThucLap danhMucLoaiCsht) {
        return danhMucHinhThucLapRepository.save(danhMucLoaiCsht);
    }

    @Override
    public void saveListDanhMuc(List<DanhMucHinhThucLap> danhMucLoaiCshts) {
        danhMucHinhThucLapRepository.saveAll(danhMucLoaiCshts);
    }
}
