package com.arquitecturajava.json1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LeerJSonPerona {
	public Persona getPersona(String json) {
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode nodo = null;
		try {
			nodo = mapper.readTree(json);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return new Persona(nodo.get("nombre").asText());
	}
}
