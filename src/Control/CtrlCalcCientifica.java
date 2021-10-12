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

    public String RealizarCalculo(CalcCientifica CalcCientifica) {

        switch (CalcCientifica.getOperador()) {
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
            case ("cosseno"):
                CalcCientifica.setRes("O ângulo de " + CalcCientifica.getValor1() + " tem o Cosseno de " + (Math.cos(Math.toRadians(CalcCientifica.getValor1()))));
                break;
            case ("seno"):
                CalcCientifica.setRes("O ângulo de " + CalcCientifica.getValor1() + " tem o Seno de " + (Math.sin(Math.toRadians(CalcCientifica.getValor1()))));
                break;
            case ("tangente"):
                CalcCientifica.setRes("O ângulo de " + CalcCientifica.getValor1() + " tem a Tangente de " + (Math.tan(Math.toRadians(CalcCientifica.getValor1()))));
                break;
            case ("logaritmo"):
                CalcCientifica.setRes("Logaritmo de " + CalcCientifica.getValor1() + " é: " + String.valueOf(Math.log(CalcCientifica.getValor1())));
                break;
            case ("exponencial"):
                CalcCientifica.setRes("Ëxponencial de " + CalcCientifica.getValor1() + " é: " + String.valueOf(Math.exp(CalcCientifica.getValor1())));
                break;
            case ("pi"):
                CalcCientifica.setPI(Math.PI);
                break;
            case ("euler"):
                CalcCientifica.setEuler(Math.E);
                break;
            case ("MC"):
                CalcCientifica.setMemoria(0.0);
                break;
            case ("MR"):
                //
                break;
            case ("M-"):
                CalcCientifica.setMemoria(CalcCientifica.getMemoria() - CalcCientifica.getValor1());
                break;
            case ("M+"):
                CalcCientifica.setMemoria(CalcCientifica.getMemoria() + CalcCientifica.getValor1());
                break;
            default:
                CalcCientifica.setRes("");
        }
        return CalcCientifica.getRes();
    }

}
