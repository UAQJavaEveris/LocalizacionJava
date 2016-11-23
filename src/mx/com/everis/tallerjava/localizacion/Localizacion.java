package mx.com.everis.tallerjava.localizacion;

import java.util.Locale;
import java.util.ResourceBundle;

public class Localizacion {
	
	public static void imprimirDetallePelicula(ResourceBundle resourceBundle){
		String nombre = resourceBundle.getString("nombre");
		Float precio = (Float)resourceBundle.getObject("precio");
		Integer anio = (Integer)resourceBundle.getObject("anio");
		System.out.println(nombre + " - " + precio + " - " + anio);
		
	}

	public static void main(String[] args) {
		
		Locale locale = Locale.getDefault();
		System.out.println("Idioma: " + locale.getLanguage() + " Pais: " + locale.getDisplayCountry());
		
		//Display all locales
		//Locale [] listaDeLocale = Locale.getAvailableLocales();
		//for (int i=0; i<listaDeLocale.length;i++){
		//	System.out.println("Pais: " + listaDeLocale[i].getCountry() + " Idioma: " + listaDeLocale[i].getLanguage());
		//}
		
		//Localizacion Current Locale
		Locale currentLocale = Locale.getDefault();
		imprimirDetallePelicula (ResourceBundle.getBundle("MsgErrores", currentLocale));
		
		//Localizacion Italiano
		Locale italiano = Locale.ITALY;
		Locale italiano2 = new Locale("it", "IT");
		imprimirDetallePelicula (ResourceBundle.getBundle("MsgErrores", italiano));

	}

}
