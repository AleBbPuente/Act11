package com.alepuente;

    import java.util.Scanner;

    public class Triangle implements Shape{

        private double base;
        private double altura;
        private double lado;

        public Triangle(double base, double altura, double lado){
            this.base = base;
            this.altura = altura;
            this.lado = lado;
        }

        public Triangle() {
            System.out.println("Valor de la base: ");
            Scanner sn = new Scanner(System.in);
            base = sn.nextInt();

            System.out.println("Valor de la altura: ");
            Scanner sn1 = new Scanner(System.in);
            altura = sn1.nextInt();

            System.out.println("Valor del lado: ");
            Scanner sn2 = new Scanner(System.in);
            lado = sn2.nextInt();
        }

        public void setBase(double base ){
            this.base = base;
        }
        public double getBase(){
            return base;
        }
        public void setAltura(double altura){
            this.altura = altura;
        }
        public double getAltura(){
            return altura;
        }

        public void setLado(double lado){
            this.lado = lado;
        }
        public double getLado(){
            return lado;
        }

        @Override
        public double area() {
            return base * altura/2;
        }

        @Override
        public double perimeter() {
            return lado * 3;
        }
    }
