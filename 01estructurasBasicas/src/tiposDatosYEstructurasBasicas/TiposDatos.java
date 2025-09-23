package tiposDatosYEstructurasBasicas;

import java.util.Scanner;

public class TiposDatos {
    enum Dias { 
        Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo
    }

    @SuppressWarnings({ "unused", "resource" })
    public TiposDatos() {
        System.out.println("Tipos de datos");
        System.out.println("");

        // BYTE
        byte tipoByte = 0;
        tipoByte = 24;
        System.out.println("tipoByte: " + tipoByte);
        System.out.println("");

        // VARIABLES
        int x;
        x = 5;
        System.out.println("El valor actual de x es " + x);
        x = 10;
        System.out.println("Ahora el valor es " + x);

        long tipoLong = 152159822321151L;

        // CARACTERES
        char tipoChar = 's';
        char letra = 'i';
        System.out.println(tipoChar + "" + letra);
        char c = 'A';
        int codigoASCII = c;
        System.out.println("El codigo ASCII de " + c + " es: " + codigoASCII);

        // DECIMALES
        float tipoFLoat;
        tipoFLoat = (float) 24.4; // con casting
        float tipoFLoat2 = 21.1F;

        double a = 7;
        double b = 5.5;

        // CONSTANTES
        final double PI = 3.14;

        // CONVERSION DE TIPOS (CASTING)
        double div;
        int dividendo, divisor;
        dividendo = 7;
        divisor = 3;
        div = dividendo / (double) divisor;
        System.out.println(div);
        System.out.println();

        // BOOLEAN
        boolean sw = false;
        sw = true;

        // CADENAS
        String palabra = "Hola";
        String frase = "¿Como estas?";
        System.out.println(palabra);
        System.out.println(frase);
        System.out.println();

        // PEDIR POR TECLADO
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        System.out.println("El numero introducido es: " + num);
        sc = null;
        sc = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String palabra2 = sc.nextLine();
        System.out.println("La palabra introducida es: " + palabra2);
        System.out.println();
        sc.close();

        // TIPOS ENUMERADOS
        Dias diaActual = Dias.Martes;
        Dias diaSiguiente = Dias.Miercoles;
        System.out.println("Hoy es " + diaActual);
        System.out.println("Mañana será " + diaSiguiente);
    }
}
