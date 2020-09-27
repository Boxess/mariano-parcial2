package com.mariano.menu;

import java.util.Scanner;

public class Menu {

    // CLIENTE
    // 1 CLIENTE
    // 2 PRODUCTO
    // 3 AGENCIA
    public Menu() {
        menu();
    }

    /**
     * * MÉTODO PARA DESPLEGAR EL MENÚ PRINCIPAL
     */
    private void menu() {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n");
            System.out.println("**********************************************");
            System.out.println("+++++++++ MENÚ PRINCIPAL ++++++++");
            System.out.println("1.- CLIENTES ");
            System.out.println("2.- PRODUCTOS ");
            System.out.println("3.- AGENCIAS ");
            System.out.println("4.- SALIR DEL PROGRAMA");
            System.out.println("INGRESE UNA OPCIÓN");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    menu_cliente();
                    break;
                case 2:
                    menu_productos();
                case 3:
                    menu_agencias();
                case 4:
                    System.out.println(" Saliendo .... ");
                    System.exit(0);
                default:
                    System.out.println("Ingrese una opción válida del 1 al 5");
                    break;
            }
        } while (opcion != 4);
    }

    /**
     * * Método para el menu_clientes
     */
    private static void menu_cliente() {
        int opcion = 0;
        // System.out.flush();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n");
            System.out.println("**********************************************");
            System.out.println("+++++++++MENÚ CLIENTES++++++++");
            System.out.println("1.- INGRESAR ");
            System.out.println("2.- VER TODOS ");
            System.out.println("3.- SALIR ");
            System.out.println("4.- REGRESAR AL MENÚ PRINCIPAL ");
            System.out.println("INGRESE UNA OPCIÓN");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    // Ingresar un nuevo cliente
                    nuevo_cliente();
                    break;
                case 2:
                    // Ver todos
                    mostrar_clientes();
                    break;
                case 3:
                    System.out.println(" Saliendo .... ");
                    System.exit(0);
                case 4:
                    System.out.println(" Regresando .... ");
                    Menu m = new Menu();
                    break;
                default:
                    System.out.println("Ingrese una opción válida del 1 al 5");
                    break;
            }
        } while (opcion != 4);

    }

    /**
     * * MÉTODO PARA PEDIR LOS DATOS DEL NUEVO CLIENTE
     */
    private static void nuevo_cliente() {

    }

    private static void mostrar_clientes() {

    }

    private static void menu_productos() {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        System.out.println("\n");
        System.out.println("+++++++++MENÚ PRODUCTOS++++++++");
        System.out.println("1.- INGRESAR PRODUCTO");
        System.out.println("2.- VER TODOS LOS PRODUCTOS ");
        System.out.println("3.- SALIR ");
        System.out.println("4.- REGRESAR AL MENÚ PRINCIPAL ");
        System.out.println("INGRESE UNA OPCIÓN");

        opcion = sc.nextInt();
        do {
            switch (opcion) {
                case 1:
                    // Ingresar un nuevo prducto
                    nuevo_producto();
                    break;
                case 2:
                    // Ver todos
                    mostrar_productos();
                    break;

                case 3:
                    System.out.println(" Saliendo .... ");
                    System.exit(0);
                case 4:
                    System.out.println(" Regresando .... ");
                    Menu m = new Menu();
                    break;
                default:
                    System.out.println("Ingrese una opción válida del 1 al 4");
                    break;
            }
        } while (opcion != 5);

    }

    /**
     * * Método para el menu_productos
     */
    private static void muevo_producto() {
        int opcion = 0;
        // System.out.flush();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n");
            System.out.println("**********************************************");
            System.out.println("+++++++++MENÚ CL++++++++");
            System.out.println("1.- INGRESAR ");
            System.out.println("2.- VER TODOS ");
            System.out.println("3.- SALIR ");
            System.out.println("4.- REGRESAR AL MENÚ PRINCIPAL ");
            System.out.println("INGRESE UNA OPCIÓN");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    // Ingresar un nuevo producto

                    break;
                case 2:
                    // Ver todos

                    break;
                case 3:
                    System.out.println(" Saliendo .... ");
                    System.exit(0);
                case 4:
                    System.out.println(" Regresando .... ");
                    Menu m = new Menu();
                    break;
                default:
                    System.out.println("Ingrese una opción válida del 1 al 5");
                    break;
            }
        } while (opcion != 4);

    }

    /**
     * * MÉTODO PARA PEDIR LOS DATOS DEL NUEVO PRODUCTO
     */
    private static void nuevo_producto() {

    }

    private static void mostrar_productos() {

    }

    /**
     * * Método para el menu_agencias
     */
    private static void menu_agencias() {
        int opcion = 0;
        // System.out.flush();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n");
            System.out.println("**********************************************");
            System.out.println("+++++++++MENÚ AGENCIAS++++++++");
            System.out.println("1.- INGRESAR ");
            System.out.println("2.- VER TODOS ");
            System.out.println("3.- SALIR ");
            System.out.println("4.- REGRESAR AL MENÚ PRINCIPAL ");
            System.out.println("INGRESE UNA OPCIÓN");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    // Ingresar un nueva agencia
                    nueva_agencia();
                    break;
                case 2:
                    // Ver todos
                    mostrar_agencias();
                    break;
                case 3:
                    System.out.println(" Saliendo .... ");
                    System.exit(0);
                case 4:
                    System.out.println(" Regresando .... ");
                    Menu m = new Menu();
                    break;
                default:
                    System.out.println("Ingrese una opción válida del 1 al 5");
                    break;
            }
        } while (opcion != 4);

    }

    private static void nueva_agencia() {

    }

    private static void mostrar_agencias() {

    }

}
