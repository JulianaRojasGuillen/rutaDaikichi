package com.codingdojo.controladores;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorDaikichi {
	
	@RequestMapping(value = "/daikichi",method = RequestMethod.GET)
	public String despliegaBienvenida() {
		String respuesta = "Bienvenid@!";
		return respuesta;
	}
	
	@RequestMapping(value = "daikichi/today",method = RequestMethod.GET)
	public String despliegaMensaje() {
		String respuesta = "¡Hoy encontrarás suerte en todos tus esfuerzos!";
		return respuesta;
	}
	
	@RequestMapping (value ="/daikichi/travel/{place}",method = RequestMethod.GET)
	public String despliegaDestino(@PathVariable ("place") String place) {
		return "¡Felicitaciones! ¡Pronto viajarás a " + place + "!";
	}
	
	@RequestMapping (value ="/daikichi/lotto/{number}",method = RequestMethod.GET)
	public String despliegaFuturo(@PathVariable ("number") int number) {
		if (number % 2 == 0) {
			return "Harás un gran viaje en un futuro cercano, pero ten cuidado con las ofertas tentadoras.";
		} else {
			return "Has disfrutado de los frutos de tu trabajo, pero ahora es un buen momento para pasar tiempo con familiares y amigos.";
		}
	}
}
