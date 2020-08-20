/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nelson.clase02.com.nelson.clase02;

/**
 *
 * @author nelson
 */
public class claseInicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println(libro.toString());
//        System.out.println(Objetolibro2.getNumeroPaginas());

        Libros Objetolibro1 = new Libros(1, "PROGRAMACION JAVA", 100, "Deitel");
        Libros Objetolibro2 = new Libros(1, "PROGRAMACION PHP", 600, "Deitel");
        Objetolibro1.setNumeroPaginas(800);

        if (Objetolibro1.getNumeroPaginas() < Objetolibro2.getNumeroPaginas()) {
            System.out.println("El libro 2 es mayo que el libro 1, y su numero de paginas es de "
                    + Objetolibro2.getNumeroPaginas());
            System.out.println("LA INFORMACION DEL LIBRO 2 ES " + Objetolibro2.toString());
        } else {
            System.out.println("El libro 1 es mayo que el libro 2, y su numero de paginas es de "
                    + Objetolibro1.getNumeroPaginas());
            System.out.println("LA INFORMACION DEL LIBRO 1 ES  " + Objetolibro1.toString());
        }
    }

}
