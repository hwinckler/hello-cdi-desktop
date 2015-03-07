package hello;

import javax.inject.Inject;

public class HelloWorldDesktopImpl implements HelloWorld {

	@Inject
	private Data data;
	
	@Override
	public String say() {
		return "HelloWorldDesktopImpl! " + data.show();
	}

}
