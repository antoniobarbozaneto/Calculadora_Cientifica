/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.CalcCientifica;

/**
 *
 * @author Neto Barboza
 */
public class CtrlCalcCientifica {
    
    public String RealizarCalculo(CalcCientifica CalcCientifica){
        
        switch (CalcCientifica.getOperador()){
            case ("+"):
                CalcCientifica.setRes(String.valueOf(CalcCientifica.getValor1() + CalcCientifica.getValor2()));
                break;
            case ("-"):
                CalcCientifica.setRes(String.valueOf(CalcCientifica.getValor1() - CalcCientifica.getValor2()));
                break;
            case ("*"):
                CalcCientifica.setRes(String.valueOf(CalcCientifica.getValor1() * CalcCientifica.getValor2()));
                break;
            case ("/"):
                CalcCientifica.setRes(String.valueOf(CalcCientifica.getValor1() / CalcCientifica.getValor2()));
                break;
            case ("cos"):
                CalcCientifica.setRes("O ângulo de " + CalcCientifica.getValor1() + " tem o Cosseno de " + (Math.cos(Math.toRadians(CalcCientifica.getValor1()))));
                break;
            case ("seno"):
                CalcCientifica.setRes("O ângulo de " + CalcCientifica.getValor1() + " tem o Seno de " + (Math.sin(Math.toRadians(CalcCientifica.getValor1()))));
                break;
            case ("tang"):
                CalcCientifica.setRes("O ângulo de " + CalcCientifica.getValor1() + " tem a Tangente de " + (Math.tan(Math.toRadians(CalcCientifica.getValor1()))));
                break;
                
            default: CalcCientifica.setRes("");
        }
        return CalcCientifica.getRes();
    }
    
}
