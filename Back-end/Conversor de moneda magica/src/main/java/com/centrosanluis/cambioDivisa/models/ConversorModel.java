package com.centrosanluis.cambioDivisa.models;

import com.centrosanluis.cambioDivisa.dto.*;

public class ConversorModel {
	
	private static final double TCAMBIO = 5.00;

	
	public ConversionDTO calcularGaleones(ConversionDTO dto) {
		
		double euros = dto.getEuros();
		
		if (euros < 0) {
			dto.setMensajeError("Gringotts Bank no acepta transacciones con valores negativos");
			dto.setGaleones(0);
		}else {
			double rGaleones = euros/TCAMBIO;
			dto.setGaleones(rGaleones);
			dto.setMensajeError(null);
		}
		
		return dto;
		
	}

}
