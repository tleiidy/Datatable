/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.modelo;


/**
 *
 * @author Leidy Torres
 */
public class Carro {
    
    private String nombre;
    
    private String marca;
    
    private int modelo;
    
    public Carro(){
    
    }

    public Carro(String nombre, String marca, int modelo) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    
}
