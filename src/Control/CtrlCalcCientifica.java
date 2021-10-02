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
    
    public Double RealizarCalculo(CalcCientifica CalcCientifica){
        
        switch (CalcCientifica.getOperador()){
            case ('+'):
                CalcCientifica.setRes(CalcCientifica.getValor1() + CalcCientifica.getValor2());
                break;
            case ('-'):
                CalcCientifica.setRes(CalcCientifica.getValor1() - CalcCientifica.getValor2());
                break;
            case ('*'):
                CalcCientifica.setRes(CalcCientifica.getValor1() * CalcCientifica.getValor2());
                break;
            case ('/'):
                CalcCientifica.setRes(CalcCientifica.getValor1() / CalcCientifica.getValor2());
                break;
                
            default: CalcCientifica.setRes(0);
        }
        return CalcCientifica.getRes();
    }
    
}
