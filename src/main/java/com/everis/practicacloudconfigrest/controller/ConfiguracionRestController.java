package com.everis.practicacloudconfigrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.practicacloudconfigrest.model.Configuracion;

@RestController
@RequestMapping("calcularTotal")
public class ConfiguracionRestController {
	
	//No es necesaria la clase de modelo, es solo un parametro si usamos value
//	@Value("#{descuento}")
//	private double descuento;
	
	@Autowired
	private Configuracion configuracion;
	
	@GetMapping("/{cantidad}")
	public Double descuento(@PathVariable double cantidad) {
		double Resultado;
		//Double descuentoDecimal = descuento/100;
		Double descuentoDecimal = configuracion.getDescuento()/100;
		return Resultado = (cantidad) - (cantidad * descuentoDecimal);
	}

}
