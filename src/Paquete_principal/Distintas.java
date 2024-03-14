/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_principal;

/**
 *
 * @author Oscar Alvarez
 */
public class Distintas extends Operaciones{
    public double mayorPar(){
        double temp_vard;
        
        Otra Temp_obj = new Otra();
        
        temp_vard = Temp_obj.Mayor();
        
        if(temp_vard != 0){
            this.setValor(Double.toString(temp_vard));
            if(this.esPar()){
                return temp_vard;
            }else{
                return 0;
            }
        }
     return 0;   
    }
    
    public double mayorImpart(){
        double temp_vard;
        
        Otra Temp_obj = new Otra();
        
        temp_vard = Temp_obj.Mayor();
        
        if(temp_vard != 0){
            this.setValor(Double.toString(temp_vard));
            if(this.esImpar()){
                return temp_vard;
            }else{
                return 0;
            }
        }
     return 0;   
    }
}
