
package CorridaDeMoto;

public class App {
    public static void main (String[] args){
       Veiculo Honda = new Veiculo (new MotorDeHonda ());
       Veiculo Yamaha = new Veiculo (new MotorDeYamaha ());
       Veiculo Avelloz = new Veiculo (new MotorDeAvelloz ());
       
       
       
       System.out println (Honda.acelerar());
       System.out println (Yahama.acelerar());
       System.out println (Avelloz.acelerar());
       
    } 
}
