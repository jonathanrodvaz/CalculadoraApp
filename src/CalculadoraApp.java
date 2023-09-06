import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while(true) {
            System.out.println("****Aplicacion Calculadora****");
            //Mostramos el menu
            System.out.println("1. Suma \n2. Resta \n3. Multiplicacion");
            System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    """);
            System.out.print("Operacion a realizar?");
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //Revisar que este dentro de las opciones mencionadas.
                if (operacion >= 1 && operacion <= 4) {
                    System.out.print("Proporciona valor operando1: ");
                    var operando1 = Integer.parseInt(consola.nextLine());
                    System.out.print("Proporciona valor operando2: ");
                    var operando2 = Integer.parseInt(consola.nextLine());
                    int resultado;
                    switch (operacion) {
                        case 1 -> { //Para realizar Suma
                            resultado = operando1 + operando2;
                            System.out.println("Resultado Suma: " + resultado);
                        }
                        case 2 -> { //Para realizar Resta
                            resultado = operando1 - operando2;
                            System.out.println("Resultado Resta: " + resultado);
                        }
                        case 3 -> { //Para realizar Multiplicación
                            resultado = operando1 * operando2;
                            System.out.println("Resultado Multiplicación: " + resultado);
                        }
                        case 4 -> { //Para realizar Division
                            resultado = operando1 / operando2;
                            System.out.println("Resultado Division: " + resultado);
                        }
                        default -> {
                            System.out.println("Opcion erronea: " + operacion);
                        }

                    }

                } else if (operacion == 5) { //Opcion salida
                    System.out.println("Muchas gracias por utilizar la calculadora, hasta pronto...!");
                    break;
                } else {
                    System.out.println("Opcion erronea: " + operacion);
                }
                //Imprimimos un salto de linea antes de repetir el ciclo
                System.out.println();
            } //Fin Try
            catch(Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        } //Fin ciclo while
    } //Fin del main
} //Fin de clase
