package com.alepuente;

import java.util.InputMismatchException;
import java.util.Scanner;

public interface Shape {
    double area();
    double perimeter();

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion = 0, figura = 0, forma = 0;

        while (!salir) {

            System.out.println("1. Conocer Area");
            System.out.println("2. Conocer Perimetro");
            System.out.println("3. Circulo");
            System.out.println("4. Cuadrado");
            System.out.println("5. Triangulo");
            System.out.println("6. Pentagono");
            System.out.println("7. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {

                    case 1:
                        figura = 1;
                        System.out.println("Conocer área");
                        break;

                    case 2:
                        figura = 2;
                        System.out.println("Conocer perimetro");
                        break;

                    case 3:
                        Circle circulo = new Circle();
                        forma = 1;
                        if (figura == 1) {
                            System.out.println("El area es: " + circulo.area());
                        } else
                            System.out.println("El perimetro es: " + circulo.perimeter());
                        break;

                    case 4:
                        Square cuadrado = new Square();
                        forma = 2;
                        if (figura == 1) {
                            System.out.println("El area es: " + cuadrado.area());
                        } else
                            System.out.println("El perimetro es: " + cuadrado.perimeter());

                        break;

                    case 5:
                        Triangle triangulo = new Triangle();
                        forma = 3;
                        if (figura == 1) {
                            System.out.println("El area es: " + triangulo.area());
                        } else
                            System.out.println("El perimetro es: " + triangulo.perimeter());

                        break;

                    case 6:
                        Pentagono pentagono = new Pentagono();
                        forma = 4;
                        if (figura == 1) {
                            System.out.println("El area es: " + pentagono.area());
                        } else
                            System.out.println("El perimetro es: ");
                        break;

                    case 7:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 7"); }

                } catch (InputMismatchException e) {
                    System.out.println("Debes insertar un número");
                    sn.next();
                }
            }

        }

    }
