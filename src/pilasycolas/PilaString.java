
package pilasycolas;

//EJERCICIOS 3 Y 4

public class PilaString {
    private NodoStringA cimaA;
    int tamanioA;
    private NodoStringB cimaB;
    int tamanioB;
    private NodoParentesis cimaP;
    int tamanioP;
    
    public PilaString(){
        cimaA = null;
        tamanioA = 0;
        cimaB = null;
        tamanioB = 0;
        cimaP= null;
        tamanioP=0;
    }  
    
    //MÉTODOS PARA EJERCICIO 3
    public void pushCadena( String cadena){ //Método para llenar la pila A 
        char arreglo[]= cadena.toCharArray();
        for(int i = 0; i < arreglo.length; i ++){
            NodoStringA nuevoA = new NodoStringA(arreglo[i]);
            nuevoA.siguienteA = cimaA;
            cimaA = nuevoA;
            tamanioA++;
        }
    }   
    
    public boolean vacia(){ //Método para saber si la pila A está vacía
        return cimaA == null;
    }
    
    public void reversePilaCadena(){ //Método para invertir la pila A y guardarla en una pila B
        NodoStringA aux = cimaA;
        NodoStringB nuevoB = new NodoStringB(cimaA.datoS);
        nuevoB.siguienteB = cimaB;
        cimaB = nuevoB;
        tamanioB ++;
        while( !vacia()){
            aux = aux.siguienteA;
            nuevoB = new NodoStringB(aux.datoS);
            nuevoB.siguienteB = cimaB;
            cimaB = nuevoB;
            tamanioB++;               
            if ( tamanioB == tamanioA){
                break;
            }
        }
    }
    
    public void imprimirPilaCadena(){ // Método para mostrar la pila A y la pila B
        NodoStringA temp = cimaA;
        System.out.println("LA PILA INGRESADA ES: ");
        while(temp!= null){
            System.out.println("[" + temp.datoS + "]"+ "A");        
            temp = temp.siguienteA;
        }
        System.out.println("LA PILA EN POSICIÓN INVERTIDA ES:");
        NodoStringB tempB = cimaB;
        while(tempB!= null){
            System.out.println("[" + tempB.datoS + "]"+ "B");
            tempB = tempB.siguienteB;
        }
    }
    
    
    
    //MÉTODOS PARA EJERCICIO 4
    public void pushParentesis( char datoP){ //Método para llenar la pila con paréntesis
        if( datoP == '('){
            NodoParentesis nuevoP = new NodoParentesis(datoP);
            nuevoP.siguienteP = cimaP;
            cimaP = nuevoP;
            tamanioP++;           
        }else{
            if(datoP == ')'){
                if(!vaciaP()){                  
                    eliminar();
                }                                                               
            }
        }
    }
    
    public boolean vaciaP(){ //Método para saber si la pila está vacía
        if(cimaP == null){
            return true;
        }
        return false;
    }
    
    public void eliminar(){ //Método para eliminar paréntesis de la pila
        char aux = cimaP.datoP;
        cimaP = cimaP.siguienteP;
        tamanioP--;
        if (cimaP.siguienteP == null){
            cimaP = null;
            tamanioP = 0;
        }
    }
    public void limpiar (){ //Método para vaciar toda la pila
        while(!vaciaP()){
            eliminar();
        }
    }  
    
    public void imprimirPilaP(){ //Método para mostrar los datos que quedaron en la pila
        NodoParentesis temp = cimaP;
        System.out.println("LA PILA INGRESADA ES: ");
        while(temp!= null){
            System.out.println("[" + temp.datoP + "]"+ "A");        
            temp = temp.siguienteP;
        }
    }
}
