/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.controlador;

import com.udec.modelo.Carro;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author Leidy Torres
 */
@ManagedBean 
@RequestScoped
public class ControlCarro implements Serializable{

    private String nombre;
    
    private String marca;
    
    private int modelo;
    
    Carro borrarCarro;
    
    @ManagedProperty("#{lista}")
    Lista listaCarro;
    /**
     * Creates a new instance of ControlCarro
     */
    public ControlCarro() {
    }

    public void agregar(){
        listaCarro.getListaCarro().add(new Carro(nombre,marca, modelo));
        FacesContext context = FacesContext.getCurrentInstance();         
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información","Persona agregada"));
    }
    
    public void modificar(RowEditEvent event) {
        Carro carro = (Carro) event.getObject();
        FacesMessage msg = new FacesMessage("Datos modificados", ((Carro) event.getObject()).getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void cancelar(RowEditEvent event) {
        Carro carro = (Carro) event.getObject();
        FacesMessage msg = new FacesMessage("Modificación Cancelada", ((Carro) event.getObject()).getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void eliminar() {
        listaCarro.getListaCarro().remove(borrarCarro);
        FacesContext context = FacesContext.getCurrentInstance();         
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Información","Carro eliminado"));
        
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

    public Carro getBorrarCarro() {
        return borrarCarro;
    }

    public void setBorrarCarro(Carro borrarCarro) {
        this.borrarCarro = borrarCarro;
    }

    public Lista getListaCarro() {
        return listaCarro;
    }

    public void setListaCarro(Lista listaCarro) {
        this.listaCarro = listaCarro;
    }
    
    
}
