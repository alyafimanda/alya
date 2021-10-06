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
import java.util.Scanner;

public class main_stack {
    public static void main(String[] args) {
        
        stackGeneric<String> stack = new stackGeneric<>(25);
        String input = "f(x)=(2x+y)-(3+(2x-x)+20)";
        Scanner scan = new Scanner(input);
        
        scan.useDelimiter("");
        
        for (int i=0; i<25; i++){
            String kar = scan.next();
            if (kar.equals("(")){
                stack.push("(");
            } else if (kar.equals(")")){
                stack.pop();
            }
        }
        
        if (stack.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Tidak Valid");
        }
    }
}
