package com.omerkocbil.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.omerkocbil.dao.PersonelDAO;
import com.omerkocbil.enterprise.Personel;

public class PersonelDAOImpl implements PersonelDAO {

	private DataSource veriKaynagi;

	public void setVeriKaynagi(DataSource veriKaynagi) {
		this.veriKaynagi = veriKaynagi;
	}

	@Override
	public void createOlustur1(Personel personel) { // JDBC ile
		String sorgu = "INSERT INTO personel (adi, soyadi, tecrube) VALUES (?, ?, ?)";
		Connection con = null;
		PreparedStatement ps = null;
		
		try{
			con = veriKaynagi.getConnection();
			ps = con.prepareStatement(sorgu);
			
			ps.setString(1, personel.getAdi());
			ps.setString(2, personel.getSoyadi());
			ps.setInt(3, personel.getTecrube());
			
			int durum = ps.executeUpdate();
			
			if(durum != 0){
				System.out.println("Kayıt eklendi");
			}
			else{
				System.out.println("Kayıt eklenemedi");
			}
		} catch(SQLException e){
			e.printStackTrace();
		} finally{
			try{
				ps.close();
				con.close();
			} catch(SQLException e){
				e.printStackTrace();
			}
		}
	}

	@Override
	public void createOlustur2(Personel personel) { // Spring JDBC Template ile
		String sorgu = "INSERT INTO personel (adi, soyadi, tecrube) VALUES (?, ?, ?)";
		
		JdbcTemplate jdbc = new JdbcTemplate(veriKaynagi);
		
		Object [] args = new Object[] {
			personel.getAdi(),
			personel.getSoyadi(),
			personel.getTecrube()
		};
		
		int durum = jdbc.update(sorgu, args);
		if(durum != 0){
			System.out.println("Kayıt eklendi");
		}
		else{
			System.out.println("Kayıt eklenemedi");
		}
	}

	@Override
	public Personel readOku1(int id) { // JDBC ile
		String sorgu = "SELECT * FROM personel WHERE id = ?";
		Personel personel = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = veriKaynagi.getConnection();
			ps = con.prepareStatement(sorgu);

			ps.setInt(1, id);

			rs = ps.executeQuery();
			if (rs.next()) {
				personel = new Personel(rs.getString("adi"), rs.getString("soyadi"),
						rs.getInt("tecrube"));
				System.out.println("ID : " + rs.getInt("id") + " ADI SOYADI : " + rs.getString("adi") + " " + 
									rs.getString("soyadi") + " TECRÜBE : " + rs.getInt("tecrube"));
				System.out.println();
			} 
			else{
				System.out.println("Kayıt bulunamadı");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				rs.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return personel;
	}

	@Override
	public Personel readOku2(int id) { // Spring JDBC Template ile
		String sorgu = "SELECT * FROM personel WHERE id = ?";
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(veriKaynagi);
		
		Personel personel = (Personel) jdbcTemplate.queryForObject(sorgu, new Object[]{id}, 
				new BeanPropertyRowMapper(Personel.class));
		
		System.out.println("ID : " + id + " ADI SOYADI : " + personel.getAdi() + " " + 
				personel.getSoyadi() + " TECRÜBE : " + personel.getTecrube());
		System.out.println();
		
		return personel;
	}

	@Override
	public void updateGuncelle1(Personel personel, int id) { // JDBC ile
		String sorgu = "UPDATE personel SET adi=?, soyadi=?, tecrube=? WHERE id = ?";
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = veriKaynagi.getConnection();
			ps = con.prepareStatement(sorgu);

			ps.setString(1, personel.getAdi());
			ps.setString(2, personel.getSoyadi());
			ps.setInt(3, personel.getTecrube());
			ps.setInt(4, id);
			
			System.out.println("ID : " + id + " ADI SOYADI : " + personel.getAdi() + " " + 
					personel.getSoyadi() + " TECRÜBE : " + personel.getTecrube());
			System.out.println();
			
			int durum = ps.executeUpdate();
			if(durum != 0){
				System.out.println("Kayıt güncellendi");
			}
			else{
				System.out.println("Kayıt güncellenemedi");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void updateGuncelle2(Personel personel, int id) { // Spring JDBC Template ile
		String sorgu = "UPDATE personel SET adi=?, soyadi=?, tecrube=? WHERE id = ?";
		
		JdbcTemplate jdbc = new JdbcTemplate(veriKaynagi);
		
		Object [] args = new Object[] {
			personel.getAdi(),
			personel.getSoyadi(),
			personel.getTecrube(),
			id
		};
		
		int durum = jdbc.update(sorgu, args);
		if(durum != 0){
			System.out.println("Kayıt güncellendi");
		}
		else{
			System.out.println("Kayıt güncellenemedi");
		}
	}

	@Override
	public void deleteSil1(int id) { // JDBC ile
		String sorgu = "DELETE FROM personel WHERE id = ?";
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = veriKaynagi.getConnection();
			ps = con.prepareStatement(sorgu);

			ps.setInt(1, id);
			
			int durum = ps.executeUpdate();
			if(durum != 0){
				System.out.println("Kayıt silindi");
			}
			else{
				System.out.println("Kayıt silinemedi");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void deleteSil2(int id) { // Spring JDBC Template ile
		String sorgu = "DELETE FROM personel WHERE id = ?";
		
		JdbcTemplate jdbc = new JdbcTemplate(veriKaynagi);
		
		int durum = jdbc.update(sorgu, id);
		if(durum != 0){
			System.out.println("Kayıt silindi");
		}
		else{
			System.out.println("Kayıt silinemedi");
		}
	}

	@Override
	public List<Personel> getAllHepsiniGetir1() { // JDBC ile
		String sorgu = "SELECT * FROM personel";
		List<Personel> personelList = new ArrayList<Personel>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = veriKaynagi.getConnection();
			ps = con.prepareStatement(sorgu);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				Personel personel = new Personel(rs.getInt("id") ,rs.getString("adi"), rs.getString("soyadi"),
						rs.getInt("tecrube"));
				personelList.add(personel);
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
				rs.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return personelList;
	}

	@Override
	public List<Personel> getAllHepsiniGetir2() { // Spring JDBC Template ile
		String sorgu = "SELECT * FROM personel";
		JdbcTemplate jdbc = new JdbcTemplate(veriKaynagi);
		List<Personel> personelList = new ArrayList<Personel>();
		
		List<Map<String, Object>> personelKayitlar = jdbc.queryForList(sorgu);
		
		for(Map<String, Object> personelKayit : personelKayitlar){
			Personel personel = new Personel();
			personel.setId(Integer.parseInt(String.valueOf(personelKayit.get("id"))));
			personel.setAdi(String.valueOf(personelKayit.get("adi")));
			personel.setSoyadi(String.valueOf(personelKayit.get("soyadi")));
			personel.setTecrube(Integer.parseInt(String.valueOf(personelKayit.get("tecrube"))));
			personelList.add(personel);
		}
		
		return personelList;
	}

	
	
}


