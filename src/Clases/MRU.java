/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author Josué
 */
public class MRU implements Serializable{
    
    protected double distancia=0;
    protected double tiempo=0;
    protected double velocidad=0;
    
    public MRU(){
        
    }
    public MRU(double distancia, double tiempo, double velocidad){
        this.distancia= distancia;
        this.tiempo=tiempo;
        this.velocidad=velocidad;
    
}
    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public double obtenerVelocidadX(double tiempo,double distancia){
        velocidad=distancia/tiempo;
        return velocidad;
    }
    public double obtenerDistanciaX(double velocidad, double tiempo){
        distancia= velocidad*tiempo;
        return distancia;
    }
    public double obtenerTiempoX(double velocidad, double distancia){
        tiempo=distancia/velocidad;
        return tiempo;
    }
}

