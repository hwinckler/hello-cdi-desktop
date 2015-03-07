package hello;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataBrasil implements Data {

	@Override
	public String show() {
		
		return new SimpleDateFormat("dd/MM/yyyy").format(new Date());
	}

}
