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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    
    
    
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
