package com.mariano.value;

public class Cliente {

   /*
    "CLIENTE" NUMBER, 
	"NOMBRES" VARCHAR2(50 BYTE), 
	"APELLIDOS" VARCHAR2(50 BYTE), 
	"EMAIL" VARCHAR2(30 BYTE)
   */

   
    int cliente ;
    String Nombre;
    String Apellidos;
    String email_;

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getEmail_() {
        return email_;
    }

    public void setEmail_(String email_) {
        this.email_ = email_;
    }



    
}
