import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class EmployeejTest {

	Employee empobj1 = new Employee();

	@Test
	public void testName() {

		empobj1.setname("Jasmine");
		Assert.assertEquals("Jasmine", empobj1.getname());
	}

	@Test
	public void testSalary() {

		empobj1.setsalary(4000.0);
		Assert.assertEquals(4000.0, empobj1.getsalary(), 0);
	}

	@Test
	public void testAge() {

		empobj1.setage(35);
		Assert.assertEquals(35, empobj1.getage());
	}

	@Test
	public void testDesignation() {

		empobj1.setdesignation("Manager");
		Assert.assertEquals("Manager", empobj1.getdesignation());
	}

	@Test
	public void testbonus() {
		Assert.assertEquals(100,empobj1.paybonus(empobj1.getsalary()));
	}

}
