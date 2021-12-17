/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author user
 */
public class PesananException extends Exception {
    public PesananException() {
        super("tanggal, nama, jenis, total_harga atau alamat tidak boleh kosong");
    }
}
