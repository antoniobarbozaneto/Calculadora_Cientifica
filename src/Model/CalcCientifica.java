/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Neto Barboza
 */
public class CalcCientifica {
    private String Operador; 
    private double Valor1;
    private double Valor2;
    private String Res;
            
    public CalcCientifica(){
        Operador = "";
    }
    
    //getters e setters

    public double getValor1() {
        return Valor1;
    }

    public void setValor1(double Valor1) {
        this.Valor1 = Valor1;
    }

    public double getValor2() {
        return Valor2;
    }

    public void setValor2(double Valor2) {
        this.Valor2 = Valor2;
    }

    public String getRes() {
        return Res;
    }

    public void setRes(String Res) {
        this.Res = Res;
    }

    public String getOperador() {
        return Operador;
    }

    public void setOperador(String Operador) {
        this.Operador = Operador;
    }
    
    
}
