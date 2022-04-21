/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.Main to edit this template
 */
package my.BankGUIs;

import my.BankObjects.Account;

/**
 *
 * @author Danial
 */

public class Main {

    static Account account1 = new Account("Danial", 5000, 2000);
    static Account account2 = new Account("Stephen", 500, 200);
    static Account account3 = new Account("", 0, 0);
    
    public static void main(String args[]) {
        System.out.print("yo");
        MainPage page = new MainPage();
        page.setVisible(true);
    }
}
