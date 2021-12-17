/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Exception.PesananException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import model.Pesanan;
/**
 *
 * @author user
 */
public class PesananView {
    static Pesanan pesanan;

    public static void pesanan() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukan id : ");
            int id = scanner.nextInt();
            scanner.nextLine();
                    
            System.out.print("Masukan Tanggal : ");
            String tanggal = scanner.nextLine();

            System.out.print("Masukan Nama : ");
            String nama = scanner.nextLine();

            System.out.print("Masukan Jenis : ");
            String jenis = scanner.nextLine();

            System.out.print("Masukan Jumlah : ");
            int jumlah = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Masukan Total Harga : ");
            String total_harga = scanner.nextLine();
            
            System.out.print("Masukan Alamat : ");
            String alamat = scanner.nextLine();

            if (tanggal.isEmpty() || nama.isEmpty() || jenis.isEmpty() || total_harga.isEmpty() || alamat.isEmpty()) {
                throw new PesananException();
            }

            pesanan = new Pesanan();

            int result = pesanan.addPesanan(id, tanggal, nama, jenis, jumlah, total_harga, alamat);
            if (result > 0) {
                System.out.println("Pesanan telah diproses");
                Homepage.menuPelanggan();
            }
        } catch (PesananException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void daftarPesanan() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================================================");
        System.out.println("---------------------------- Daftar Pesanan --------------------------");
        System.out.println("======================================================================");

        Pesanan pesanan = new Pesanan();
        ResultSet result =  pesanan.getPesanan();

        System.out.println("Id | Tanggal | Nama | Jenis | Jumlah | Total Harga | Alamat");

        while (result.next()) {
            System.out.print(result.getString("id"));
            System.out.print(" | ");
            System.out.print(result.getString("tanggal"));
            System.out.print(" | ");
            System.out.print(result.getString("nama"));
            System.out.print(" | ");
            System.out.print(result.getString("jenis"));
            System.out.print(" | ");
            System.out.print(result.getInt("jumlah"));
            System.out.print(" | ");
            System.out.print(result.getString("total_harga"));
            System.out.print(" | ");
            System.out.print(result.getString("alamat"));
            System.out.println();
        }
        System.out.print("\n======================================================================");
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
