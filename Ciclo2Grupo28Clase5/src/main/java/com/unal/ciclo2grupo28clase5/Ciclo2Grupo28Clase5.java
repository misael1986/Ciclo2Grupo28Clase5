package com.unal.ciclo2grupo28clase5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ciclo2Grupo28Clase5 {

    public static void main(String[] args) {

        //-----WHILE-------------------
        //ejemplo1();
        //ejemplo2();
        //System.out.println(minMaquina());
        //nuncaJamas();
        //siempreCumple();
        //mayusculasASCII();
        //--------DO WHILE-------------
        //System.out.println(minMaquinaDoWhile());
        //leerMientrasBreak();
        //leerMientrasDoWhile();
        //imprimir_1_a_100();
        //imprimeParesEImpares();
        //imprimeHastaDos();
        paises();

    }

    //------------------ejemplo1--------------
    public static void ejemplo1() {
        int i = 0;
        while (i <= 6) {
            System.out.println(i);//bloque
            i = i + 1;//actualiza
        }
        System.out.println("Fin del programa");
    }

    public static void ejemplo2() {
        int i = 2;//inicializa a 'i' en 2
        int j = 25;//inicializa a 'j' en 25
        while (i < j) {//mientras 'i' sea menor a 'j'
            // imprime los valores de 'i' y 'j'
            System.out.println(i + "," + j);
            i = i * 2;//'i' se multiplica por 2 en cada iteracion
            j = j + 10;// 'j' se incrementa de 10 en 10
        }
        // se ejecuta al terminar el ciclo
        System.out.println("the end.");
        System.out.println(i + " , " + j);//valores finales de 'i' y 'j'

    }

    //-----------minimo numero de la maquina-----
    public static double minMaquina() {
        double Xo = 1.0;
        double Xi = Xo / 2.0;
        while (Xi > 0.0) {
            Xo = Xi;
            Xi = Xo / 2.0;
        }
        return Xo;
    }

    //---while que nunca se cumple----
    public static void nuncaJamas() {
        Scanner tec = new Scanner(System.in);
        System.out.println("digite un numero entero:");
        int x = tec.nextInt();
        int y = x + 1;
        while (x == y) {
            System.out.println("si entro al while");
        }
        System.out.println("Final");
    }

    //----siempre se cumple--------------
    public static void siempreCumple() {
        Scanner tec = new Scanner(System.in);
        System.out.println("digite un numero entero:");
        int x = tec.nextInt();
        int y = x;
        while (x == y) {
            System.out.println("si entro al while" + x);
            x++;
            ++y;
        }
        System.out.println("Final");
    }

    //-----pide letras mientras no sean mayusculas en ASCII
    public static void mayusculasASCII() {
        Scanner t = new Scanner(System.in);
        System.out.println("Digite una letra:");
        char letra = t.nextLine().charAt(0);
        while (letra <= 'A' || letra >= 'Z') {
            System.out.println("Digite una letra:");
            letra = t.nextLine().charAt(0);
        }
        System.out.println("Finalizo por ingresar la letra " + letra);
    }

    //------------------DO WHILE------------------------
    public static double minMaquinaDoWhile() {
        double Xo = 1.0;
        double Xi = Xo / 2;
        do {
            Xo = Xi;
            Xi = Xo / 2.0;
        } while (Xi > 0.0);
        return Xo;
    }

    //-----------lea mientras break-------------------
    public static void leerMientrasBreak() {
        int suma = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Ingrese un numero entero ");
            System.out.println("a sumar o '0' para salir:");
            int dato = Integer.parseInt(sc.nextLine());
            if (dato == 0) {
                break;
            }
            suma += dato;
        }
        System.out.println("La suma es:" + suma);
    }

    //---------------------
    public static void leerMientrasDoWhile() {
        Scanner sc = new Scanner(System.in);
        int dato;
        int suma = 0;
        do {
            System.out.print("Ingrese un numero entero ");
            System.out.println("a sumar o '0' para salir:");
            dato = Integer.parseInt(sc.nextLine());
            suma += dato;
        } while (dato != 0);
        System.out.println("La sumaes:" + suma);
    }

    //---------------imprimir del 1 al 100-----------
    public static void imprimir_1_a_100() {
        int a = 1;
        do {
            System.out.println(a + " " + (a * a));
            a++;
        } while (a <= 100);
    }

    //----------imprimir pares e impares-------
    public static void imprimeParesEImpares() {
        int d = 1;
        while (d <= 1000) {
            if (d % 2 == 1) {
                System.out.println(d);
            }
            d++;
        }
        System.out.println("- - - - - - - - - - -");
        int f = 1;
        while (f <= 1000) {
            if (f % 2 == 0) {
                System.out.println(f);
            }
            f++;
        }

    }

    //-----------------------------
    public static void imprimeHastaDos() {
        Scanner op = new Scanner(System.in);
        System.out.println("digite un numero mayor a 2:");
        int inicial = op.nextInt();
        while (inicial >= 2) {
            System.out.println(inicial);
            inicial--;
        }
    }
    //---------paises poblacion---------------

    public static void paises() {
        double paisA, paisB;
        int anio = 2022;
        paisA = 25000000;//2%
        paisB = 18900000;//3%
        while (paisA > paisB) {
            paisA = paisA + (paisA * 0.02);
            paisB = paisB + (paisB * 0.03);

            System.out.println("Año " + anio + " -> " + "Pais A = "+paisA+
                    "\tPais B ="+paisB);
            anio++;
        }
        System.out.println("el pais B sobrepasara al pais A en el a\u00F1o " +
                anio);

    }

}
