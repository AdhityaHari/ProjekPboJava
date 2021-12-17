/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.BaseModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import model.Pelanggan;


/**
 *
 * @author user
 */
public class PelangganView extends BaseModel{
    static Pelanggan pelanggan;
            
     public static void daftarPelanggan() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================================================");
        System.out.println("--------------------- Daftar Pelanggan ----------------------");
        System.out.println("===========================================================");

        Pelanggan pelanggan1 = new Pelanggan();
        ResultSet result =  pelanggan1.getPelanggan();

        System.out.println("Id | Username | Password | Nama | No HP | Alamat");

        while (result.next()) {
            System.out.print(result.getString("id"));
            System.out.print(" | ");
            System.out.print(result.getString("username"));
            System.out.print(" | ");
            System.out.print(result.getString("password"));
            System.out.print(" | ");
            System.out.print(result.getString("nama"));
            System.out.print(" | ");
            System.out.print(result.getString("no_hp"));
            System.out.print(" | ");
            System.out.print(result.getString("alamat"));
            System.out.println();
        }
        System.out.print("\n============================================================");
        System.out.println();
        System.out.println("Menu: \n0. Kembali \nPilih Menu> ");

        String menu = scanner.nextLine();

        switch (menu) {
            case "0":
                Homepage.menuPenjual();
                break;
            default:
                System.out.println("Menu tidak ada!");
                Homepage.menuPenjual();
                break;
        }
    }
}
