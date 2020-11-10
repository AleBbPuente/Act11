package com.alepuente;

import java.util.Scanner;

public class Square implements Shape{

    protected double lado;

    public Square(double lado){
        this.lado = lado;
    }

    public Square() {
        System.out.println("Valor del lado: ");
        Scanner sn = new Scanner(System.in);
        lado = sn.nextInt();
    }

    public void setLado(double lado){
        this.lado = lado;
    }
    public double getLado(){
        return lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimeter() {
        return lado * 4;
    }
}