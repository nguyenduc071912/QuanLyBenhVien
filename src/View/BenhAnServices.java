/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class BenhAnServices {
    static String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=BenhVien;user=sa;password=123;trustServerCertificate=true";
    
    public static List<ClassBenhAn> getAll(){
        String sql = "select * from BenhAn";
        try(Connection con = DriverManager.getConnection(connectionUrl);PreparedStatement stm = con.prepareStatement(sql)){
            List<ClassBenhAn> baList = new ArrayList<>();
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                ClassBenhAn ba = new ClassBenhAn();
                ba.setTenBN(rs.getString("TenBN"));
                ba.setGioiTinh(rs.getInt("GioiTinh"));
                ba.setTuoi(rs.getInt("Tuoi"));
                ba.setBenhAn(rs.getString("BenhAn"));
                ba.setKetQuaKham(rs.getString("KetQuaKham"));
                ba.setDonThuoc(rs.getString("DonThuoc"));
                ba.setNgayCapNhat(rs.getString("NgayCapNhat"));
                baList.add(ba);
            }
            return baList;
        } catch (Exception e) {
        }
        return null;
    }
    
    public static ClassBenhAn getById(String TenBN){
        String sql = "select * from BenhAn where TenBN=?";
        ClassBenhAn ba = new ClassBenhAn();
        try (Connection con = DriverManager.getConnection(connectionUrl);PreparedStatement stm = con.prepareStatement(sql)){
            stm.setString(1, ba.getTenBN());
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                ba.setTenBN(rs.getString("TenBN"));
                ba.setGioiTinh(rs.getInt("GioiTinh"));
                ba.setTuoi(rs.getInt("Tuoi"));
                ba.setBenhAn(rs.getString("BenhAn"));
                ba.setKetQuaKham(rs.getString("KetQuaKham"));
                ba.setDonThuoc(rs.getString("DonThuoc"));
                ba.setNgayCapNhat(rs.getString("NgayCapNhat"));
            }
            return ba;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
