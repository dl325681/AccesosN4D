package com.SolucionAccesoN4d.Acceson4D.modelo;

import java.util.Date;


public class Acceso {

private Date entrada;
private Date salida;

public Date getEntrada() {
    return entrada;
}
public void setEntrada(Date entrada) {
    this.entrada = entrada;
}
public Date getSalida() {
    return salida;
}
public void setSalida(Date salida) {
    this.salida = salida;
}



public int getDuracionEnMinutos() {

    if(entrada==null || salida == null || salida.before(entrada)) {
    return 0; }
    }


    
}



