/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author Robinson Concha
 */
public class Iterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        try {
             AgregadoConcreto agregado = new AgregadoConcreto();
             Iterador iterador = agregado.getIterador();
             String obj = (String) iterador.primero();
             System.out.println(obj);
             iterador.siguiente();
             iterador.siguiente();
             System.out.println((String) iterador.actual() + "\n");
             iterador.primero();
             while(iterador.hayMas() == true){
               System.out.println(iterador.siguiente());
             }
        
        }catch(Exception e){
        e.printStackTrace();
        }
    }
    
}
