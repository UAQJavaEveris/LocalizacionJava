package mx.com.everis.tallerjava.localizacion;

import java.util.ListResourceBundle;

public class MsgErrores extends ListResourceBundle {

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
