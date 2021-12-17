/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Pesanan extends BaseModel{
    public Pesanan() throws SQLException {
        super();
    }

    public int addPesanan(int id, String tanggal, String nama, String jenis, int jumlah, String total_harga, String alamat) throws SQLException {
        String query = "INSERT INTO pesanan " +
                        "(id,tanggal, nama, jenis, jumlah, total_harga, alamat) VALUES " +
                        "(?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, tanggal);
        preparedStatement.setString(3, nama);
        preparedStatement.setString(4, jenis);
        preparedStatement.setInt(5, jumlah);
        preparedStatement.setString(6, total_harga);
        preparedStatement.setString(7, alamat);

        return preparedStatement.executeUpdate(); 
    }
    public ResultSet getPesanan() throws SQLException {
        String query = "SELECT * FROM pesanan";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        return preparedStatement.executeQuery();
    }
}


