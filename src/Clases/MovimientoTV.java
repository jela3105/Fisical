/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Josué
 */
public interface MovimientoTV{
    

    public double obtenerTiempoY (double vo);
    public double obtenerAlturaY(double vo, double vf);
    public double obtenerVoY(double vf, double Altura);
    public double obtenerVfY(double vi, double tiempo);
}
