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
public class CL implements Serializable {
 private double vi;
 private double vf;
 private double gravedad=9.81;
 private double tiempo;
 private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVi() {
        return vi;
    }

    public void setVi(double vi) {
        this.vi = vi;
    }

    public double getVf() {
        return vf;
    }

    public void setVf(double vf) {
        this.vf = vf;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    
    public double obtenerVf(double vi, double tiempo){
        vf=vi+(gravedad*tiempo);
        return vf;
    }
    public double obtenerVi(double tiempo, double vf){
        vi=vf-(gravedad*tiempo);
        return vi;
    }
    public double obtenerTiempo(double vf, double vi){
        tiempo=(vf-vi)/gravedad;
        return tiempo;
    }
    public double obtenerAltura(double vi, double tiempo){
        altura=(vi*tiempo)+((gravedad*tiempo*tiempo)/2);
        return altura;
    }
 
}
