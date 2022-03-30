
package pilasycolas;

// EJERCICIO 2
public class Cola {
    private NodoA primeroA;
    private NodoA ultimoA;
    int tamanioA;
    private NodoB primeroB;
    private NodoB ultimoB;
    int tamanioB;
    private NodoR primeroR;
    private NodoR ultimoR;
    int tamanioR;
    
    public Cola(){
        primeroA = null;
        ultimoA = null;
        tamanioA = 0;
        primeroB = null;
        ultimoB = null;
        tamanioB = 0;
    }
    
    public boolean vacia(){ //Método para saber si la cola está vacía
        if(this.primeroA != null){
            return true;
        }
        System.out.println("La lista está vacía");
        return false;
    }
    
    public int push(int dato){ //Método para ingresar datos a la cola A
        NodoA nuevo1 = new NodoA(dato);
        if(tamanioA==0){
        primeroA = nuevo1;}
        else{
            ultimoA.setSiguiente(nuevo1);}
        ultimoA = nuevo1;
        tamanioA++;
        return dato;
    }

    public int push2(int dato){ //Métodos para ingresar datos a la cola B
        NodoB nuevo2 = new NodoB(dato);
        if(tamanioB==0){
        primeroB = nuevo2;}
        else{
            ultimoB.setSiguiente(nuevo2);}
        ultimoB = nuevo2;
        tamanioB++;
        return dato;
    }
    
    public void pushResultado(int datoA, int datoB){ //Método para sumar la cola A y B y el resultado guardarlo en la cola Resultado
        int suma = datoA + datoB;
        NodoR resultado = new NodoR(suma);
        if(tamanioR==0){
        primeroR = resultado;}
        else{
            ultimoR.setSiguiente(resultado);}
        ultimoR = resultado;
        tamanioR++;
    }
    
    public void imprimirDatosCola(){ //Método para mostrar los datos de las 3 colas
        NodoA temp = primeroA;
        NodoB temp2 = primeroB;
        NodoR tempR = primeroR;
        System.out.println("La PRIMERA cola es:");
        while(temp!= null){
            System.out.println("[" + temp.dato + "]");
            temp = temp.siguienteA;
        }
        System.out.println("La SEGUNDA cola es:");
        while( temp2!= null ){
            System.out.println("[" + temp2.dato + "]"+"B"); 
            temp2 = temp2.siguienteB;
        }
        System.out.println("La SUMA de ambas colas es");
        while( tempR != null){ 
            System.out.println("[" + tempR.dato + "]"+"R");
            tempR = tempR.siguienteR;
        }
    }  
}
