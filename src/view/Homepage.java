/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Homepage {
    public static void menuAwal() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("-------- HomePage --------");
        System.out.println("===========================");
        System.out.println("Menu: \n"
                + "1. Login \n"
                + "2. Registrasi \n"
                + "0. Keluar");
        System.out.print("Masukan menu pilihan: ");

        String menu = scanner.nextLine();

        switch (menu) {
            case "0":
                System.out.println("------------------");
                System.out.println("Anda telah Keluar!");
                System.out.println("------------------");
                System.exit(0);
                break;
            case "1":
                LoginView.login();
                break;
            case "2":
                RegisterView.register();
                break;
            default:
                System.out.println("Pilihan Anda Salah!");
                backToLogin();
                break;
        }
    }
    public static void menuPenjual() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("-------- Menu Utama --------");
        System.out.println("============================");
        System.out.print("Menu: \n"
                + "1. Stok produk \n"
                + "2. Daftar Pesanan \n"
                + "3. Daftar Pelanggan\n"
                + "0. Keluar "
                + "\nPilih Menu> ");

        String menu = scanner.nextLine();

        switch (menu) {
            case "0":
                backToLogin();
                break;
            case "1":
                StokProdukView.daftarProduk();
                break;
            case "2":
                PesananView.daftarPesanan();
                break;
            case "3":
                PelangganView.daftarPelanggan();
                break;
            default:
                System.out.println("Pilihan Anda Salah!");
                backToMenuPenjual();
                break;
        }
    }    
    public static void menuPelanggan() throws SQLException {
    Scanner scanner = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("-------- Menu Utama --------");
        System.out.println("============================");
        System.out.print("Menu: \n"
                + "1. Lihat Produk \n"
                + "2. Tambah Pesanan \n"
                + "0. Keluar \n"
                + "Pilih Menu> ");

        String menu = scanner.nextLine();

        switch (menu) {
            case "0":
                backToLogin();
                break;
            case "1":
                StokProdukView.daftarProduk();
                break;
            case "2":
                PesananView.pesanan();
                break;
            default:
                System.out.println("Pilihan Anda Salah!");
                backToMenuPelanggan();
                break;
        }
    }       
    public static void backToLogin() throws SQLException {
        System.out.println("\n--------------------------");
        System.out.println("Tekan Enter Untuk Kembali!");
        try {
            System.in.read();
            menuAwal();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void backToMenuPenjual() throws SQLException {
        System.out.println("\n--------------------------");
        System.out.println("Tekan Enter Untuk Kembali!");
        try {
            System.in.read();
            menuPenjual();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void backToMenuPelanggan() throws SQLException {
        System.out.println("\n--------------------------");
        System.out.println("Tekan Enter Untuk Kembali!");
        try {
            System.in.read();
            menuPelanggan();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


