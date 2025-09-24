package tiposDatosYEstructurasBasicas;

public class Operadores {

    public Operadores() {
        System.out.println("Tipos de operadores");
        int suma, c = -5, d = 3, e = 2, mult;
        double suma2, num1 = 5.5, num2 = 2.3;
        suma = c - d;
        mult = c * d;
        System.out.println("La suma de " + c + " y " + d + " = " + suma);
        System.out.println("La multiplicacion de " + c + " y " + d + " = " + mult);

        int op = c + d * e; // prioridad de operadores
        System.out.println("El resultado de c + d * e = " + op);
        suma2 = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " = " + suma2);
        suma = (int) (num1 + num2); // casting
        System.out.println("La suma de " + num1 + " y " + num2 + " = " + suma);
        suma2 = d + e;
        System.out.println("La suma de " + d + " y " + e + " = " + suma2);

        int divEntera, divid = 7, div = 3;
        double divReal, div2 = 3;
        divEntera = divid / div; // division entera
        System.out.println("La division entera de " + divid + " y " + div + " = " + divEntera);
        divReal = divid / div; // division real
        System.out.println("La division real de " + divid + " y " + div2 + " = " + divReal);
        divReal = (double) divid / div; // division real con casting
        System.out.println("La division real de " + divid + " y " + div + " = " + divReal);

        divReal = divid / div2; // division real con conversion implicita
        System.out.println("La division real de " + divid + " y " + div2 + " = " + divReal);

        int resto;
        divid = 8;
        div = 3;
        resto = divid % div;
        System.out.println("El resto de la division de " + divid + " y " + div + " = " + resto);

        int cont = 0;
        cont++;
        System.out.println(cont);
        cont += 2;
        System.out.println(cont);
        cont *= 3;
        System.out.println(cont);


        int x=5;
        x++;
        System.out.println(x);
        ++x;
        System.out.println(x);
        System.out.println();
        int z;
        z=x++; // z=7, x=8, primero se asigna y luego se incrementa x
        System.out.println(z);
        z=++x; // z=9, x=9, primero se incrementa x y luego se asigna
        System.out.println(z);

    }
}
