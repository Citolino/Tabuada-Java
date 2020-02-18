/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabuada;

import java.util.Scanner;

/**
 *
 * @author 082170019
 */
public class Tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Digite o numero para fazer a tabuada!");
        Scanner scan  = new Scanner( System.in);   
     int x = Integer.parseInt(scan.nextLine());
     
     
     for(int y =0;y<10;y++){
         System.out.println(x + " x " + y + " = " + x*y );
    }
    }
}
