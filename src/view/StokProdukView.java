/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import model.StokProduk;
import java.sql.ResultSet;
import java.util.Scanner;
import model.BaseModel;
/**
 *
 * @author user
 */
public class StokProdukView extends BaseModel {
    
    public static void daftarProduk() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("-------- Daftar Produk --------");
        System.out.println("=============================");

        StokProduk stokProduk = new StokProduk();
        ResultSet result =  stokProduk.getProduk();

        System.out.println("Id | Jenis | Stok | Harga Susu");

        while (result.next()) {
            System.out.print(result.getString("id"));
            System.out.print(" | ");
            System.out.print(result.getString("jenis"));
            System.out.print(" | ");
            System.out.print(result.getString("stok"));
            System.out.print(" | ");
            System.out.print(result.getString("harga_susu"));
            System.out.println();
        }

        System.out.println("============================");
        System.out.print("Menu: \n0. Kembali \nPilih Menu> ");

        String menu = scanner.nextLine();

        switch (menu) {
            case "0":
                Homepage.menuPelanggan();
                break;
            default:
                System.out.println("Menu tidak ada!");
                Homepage.menuPelanggan();
                break;
        }
    }
}

