/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_principal;

/**
 *
 * @author Oscar Alvarez
 */
public class Otra extends Numeros{
    public double Mayor(){
        if(this.a > this.b){
            return this.a;
        }else if( this.a < this.b){
            return this.b;
        }else {
            return 0;
        }
    }
    
    public double Menor(){
        if(this.a < this.b){
            return this.a;
        }else if( this.a > this.b){
            return this.b;
        }else {
            return 0;
        }
    }
}
