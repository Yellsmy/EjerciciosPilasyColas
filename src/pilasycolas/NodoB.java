//Nodo para EJERCICIOS 1 Y 2
package pilasycolas;

public class NodoB {
    int dato;
    NodoB siguienteB;
    
    public NodoB(int dato){
        this.dato = dato;
        siguienteB = null;   
    }

    public NodoB getSiguiente() {
        return siguienteB;
    }

    public void setSiguiente(NodoB siguiente) {
        this.siguienteB = siguiente;
    }
}
