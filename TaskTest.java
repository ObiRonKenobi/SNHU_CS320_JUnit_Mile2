/*
 * Ronald W. Sudol III
 * SNHU CS320
 * Milestone Two
 * 05/28/2023
 */

//import testing tools
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//define test class
class TaskTest {

	//define tests
	@Test
	void testTask() {
			
		//initialize testable object
		Task testTask = new Task("123","Homework","Complete Mile Stone Two!");
			
		//test object creation
		assertTrue(testTask.getId().equals("123"));
		assertTrue(testTask.getName().equals("Homework"));
		assertTrue(testTask.getDescription().equals("Complete Mile Stone Two!"));
	}
	
	// null tests
	@Test
	void testTaskIdNull() {
		//test for null id
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task(null,"Homework","Complete Mile Stone Two!");
		});
	}
	@Test
	void testTaskNameNull() {
		//test for null name
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("123",null,"Complete Mile Stone Two!");
		});
	}
	@Test
	void testTaskDescriptionNull() {
		//test for null description
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("123","Homework",null);
		});
	}
	
	// too long tests
	@Test
	void testTaskIdTooLong() {
		//test for too long id
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("1234567890ABCDEF","Homework","Complete Mile Stone Two!");
		});
	}
	@Test
	void testTaskNameTooLong() {
		//test for too long name
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("123","ABCDEFGHIJKLMNOPQRSTUVWXYZ","Complete Mile Stone Two!");
		});
	}
	@Test
	void testTaskDescriptionTooLong() {
		//test for too long description
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Task("123","Homework","ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		});
	}

}

/*
 * Rip and Tear!
 */