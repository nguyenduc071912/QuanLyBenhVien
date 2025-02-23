/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Admin
 */
public class ClassBenhNhan {
    String Ma,Ten,NgaySinh,BenhLy,DiaChi;
    int SDT,GioiTinh;

    public ClassBenhNhan() {
    }

    public ClassBenhNhan(String Ma, String Ten, String NgaySinh, String BenhLy, String DiaChi, int SDT, int GioiTinh) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.NgaySinh = NgaySinh;
        this.BenhLy = BenhLy;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
        this.GioiTinh = GioiTinh;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getBenhLy() {
        return BenhLy;
    }

    public void setBenhLy(String BenhLy) {
        this.BenhLy = BenhLy;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public int getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    
    
    
}
