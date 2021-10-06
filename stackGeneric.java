/*   
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author ASUS
 */
public class stackGeneric <G> {
     public G[] data;
     public int top = 0;
       
     public stackGeneric(int d){
         data = (G[]) new Object[d];
     }
      
     public boolean isEmpty(){
         return top == 0;
     }
     
     public boolean isFull(){
         return top == data.length;
     }
     
     public void push(G  value){
         if (!isFull()){
             data[top] = value;
             top = top+1;
         } else {
             System.out.println("Stack Full!");
         }
     }
     
     public G pop(){
         if(!isEmpty()){
             top = top-1;
             G r = data[top];
             return r;
         } else {
             return null;
         }
     }
     
     /**public G peek(){
         if(!isEmpty()){
             return data[top-1];
         } else {
             return null;
         }
     }**/
    
}
