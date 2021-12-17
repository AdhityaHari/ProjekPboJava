/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.Scanner;
import model.Login;
/**
 *
 * @author user
 */
public class LoginView {
    static Login login;

    public static void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan username: ");
        String username = scanner.nextLine();

        System.out.print("Masukan password: ");
        String password = scanner.nextLine();

        try {
            login = new Login();

            login.checkPenjual(username, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
