
package pilasycolas;

import java.util.Scanner;

public class PilasyColas {

    Scanner op = new Scanner(System.in);
    Cola cola = new Cola();
    Pila pila = new Pila();
    PilaString pilaString = new PilaString();
    
    public void menu(){
        PilasyColas objeto = new PilasyColas();
        boolean salir = false;
        int opcion = 0;
        
        while(!salir){
            System.out.println("----------BIENVENIDO----------");
            System.out.println("\n\t       OPCION 1");
            System.out.println("\t*****Ejercicio 1*****");
            System.out.println("Llenar una pila con números para invertirla ");
            
            System.out.println("\n\t      OPCION 2");
            System.out.println("\t*****Ejercicio 2*****");
            System.out.println("Llenar 2 colas con números para hacer la suma de ambas ");

            System.out.println("\n\t    OPCION 3");
            System.out.println("\t*****Ejercicio 3*****");
            System.out.println("Ingresar una palabra para invertirla ");

            System.out.println("\n\t    OPCION 4");
            System.out.println("\t*****Ejercicio 4*****");
            System.out.println("Llenar una pila paréntesis para saber si todos están cerrados ");

            System.out.println("\n\t5. Salir");
            System.out.println("Selecciona la opción");
            opcion = op.nextInt();
            op.nextLine();
            switch(opcion){
                case 5:
                    salir = true;               
                    break;
                default:                            
            }
            objeto.menu2(opcion);
        }
    }
    
 
    public void menu2(int opcion ){
        boolean salir = false;         
        int seleccion;
        while(!salir){
           switch(opcion){
            case 1:
                System.out.println("1. Agregar dato a la pila A"); 
                System.out.println("2. Mostrar pila A invertida");
                System.out.println("0. Atras");
                seleccion = op.nextInt();
                op.nextLine();
                if(seleccion == 1){
                    System.out.println("Ingrese dato para la pila A: ");
                    int dato = op.nextInt();
                    pila.push(dato);
                }else if( seleccion == 2){
                    pila.reversePila();
                    pila.imprimirPilaA();
                    pila.imprimirPilaB();
                }
                else if(seleccion ==0){
                    salir = true;               
                    break;
                }
                break;
            case 2:
                System.out.println("1. Ingresar datos a las 2 colas");
                System.out.println("2. Mostrar la suma de las 2 colas");
                System.out.println("0. Atras");
                seleccion = op.nextInt();
                op.nextLine();
                if(seleccion == 1){
                    System.out.println("Ingrese dato para la PRIMERA COLA: ");
                    int datoA = op.nextInt();
                    System.out.println("Ingrese dato para la SEGUNDA COLA: ");
                    int datoB = op.nextInt();
                    op.nextLine();
                    cola.pushResultado(cola.push(datoA), cola.push2(datoB));        
                }else if( seleccion == 2){
                    cola.imprimirDatosCola();}
                else if(seleccion ==0){
                    salir = true;               
                    break;
                }
                break;
            case 3:  
                System.out.println("1. Ingresar datos a la pila String");
                System.out.println("2. Mostrar datos invertidos de la pila String");
                System.out.println("0. Atras");
                seleccion = op.nextInt();
                op.nextLine();
                if(seleccion == 1){
                    String palabra;
                    System.out.println("Ingrese su cadena: ");
                    palabra = op.nextLine();
                    pilaString.pushCadena(palabra);
                    pilaString.reversePilaCadena();  
                }else if( seleccion == 2){
                    pilaString.imprimirPilaCadena();}
                else if(seleccion ==0){
                    salir = true;               
                    break;
                }
                break;
            case 4:           
                System.out.println("1. Llenar pila con paréntesis");
                System.out.println("2. Todos los paréntesis están cerrados?");
                System.out.println("0. Atras");
                seleccion = op.nextInt();
                op.nextLine();
                if(seleccion == 1){
                    System.out.println("Ingrese paréntesis: ");
                    char caracter = op.next().charAt(0);
                    pilaString.pushParentesis(caracter);
                }else if( seleccion == 2){
                    if(pilaString.vaciaP()== true){
                    System.out.println("Felicidades, la pila está vacía");
                    }else{
                        pilaString.imprimirPilaP();
                        System.out.println("Lo sentimos, no todos los paréntesis están cerrados");
                        System.out.println("Intentalo nuevamente");
                        pilaString.limpiar();
                    }
                }
                else if(seleccion ==0){
                    salir = true;               
                    break;
                }
                break;
            case 5:
                salir = true;
                break;
            default:
                System.out.println("La opción ingresada es incorrecta");          
            }
        }
    }
    public static void main(String[] args) {
        PilasyColas objeto = new PilasyColas();
        objeto.menu();
    }
    
}
