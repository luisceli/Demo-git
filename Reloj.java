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
public class Reloj {
    //Atributos 
    private int hora;
    private int minuto;
    private int segundo;

    public Reloj() {
    this(1,1,1);
    }
    

    public Reloj(int hora) {
        this(hora,0,0);
    }

    public Reloj(int hora, int minuto) {
        this(hora,minuto,0);
    }

    public Reloj(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if(hora >= 0 && hora<=23){
          this.hora = hora;  
        }else{
            System.out.println("Hora incorecta, seasigna el valor de 0");
            this.hora=0;
        }
        
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if(minuto>=0 && minuto<=59){
             this.minuto = minuto;
        }else{
            System.out.println("Minuto incorrecto, se asignara el valor de 0");
            this.hora=0;
        }
       
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if(segundo>=0 && segundo<=59){
             this.segundo = segundo;
        }else{
            System.out.println("Segundo incorrecto, se asgina el valor de o");
            this.segundo=0;
        }
    }
    
    public String mostrarTiempo24Horas(){
        return String.format("%d:%d:%d",hora,minuto,segundo);
    }
    public String mostrarTiempo12Horas(){
        
    return String.format("%02d:%02d:%02d:%s:",hora== 0|| hora==12?12: hora%12,minuto,segundo,
            hora< 12?"AM": "PM");    
    
    }
}


