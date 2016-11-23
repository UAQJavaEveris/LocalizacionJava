

import java.util.ListResourceBundle;

public class MsgErrores_it_IT extends ListResourceBundle {

	Object [][] contents = {
			{"nombre", "PeliculaEnItaliano"},
			{"precio", (Float)80.5f},
			{"anio", (Integer)2016}
	};
	
	@Override
	protected Object[][] getContents() {
		return contents;
	}

}
