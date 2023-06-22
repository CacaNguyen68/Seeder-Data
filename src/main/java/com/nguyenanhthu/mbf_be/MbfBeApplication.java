package com.nguyenanhthu.mbf_be;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nguyenanhthu.mbf_be.dto.RolePermissionDto;
import com.nguyenanhthu.mbf_be.model.Permission;
import com.nguyenanhthu.mbf_be.model.Role;
import com.nguyenanhthu.mbf_be.model.danhmuc.*;
import com.nguyenanhthu.mbf_be.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class MbfBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MbfBeApplication.class, args);
    }


    @Bean
    CommandLineRunner runnerDanhMucNhaThau(DanhMucNhaThauService danhMucNhaThauService,
                                           DanhMucLoaiDuAnService danhMucLoaiDuAnService,
                                           DanhMucLoaiCshtService danhMucLoaiCshtService,
                                           DanhMucTinhTrangCshtService danhMucTinhTrangCshtService,
                                           DanhMucHinhThucLapService danhMucHinhThucLapService,
                                           DanhMucLoaiThietBiRanService danhMucLoaiThietBiRanService,
                                           DanhMucNhaSanXuatThietBiService danhMucNhaSanXuatThietBiService,
                                           DanhMucDonViTrienKhaiService danhMucDonViTrienKhaiService,
                                           DanhMucCongTyKinhDoanhService danhMucCongTyKinhDoanhService,
                                           DanhMucTrangThaiDuAnService danhMucTrangThaiDuAnService,
                                           DanhMucHinhThucDauTuService danhMucHinhThucDauTuService,
                                           DanhMucHangMucService danhMucHangMucService,
                                           DanhMucTinhTrangKyHopDongThueTramService danhMucTinhTrangKyHopDongThueTramService,
                                           DanhMucNguonVonService danhMucNguonVonService,
                                           DanhMucLoaiPhongService danhMucLoaiPhongService,
                                           DanhMucChuSoHuuPhongService danhMucChuSoHuuPhongService,
                                           DanhMucChuSoHuuBeService danhMucChuSoHuuBeService,
                                           DanhMucTinhService danhMucTinhService,
                                           PermissionService perrmissionService,
                                           RoleService roleService) {
        return args -> {
            // read JSON and load json

            ObjectMapper mapper = new ObjectMapper();

            TypeReference<List<DanhMucNhaThau>> typeReference_DanhMucNhaThau = new TypeReference<List<DanhMucNhaThau>>() {
            };
            TypeReference<List<DanhMucLoaiDuAn>> typeReference_DanhMucLoaiDuAn = new TypeReference<List<DanhMucLoaiDuAn>>() {
            };
            TypeReference<List<DanhMucLoaiCsht>> typeReference_DanhMucLoaiCsht = new TypeReference<List<DanhMucLoaiCsht>>() {
            };
            TypeReference<List<DanhMucTinhTrangCsht>> typeReference_DanhMucTinhTrangCsht = new TypeReference<List<DanhMucTinhTrangCsht>>() {
            };
            TypeReference<List<DanhMucHinhThucLap>> typeReference_DanhMucHinhThucLap = new TypeReference<List<DanhMucHinhThucLap>>() {
            };
            TypeReference<List<DanhMucLoaiThietBiRan>> typeReference_DanhMucLoaiThietBiRan = new TypeReference<List<DanhMucLoaiThietBiRan>>() {
            };
            TypeReference<List<DanhMucNhaSanXuatThietBi>> typeReference_DanhMucNhaSanXuatThietBi = new TypeReference<List<DanhMucNhaSanXuatThietBi>>() {
            };
            TypeReference<List<DanhMucDonViTrienKhai>> typeReference_DanhMucDonViTrienKhai = new TypeReference<List<DanhMucDonViTrienKhai>>() {
            };
            TypeReference<List<DanhMucCongTyKinhDoanh>> typeReference_DanhMucCongTyKinhDoanh = new TypeReference<List<DanhMucCongTyKinhDoanh>>() {
            };
            TypeReference<List<DanhMucTrangThaiDuAn>> typeReference_DanhMucTrangThaiDuAn = new TypeReference<List<DanhMucTrangThaiDuAn>>() {
            };
            TypeReference<List<DanhMucHinhThucDauTu>> typeReference_DanhMucHinhThucDauTu = new TypeReference<List<DanhMucHinhThucDauTu>>() {
            };
            TypeReference<List<DanhMucHangMuc>> typeReference_DanhMucHangMuc = new TypeReference<List<DanhMucHangMuc>>() {
            };
            TypeReference<List<DanhMucTinhTrangKyHopDongThueTram>> typeReference_DanhMucTinhTrangKyHopDongThueTram = new TypeReference<List<DanhMucTinhTrangKyHopDongThueTram>>() {
            };
            TypeReference<List<DanhMucNguonVon>> typeReference_DanhMucNguonVon = new TypeReference<List<DanhMucNguonVon>>() {
            };
            TypeReference<List<DanhMucLoaiPhong>> typeReference_DanhMucLoaiPhong = new TypeReference<List<DanhMucLoaiPhong>>() {
            };
            TypeReference<List<DanhMucChuSoHuuPhong>> typeReference_DanhMucChuSoHuuPhong = new TypeReference<List<DanhMucChuSoHuuPhong>>() {
            };
            TypeReference<List<DanhMucChuSoHuuBe>> typeReference_DanhMucChuSoHuuBe = new TypeReference<List<DanhMucChuSoHuuBe>>() {
            };
            TypeReference<List<DanhMucTinh>> typeReference_DanhMucTinh = new TypeReference<List<DanhMucTinh>>() {
            };
            TypeReference<List<Permission>> typeReference_Permission = new TypeReference<List<Permission>>() {
            };
            TypeReference<List<Role>> typeReference_Role = new TypeReference<List<Role>>() {
            };
            TypeReference<List<RolePermissionDto>> typeReference_RolePermission = new TypeReference<List<RolePermissionDto>>() {
            };

            InputStream inputStream_DanhMucNhaThau = TypeReference.class.getResourceAsStream("/json/danh_muc_nha_thau.json");
            InputStream inputStream_DanhMucLoaiDuAn = TypeReference.class.getResourceAsStream("/json/danh_muc_loai_du_an.json");
            InputStream inputStream_DanhMucLoaiCsht = TypeReference.class.getResourceAsStream("/json/danh_muc_loai_csht.json");
            InputStream inputStream_DanhMucTinhTrangCsht = TypeReference.class.getResourceAsStream("/json/danh_muc_tinh_trang_csht.json");
            InputStream inputStream_DanhMucHinhThucLap = TypeReference.class.getResourceAsStream("/json/danh_muc_hinh_thuc_lap.json");
            InputStream inputStream_DanhMucLoaiThietBiRan = TypeReference.class.getResourceAsStream("/json/danh_muc_loai_thiet_bi_ran.json");
            InputStream inputStream_DanhMucNhaSanXuatThietBi = TypeReference.class.getResourceAsStream("/json/danh_muc_nha_san_xuat_thiet_bi.json");
            InputStream inputStream_DanhMucDonViTrienKhai = TypeReference.class.getResourceAsStream("/json/danh_muc_don_vi_trien_khai.json");
            InputStream inputStream_DanhMucCongTyKinhDoanh = TypeReference.class.getResourceAsStream("/json/danh_muc_cong_ty_kinh_doanh.json");
            InputStream inputStream_DanhMucTrangThaiDuAn = TypeReference.class.getResourceAsStream("/json/danh_muc_trang_thai_du_an.json");
            InputStream inputStream_DanhMucHinhThucDauTu = TypeReference.class.getResourceAsStream("/json/danh_muc_hinh_thuc_dau_tu.json");
            InputStream inputStream_DanhMucHangMuc = TypeReference.class.getResourceAsStream("/json/danh_muc_hang_muc.json");
            InputStream inputStream_DanhMucTinhTrangKyHopDongThueTram = TypeReference.class.getResourceAsStream("/json/danh_muc_tinh_trang_ky_hd_tram.json");
            InputStream inputStream_DanhMucNguonVon = TypeReference.class.getResourceAsStream("/json/danh_muc_nguon_von.json");
            InputStream inputStream_DanhMucLoaiPhong = TypeReference.class.getResourceAsStream("/json/danh_muc_loai_phong.json");
            InputStream inputStream_DanhMucChuSoHuuPhong = TypeReference.class.getResourceAsStream("/json/danh_muc_chu_so_huu_phong.json");
            InputStream inputStream_DanhMucChuSoHuuBe = TypeReference.class.getResourceAsStream("/json/danh_muc_chu_so_huu_be.json");
            InputStream inputStream_DanhMucTinh = TypeReference.class.getResourceAsStream("/json/danh_muc_tinh_huyen.json");
            InputStream inputStream_Permission = TypeReference.class.getResourceAsStream("/json/permission.json");
            InputStream inputStream_Role = TypeReference.class.getResourceAsStream("/json/role.json");
            InputStream inputStream_RolePermission = TypeReference.class.getResourceAsStream("/json/role_permission.json");

            /*DANH MUC NHA THAU*/
            try {
                List<DanhMucNhaThau> danhMucNhaThauList = mapper.readValue(inputStream_DanhMucNhaThau, typeReference_DanhMucNhaThau);
                //danhMucNhaThauService.saveListDanhMuc(danhMucNhaThauList);
                System.out.println("Danh Muc Nha Thau Doi Tac Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save Danh Muc Nha Thau Doi Tac: " + e.getMessage());
            }

            /*DANH MUC LOAI DU AN*/
            try {
                List<DanhMucLoaiDuAn> danhMucLoaiDuAnList = mapper.readValue(inputStream_DanhMucLoaiDuAn, typeReference_DanhMucLoaiDuAn);
                //danhMucLoaiDuAnService.saveListDanhMuc(danhMucLoaiDuAnList);
                System.out.println("Danh Muc Loai Du An Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save Danh Muc Loai Du An: " + e.getMessage());
            }

            /*DANH MUC LOAI CSHT*/
            try {
                List<DanhMucLoaiCsht> danhMucLoaiCshtList = mapper.readValue(inputStream_DanhMucLoaiCsht, typeReference_DanhMucLoaiCsht);
                //danhMucLoaiCshtService.saveListDanhMuc(danhMucLoaiCshtList);
                System.out.println("Danh Muc Loai CSHT Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save Danh Muc Loai CSHT: " + e.getMessage());
            }

            /*DANH MUC TINH TRANG CSHT*/
            try {
                List<DanhMucTinhTrangCsht> danhMucTinhTrangCshtList = mapper.readValue(inputStream_DanhMucTinhTrangCsht, typeReference_DanhMucTinhTrangCsht);
//                danhMucTinhTrangCshtService.saveListDanhMuc(danhMucTinhTrangCshtList);
                System.out.println("Danh Muc Tinh Trang CSHT Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save Danh Muc Tinh Trang CSHT: " + e.getMessage());
            }

            /*DANH MUC HINH THUC LAP*/
            try {
                List<DanhMucHinhThucLap> danhMucHinhThucLapList = mapper.readValue(inputStream_DanhMucHinhThucLap, typeReference_DanhMucHinhThucLap);
//                danhMucHinhThucLapService.saveListDanhMuc(danhMucHinhThucLapList);
                System.out.println("Danh Muc Hinh Thuc Lap Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save Danh Muc Hinh Thuc Lap: " + e.getMessage());
            }

            /*DANH MUC LOAI THIET BI RAN*/
            try {
                List<DanhMucLoaiThietBiRan> danhMucLoaiThietBiRanList = mapper.readValue(inputStream_DanhMucLoaiThietBiRan, typeReference_DanhMucLoaiThietBiRan);
//                danhMucLoaiThietBiRanService.saveListDanhMuc(danhMucLoaiThietBiRanList);
                System.out.println("Danh Muc Loai Thiet Bi RAN Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save Danh Muc Loai Thiet Bi RAN: " + e.getMessage());
            }

            /*DANH MUC NHA SAN XUAT THIET BI*/
            try {
                List<DanhMucNhaSanXuatThietBi> danhMucNhaSanXuatThietBiList = mapper.readValue(inputStream_DanhMucNhaSanXuatThietBi, typeReference_DanhMucNhaSanXuatThietBi);
//                danhMucNhaSanXuatThietBiService.saveListDanhMuc(danhMucNhaSanXuatThietBiList);
                System.out.println("Danh Muc Nha San Xuat Thiet Bi Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save Danh Muc Nha San Xuat Thiet Bi: " + e.getMessage());
            }

            /*DANH MUC DON VI TRIEN KHAI*/
            try {
                List<DanhMucDonViTrienKhai> danhMucDonViTrienKhaiList = mapper.readValue(inputStream_DanhMucDonViTrienKhai, typeReference_DanhMucDonViTrienKhai);
//                danhMucDonViTrienKhaiService.saveListDanhMuc(danhMucDonViTrienKhaiList);
                System.out.println("Danh Muc Don Vi Trien Khai Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save Danh Muc Don Vi Trien Khai: " + e.getMessage());
            }

            /*DANH MUC CONG TY KINH DOANH*/
            try {
                List<DanhMucCongTyKinhDoanh> danhMucCongTyKinhDoanhList = mapper.readValue(inputStream_DanhMucCongTyKinhDoanh, typeReference_DanhMucCongTyKinhDoanh);
//                danhMucCongTyKinhDoanhService.saveListDanhMuc(danhMucCongTyKinhDoanhList);
                System.out.println("Danh Muc Cong Ty Kinh Doanh Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save Danh Muc Cong Ty Kinh Doanh: " + e.getMessage());
            }

            /*DANH MUC TRANG THAI DU AN*/
            try {
                List<DanhMucTrangThaiDuAn> danhMucTrangThaiDuAnList = mapper.readValue(inputStream_DanhMucTrangThaiDuAn, typeReference_DanhMucTrangThaiDuAn);
//                danhMucTrangThaiDuAnService.saveListDanhMuc(danhMucTrangThaiDuAnList);
                System.out.println("Danh Muc Trang Thai Du An Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save Danh Muc Trang Thai Du An: " + e.getMessage());
            }

            /*DANH MUC HINH THUC DAU TU*/
            try {
                List<DanhMucHinhThucDauTu> danhMucHinhThucDauTuList = mapper.readValue(inputStream_DanhMucHinhThucDauTu, typeReference_DanhMucHinhThucDauTu);
//                danhMucHinhThucDauTuService.saveListDanhMuc(danhMucHinhThucDauTuList);
                System.out.println("Danh Muc Hinh Thuc Dau Tu Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save Danh Muc Hinh Thuc Dau Tu: " + e.getMessage());
            }

            /*DANH MUC HANG MUC*/
            try {
                List<DanhMucHangMuc> danhMucHangMucList = mapper.readValue(inputStream_DanhMucHangMuc, typeReference_DanhMucHangMuc);
//                danhMucHangMucService.saveListDanhMuc(danhMucHangMucList);
                System.out.println("Danh Muc Hang Muc Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save Danh Muc Hang Muc: " + e.getMessage());
            }

            /*DANH MUC TINH TRANG KY HOP DONG TRAM*/
            try {
                List<DanhMucTinhTrangKyHopDongThueTram> danhMucTinhTrangKyHopDongThueTramList = mapper.readValue(inputStream_DanhMucTinhTrangKyHopDongThueTram, typeReference_DanhMucTinhTrangKyHopDongThueTram);
//                danhMucTinhTrangKyHopDongThueTramService.saveListDanhMuc(danhMucTinhTrangKyHopDongThueTramList);
                System.out.println("Danh Muc Tinh Trang Ky HD  Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save Danh Muc Tinh Trang Ky HD: " + e.getMessage());
            }

            /*DANH MUC NGUON VON*/
            try {
                List<DanhMucNguonVon> danhMucNguonVonList = mapper.readValue(inputStream_DanhMucNguonVon, typeReference_DanhMucNguonVon);
//                danhMucNguonVonService.saveListDanhMuc(danhMucNguonVonList);
                System.out.println("Danh Muc Nguon Von Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save Danh Muc Nguon Von: " + e.getMessage());
            }

            /*DANH MUC LOAI PHONG*/
            try {
                List<DanhMucLoaiPhong> danhMucLoaiPhongList = mapper.readValue(inputStream_DanhMucLoaiPhong, typeReference_DanhMucLoaiPhong);
//                danhMucLoaiPhongService.saveListDanhMuc(danhMucLoaiPhongList);
                System.out.println("Danh Muc Loai Phong Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save Danh Muc Loai Phong: " + e.getMessage());
            }

            /*DANH MUC CHU SO HUU PHONG*/
            try {
                List<DanhMucChuSoHuuPhong> danhMucChuSoHuuPhongList = mapper.readValue(inputStream_DanhMucChuSoHuuPhong, typeReference_DanhMucChuSoHuuPhong);
//                danhMucChuSoHuuPhongService.saveListDanhMuc(danhMucChuSoHuuPhongList);
                System.out.println("Danh Muc Chu So Huu Phong Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save Danh Muc Chu So Huu Phong: " + e.getMessage());
            }

            /*DANH MUC CHU SO HUU BE*/
            try {
                List<DanhMucChuSoHuuBe> danhMucChuSoHuuBeList = mapper.readValue(inputStream_DanhMucChuSoHuuBe, typeReference_DanhMucChuSoHuuBe);
//                danhMucChuSoHuuBeService.saveListDanhMuc(danhMucChuSoHuuBeList);
                System.out.println("Danh Muc Chu So Huu Be Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save Danh Muc Chu So Huu Be: " + e.getMessage());
            }

            /*DANH MUC TINH*/
            try {
                List<DanhMucTinh> danhMucTinhList = mapper.readValue(inputStream_DanhMucTinh, typeReference_DanhMucTinh);
//                danhMucTinhService.saveListDanhMuc(danhMucTinhList);
                System.out.println("Danh Muc Tinh - Huyen Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save Danh Muc Tinh - Huyen: " + e.getMessage());
            }

            /*PERMISSION*/
            try {
                List<Permission> permissionList = mapper.readValue(inputStream_Permission, typeReference_Permission);
//                perrmissionService.saveLisPermisson(permissionList);
                System.out.println("Permission Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save Permission: " + e.getMessage());
            }

            /*ROLE*/
            try {
                List<Role> roleList = mapper.readValue(inputStream_Role, typeReference_Role);
//                roleService.saveListRole(roleList);
                System.out.println("Role Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save Role: " + e.getMessage());
            }

            /*ROLE PERMISSION*/
            try {
                List<RolePermissionDto> rolePermissionDtoList = mapper.readValue(inputStream_RolePermission, typeReference_RolePermission);
//                roleService.addPermission(rolePermissionDtoList);
                System.out.println("Role Permission Saved!");
            } catch (IOException e) {
                System.out.println("Unable to save Role Permission: " + e.getMessage());
            }


        };

    }


}
