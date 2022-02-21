package pilas.y.colas.umg;

import java.util.Scanner;
import java.util.Stack;
import java.util.Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 *
 * @author Diego
 */
public class Pila {
           

    public void push() {
        
      Stack pila = new Stack();
      Random ran = new Random ();
      int v = 0;
      int desde = -10000000, hasta = 10000000;
      for (int x = 0; x <= 999999; x++) {
      v = ran.nextInt(hasta - desde + 1) + desde;
      pila.push(Integer.toString(v));
      
      // Metodo para borrar  la pila
      while(!pila.empty())
          System.out.println(pila.pop());

    }
    }


}