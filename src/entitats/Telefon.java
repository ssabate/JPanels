/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitats;

import java.io.Serializable;

/**
 *
 * @author papa
 */
public class Telefon implements Comparable<Telefon>,Serializable{
    private int _1numero;
    private String _2tipo;

    @Override
    public int compareTo(Telefon t) {
        return this._1numero-t._1numero;
    }

    
    public Telefon(int numero, String tipo) {
        this._1numero = numero;
        this._2tipo = tipo;
    }

    public int get1numero() {
        return _1numero;
    }

    public void set1numero(int _1numero) {
        this._1numero = _1numero;
    }

    public String get2tipo() {
        return _2tipo;
    }

    public void set2tipo(String _2tipo) {
        this._2tipo = _2tipo;
    }

    @Override
    public String toString() {
        return "numero=" + _1numero + ", tipo=" + _2tipo;
    }
    
    
}
