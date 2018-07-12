/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

/**
 *
 * @author Sneyder
 */
public class MainReloj {
    public static void main(String[]args){
        Reloj reloj= new Reloj(6,4,19);
        
        System.out.println(reloj.mostrarTiempo24Horas());
         System.out.println(reloj.mostrarTiempo12Horas());
    }
}
