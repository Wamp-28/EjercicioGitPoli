import java.util.Scanner;

public class Main {
    public static void main(String[] args) {












    }


}






























/*

double imc = calcularIMC();
        System.out.println("EL IMC ES: " + imc);
        System.out.println(clasificarIMC(imc));
 METODOS
  public static double calcularIMC() {
        // PESO/ALTURA^2
        Scanner teclado = new Scanner(System.in);
        double peso=0;
        double altura=0;

        System.out.print("INGRESE SU PESO");
        peso = teclado.nextDouble();

        System.out.print("INGRESE SU ALTURA");
        altura = teclado.nextDouble();


        return peso / (Math.pow(altura, 2));


    }

    public static String clasificarIMC(double imc) {

        String situacion = "";
        if (imc < 18.5) {
            situacion = "PESO BAJO";
        } else if (imc < 25) {
            situacion = "PESO NORMAL";
        } else if (imc < 30) {
            situacion = "SOBREPESO";
        } else if (imc >= 30) {
            situacion = "OBESIDAD";
        }
        return situacion;
    }



 */









/*

// variables entero

int edad = 32798;

        System.out.println(edad);



// variables de tipo decimal

float numero = 3.5f;  // 4byte

        System.out.println(numero);


double pi = 3.14;  // 8 byte

        System.out.println(pi);

//CADENA DE CARACTERES

String nombre = "JUAN";
String direccion= "CRA 5 # 9-15";
String telefonos = "31313654";

        System.out.println(nombre);
        System.out.println(direccion);
        System.out.println(telefonos);

// CARACTER

char letra = 64;
        System.out.println(letra);


// LOGICO

boolean estado = true;

        System.out.println(estado);



    }


    // CLASE  - OBJETO - INSTANCIA

        Scanner teclado = new Scanner(System.in);

        /*
        // CONDICICONAL IF

        int edad;

        System.out.println("INGRESE SU EDAD");
        edad = teclado.nextInt();

        if(edad >= 18){
            System.out.println("MAYOR DE EDAD");
        }else{
            System.out.println("MENOR DE EDAD");
        }
*/

        /*
        // IF ANIDADO

        int edad;

        System.out.println("INGRESE SU EDAD");
        edad = teclado.nextInt();
        // Y - &&
        // O ||
        if (edad >= 0 && edad <= 5) {
            System.out.println("INFANCIA");
        } else if (edad >= 6 && edad <= 11) {
            System.out.println("NIÑEZ");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Adolescencia");
        } else if (edad >= 18 && edad <= 29) {
            System.out.println("Juventud");
        } else if (edad >= 30 && edad <= 59) {
            System.out.println("Adultez");
        } else {
            System.out.println("ADULTO MAYOR");
        }*/

        /*
        // SWITCH CASE -- DECISIONES

        String operacion;
        System.out.println("Escriba el tipo de operacion a realizar suma, resta, multiplicacion, division");
        operacion = teclado.next();

        switch (operacion.toUpperCase()) {
            case "SUMA":
                System.out.println("Vamos a desarrollar una suma");
                break;

            case "RESTA":
                System.out.println("Vamos a desarrollar una resta");
                break;

            case "division":
                System.out.println("Vamos a desarrollar una division");
                break;

            case "multiplicacion":
                System.out.println("Vamos a desarrollar una multiplicacion");
                break;

            default:
                System.out.println("OPERACION NO EXISTE");
        }
        */
/*
        int op = 1;

        switch (op) {
            case 1:
                System.out.println("OPERACION");
                break;

            case 2:
                System.out.println("oprecaion 2");
                break;

            default:
                System.out.println("NO ESTA");
        }
*/

// CICLOS - FOR - PARA

        /*
        int suma = 0;
        for(int i=1; i<=100; i++ ){
            suma+=i;
        }
        System.out.println("LA SUMA ES: " + suma);
*/

        /*
        int tabla;

        for (int i = 1; i <= 10; i++) {
            System.out.println("LA TABLA DE " + i);
            for(int j = 1; j<=10;j++){
                System.out.println(i + "*" + j + "=" + (i * j));
            }

        }
        */


        /*
        // while - mientras que

        int numero = 1;

        while(numero <= 10){
            System.out.println(numero);
            numero++;
        }

        System.out.println("-----------------------------------------");

        int numero2=11;
        do{
            System.out.println(numero2);
            numero2+=2;
        }while(numero2<=10);
*/

        /*
        String nombre;
        System.out.print("INGRESE UN NOMBRE");
        nombre = teclado.nextLine();

        System.out.println("EL NOMBRE INGRESADO ES: " + nombre);
*/

/*
    // METODOS


        System.out.println(suma(5,4));
        System.out.println(suma(15,35));
        System.out.println(suma(35,46));


        System.out.println( suma(24,35));

        System.out.println(saludo("Lorena"));



}

public static int suma(int n1, int n2) {
    return n1 + n2;
}

public static String saludo(String nombre){
    return "HOLA: " + nombre;
}

// SIN PARAMETROS SIN RETORNO

    public static void suma(){

        int n1=5;
        int n2=6;
        int sum=n1+n2;

        System.out.println("LA SUMA ES: " + sum);

    }

    // SIN PARAMETROS CON RETORNO

    public static double OperacionDecimal(){

        return (3.14*2);
    }

    // CON PARAMETROS SIN RETORNO

    public static void EntregarNombre(String nombre){

        System.out.println("SU NOMBRE ES: " + nombre);
    }

    // CON PARAMETROS CON RETORNO

    public static String saludar(String nombre,String apellido){

        return "ME LLAMO " + nombre + " "+apellido;

    }

    */