/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Admin
 */
public class BacSiServices {
    static String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=BenhVien;user=sa;password=123;trustServerCertificate=true";
    
    public static List<ClassBacSi> getAll(){
        String sql = "select * from BacSi";
        try(Connection con = DriverManager.getConnection(connectionUrl);PreparedStatement stm = con.prepareStatement(sql)){
            List<ClassBacSi> bsList = new ArrayList<>();
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                ClassBacSi bs = new ClassBacSi();
                bs.setMa(rs.getString("Ma"));
                bs.setTen(rs.getString("Ten"));
                bs.setChuyenKhoa(rs.getString("ChuyenKhoa"));
                bs.setSDT(rs.getInt("SDT"));
                bs.setEmail(rs.getString("Email"));
                bsList.add(bs);
            }
            return bsList;
        } catch (Exception e) {
        }
        return null;
    }
    
    public static ClassBacSi getById(String Ma){
        String sql = "select * from BacSi where Ma=?";
        ClassBacSi bs = new ClassBacSi();
        try (Connection con = DriverManager.getConnection(connectionUrl);PreparedStatement stm = con.prepareStatement(sql)){
            stm.setString(1, bs.getMa());
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                bs.setMa(rs.getString("Ma"));
                bs.setTen(rs.getString("Ten"));
                bs.setChuyenKhoa(rs.getString("ChuyenKhoa"));
                bs.setSDT(rs.getInt("SDT"));
                bs.setEmail(rs.getString("Email"));
            }
            return bs;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static boolean create(ClassBacSi bs){
        String sql = "insert into BacSi(Ma,Ten,ChuyenKhoa,SDT,Email) values(?,?,?,?,?)";
        try (Connection con = DriverManager.getConnection(connectionUrl);PreparedStatement stm = con.prepareStatement(sql)){
            stm.setString(1, bs.getMa());
            stm.setString(2, bs.getTen());
            stm.setString(3, bs.getChuyenKhoa());
            stm.setInt(4, bs.getSDT());
            stm.setString(5, bs.getEmail());
            return stm.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean update(ClassBacSi bs){
        String sql = "update BacSi set Ten=?,ChuyenKhoa=?,SDT=?,Email=? where Ma=?";
        try (Connection con = DriverManager.getConnection(connectionUrl);PreparedStatement stm = con.prepareStatement(sql)){
            stm.setString(5, bs.getMa());
            stm.setString(1, bs.getTen());
            stm.setString(2, bs.getChuyenKhoa());
            stm.setInt(3, bs.getSDT());
            stm.setString(4, bs.getEmail());
            return stm.executeUpdate() > 0;
        } catch (Exception e) {
        }
        return false;
    }
    
    public static boolean delete(ClassBacSi bs){
        String sql = "delete from BacSi where Ma=?";
        try (Connection con = DriverManager.getConnection(connectionUrl);PreparedStatement stm = con.prepareStatement(sql)){
            stm.setString(1, bs.getMa());
            return stm.executeUpdate() > 0;
        } catch (Exception e) {
        }
        return false;
    }
}
