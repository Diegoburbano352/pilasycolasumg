package pilas.y.colas.umg;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;


/**
 *
 * @author Diego
 */
public class colas {
    
    Random ran = new Random();
    int x;
    int cola1[] = new int[1000000];
    int tope = 999999;

    
    Queue<Integer> cola = new LinkedList();
     int v = 0;
     int desde = -10000000, hasta = 10000000;
     
     
     public void add(){
    cola1 = new int[1000000];
    for (int x = 0; v <= 999999; v++) {
    v = ran.nextInt(hasta - desde + 1) + desde;
    cola1[x] = v;
    System.out.println(x+ "," + v);
    cola.add(v);
    System.out.println(" Cola llena: " + cola);
    
    // Desencolamos la cola 
    while(cola.remove()!=999999){
       System.out.println(cola.peek());
    }
    // Consultaremos la pila 
     System.out.println(cola.element());
    }
    
}
     
     
}