package com.nguyenanhthu.mbf_be.service.impl;

import com.nguyenanhthu.mbf_be.model.danhmuc.DanhMucDonViTrienKhai;
import com.nguyenanhthu.mbf_be.repository.DanhMucDonViTrienKhaiRepository;
import com.nguyenanhthu.mbf_be.service.DanhMucDonViTrienKhaiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucDonViTrienKhaiServiceImpl implements DanhMucDonViTrienKhaiService {
    @Autowired
    private DanhMucDonViTrienKhaiRepository danhMucDonViTrienKhaiRepository;

    @Override
    public DanhMucDonViTrienKhai saveDanhMucDonViTrienKhai(DanhMucDonViTrienKhai danhMucDonViTrienKhai) {
        return danhMucDonViTrienKhaiRepository.save(danhMucDonViTrienKhai);
    }

    @Override
    public void saveListDanhMuc(List<DanhMucDonViTrienKhai> danhMucLoaiCshts) {
        danhMucDonViTrienKhaiRepository.saveAll(danhMucDonViTrienKhaiRepository.saveAll(danhMucLoaiCshts));
    }
}
