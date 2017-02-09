package ejerciciopoo;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author Equipo
 */
public class POO {
   private  Turtle joe;
   
   public POO(){
     this.joe =  new Turtle(); 
   }
   
   public void dibujar(){
      
        for(int i =0; i < 360;i++);
        joe.forward(100);
        joe.right(90);
        
    }  
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       POO e = new POO();
       e.dibujar();
    }
    
}
