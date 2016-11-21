/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entitats;

import java.util.ArrayList;

/**
 *
 * @author profe
 */
public class Contacte implements java.io.Serializable{
    
    /**Camps propis de les instàncies dels contactes*/
    //Per a que apareguen a les taules en l'ordre que ens interesse hem d'ordenar el nom dels camps posant _n
    //Aquí mostrarà primer el nom, després el cognom i per últim el telèfon
    private String _1nom;
    private String _2cognoms; 
    private ArrayList<Telefon> _3434343telefon;
    
    public Contacte(String n, String c){
        this._1nom = n;
        this._2cognoms = c;
    }
    
    
    
    //Molt important!!
    //Els getters i setters han de tenir els noms correctes, sinó no podreu vore els camps a un JTable
    
    public String get1nom() {
        return _1nom;
    }

    public void set1nom(String _1nom) {
        this._1nom = _1nom;
    }

    public String get2cognoms() {
        return _2cognoms;
    }

    public void set2cognoms(String _2cognoms) {
        this._2cognoms = _2cognoms;
    }

    public ArrayList<Telefon> get3434343telefon() {
        return _3434343telefon;
    }

    public void set3434343telefon(ArrayList<Telefon> _3434343telefon) {
        this._3434343telefon = _3434343telefon;
    }

    @Override
    public String toString() {
        return _2cognoms; //To change body of generated methods, choose Tools | Templates.
    }
    
       
    
}
