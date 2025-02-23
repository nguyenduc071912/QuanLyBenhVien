/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import static View.BacSiServices.connectionUrl;
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
public class BenhNhanServices {
    static String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=QLBenhVien;user=sa;password=111;trustServerCertificate=true";
    
    public static List<ClassBenhNhan> getAll(){
        String sql = "select * from BenhNhan";
        try(Connection con = DriverManager.getConnection(connectionUrl);PreparedStatement stm = con.prepareStatement(sql)){
            List<ClassBenhNhan> bnList = new ArrayList<>();
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                ClassBenhNhan bn = new ClassBenhNhan();
                bn.setMa(rs.getString("Ma"));
                bn.setTen(rs.getString("Ten"));
                bn.setNgaySinh(rs.getString("NgaySinh"));
                bn.setBenhLy(rs.getString("BenhLy"));
                bn.setSDT(rs.getInt("SDT"));
                bn.setDiaChi(rs.getString("DiaChi"));
                bn.setGioiTinh(rs.getInt("GioiTinh"));
                bnList.add(bn);
            }
            return bnList;
        } catch (Exception e) {
        }
        return null;
    }
    
    public static ClassBenhNhan getById(String Ma){
        String sql = "select * from BenhNhan where Ma=?";
        ClassBenhNhan bn = new ClassBenhNhan();
        try (Connection con = DriverManager.getConnection(connectionUrl);PreparedStatement stm = con.prepareStatement(sql)){
            stm.setString(1, bn.getMa());
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                bn.setMa(rs.getString("Ma"));
                bn.setTen(rs.getString("Ten"));
                bn.setNgaySinh(rs.getString("NgaySinh"));
                bn.setBenhLy(rs.getString("BenhLy"));
                bn.setSDT(rs.getInt("SDT"));
                bn.setDiaChi(rs.getString("DiaChi"));
                bn.setGioiTinh(rs.getInt("GioiTinh"));
            }
            return bn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static boolean create(ClassBenhNhan bn){
        String sql = "insert into BenhNhan(Ma,Ten,NgaySinh,BenhLy,SDT,DiaChi,GioiTinh) values(?,?,?,?,?,?,?)";
        try (Connection con = DriverManager.getConnection(connectionUrl);PreparedStatement stm = con.prepareStatement(sql)){
            stm.setString(1, bn.getMa());
            stm.setString(2, bn.getTen());
            stm.setString(3, bn.getNgaySinh());
            stm.setString(4, bn.getBenhLy());
            stm.setInt(5, bn.getSDT());
            stm.setString(6, bn.getDiaChi());
            stm.setInt(7, bn.getGioiTinh());
            return stm.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean update(ClassBenhNhan bn){
        String sql = "update BenhNhan set Ten=?,NgaySinh=?,BenhLy=?,SDT=?,DiaChi=?,GioiTinh=? where Ma=?";
        try (Connection con = DriverManager.getConnection(connectionUrl);PreparedStatement stm = con.prepareStatement(sql)){
            stm.setString(7, bn.getMa());
            stm.setString(1, bn.getTen());
            stm.setString(2, bn.getNgaySinh());
            stm.setString(3, bn.getBenhLy());
            stm.setInt(4, bn.getSDT());
            stm.setString(5, bn.getDiaChi());
            stm.setInt(6, bn.getGioiTinh());
            return stm.executeUpdate() > 0;
        } catch (Exception e) {
        }
        return false;
    }
    
    public static boolean delete(ClassBenhNhan bn){
        String sql = "delete from BenhNhan where Ma=?";
        try (Connection con = DriverManager.getConnection(connectionUrl);PreparedStatement stm = con.prepareStatement(sql)){
            stm.setString(1, bn.getMa());
            return stm.executeUpdate() > 0;
        } catch (Exception e) {
        }
        return false;
    }
}
