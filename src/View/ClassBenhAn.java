/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Admin
 */
public class ClassBenhAn {
    String TenBN,BenhAn,KetQuaKham,DonThuoc,NgayCapNhat;
    int Tuoi,GioiTinh;

    public ClassBenhAn() {
    }

    public ClassBenhAn(String TenBN, String BenhAn, String KetQuaKham, String DonThuoc, String NgayCapNhat, int Tuoi, int GioiTinh) {
        this.TenBN = TenBN;
        this.BenhAn = BenhAn;
        this.KetQuaKham = KetQuaKham;
        this.DonThuoc = DonThuoc;
        this.NgayCapNhat = NgayCapNhat;
        this.Tuoi = Tuoi;
        this.GioiTinh = GioiTinh;
    }

    public String getTenBN() {
        return TenBN;
    }

    public void setTenBN(String TenBN) {
        this.TenBN = TenBN;
    }

    public String getBenhAn() {
        return BenhAn;
    }

    public void setBenhAn(String BenhAn) {
        this.BenhAn = BenhAn;
    }

    public String getKetQuaKham() {
        return KetQuaKham;
    }

    public void setKetQuaKham(String KetQuaKham) {
        this.KetQuaKham = KetQuaKham;
    }

    public String getDonThuoc() {
        return DonThuoc;
    }

    public void setDonThuoc(String DonThuoc) {
        this.DonThuoc = DonThuoc;
    }

    public String getNgayCapNhat() {
        return NgayCapNhat;
    }

    public void setNgayCapNhat(String NgayCapNhat) {
        this.NgayCapNhat = NgayCapNhat;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    
    
    
}
