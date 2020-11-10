    package com.alepuente;

    import java.util.Scanner;

    public class Pentagono implements Shape{

        private double lado;
        private double radio;
        private double apotema;

        public Pentagono (double lado, double radio, double apotema) {
            this.lado =lado;
            this.radio =radio;
            this.apotema =apotema;
    }
        public Pentagono() {
            System.out.println("Valor del radio: ");
            Scanner sn = new Scanner(System.in);
            radio = sn.nextInt();

            System.out.println("Valor de la apotema: ");
            Scanner sn1 = new Scanner(System.in);
            apotema = sn1.nextInt();

            System.out.println("Valor del lado: ");
            Scanner sn2 = new Scanner(System.in);
            lado = sn2.nextInt();
        }

        public void setRadio(double radio ){
            this.radio = radio;
        }
        public double getBase(){
            return radio;
        }

        public void setApotema(double apotema){
            this.apotema = apotema;
        }
        public double getApotema(){
            return apotema;
        }

        public void setLado(double lado){
            this.lado = lado;
        }
        public double getLado(){
            return lado;
        }

        @Override
        public double area() {
            return (lado*5)*apotema/2;
        }

        @Override
        public double perimeter() {
            return (lado*5);
        }
    }

