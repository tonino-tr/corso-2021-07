package it.corsojava.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.corsojava.classi.Persona;

public class CollectionMain {

	public static void main(String[] args) {
		CollectionMain cm = new CollectionMain();
		cm.eseguiTest();
	}

	private void eseguiTest() {
		List<Persona> lstPers = new ArrayList<>();
		Map<String, Persona> mapPers = new HashMap<>();
		Persona p1 = new Persona("Marco", 22, "m@m.com");
		Persona p2 = new Persona("Mauro", 23, "m@mauro.com");
		String str = "Tonino";

		//	Map
		//
		mapPers.put(p1.getNome(), p1);
		mapPers.put(p2.getNome(), p2);
		System.out.println("Numero elementi: +" + mapPers.size());
		System.out.println(mapPers);
		
		Persona p10 = mapPers.get("Marco");
		
		
		//	ArrayList
		//
//		lstPers.add(p1);
//		lstPers.add(p2);
//		
//		System.out.println("Numero elementi: +" + lstPers.size());
//		
//		
//		Persona p3 = lstPers.get(1);
//		System.out.println("Il secondo elemento è: " + lstPers.get(1));
//		System.out.println("p3 è: +" + p3);
//		
//		System.out.println("Ciclare sull'ArrayList");
//		for(int i = 0; i<lstPers.size(); i++) {
//			Persona p = lstPers.get(i);
//			System.out.println(p);
//		}
//		
//		System.out.println("Ciclare sull'ArrayList con ForEach");
//		for(Persona pers : lstPers) {
//			System.out.println(pers);
//		}
		
		
	}

}
