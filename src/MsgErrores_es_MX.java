

import java.util.ListResourceBundle;

public class MsgErrores_es_MX extends ListResourceBundle {

	Object [][] contents = {
			{"nombre", "PeliculaMexicana"},
			{"precio", (Float)10.5f},
			{"anio", (Integer)1990}
	};
	
	@Override
	protected Object[][] getContents() {
		return contents;
	}

}
