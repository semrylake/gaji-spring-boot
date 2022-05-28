package com.gajiku.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_gaji")
public class Gaji {
    @Id // sebagai ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) // membuat primary & auto increament
    private Long id;

    @Column(length = 20, nullable = true)
    private String nama;

    private String kota;

    private String perusahaan;

    private String pekerjaan;

    private Integer pengalaman;

    private String gaji;

    private String deskripsi;

    public Gaji() {
    }

    // public Gaji(Long id, String nama, String kota, String perusahaan, String
    // pekerjaan, Integer pengalaman, String gaji,
    // String deskripsi) {
    // this.id = id;
    // this.nama = nama;
    // this.kota = kota;
    // this.perusahaan = perusahaan;
    // this.pekerjaan = pekerjaan;
    // this.pengalaman = pengalaman;
    // this.gaji = gaji;
    // this.deskripsi = deskripsi;
    // }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getPerusahaan() {
        return perusahaan;
    }

    public void setPerusahaan(String perusahaan) {
        this.perusahaan = perusahaan;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public Integer getPengalaman() {
        return pengalaman;
    }

    public void setPengalaman(Integer pengalaman) {
        this.pengalaman = pengalaman;
    }

    public String getGaji() {
        return gaji;
    }

    public void setGaji(String gaji) {
        this.gaji = gaji;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

}
