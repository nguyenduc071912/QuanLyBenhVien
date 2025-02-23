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
public class DatLichKhamServices {
    static String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=QLBenhVien;user=sa;password=111;trustServerCertificate=true";
    
    public static List<ClassDatLichKham> getAll(){
        String sql = "select * from DatLichKham";
        try(Connection con = DriverManager.getConnection(connectionUrl);PreparedStatement stm = con.prepareStatement(sql)){
            List<ClassDatLichKham> lkList = new ArrayList<>();
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                ClassDatLichKham lk = new ClassDatLichKham();
                lk.setMaBenhNhan(rs.getString("MaBenhNhan"));
                lk.setMaBacSi(rs.getString("MaBacSi"));
                lk.setNgayHen(rs.getString("NgayHen"));
                lk.setGioHen(rs.getString("GioHen"));
                lk.setGhiChu(rs.getString("GhiChu"));
                lkList.add(lk);
            }
            return lkList;
        } catch (Exception e) {
        }
        return null;
    }
    
    public static ClassDatLichKham getById(String MaBenhNhan){
        String sql = "select * from DatLichKham where MaBenhNhan=?";
        ClassDatLichKham lk = new ClassDatLichKham();
        try (Connection con = DriverManager.getConnection(connectionUrl);PreparedStatement stm = con.prepareStatement(sql)){
            stm.setString(1, lk.getMaBenhNhan());
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                lk.setMaBenhNhan(rs.getString("MaBenhNhan"));
                lk.setMaBacSi(rs.getString("MaBacSi"));
                lk.setNgayHen(rs.getString("NgayHen"));
                lk.setGioHen(rs.getString("GioHen"));
                lk.setGhiChu(rs.getString("GhiChu"));
            }
            return lk;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static boolean create(ClassDatLichKham lk){
        String sql = "insert into DatLichKham(MaBenhNhan,MaBacSi,NgayHen,GioHen,GhiChu) values(?,?,?,?,?)";
        try (Connection con = DriverManager.getConnection(connectionUrl);PreparedStatement stm = con.prepareStatement(sql)){
            stm.setString(1, lk.getMaBenhNhan());
            stm.setString(2, lk.getMaBacSi());
            stm.setString(3, lk.getNgayHen());
            stm.setString(4, lk.getGioHen());
            stm.setString(5, lk.getGhiChu());
            return stm.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean update(ClassDatLichKham lk){
        String sql = "update DatLichKham set MaBacSi=?,NgayHen=?,GioHen=?,GhiChu=? where MaBenhNhan=?";
        try (Connection con = DriverManager.getConnection(connectionUrl);PreparedStatement stm = con.prepareStatement(sql)){
            stm.setString(5, lk.getMaBenhNhan());
            stm.setString(1, lk.getMaBacSi());
            stm.setString(2, lk.getNgayHen());
            stm.setString(3, lk.getGioHen());
            stm.setString(4, lk.getGhiChu());
            return stm.executeUpdate() > 0;
        } catch (Exception e) {
        }
        return false;
    }
    
    public static boolean delete(ClassDatLichKham lk){
        String sql = "delete from DatLichKham where MaBenhNhan=?";
        try (Connection con = DriverManager.getConnection(connectionUrl);PreparedStatement stm = con.prepareStatement(sql)){
            stm.setString(1, lk.getMaBenhNhan());
            return stm.executeUpdate() > 0;
        } catch (Exception e) {
        }
        return false;
    }
}
