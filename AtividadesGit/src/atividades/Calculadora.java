/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividades;

/**
 *
 * @author erikk
 */
public class Calculadora {
    
    public double somar(double a, double b) {
        return a + b;
    }

    public double media(double[] valores) {
        double soma = 0;
        for (double v : valores) {
            soma = soma + v;
        }
        return soma / valores.length;
    }
}
