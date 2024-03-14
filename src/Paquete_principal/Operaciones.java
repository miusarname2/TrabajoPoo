/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_principal;

/**
 *
 * @author Oscar Alvarez
 */
public class Operaciones extends Numeros{
    public double areaRectangulo(){
        return this.a*this.b;
    }
    
    public double areaTrapecio(){
        double temp_var;
        
        temp_var = ((this.b+this.b)/2)*this.a;
        return temp_var;
    }
}
