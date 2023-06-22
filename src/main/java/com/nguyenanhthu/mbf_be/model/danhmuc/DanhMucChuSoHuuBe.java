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
@Table(name = "danh_muc_chu_so_huu_be")
public class DanhMucChuSoHuuBe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "ma_chu_so_huu_be")
    private String maChuSoHuuBe;

    @Column(name = "ten_chu_so_huu_be")
    private String tenChuSoHuuBe;

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
