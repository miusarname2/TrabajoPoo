/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_principal;

/**
 *
 * @author Oscar Alvarez
 */
public class Numeros {
    String valor,nombre;
    double a,b;
    int identificacion;
    
    public boolean esNumero(){
         if(this.valor.equals("")){
            return false;
        }
      
       
        if (this.valor.matches("[0.0-9.9]*")) {
            return true;
        }
        
        return false;
    }
    
    public boolean esPar(){
        
        double temp_var;
        
        temp_var = Double.parseDouble(this.valor);
        
        if((temp_var % 2) == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public  boolean esImpar(){
        
        double temp_var;
        
        temp_var = Double.parseDouble(this.valor);
        
        if((temp_var % 2) != 0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean carater(){
         if(this.valor.equals("")){
            return false;
        }     
        if (!(this.valor.matches("[0.0-9.9]*"))) {
            return true;
        }
        
        return false;
    }    
    
}
