
package pilasycolas;

//EJERCICIO 1
public class Pila {
    private NodoA cimaA;
    int tamanioA;
    private NodoB cimaB;
    int tamanioB;
    
    public Pila(){
        cimaA = null;
        tamanioA = 0;
        cimaB = null;
        tamanioB = 0;
    }
    
    public boolean vacia(){ //Método para saber si la pila A está vacía
        return cimaA == null;
    }
    
    public boolean vaciaB(){//Método para saber si la pila B está vacía
        return cimaB == null;
    }
    
    public int push( int dato){ //Método para Ingresar datos a la pila A
        NodoA nuevoA = new NodoA(dato);
        nuevoA.siguienteA = cimaA;
        cimaA = nuevoA;
        tamanioA++;
        return dato;
    }
    
    public void reversePila(){ //Método para invertir la pila ingresada
        NodoA aux = cimaA;
        NodoB nuevoB = new NodoB(cimaA.dato);
        nuevoB.siguienteB = cimaB;
        cimaB = nuevoB;
        tamanioB ++;
        while( !vaciaB()){
            aux = aux.siguienteA;
            nuevoB = new NodoB(aux.dato);
            nuevoB.siguienteB = cimaB;
            cimaB = nuevoB;
            tamanioB++;               
            if ( tamanioB == tamanioA){
                break;
            }
        }
        System.out.println("La pila ha sido invertida exitosamente");
    }
    
    public void pop(){ //Método para eliminar dato de la pila
        int aux = cimaA.dato;
        cimaA = cimaA.siguienteA;
        tamanioA--;
        if (cimaA.siguienteA == null){
            cimaA = null;
            tamanioA = 0;
        }
    }
    
    public void imprimirPilaA(){ //Método para mostrar datos de la pila A
        NodoA temp = cimaA;
        System.out.println("LA PILA INGRESADA ES: ");
        while(temp!= null){
            System.out.println("[" + temp.dato + "]"+ "A");        
            temp = temp.siguienteA;
        }
    }
    
    public void imprimirPilaB(){ //Método para mostrar datos de la pila invertida
        System.out.println("LA PILA EN POSICIÓN INVERTIDA ES:");
        NodoB tempB = cimaB;
        while(tempB!= null){
            System.out.println("[" + tempB.dato + "]"+ "B");
            tempB = tempB.siguienteB;
        }
    }
}
