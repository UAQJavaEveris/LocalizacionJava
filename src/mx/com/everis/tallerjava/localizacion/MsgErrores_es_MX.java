package mx.com.everis.tallerjava.localizacion;

import java.util.ListResourceBundle;

public class MsgErrores_es_MX extends ListResourceBundle {

	Object [][] contents = {
			{"nombre", "Pelicula1"},
			{"precio", (Float)55.5f},
			{"anio", (Integer)2016}
	};
	
	@Override
	protected Object[][] getContents() {
		return contents;
	}

}
