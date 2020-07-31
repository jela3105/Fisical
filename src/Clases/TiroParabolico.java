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
public class TiroParabolico extends MRU implements MovimientoTV, Serializable {

    private double velo;
    private double angulo;
    private double respuesta;
    
    public TiroParabolico(){
    }
    
    public TiroParabolico(double velo,double angulo,double respuesta){
      this.velo=velo;
      this.angulo=angulo;
      this.respuesta=respuesta;
      
  }

    
    public void setRespuesta(double respuesta){
        this.respuesta=respuesta;
    }
    public double getRespuesta(){
        return respuesta;
    }
    public double getVelo() {
        return velo;
    }

    public void setVelo(double velo) {
        this.velo = velo;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }
   
   
    public double obtenerVelocidadX(double tiempo,double distancia){
        tiempo=velo*(Math.cos((angulo*Math.PI)/180));
        return tiempo;
    }
     
     public double obtenerDistanciaX(double velocidad, double tiempo){
       velocidad=(velo*velo*(Math.sin((2*angulo*Math.PI)/180)))/10;
        return velocidad;
    }
    
    public double obtenerTiempoX(double velocidad, double distancia){
        distancia=(2*velo*(Math.sin((angulo*Math.PI)/180)))/9.81;
        return distancia;
    }

    
    public double obtenerTiempoY(double vo) {
        vo=((2*velo*(Math.sin((angulo*Math.PI)/180)))/9.81)/2;
        return vo;
    }

    
    public double obtenerAlturaY(double vo, double vf) {
         vf=((velo*velo*(Math.sin((angulo*Math.PI)/180))*(Math.sin((angulo*Math.PI)/180)))/19.62);
        return vf;
    }

    
    public double obtenerVoY(double vf, double Altura) {
       return velo*(Math.sin((angulo*Math.PI)/180));
    }

   
    public double obtenerVfY(double vi, double tiempo) {
        return tiempo;
    }
    
}
