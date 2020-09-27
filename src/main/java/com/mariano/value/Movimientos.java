package com.mariano.value;

import java.sql.Date;

public class Movimientos {
 /*   CREATE TABLE "MOVIMIENTOS" 
   (	"MOVIMIENTO" NUMBER, 
	"TIPO_MOVIMIENTO" NUMBER, 
	"CUENTA" NUMBER, 
	"FECHA" DATE, 
	"MONTO" NUMBER(20,2)
   ) ; 
   */
  int movimiento;
  int tipo_movimiento;
  int cuenta;
  Date fecha;
  int monto;

  public int getMovimiento() {
      return movimiento;
  }

  public void setMovimiento(int movimiento) {
      this.movimiento = movimiento;
  }

  public int getTipo_movimiento() {
      return tipo_movimiento;
  }

  public void setTipo_movimiento(int tipo_movimiento) {
      this.tipo_movimiento = tipo_movimiento;
  }

  public int getCuenta() {
      return cuenta;
  }

  public void setCuenta(int cuenta) {
      this.cuenta = cuenta;
  }

  public Date getFecha() {
      return fecha;
  }

  public void setFecha(Date fecha) {
      this.fecha = fecha;
  }

  public int getMonto() {
      return monto;
  }

  public void setMonto(int monto) {
      this.monto = monto;
  }
  
}
