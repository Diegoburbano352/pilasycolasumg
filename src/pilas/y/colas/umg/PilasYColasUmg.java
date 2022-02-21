package pilas.y.colas.umg;
import java.util.Scanner;
import pilas.y.colas.umg.colas;
/**
 *
 * @author Diego
 */
public class PilasYColasUmg {


    public static void main(String[] args) {
        // TODO code application logic here
        Pila obj= new Pila();
        colas o = new colas();
        Scanner op=new Scanner(System.in);
        int opcion;
        do{
        System.out.println("Menu de pila y colas ");
        System.out.println("1. Ingresar a la pila...");
        System.out.println("2.  Ingresar a la cola.... ");
        System.out.println("3. Salir.... ");
        System.out.println("Ingrese la opcion que desea... :D ");
        opcion = op.nextInt();
        switch(opcion){
            case 1 : 
                    obj.push();
                    break;
            case 2 :
                  o.add();
                    break;       
              default:
                  System.out.println("\n Ingrese una opcion valida");
        }
        
        }while(opcion!=3);
    }

}
