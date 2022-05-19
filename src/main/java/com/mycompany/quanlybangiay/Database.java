package com.mycompany.quanlybangiay;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author minhq
 */
public class Database {
	private static String dbPrefix = "jdbc:sqlserver://25.15.178.2";
	private static String user = "sa";
	private static String pass = "654321";
	private static String dbPort = "1433";
	private static String databaseName = "QuanLyBanGiay";
	private Connection conn = null;
	private Statement stmt = null;

	public Database() {
		String dbURL = dbPrefix + ":" + dbPort + ";" + "databaseName=" + databaseName
				+ ";encrypt=true;trustServerCertificate=true";
		try {
			DriverManager.registerDriver(new SQLServerDriver());
			conn = DriverManager.getConnection(dbURL, user, pass);
			System.out.println("Ket noi DB thanh cong!");
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Ket noi DB that bai!");
		}
	}

	// SELECT
	public ResultSet Query(String sql) {
		try {
			return stmt.executeQuery(sql);
		} catch (SQLException e) {
			System.out.println("");
		}
		return null;
	}

	// INSERT, UPDATE, DELETE
	public int Update(String sql) {
		try {
			return stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	public ResultSet getProducts() {
		return Query(
				"SELECT S.*, TH.TenThuongHieu FROM SanPham S LEFT JOIN ThuongHieu TH ON S.MaThuongHieu = TH.MaThuongHieu");
	}

	public ResultSet getThuongHieu() {
		return Query("SELECT * FROM ThuongHieu");
	}

	public ResultSet getProductByThuongHieu(String TH) {
		return Query(
				"SELECT S.*, TH.TenThuongHieu FROM SanPham S LEFT JOIN ThuongHieu TH ON S.MaThuongHieu = TH.MaThuongHieu WHERE TenThuongHieu = '"
						+ TH + "' ");
	}

	public int addToCart(int msp) {
		// return Update(
		// "IF EXISTS (SELECT 1 FROM GioHang WHERE MaSanPham = '" + msp
		// + "' ) BEGIN UPDATE GioHang SET SoLuong = SoLuong + 1 WHERE MaSanPham = '" +
		// msp
		// + "'; END ELSE BEGIN INSERT INTO GioHang VALUES (" + msp + ", 1) END");
		ResultSet rs = Query("SELECT COUNT(*) AS total FROM GioHang WHERE MaSanPham = " + msp);
		try {
			rs.next();
			if (rs.getInt("total") > 0) {
				// UPDATE
				return Update("UPDATE GioHang SET SoLuong = SoLuong + 1 WHERE MaSanPham = " + msp);
			} else {
				// INSERT
				return Update("INSERT INTO GioHang VALUES (" + msp + ", 1, NULL)");
			}
		} catch (SQLException e) {
			return 0;
		}
	}

	public ResultSet getCart() {
		return Query(
				"SELECT G.*, TenSanPham, DonGia FROM GioHang G LEFT JOIN SanPham SP ON G.MaSanPham = SP.MaSanPham");
	}

	public int deleteCart(int msp) {
		return Update("DELETE FROM GioHang WHERE MaSanPham = " + msp);
	}

	public boolean addInvoice() {
		ResultSet a = getCart();
		int TongTien = 0;
		try {
			while (a.next()) {
				TongTien += a.getInt("SoLuong") * a.getInt("DonGia");
			}
			if (TongTien > 0) {
				Update("INSERT INTO HoaDon VALUES (NULL, NULL, GETDATE(), " + TongTien + ")");
				ResultSet b = Query("SELECT SCOPE_IDENTITY() AS id");
				b.next();
				int id = b.getInt("id");
				a = getCart();
				while (a.next()) {
					conn.createStatement().executeUpdate(
							"INSERT INTO ChiTietHoaDon VALUES (" + id + ", " + a.getInt("MaSanPham") + ", "
									+ a.getInt("SoLuong") + ", " + a.getInt("DonGia") + ")");
				}
				Update("DELETE FROM GioHang");
				return true;
			}
		} catch (SQLException e) {
			System.out.println("error insert invoice: " + e.getMessage());
		}
		return false;
	}

	public ResultSet getInvoices() {
		return Query("SELECT * FROM HoaDon");
	}

	public ResultSet getInvoiceDetail(int mhd) {
		return Query(
				"SELECT CTHD.*, TenSanPham FROM HoaDon HD LEFT JOIN ChiTietHoaDon CTHD ON HD.MaHD = CTHD.MaHD LEFT JOIN SanPham SP ON CTHD.MaSanPham = SP.MaSanPham WHERE HD.MaHD = "
						+ mhd);
	}

}
