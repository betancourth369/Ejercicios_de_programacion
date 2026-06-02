package com.centrosanluis.cambioDivisa.controllers;

import java.io.IOException;

import com.centrosanluis.cambioDivisa.dto.ConversionDTO;
import com.centrosanluis.cambioDivisa.models.ConversorModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

	
	@WebServlet(name = "conversor", urlPatterns = {"/conversor"})
	public class ConversorController extends HttpServlet{
		private static final long serialVersionUID = 1L;

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			String euroText = req.getParameter("euros");
			double euros = Double.parseDouble(euroText);
			
			ConversorModel coversor = new ConversorModel();
			
			
			
		}
		
		
		
	}


