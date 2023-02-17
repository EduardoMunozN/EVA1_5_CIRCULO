/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_5_circulo;

/**
 *
 * @author eduar
 */
public class circulo {
    private double radio;
    private double perimetro;
    private double area;
    
    
    public circulo (){ //constrcutor default
        double radio;
        double pi = 3.1416;
        }
    //métodos para operar
    
    public double getRadio (){
        return radio;
        
    }
    public void setRadio (double valor){
        radio = valor;
        System.out.println("El radio del círculo es de: " +radio);
    }
     public void setArea (){
         //calcular el area del circulo
         //return Math.PI * radio * radio
          double area = Math.PI * Math.pow(radio, 2);
          System.out.println("El área del círculo es de: " +area);
    }
     public void setPerimetro (){
         //calcular el perímetro del círculo
         //Math.PI (radio * 2);
         double diametro = 2*radio;
        double perimetro = Math.PI*diametro;
        System.out.println("El perímetro del círculo es de: " +perimetro);
    }
   

   
    
}
