//Nodo para EJERCICIOS 1 Y 2
package pilasycolas;

public class NodoA {
    int dato;
    NodoA siguienteA;
    
    public NodoA(int dato){
        this.dato = dato;
        siguienteA = null;
    
    }
    

    public NodoA getSiguiente() {
        return siguienteA;
    }

    public void setSiguiente(NodoA siguiente) {
        this.siguienteA = siguiente;
    }
    
}