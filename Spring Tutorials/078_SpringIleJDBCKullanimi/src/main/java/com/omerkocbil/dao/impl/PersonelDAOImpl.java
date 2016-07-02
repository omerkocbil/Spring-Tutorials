package com.omerkocbil.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.omerkocbil.dao.PersonelDAO;
import com.omerkocbil.enterprise.Personel;

public class PersonelDAOImpl implements PersonelDAO {

	private Connection baglanti = null;
	private String sqlKodu = null;
	private DataSource veriKaynagi;

	public void setVeriKaynagi(DataSource veriKaynagi) {
		this.veriKaynagi = veriKaynagi;
	}

	@Override
	public void ekle(Personel personel) {
		sqlKodu = "INSERT INTO personel (adi, tecrube) VALUES (?, ?)";
		Connection baglanti = null;

		try {
			baglanti = veriKaynagi.getConnection();

			PreparedStatement preparedStatement;
			preparedStatement = baglanti.prepareStatement(sqlKodu);

			preparedStatement.setString(1, personel.getAdi());
			preparedStatement.setInt(2, personel.getTecrube());

			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (baglanti != null) {
				try {
					baglanti.close();
				} catch (SQLException e) {
				}
			}
		}
	}

	@Override
	public Personel idAra(int id) {
		sqlKodu = "SELECT * FROM personel WHERE id = ?";

		try {
			baglanti = veriKaynagi.getConnection();

			PreparedStatement preparedStatement;
			preparedStatement = baglanti.prepareStatement(sqlKodu);

			preparedStatement.setInt(1, id);

			Personel personel = null;
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				personel = new Personel(resultSet.getInt("id"), resultSet.getString("adi"),
						resultSet.getInt("tecrube"));
			}

			resultSet.close();
			preparedStatement.close();
			return personel;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (baglanti != null) {
				try {
					baglanti.close();
				} catch (SQLException e) {
				}
			}
		}
	}

	@Override
	public Personel adiAra(String adi) {
		sqlKodu = "SELECT * FROM personel WHERE adi = ?";

		try {
			baglanti = veriKaynagi.getConnection();

			PreparedStatement preparedStatement;
			preparedStatement = baglanti.prepareStatement(sqlKodu);

			preparedStatement.setString(1, adi);

			Personel personel = null;
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				personel = new Personel(resultSet.getInt("id"), resultSet.getString("adi"),
						resultSet.getInt("tecrube"));
			}

			resultSet.close();
			preparedStatement.close();
			return personel;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (baglanti != null) {
				try {
					baglanti.close();
				} catch (SQLException e) {
				}
			}
		}
	}

	@Override
	public Personel tecrubeAra(int tecrube){
		sqlKodu = "SELECT * FROM personel WHERE tecrube = ?";

		try {
			baglanti = veriKaynagi.getConnection();

			PreparedStatement preparedStatement;
			preparedStatement = baglanti.prepareStatement(sqlKodu);

			preparedStatement.setInt(1, tecrube);

			Personel personel = null;
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				personel = new Personel(resultSet.getInt("id"), resultSet.getString("adi"),
						resultSet.getInt("tecrube"));
			}

			resultSet.close();
			preparedStatement.close();
			return personel;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (baglanti != null) {
				try {
					baglanti.close();
				} catch (SQLException e) {
				}
			}
		}
	}
	
}


