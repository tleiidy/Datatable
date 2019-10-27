/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.controlador;

import com.udec.modelo.Carro;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Leidy Torres
 */
@ManagedBean
@SessionScoped
public class Lista implements Serializable{
    /**
     * Variables de la clase Lista
     */
    private static List<Carro> listaCarro;
    /**
     * Constructor que crea las listas en memoria
     */
    public Lista() {
         listaCarro = new ArrayList<>();
    }
    
    /**
     * metodo get que obtiene la lista de carros
     * @return 
     */
    public List<Carro> getListaCarro() {
        return listaCarro;
    }

    /**
     * metodo que modifica la lista de carros
     * @param listaCarro 
     */
    public static void setListaCarro(List<Carro> listaCarro) {
        Lista.listaCarro = listaCarro;
    }
}
