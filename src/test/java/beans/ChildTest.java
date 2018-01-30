package beans;


import io.ebean.Ebean;
import org.junit.Test;

public class ChildTest {

	@Test
	public void iud() {

		Child child = new Child();
		child.setName("Hello");

		Ebean.save(child);

		child.setName("Goodbye");
		Ebean.save(child);

		Ebean.delete(child);

	}
}