import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcion;
        int celsius;
        int fahrenheit = 0;
        int kelvin = 0;
        int rankine = 0;
        int reaumur = 0;

        boolean repeticion = false;
        boolean salir = false;
        do {
            System.out.println("\tMENÚ");
            System.out.println("1) Celsius a Fahrenheit");
            System.out.println("2) Celsius a Kelvin");
            System.out.println("3) Celsius a Rankine");
            System.out.println("4) Celsius a Réaumur");
            System.out.println("5) Fahrenheit a Celsius");
            System.out.println("6) Fahrenheit a Kelvin");
            System.out.println("7) Fahrenheit a Rankine");
            System.out.println("8) Fahrenheit a Réaumur");
            System.out.println("9) Kelvin a Celsius");
            System.out.println("10) Kelvin a Fahrenheit");
            System.out.println("11) Kelvin a Rankine");
            System.out.println("12) Kelvin a Réaumur");
            System.out.println("13) Rankine a Celsius");
            System.out.println("14) Rankine a Fahrenheit");
            System.out.println("15) Rankine a Kelvin");
            System.out.println("16) Salir");

            System.out.print("Digite su opcion: \n>> ");
            opcion = teclado.nextInt();
            do switch (opcion) {
                case 1:
                    System.out.println("Ingreso a la opcion de Celsius a Fahrenheit");
                    System.out.print("Ingrese el numero de grados Celsius ");
                    celsius = teclado.nextInt();
                    fahrenheit = (celsius*9/5)+32;
                    System.out.println("La conversion entre " + celsius +"° Celcius es: "+ fahrenheit + "° Fahrenheit");
                    salir = true;
                    break;

                case 2:
                    System.out.println("Ingreso a la opcion de Celsius a Kelvin");
                    System.out.print("Ingrese el numero de grados Celsius ");
                    celsius = teclado.nextInt();
                    kelvin = (int) (celsius+273.15);
                    System.out.println("La conversion entre " + celsius +"° Celcius es: "+ kelvin + "° Kelvin");
                    salir = true;

                    break;
                case 3:
                    System.out.println("Ingreso a la opcion de Celsius a Rankine");
                    System.out.print("Ingrese el numero de grados Celsius ");
                    celsius = teclado.nextInt();
                    rankine = (int) ((celsius+273.15)*9/5);
                    System.out.println("La conversion entre " + celsius +"° Celcius es: "+ rankine + "° Rankine");
                    salir = true;

                    break;

                case 4:
                    System.out.println("Ingreso a la opcion de Celsius a Réaumur");
                    System.out.print("Ingrese el numero de grados Celsius ");
                    celsius = teclado.nextInt();
                    reaumur = (celsius*4/5);
                    System.out.println("La conversion entre " + celsius +"° Celcius es: "+ reaumur + "° Réaumur");
                    salir = true;

                    break;
                case 5:
                    System.out.println("Ingreso a la opcion de Fahrenheit a Celsius");
                    System.out.print("Ingrese el numero de grados Fahrenheit ");
                    fahrenheit = teclado.nextInt();
                    celsius = (fahrenheit-32)*5/9;
                    System.out.println("La conversion entre " + fahrenheit +"° Fahrenheit es: "+ celsius + "° Celsius");
                    salir = true;

                    break;

                case 6:
                    System.out.println("Ingreso a la opcion de Fahrenheit a Kelvin");
                    System.out.print("Ingrese el numero de grados Fahrenheit ");
                    fahrenheit = teclado.nextInt();
                    kelvin = (int) ((fahrenheit-32)*5/9+273.15);
                    System.out.println("La conversion entre " + fahrenheit +"° Fahrenheit es: "+ kelvin + "° Kelvin");
                    salir = true;

                    break;
                case 7:
                    System.out.println("Ingreso a la opcion de Fahrenheit a Rankine");
                    System.out.print("Ingrese el numero de grados Fahrenheit ");
                    fahrenheit = teclado.nextInt();
                    rankine = (int) (fahrenheit+459.67);
                    System.out.println("La conversion entre " + fahrenheit + "° Fahrenheit es: "+ rankine + "° Rankine");
                    salir = true;

                    break;

                case 8:
                    System.out.println("Ingreso a la opcion de Fahrenheit a Réaumur");
                    System.out.print("Ingrese el numero de grados Fahrenheit ");
                    fahrenheit = teclado.nextInt();
                    reaumur = (fahrenheit-32)*4/9;
                    System.out.println("La conversion entre " + fahrenheit +"° Fahrenheit es: "+ reaumur + "° Réaumur");
                    salir = true;

                    break;
                case 9:
                    System.out.println("Ingreso a la opcion de Kelvin a Celsius");
                    System.out.print("Ingrese el numero de grados Kelvin ");
                    kelvin = teclado.nextInt();
                    celsius = (int) (kelvin-273.15);
                    System.out.println("La conversion entre " + kelvin +"° Kelvin es: "+ celsius + "° Celsius");
                    salir = true;

                    break;

                case 10:
                    System.out.println("Ingreso a la opcion de Kelvin a Fahrenheit");
                    System.out.print("Ingrese el numero de grados Kelvin ");
                    kelvin = teclado.nextInt();
                    fahrenheit = (int) ((kelvin-273.15)*9/5+32);
                    System.out.println("La conversion entre " + kelvin +"° Kelvin es: "+ fahrenheit + "° Fahrenheit");
                    salir = true;

                    break;
                case 11:
                    System.out.println("Ingreso a la opcion de Kelvin a Rankine");
                    System.out.print("Ingrese el numero de grados Kelvin ");
                    kelvin = teclado.nextInt();
                    rankine = (kelvin*9/5);
                    System.out.println("La conversion entre " + kelvin +"° Kelvin es: "+ rankine + "° Rankine");
                    salir = true;

                    break;

                case 12:
                    System.out.println("Ingreso a la opcion de Kelvin a Réaumur");
                    System.out.print("Ingrese el numero de grados Kelvin ");
                    kelvin = teclado.nextInt();
                    rankine = (int) ((kelvin-273.15)*4/5);
                    System.out.println("La conversion entre " + kelvin +"° Kelvin es: "+ reaumur + "° Réaumur");
                    salir = true;

                    break;
                case 13:
                    System.out.println("Ingreso a la opcion de Rankine a Celcius");
                    System.out.print("Ingrese el numero de grados Rankine ");
                    rankine = teclado.nextInt();
                    celsius = (int) ((rankine-491.67)*5/9);
                    System.out.println("La conversion entre " + rankine +"° Rankine es: "+ celsius + "° Celsius");
                    salir = true;

                    break;

                case 14:
                    System.out.println("Ingreso a la opcion de Rankine a Fahrenheit");
                    System.out.print("Ingrese el numero de grados Rankine ");
                    rankine = teclado.nextInt();
                    fahrenheit = (int) (rankine-459.67);
                    System.out.println("La conversion entre " + rankine +"° Rankine es: "+ fahrenheit + "° Fahrenheit");
                    salir = true;

                    break;
                case 15:
                    System.out.println("Ingreso a la opcion de Rankine a Kelvin");
                    System.out.print("Ingrese el numero de grados Rankine ");
                    rankine = teclado.nextInt();
                    kelvin = rankine*5/9;
                    System.out.println("La conversion entre " + rankine +"° Rankine es: "+ kelvin + "° Kelvin");
                    salir = true;

                    break;

                case 16:
                    salir = true;
                    break;

            }while (!salir);
            System.out.println("HASTA LUEGO");
            break;
        }while (repeticion);
    }
}