package com.nguyenanhthu.mbf_be.service.impl;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucHinhThucDauTu;
import com.nguyenanhthu.mbf_be.repository.DanhMucHinhThucDauTuRepository;
import com.nguyenanhthu.mbf_be.service.DanhMucHinhThucDauTuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucHinhThucDauTuServiceImpl implements DanhMucHinhThucDauTuService {
    @Autowired
    private DanhMucHinhThucDauTuRepository danhMucHinhThucDauTuRepository;

    @Override
    public DanhMucHinhThucDauTu saveDanhMucHinhThucDauTu(DanhMucHinhThucDauTu danhMucHinhThucDauTu) {
        return danhMucHinhThucDauTuRepository.save(danhMucHinhThucDauTu);
    }

    @Override
    public void saveListDanhMuc(List<DanhMucHinhThucDauTu> danhMucHinhThucDauTuList) {
        danhMucHinhThucDauTuRepository.saveAll(danhMucHinhThucDauTuList);
    }
}
