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
        Reloj reloj= new Reloj(12,50,59);
        
        System.out.println(reloj.mostrarTiempo24Horas());
    }
}
