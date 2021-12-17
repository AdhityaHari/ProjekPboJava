/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import view.Homepage;

/**
 *
 * @author user
 */
public class Login extends BaseModel{
    public Login() throws SQLException {
        super();
    }

    public void checkPenjual(String username, String password) throws SQLException {
        String query = "SELECT * FROM penjual " +
                        "WHERE username = ? " +
                        "AND password = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);

        try {
            ResultSet res;
            res = preparedStatement.executeQuery();

            if (res.next()) {
                String username2 = res.getString("username");
                String password2 = res.getString("password");
                if (Objects.equals(username2, username) && Objects.equals(password2, password)) {
                    System.out.println("Login Berhasil");
                    Homepage.menuPenjual();
                }
            } else {
                checkPelanggan(username, password);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void checkPelanggan(String username, String password) throws SQLException {
        String query = "SELECT * FROM pelanggan " +
                "WHERE username = ? " +
                "AND password = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);

        try {
            ResultSet res;
            res = preparedStatement.executeQuery();

            if (res.next()) {
                String username2 = res.getString("username");
                String password2 = res.getString("password");
                if (Objects.equals(username2, username) && Objects.equals(password2, password)) {
                    System.out.println("Login Berhasil");
                    Homepage.menuPelanggan();
                }
            } else {
                System.out.println("Username atau password salah !");

                Homepage.backToLogin();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
