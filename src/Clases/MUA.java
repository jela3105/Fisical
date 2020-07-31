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
public class MUA implements Serializable{

    private double vf;
    private double vi;
    private double aceleracion;
    private double distancia;
    private double tiempo;

    public double getVf() {
        return vf;
    }

    public void setVf(double vf) {
        this.vf = vf;
    }

    public double getVi() {
        return vi;
    }

    public void setVi(double vi) {
        this.vi = vi;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
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
    public double obtenerTiempo(double vf, double vi, double aceleracion){
        tiempo=(vf-vi)/aceleracion;
        return tiempo;
    }
    public double obtenerVf(double vi, double aceleracion, double tiempo){
        vf= vi+(aceleracion*tiempo);
        return vf;
    }
    public double obtenerDistancia(double vi, double tiempo, double aceleracion){
        distancia=(vi*tiempo)+((aceleracion*tiempo*tiempo)/2);
        return distancia;
    }
    public double obtenerAceleracion(double vf, double vi, double tiempo){
        aceleracion = (vf-vi)/tiempo;
        return aceleracion;
    }
    public double obtenerVi(double vf, double aceleracion, double tiempo){
        vi= vf-(aceleracion*tiempo);
        return vi;
    }
}
