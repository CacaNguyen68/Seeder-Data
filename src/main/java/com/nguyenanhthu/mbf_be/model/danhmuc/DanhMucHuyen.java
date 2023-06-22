package com.nguyenanhthu.mbf_be.model.danhmuc;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "danh_muc_huyen")
public class DanhMucHuyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "ma_huyen")
    private String maHuyen;

    @Column(name = "ten_huyen")
    private String tenHuyen;

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

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_tinh")
    @JsonBackReference
    private DanhMucTinh danh_muc_tinh;
}
