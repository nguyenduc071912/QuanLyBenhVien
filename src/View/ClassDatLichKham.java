/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Admin
 */
public class ClassDatLichKham {
    String MaBenhNhan,MaBacSi,NgayHen,GioHen,GhiChu;

    public ClassDatLichKham() {
    }

    public ClassDatLichKham(String MaBenhNhan, String MaBacSi, String NgayHen, String GioHen, String GhiChu) {
        this.MaBenhNhan = MaBenhNhan;
        this.MaBacSi = MaBacSi;
        this.NgayHen = NgayHen;
        this.GioHen = GioHen;
        this.GhiChu = GhiChu;
    }

    public String getMaBenhNhan() {
        return MaBenhNhan;
    }

    public void setMaBenhNhan(String MaBenhNhan) {
        this.MaBenhNhan = MaBenhNhan;
    }

    public String getMaBacSi() {
        return MaBacSi;
    }

    public void setMaBacSi(String MaBacSi) {
        this.MaBacSi = MaBacSi;
    }

    public String getNgayHen() {
        return NgayHen;
    }

    public void setNgayHen(String NgayHen) {
        this.NgayHen = NgayHen;
    }

    public String getGioHen() {
        return GioHen;
    }

    public void setGioHen(String GioHen) {
        this.GioHen = GioHen;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
    
}
