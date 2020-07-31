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
public class TVR implements MovimientoTV, Serializable{
    private double vf;
    private double hm;
    private double vo;
    private double gravedad=9.81;
    private double tiempo;
    
    

    public double getVf() {
        return vf;
    }

    public void setVf(double vf) {
        this.vf = vf;
    }

    public double getHm() {
        return hm;
    }

    public void setHm(double hm) {
        this.hm = hm;
    }

    public double getVo() {
        return vo;
    }

    public void setVo(double vo) {
        this.vo = vo;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }


    @Override
    public double obtenerTiempoY(double vi) {
     tiempo=vi/gravedad;
     return tiempo;
    }

    @Override
    public double obtenerVoY(double vf, double Altura) {
      vo=Math.sqrt((vf*vf)+(2*gravedad*Altura));
       return vo;
    }

    @Override
    public double obtenerVfY(double vi, double tiempo) {
        vf=(vi-(gravedad*tiempo));
        return vf;
    }

    @Override
    public double obtenerAlturaY(double vo, double vf) {
       hm=((vf*vf)-(vo*vo))/-19.62;
       return hm; 
    }

  
    
}
