package com.SolucionAccesoN4d.Acceson4D.modelo;

import java.util.ArrayList;

public class Usuario {

private String username;
private String nombre;
private String apellido;
private Boolean habilitado;
private ArrayList<Acceso> accesos;


public String getUsername() {
    return username;
}
public void setUsername(String username) {
    this.username = username;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getApellido() {
    return apellido;
}
public void setApellido(String apellido) {
    this.apellido = apellido;
}
public Boolean getHabilitado() {
    return habilitado;
}
public void setHabilitado(Boolean habilitado) {
    this.habilitado = habilitado;
}

public List<Acceso> getAccesos() {
    return accesos;
}
public void setAccesos(List<Acceso> accesos) {
    this.accesos = accesos;
}

public int tiempoTotalAcceso() {

    int tiempoTotal =0;
    for(Acceso acceso : accesos) {

        tiempoTotal+=acceso.getDuracionEnMinutos();

    }

return tiempoTotal;

}

@Override
public String toString(){
    return nombre + " " + apellido;

}




}
