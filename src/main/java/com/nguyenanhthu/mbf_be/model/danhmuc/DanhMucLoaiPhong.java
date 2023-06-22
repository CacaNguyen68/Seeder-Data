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
@Table(name = "danh_muc_loai_phong")
public class DanhMucLoaiPhong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "ma_loai_phong")
    private String maLoaiPhong;

    @Column(name = "loai_phong")
    private String loaiPhong;

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
