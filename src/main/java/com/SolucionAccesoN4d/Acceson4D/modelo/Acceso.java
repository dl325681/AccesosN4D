package com.SolucionAccesoN4d.Acceson4D.modelo;

import java.util.Date;


public class Acceso {

private Date entrada;
private Date salida;


    public Acceso(Date entrada, Date salida) {
        this.entrada = entrada;
        this.salida = salida;
    }


public Acceso() {
        //TODO Auto-generated constructor stub
    }


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
    return 0;
 }

 int diffInMillis = (int) (salida.getTime()-entrada.getTime());

 return diffInMillis /(60*1000);

    }



}



