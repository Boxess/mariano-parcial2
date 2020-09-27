package com.mariano.value;

import java.sql.Date;

public class Producto {

   /* CREATE TABLE "PRODUCTO" 
    (	"PRODUCTO" NUMBER, 
     "TIPO_PRODUCTO" NUMBER, 
     "NOMBRE" VARCHAR2(50 BYTE)
    ) ;

*/


int producto;
int tipo_producto;
String nombre;

public int getProducto() {
    return producto;
}

public void setProducto(int producto) {
    this.producto = producto;
}

public int getTipo_producto() {
    return tipo_producto;
}

public void setTipo_producto(int tipo_producto) {
    this.tipo_producto = tipo_producto;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

}
