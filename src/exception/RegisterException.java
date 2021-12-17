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
public class RegisterException extends Exception {
    public RegisterException() {
        super("username, password, nama, alamat atau nomer hp tidak boleh kosong");
    }
}
