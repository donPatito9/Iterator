/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;
import java.util.Vector;
/**
 *
 * @author Robinson Concha
 */
public class AgregadoConcreto implements Agregado{
 protected Vector aDatos = new Vector();
 public AgregadoConcreto(){
 this.llenar();
 
 }
 @Override
 public Iterador getIterador(){
 return new IteradorConcreto(this);
 }
 
 public void llenar(){
 this.aDatos.add(new String("Jose"));
 this.aDatos.add(new String("Marta"));
 this.aDatos.add(new String("Antonio")); 
 this.aDatos.add(new String("Romina"));
 }
 
}
