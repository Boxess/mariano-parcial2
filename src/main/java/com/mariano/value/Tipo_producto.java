package com.mariano.value;

public class Tipo_producto {
    
  /*  CREATE TABLE "TIPO_PRODUCTO" 
    (	"TIPO_PRODUCTO" NUMBER, 
     "NOMBRE" VARCHAR2(50 BYTE)
    ) ;

*/

int tipo_producto;
String nombre;

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
