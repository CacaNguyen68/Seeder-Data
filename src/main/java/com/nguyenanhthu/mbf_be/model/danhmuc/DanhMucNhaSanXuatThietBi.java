package com.nguyenanhthu.mbf_be.model.danhmuc;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "danh_muc_nha_san_xuat_thiet_bi")
public class DanhMucNhaSanXuatThietBi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "ma_nha_san_xuat")
    private String maNhaSanXuat;

    @Column(name = "ten_nha_san_xuat")
    private String tenNhaSanXuat;

    @Column(name = "trang_thai")
    private Integer trangThai;

    @Column(name = "created_by")
    private String createBy;

    @CreatedDate
    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", updatable = false)
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date updatedAt;

    @PreUpdate
    @PrePersist
    public void updateTimeStamps() {
        updatedAt = new Date();
        if (createdAt == null) {
            createdAt = new Date();
        }
    }
}
