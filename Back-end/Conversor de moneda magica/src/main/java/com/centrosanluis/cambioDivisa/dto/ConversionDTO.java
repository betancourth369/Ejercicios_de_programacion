package com.centrosanluis.cambioDivisa.dto;

public class ConversionDTO {
	
private double euros;
private double galeones;
private String mensajeError;


public ConversionDTO(double euros) {
	this.euros = euros;
}


public double getEuros() {
	return euros;
}


public void setEuros(double euros) {
	this.euros = euros;
}


public double getGaleones() {
	return galeones;
}


public void setGaleones(double galeones) {
	this.galeones = galeones;
}


public String getMensajeError() {
	return mensajeError;
}


public void setMensajeError(String mensajeError) {
	this.mensajeError = mensajeError;
}




}
