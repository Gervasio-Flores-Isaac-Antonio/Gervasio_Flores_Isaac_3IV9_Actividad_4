import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Gervasio_Flores_Isaac_3IV8_Actividad_4 {

    public static void main(String[] args) throws InterruptedException {

       Scanner scann;

        String menu;
        do {
            menu = new String("");
            System.out.println("Menu");
            System.out.println("1 PRECIO DEL ABONO SE LE APLICA UN DESCUENTO");
            System.out.println("2 CONVERTIR UN NUMERO DECIMAL A BINARIO");
            System.out.println("3 CONVIERTA TEMPERATURA EN GRADOS CELSIUS A GRADOS FAHRENHEIT, KELVINE Y RANKINE");
            System.out.println("4 INTRODUCE UNA SERIE DE NUMEROS DEBERA CONTAR CUANTOS SON POSITIVOS  Y CUANTOS NEGATIVOS");
            System.out.println("5 ");
            System.out.println("6 ");
            System.out.println("7 ");
            System.out.println("8 ");
            System.out.println("9 ");
            System.out.println("10 ");
            System.out.println("11 ");
            System.out.println("12 ");
            System.out.println("13 ");
            System.out.println("14 Salir");
            System.out.println("");

            System.out.println("Opcion: ");

            scann = new Scanner(System.in);
            menu = scann.nextLine();

            switch (menu) {

                case "1":
                    String menu1;
                    do {
                        menu1 = new String("");
                        System.out.println("******************************************************************");
                        System.out.println("******************************************************************");
                        System.out.println(" 1 ");
                        System.out.println("PARA CALCULAR EL DESCUENTO QUE TIENE, FAVOR DE INGRESAR SU EDAD...");
                        int edad = scann.nextInt();
                        if (edad >= 65) {
                            System.out.println(" edad mayor a 65  ");
                            System.out.println("TU DESCUENTO ES DE 40 % ");
                            System.out.println("******************************************************************");
                            System.out.println("******************************************************************");
                            Thread.sleep(3000);
                        } else if (edad <= 21) {
                            System.out.println(" edad menor a 21  ");
                            System.out.println("PARA CALCULAR EL DESCUENTO QUE TIENE, INDICA TUS PADRES SON SOCIOS?, SI O NO ");
                            scann = new Scanner(System.in);
                            String socios = scann.nextLine();
                            if (socios.equalsIgnoreCase("si")) {
                                System.out.println("TU DESCUENTO ES DE 45 % ");
                                System.out.println("******************************************************************");
                                System.out.println("******************************************************************");
                                Thread.sleep(3000);
                            } else if (socios.equalsIgnoreCase("no")) {
                                System.out.println("TU DESCUENTO ES DE 25 % ");
                                System.out.println("******************************************************************");
                                System.out.println("******************************************************************");
                                Thread.sleep(3000);
                            }
                        } else {
                            System.out.println("NO TIENES DESCUENTO !");
                            System.out.println("******************************************************************");
                            System.out.println("******************************************************************");
                            Thread.sleep(3000);
                        }
                        System.out.println("****  OPRIME S PARA REGRESAR AL MENU PRINCIPAL CUALQUIER OTRA TECLA PARA CONTINUAR  ********");
                        scann = new Scanner(System.in);
                        menu1 = scann.nextLine();

                    } while (!menu1.equalsIgnoreCase("s"));
                    break;

   case "2":
                    System.out.println(" 2 ");

                    String menu2;
                    do {
                        menu2 = new String("");
                        int numero, exp, digito;
                        double binario;

                        do {
                            System.out.print("Introduce un numero entero >= 0: ");
                            scann = new Scanner(System.in);
                            numero = scann.nextInt();
                        } while (numero < 0);

                        exp = 0;
                        binario = 0;
                        while (numero != 0) {
                            digito = numero % 2;
                            binario = binario + digito * Math.pow(10, exp);
                            exp++;
                            numero = numero / 2;
                        }
                        System.out.printf("Binario: %.0f %n", binario);
                        System.out.println(" ");
                        System.out.println("******************************************************************");
                        System.out.println("******************************************************************");
                        System.out.println("****  OPRIME S PARA REGRESAR AL MENU PRINCIPAL CUALQUIER OTRA TECLA PARA CONTINUAR  ********");
                        scann = new Scanner(System.in);
                        menu2 = scann.nextLine();
                    } while (!menu2.equalsIgnoreCase("s"));

                    break;

    case "3":
                    System.out.println(" 3 ");

                    float centigrado,fahrenheit,kelvin,rankine;
                    int resp,datoIn;

                   // Scanner teclado = new Scanner(System.in);
                    scann = new Scanner(System.in);
                    resp = 1;

                    while (resp == 1) {

                        System.out.println("PROGRAMA PARA CONVERTIR grados CENTiGRADOS A grados FAHRENHEIT O KELVIN");

                        System.out.println("");

                        System.out.println("Ingrese la temperatura en grados CENTIGRADOS");

                        System.out.println("");

                        centigrado = scann.nextFloat();

                        System.out.println("Si desea convertir a grados fahrenheit presione 1 ");

                        System.out.println("");

                        System.out.println("Si desea convertir a grados kelvin presione 2 ");

                        System.out.println("");
                        
                        System.out.println("Si desea convertir a grados rankine presione 3 ");

                        System.out.println("");

                        datoIn = scann.nextInt();

                        switch (datoIn) {

                            case 1:

                                fahrenheit = (float) (centigrado * 1.8 + 32);

                                System.out.println(fahrenheit + " grados Fahrenheit");
                                System.out.println(" ");
                                System.out.println("******************************************************************");
                        System.out.println("******************************************************************");

                                break;

                            case 2:

                                kelvin = (float) (centigrado + 273.15);

                                System.out.println(centigrado + " grados centigrados equivalen a " + kelvin + " grados kelvin");
                                System.out.println(" ");
System.out.println("******************************************************************");
                        System.out.println("******************************************************************");
                                break;

                                case 3:
                               // 12 °C × 9/5 + 491.67
                                rankine = (float) (centigrado * 9/5 + 491.67);

                                System.out.println(centigrado + " grados centigrados equivalen a " + rankine + " grados rankine");
                                System.out.println(" ");
System.out.println("******************************************************************");
                        System.out.println("******************************************************************");
                                break;

                            default:

                                System.out.println("SOLO DEBE DIGITAR 1 o 2");

                        }

                        System.out.println("Desea hacer otra conversion? digite: 1 si / 2 no");
System.out.println("******************************************************************");
                        System.out.println("******************************************************************");
                        resp = scann.nextInt();

                    }

                    break;

case "4":
                   
            String menu3;
            System.out.println("******************************************************************");
                        System.out.println("******************************************************************");
            System.out.println("INTRODUCE NUMEROS POSITIVOS O NEGATIVOS, AL TERMMINAR INTRODUCE ' OK '...");
            do {
             menu3 = new String("");
             boolean flag = true;
            int contar = 0;
            int contar2 = 0; 
             
             do{   
              System.out.println("INTRODUCE UN NUMERO Y PRESIONA ENTER...");    
              String dato = scann.nextLine();
                    if(!dato.equalsIgnoreCase("ok")){
                        int numero = Integer. parseInt(dato);
                        if (numero > 0) {
                            contar++;
                            } else {
                                    contar2++;
                                    }
                      }else{
                        flag=false;
                        }
             }while(flag);
        
            System.out.println("contador final numeros positivos: "+ contar );
            System.out.println("contador final numeros negativos: "+ contar2 );  
            System.out.println(" ");
            System.out.println("******************************************************************");
                        System.out.println("******************************************************************");
            System.out.println("****  OPRIME S PARA REGRESAR AL MENU PRINCIPAL CUALQUIER OTRA TECLA PARA CONTINUAR  ********");
                scann = new Scanner(System.in);
                menu3 = scann.nextLine();
            } while (!menu3.equalsIgnoreCase("s"));
                   
            break;
    
                    
                    
                    case "5":
                    break;
                    
                    case "6":
                    break;
                    
                    case "7":
                    break;
                    
                    case "8":
                    break;
                    
                    case "9":
                    break;
                    
                    case "10":
                    break;
                    
                default:
                    break;
            }
        } while ((!menu.equals("14")));
        System.out.println("SALIENDO WHILE....");
    }//DO WHILE

}//CLASE
