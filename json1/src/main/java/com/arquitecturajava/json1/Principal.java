package com.arquitecturajava.json1;

public class Principal {

	public static void main(String[] args) {
		String json="{\"nombre\":\"Pedro\"}";

		LeerJSonPerona leer = new LeerJSonPerona();
		Persona p = leer.getPersona(json);
		System.out.println(p.getNombre());
	}

}
