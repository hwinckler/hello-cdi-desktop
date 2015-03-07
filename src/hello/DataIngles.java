package hello;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;
import javax.interceptor.Interceptor;

@Alternative @Priority(Interceptor.Priority.APPLICATION + 1)
public class DataIngles implements Data {

	
	public String show() {
		return new SimpleDateFormat("MM-dd-yyyy").format(new Date());
	}

}
