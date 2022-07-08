/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author DET PC
 */
class TransporteTransvia {
    private String cooperativaTransvia;
    public double tarifa;
    
      public void establecerCooperativaTransvia(String n){
        cooperativaTransvia = n;
    }
    
    public void establecerTarifa(){
        tarifa = 3.00 + 0.30;
    }
    
    public String obtenerCooperativaBus(){
        return cooperativaTransvia;
    }
    
    public double obtenerTarifa(){
        return tarifa;
    }
    
}
