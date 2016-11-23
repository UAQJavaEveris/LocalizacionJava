package mx.com.everis.tallerjava.localizacion;

import java.util.ListResourceBundle;

public class MsgErrores_it_IT extends ListResourceBundle {

	Object [][] contents = {
			{"nombre", "PeliculaEnMexicano"},
			{"precio", (Float)1.0f},
			{"anio", (Integer)1990}
	};
	
	@Override
	protected Object[][] getContents() {
		return contents;
	}

}
