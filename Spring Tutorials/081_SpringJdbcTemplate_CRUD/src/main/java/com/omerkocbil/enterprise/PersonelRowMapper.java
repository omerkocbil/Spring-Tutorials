package com.omerkocbil.enterprise;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;;

public class PersonelRowMapper implements RowMapper<Personel> {

	@Override
	public Personel mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Personel personel = new Personel();
		personel.setId(resultSet.getInt("id"));
		personel.setAdi(resultSet.getString("adi"));
		personel.setAdi(resultSet.getString("soyadi"));
		personel.setTecrube(resultSet.getInt("tecrube"));
		
		return personel;
	}
	
}
