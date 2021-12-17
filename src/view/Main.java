/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Main {
    
     public static void main(String[] args) {
        try {
            Homepage.menuAwal();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
