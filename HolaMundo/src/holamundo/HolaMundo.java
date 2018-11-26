/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import javax.swing.JOptionPane;

/**
 *
 * @author AMATER@STU
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner sc = new Scanner(System.in);
        double op1, op2;
        System.out.print("Introduzca el primer operando: ");
        op1 = sc.nextDouble();
        System.out.print("Introduzca el segundo operando: ");
        op2 = sc.nextDouble();
        System.out.println("LA SUMA ES: "+op1 + op2);
        System.out.println("LA RESTA ES: "+(op1 - op2));
        System.out.println("LA MULTIPLICACION ES: "+op1 * op2);
        
        
    }
    
}
