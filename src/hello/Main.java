package hello;

import javax.inject.Inject;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {

	@Inject
	static HelloWorld hello;
	
	public static void main(String[] args) {
		
		Weld weld = new Weld();
		WeldContainer container = weld.initialize();
		
		hello = container.instance().select(HelloWorld.class).get();
		
		System.out.println(hello.say());

	}

}
