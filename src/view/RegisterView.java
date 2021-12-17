/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;



import Exception.RegisterException;
import java.sql.SQLException;
import java.util.Scanner;
import model.Register;

/**
 *
 * @author user
 */
public class RegisterView {
    static Register register;

    public static void register() throws SQLException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukan id : ");
            int id = scanner.nextInt();
            scanner.nextLine();
                    
            System.out.print("Masukan Username : ");
            String username = scanner.nextLine();

            System.out.print("Masukan Password : ");
            String password = scanner.nextLine();

            System.out.print("Masukan Nama : ");
            String nama = scanner.nextLine();

            System.out.print("Masukan No HP : ");
            String no_hp = scanner.nextLine();

            System.out.print("Masukan Alamat : ");
            String alamat = scanner.nextLine();

            if (username.isEmpty() || password.isEmpty() || nama.isEmpty() || no_hp.isEmpty() || alamat.isEmpty()) {
                throw new RegisterException();
            }

            register = new Register();

            int result = register.addPelanggan(id, username, password, nama, no_hp, alamat);
            if (result > 0) {
                System.out.println("Akun berhasil terdaftar \nsilahkan login terlebih dahulu");
                Homepage.backToLogin();
            }
        } catch (RegisterException e) {
            System.out.println(e.getMessage());
        }
    }
}
