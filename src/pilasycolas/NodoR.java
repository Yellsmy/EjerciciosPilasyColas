//Nodo para EJERCICIO 2
package pilasycolas;

public class NodoR {
    int dato;
    NodoR siguienteR;
    
    public NodoR(int dato){
        this.dato = dato;
        siguienteR = null;    
    }

    public NodoR getSiguiente() {
        return siguienteR;
    }

    public void setSiguiente(NodoR siguiente) {
        this.siguienteR = siguiente;
    }
}
