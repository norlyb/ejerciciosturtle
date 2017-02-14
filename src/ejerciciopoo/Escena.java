/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo;
import ch.aplu.turtle.Turtle;


public class Escena {

    private Turtle tortuga;
    public Escena () {
   this.tortuga=new Turtle();
}
    public  void cuadrado(){
        for(int i=0; i<4;i++){
            tortuga.forward(100);
            tortuga.right(90);
    }
}
    public void patron (){
        for (int i=0; i<8;i++){
            cuadrado();
            tortuga.left(45);
        }
    }

public static void main(String[] args) {
       Escena esc = new Escena();
       esc.patron();
}
}