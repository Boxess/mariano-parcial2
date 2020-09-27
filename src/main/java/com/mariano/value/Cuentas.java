package com.mariano.value;

import java.sql.Date;

public class Cuentas {

/*
    CREATE TABLE "CUENTAS" 
    (	"CUENTA" NUMBER, 
     "PRODUCTO" NUMBER, 
     "CLIENTE" NUMBER, 
     "SALDO" NUMBER(20,2) DEFAULT 0,
   "NOMBRE_AGENCIA" VARCHAR2(20),
   "FECHA_APERTURA" DATE
    );   
    */

    int cuenta;
    int producto;
    int cliente;
    int saldo;
    String nombre_agencia;
    Date fecha_apertura;

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNombre_agencia() {
        return nombre_agencia;
    }

    public void setNombre_agencia(String nombre_agencia) {
        this.nombre_agencia = nombre_agencia;
    }

    public Date getFecha_apertura() {
        return fecha_apertura;
    }

    public void setFecha_apertura(Date fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }
    
}
