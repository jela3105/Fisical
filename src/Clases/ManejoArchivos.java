/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.EOFException;

/**
 *
 * @author Josué
 */
public class ManejoArchivos {

    public void serializarUsuario(ArrayList<Usuarios> users) {
        FileOutputStream out;
        try {
            out = new FileOutputStream("src/Archivos/Usuarios.txt");
            ObjectOutputStream oops = new ObjectOutputStream(out);
            oops.writeObject(users);
            oops.close();
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();

        }

    }

    public ArrayList<Usuarios> deserializarUsuario() {
        ArrayList<Usuarios> users;
        try {
            FileInputStream In = new FileInputStream("src/Archivos/Usuarios.txt");
            ObjectInputStream oips = new ObjectInputStream(In);
            users = (ArrayList) oips.readObject();
            oips.close();
            In.close();
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
        return users;
    }

    public ArrayList<MRU> deserializarMRU(String nombre, String movimiento, String variable) {
        ArrayList<MRU> datos;
        String ruta = nombre + "/" + movimiento + "/" + variable;
        try {
            FileInputStream In = new FileInputStream("src/Archivos/" + nombre + "/" + movimiento + "/" + variable + ".txt");
            ObjectInputStream oips = new ObjectInputStream(In);
            datos = (ArrayList) oips.readObject();
            oips.close();
            In.close();
        } catch (IOException e) {

            return null;
        } catch (ClassNotFoundException p) {
            p.printStackTrace();
            return null;
        }
        return datos;

    }

    public ArrayList<CL> deserializarCL(String nombre, String movimiento, String variable) {
        ArrayList<CL> datos;
        String ruta = nombre + "/" + movimiento + "/" + variable;
        try {
            FileInputStream In = new FileInputStream("src/Archivos/" + nombre + "/" + movimiento + "/" + variable + ".txt");
            ObjectInputStream oips = new ObjectInputStream(In);
            datos = (ArrayList) oips.readObject();
            oips.close();
            In.close();
        } catch (IOException e) {

            return null;
        } catch (ClassNotFoundException p) {
            p.printStackTrace();
            return null;
        }
        return datos;

    }

    public ArrayList<TVR> deserializarTV(String nombre, String movimiento, String variable) {
        ArrayList<TVR> datos;
        String ruta = nombre + "/" + movimiento + "/" + variable;
        try {
            FileInputStream In = new FileInputStream("src/Archivos/" + nombre + "/" + movimiento + "/" + variable + ".txt");
            ObjectInputStream oips = new ObjectInputStream(In);
            datos = (ArrayList) oips.readObject();
            oips.close();
            In.close();
        } catch (IOException e) {

            return null;
        } catch (ClassNotFoundException p) {
            p.printStackTrace();
            return null;
        }
        return datos;

    }

    public ArrayList<MUA> deserializarMUA(String nombre, String movimiento, String variable) {
        ArrayList<MUA> datos;
        String ruta = nombre + "/" + movimiento + "/" + variable;
        try {
            FileInputStream In = new FileInputStream("src/Archivos/" + nombre + "/" + movimiento + "/" + variable + ".txt");
            ObjectInputStream oips = new ObjectInputStream(In);
            datos = (ArrayList) oips.readObject();
            oips.close();
            In.close();
        } catch (IOException e) {

            return null;
        } catch (ClassNotFoundException p) {
            p.printStackTrace();
            return null;
        }
        return datos;

    }

     public ArrayList<TiroParabolico> deserializarTP(String nombre, String movimiento, String variable) {
        ArrayList<TiroParabolico> datos;
        String ruta = nombre + "/" + movimiento + "/" + variable;
        try {
            FileInputStream In = new FileInputStream("src/Archivos/" + nombre + "/" + movimiento + "/" + variable + ".txt");
            ObjectInputStream oips = new ObjectInputStream(In);
            datos = (ArrayList) oips.readObject();
            oips.close();
            In.close();
        } catch (IOException e) {

            return null;
        } catch (ClassNotFoundException p) {
            p.printStackTrace();
            return null;
        }
        return datos;

    }

    public void serializarMRU(ArrayList<MRU> array, String nombre, String movimiento, String variable) {
        FileOutputStream out;
        String ruta = nombre + "/" + movimiento + "/" + variable;
        try {
            out = new FileOutputStream("src/Archivos/" + ruta + ".txt");
            ObjectOutputStream oops = new ObjectOutputStream(out);
            oops.writeObject(array);
            oops.close();
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }

    public void serializarCL(ArrayList<CL> array, String nombre, String movimiento, String variable) {
        FileOutputStream out;
        String ruta = nombre + "/" + movimiento + "/" + variable;
        try {
            out = new FileOutputStream("src/Archivos/" + ruta + ".txt");
            ObjectOutputStream oops = new ObjectOutputStream(out);
            oops.writeObject(array);
            oops.close();
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }

    public void serializarMUA(ArrayList<MUA> array, String nombre, String movimiento, String variable) {
        FileOutputStream out;
        String ruta = nombre + "/" + movimiento + "/" + variable;
        try {
            out = new FileOutputStream("src/Archivos/" + ruta + ".txt");
            ObjectOutputStream oops = new ObjectOutputStream(out);
            oops.writeObject(array);
            oops.close();
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }

    public void serializarTVR(ArrayList<TVR> array, String nombre, String movimiento, String variable) {
        FileOutputStream out;
        String ruta = nombre + "/" + movimiento + "/" + variable;
        try {
            out = new FileOutputStream("src/Archivos/" + ruta + ".txt");
            ObjectOutputStream oops = new ObjectOutputStream(out);
            oops.writeObject(array);
            oops.close();
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }

    public void serializarTP(ArrayList<TiroParabolico> array, String nombre, String movimiento, String variable) {
        FileOutputStream out;
        String ruta = nombre + "/" + movimiento + "/" + variable;
        try {
            out = new FileOutputStream("src/Archivos/" + ruta + ".txt");
            ObjectOutputStream oops = new ObjectOutputStream(out);
            oops.writeObject(array);
            oops.close();
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }

    public void crearCarpetas(String nombre) {

        String rutamru = "src/Archivos/" + nombre + "/MRU";
        File MRU_C = new File(rutamru);
        MRU_C.mkdirs();

        String rutamua = "src/Archivos/" + nombre + "/MUA";
        File MUA_C = new File(rutamua);
        MUA_C.mkdirs();

        String rutatp = "src/Archivos/" + nombre + "/TP";
        File TP_C = new File(rutatp);
        TP_C.mkdirs();

        String rutatv = "src/Archivos/" + nombre + "/TV";
        File TV_C = new File(rutatv);
        TV_C.mkdirs();

        String rutacl = "src/Archivos/" + nombre + "/CL";
        File CL_C = new File(rutacl);
        CL_C.mkdirs();

    }

    public void crearCarpetaUsuario(String nombre) {
        String rutausuario = "src/Archivos/" + nombre;
        File crear = new File(rutausuario);
        crear.mkdirs();
    }

    public void crearArchivos(String nombre) throws IOException {
        String velocidadmru = "/Velocidad.txt";
        String distanciamru = "/Distancia.txt";
        String tiempomru = "/Tiempo.txt";
        
        File MRU_Av = new File("src/Archivos/" + nombre + "/MRU" + velocidadmru);
        MRU_Av.createNewFile();
        File MRU_Ad = new File("src/Archivos/" + nombre + "/MRU" + distanciamru);
        MRU_Ad.createNewFile();
        File MRU_At = new File("src/Archivos/" + nombre + "/MRU" + tiempomru);
        MRU_At.createNewFile();

        String vomua = "/VelocidadInicial.txt";
        String vfmua = "/VelocidadFinal.txt";
        String tiempomua = "/Tiempo.txt";
        String aceleracionmua = "/Aceleracion.txt";
        String distanciamua = "/Distancia.txt";
        File MUA_Avomua = new File("src/Archivos/" + nombre + "/MUA" + vomua);
        MUA_Avomua.createNewFile();
        File MUA_Afmua = new File("src/Archivos/" + nombre + "/MUA" + vfmua);
        MUA_Afmua.createNewFile();
        File MUA_Atmua = new File("src/Archivos/" + nombre + "/MUA" + tiempomua);
        MUA_Atmua.createNewFile();
        File MUA_Aamua = new File("src/Archivos/" + nombre + "/MUA" + aceleracionmua);
        MUA_Aamua.createNewFile();
        File MUA_Admua = new File("src/Archivos/" + nombre + "/MUA" + distanciamua);
        MUA_Admua.createNewFile();

        String drtp = "/DistanciaRecorrida.txt";
        String amtp = "/AlturaMaxima.txt";
        String tstp = "/TiempoSubida.txt";
        String tttp = "/TiempoTotal.txt";
        String viex = "/VelocidadInicialX.txt";
        String viey = "/VelocidadInicialY.txt";
        String vfex = "/VelocidadFinalX.txt";
        String vfey = "/VelocidadFinalY.txt";

        File TP_Adrtp = new File("src/Archivos/" + nombre + "/TP" + drtp);
        TP_Adrtp.createNewFile();
        File TP_Aamtp = new File("src/Archivos/" + nombre + "/TP" + amtp);
        TP_Aamtp.createNewFile();
        File TP_Atstp = new File("src/Archivos/" + nombre + "/TP" + tstp);
        TP_Atstp.createNewFile();
        File TP_Atttp = new File("src/Archivos/" + nombre + "/TP" + tttp);
        TP_Atttp.createNewFile();
        File TP_Aviex = new File("src/Archivos/" + nombre + "/TP" + viex);
        TP_Aviex.createNewFile();
        File TP_Aviey = new File("src/Archivos/" + nombre + "/TP" + viey);
        TP_Aviey.createNewFile();
        File TP_Avfex = new File("src/Archivos/" + nombre + "/TP" + vfex);
        TP_Avfex.createNewFile();
        File TP_Avfey = new File("src/Archivos/" + nombre + "/TP" + vfey);
        TP_Avfey.createNewFile();

        String vftv = "/VelocidadFinal.txt";
        String amtv = "/AlturaMaxima.txt";
        String tstv = "/TiempoSubida.txt";
        String vitv = "/VelocidadInicial.txt";
        File TV_Avftv = new File("src/Archivos/" + nombre + "/TV" + vftv);
        TV_Avftv.createNewFile();
        File TV_Aamtv = new File("src/Archivos/" + nombre + "/TV" + amtv);
        TV_Aamtv.createNewFile();
        File TV_Atstv = new File("src/Archivos/" + nombre + "/TV" + tstv);
        TV_Atstv.createNewFile();
        File TV_Avitv = new File("src/Archivos/" + nombre + "/TV" + vitv);
        TV_Avitv.createNewFile();

        String tcl = "/Tiempo.txt";
        String vicl = "/VelocidadInicial.txt";
        String vfcl = "/VelocidadFinal.txt";
        String acl = "/Altura.txt";
        File CL_Atcl = new File("src/Archivos/" + nombre + "/CL" + tcl);
        CL_Atcl.createNewFile();
        File CL_Avicl = new File("src/Archivos/" + nombre + "/CL" + vicl);
        CL_Avicl.createNewFile();
        File CL_Avfcl = new File("src/Archivos/" + nombre + "/CL" + vfcl);
        CL_Avfcl.createNewFile();
        File CL_Aacl = new File("src/Archivos/" + nombre + "/CL" + acl);
        CL_Aacl.createNewFile();

    }

}
