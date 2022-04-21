/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package my.BankObjects;

/**
 *
 * @author Danial
 */
public class Account {

    private String name;
    private double savingsBal;
    private double chequingBal;
    
    public Account(String n, double sBal, double cBal) {
        name = n;
        savingsBal = sBal;
        chequingBal = cBal;
    }
    
    public String getName() {
        return name;
    }
    
    public double getSavingsBal() {
        return savingsBal;
    }
    
    public double getChequingBal() {
        return chequingBal;
    }
    
    public void setName(String n) {
        this.name = n;
    }
    
    public void setSavingsBal(double sBal) {
        this.savingsBal = sBal;
    }
    
    public void setChequingBal(double cBal) {
        this.chequingBal = cBal;
    }
    
}
