/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Admin
 */
public class ClassBacSi {
    String Ma,Ten,ChuyenKhoa,Email;
    int SDT;

    public ClassBacSi() {
    }

    public ClassBacSi(String Ma, String Ten, String ChuyenKhoa, String Email, int SDT) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.ChuyenKhoa = ChuyenKhoa;
        this.Email = Email;
        this.SDT = SDT;
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

    public String getChuyenKhoa() {
        return ChuyenKhoa;
    }

    public void setChuyenKhoa(String ChuyenKhoa) {
        this.ChuyenKhoa = ChuyenKhoa;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }
    
    
}
