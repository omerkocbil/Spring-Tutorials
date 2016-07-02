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

// Alttaki kod sınıftaki tüm uyarıları gizliyor
@SuppressWarnings({"unchecked", "rawtypes"})
public class PersonelDAOImpl implements PersonelDAO {

	private JdbcTemplate jdbcTemplate;
	private Connection baglanti = null;
	private String sqlKodu = null;
	private DataSource veriKaynagi;

	public void setVeriKaynagi(DataSource veriKaynagi) {
		this.veriKaynagi = veriKaynagi;
	}

	@Override
	public void ekle(Personel personel) {
		sqlKodu = "INSERT INTO personel (adi, tecrube) VALUES (?, ?)";
		
		jdbcTemplate = new JdbcTemplate(veriKaynagi);
		jdbcTemplate.update(sqlKodu, new Object[]{
			personel.getAdi(),
			personel.getTecrube()
		});
		
	}

	@Override
	public Personel idAra(int id) {
		sqlKodu = "SELECT * FROM personel WHERE id = ?";
		
		jdbcTemplate = new JdbcTemplate(veriKaynagi);
		
		Personel personel = (Personel) jdbcTemplate.queryForObject(sqlKodu, new Object[]{id}, 
				new BeanPropertyRowMapper(Personel.class));
		
		return personel;
	}

	@Override
	public Personel adiAra(String adi) {
		sqlKodu = "SELECT * FROM personel WHERE adi = ?";
		
		jdbcTemplate = new JdbcTemplate(veriKaynagi);
		
		Personel personel = (Personel) jdbcTemplate.queryForObject(sqlKodu, new Object[]{adi}, 
				new BeanPropertyRowMapper(Personel.class));
		
		return personel;
	}

	@Override
	public Personel tecrubeAra(int tecrube){
		sqlKodu = "SELECT * FROM personel WHERE tecrube = ?";

		jdbcTemplate = new JdbcTemplate(veriKaynagi);
		
		Personel personel = (Personel) jdbcTemplate.queryForObject(sqlKodu, new Object[]{tecrube}, 
				new BeanPropertyRowMapper(Personel.class));
		
		return personel;
	}

	@Override
	public List<Personel> butunKayitlariAra() {
		sqlKodu = "SELECT * FROM personel";

		jdbcTemplate = new JdbcTemplate(veriKaynagi);
		
		List<Personel> personelList = new ArrayList<Personel>();
		List<Map<String, Object>> satirlar = jdbcTemplate.queryForList(sqlKodu);
		
		for(Map satir : satirlar){
			Personel personel = new Personel();
			personel.setId(Integer.parseInt(String.valueOf(satir.get("id"))));
			personel.setAdi((String) satir.get("adi"));
			personel.setTecrube(Integer.parseInt(String.valueOf(satir.get("tecrube"))));
			personelList.add(personel);
		}
		
		return personelList;
	}

	@Override
	public String idDegeriyleStringBirVeriyiCekme(int id) {
		sqlKodu = "SELECT adi FROM personel WHERE id = ?";

		jdbcTemplate = new JdbcTemplate(veriKaynagi);
		
		String sonuc = (String) jdbcTemplate.queryForObject(sqlKodu, new Object[]{id}, String.class);
		
		return sonuc;
	}

	@Override
	public void topluVeriGirisiBatch1(final List<Personel> personelList) {
		sqlKodu = "INSERT INTO personel (adi, tecrube) VALUES (?, ?)";

		jdbcTemplate = new JdbcTemplate(veriKaynagi);
		jdbcTemplate.batchUpdate(sqlKodu, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
				Personel personel = personelList.get(i);
				preparedStatement.setString(1, personel.getAdi());
				preparedStatement.setInt(2, personel.getTecrube());
			}
			
			@Override
			public int getBatchSize() {
				return personelList.size();
			}
		});
	}

	@Override
	public void topluVeriGirisiBatch2(String sqlKodu) {
		jdbcTemplate = new JdbcTemplate(veriKaynagi);
		jdbcTemplate.batchUpdate(new String[]{sqlKodu});
	}
	
}


