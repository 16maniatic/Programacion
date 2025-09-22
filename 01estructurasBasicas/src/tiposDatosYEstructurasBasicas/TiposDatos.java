package tiposDatosYEstructurasBasicas;

public class TiposDatos {
    @SuppressWarnings("unused")
    public TiposDatos(){
        System.out.println("Tipos de datos");
        System.out.println("");

        // BYTE
        byte tipoByte=0;
        tipoByte =24;
        System.out.println("tipoByte: " +tipoByte);
        System.out.println("");

        // VARIABLES
        int x;
        x=5;
        System.out.println("El valor actual de x es "+x);
        x=10;
        System.out.println("Ahora el valor es " +x);

        long tipoLong = 152159822321151L;

        // CARACTERES
        char tipoChar = 's';
        char letra= 'i';
        System.out.println(tipoChar + "" +letra); 
        char c ='A';
        int codigoASCII=c;
        System.out.println("El codigo ASCII de " +c+ " es: " +codigoASCII);

    }
}
