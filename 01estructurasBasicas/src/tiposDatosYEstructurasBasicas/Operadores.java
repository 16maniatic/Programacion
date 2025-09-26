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

        int x = 5;
        x++;
        System.out.println(x);
        ++x;
        System.out.println(x);
        System.out.println();
        int z;
        z = x++; // z=7, x=8, primero se asigna y luego se incrementa x
        System.out.println(z);
        z = ++x; // z=9, x=9, primero se incrementa x y luego se asigna
        System.out.println(z);
        System.out.println();

        // Acumuladores
        int acu = 0;
        int nota = 7;
        acu += nota;
        System.out.println("Acumulador: " + acu);
        nota = 6;
        acu += nota;
        System.out.println("Acumulador: " + acu);
        System.out.println();

        // Operadores relacionales
        // > mayor, < menor, >= mayor o igual, <= menor o igual, == igual, != distinto

        int t = 3, r = 4;
        boolean sw = false, sw1, sw2;
        System.out.println(sw);
        sw1 = t == r;
        System.out.println(sw1);
        sw2 = t != r;
        System.out.println(sw2);
        System.out.println();

        // Operadores ternarios
        int resultado = (t > r) ? t : r; // si t>r resultado=t, sino resultado=r
        int notaNumerica = 6;
        String notaCadena = (notaNumerica >= 5) ? "Aprobado" : "Suspenso"; // si nota>=5 "Aprobado", sino "Suspenso"
        System.out.println("El mayor es: " + resultado);
        System.out.println("La nota es: " + notaCadena);
        System.out.println();

        // Operadores logicos
        // && and, || or, ! not, ^ xor
        sw1 = true;
        sw2 = true;
        System.out.println(!sw1); // devuelve el valor contrario
        System.out.println(sw1 || sw2); // devuelve true si alguno es true
        System.out.println(sw1 && sw2); // devuelve true si ambos son true
        System.out.println(sw1 ^ sw2); // devuelve true si son distintos
        System.out.println();
        sw1 = false;
        System.out.println(!sw1);
        System.out.println(sw1 || sw2);
        System.out.println(sw1 && sw2);
        System.out.println(sw1 ^ sw2);
        System.out.println();

        boolean a = true;
        System.out.println("a || (6 > 10) = " + (a || (6 > 10)));

        int A = 10, B = 5, C = 3, D = 2, E = 8;
        boolean flag = true;
        // Expresion compleja mezclando TODOS los operadores
        boolean resultadoL = ++A * B / C + D % 3 > E - 2 && B <= C + D || flag && A != B * C;
        System.out.println("Resultado de la operacion compleja " + resultadoL);
        // Misma expresion con parentesis para aclarar
        boolean resultadoL2 = ((++A * B / C + D % 3) > (E - 2) && B <= (C + D)) || (flag && (A != (B * C)));
        System.out.println("Resultado de la operacion compleja " + resultadoL2);

    }
}