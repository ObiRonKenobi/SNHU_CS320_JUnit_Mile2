/*
 * Ronald W. Sudol III
 * SNHU CS320
 * Milestone Two
 * 05/28/2023
 */

//import test tools
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//define test class
class TaskServiceTest {
	
	//test for adding tasks
	@Test
	void testAddTask() {
		
		//Initialize a task list
		TaskService tList = new TaskService();
		
		//create test tasks
        Task task1 = new Task("123","Homework", "Complete Mile Stone Two!");
        Task task2 = new Task("420","Chillaxify", "Get thoroughly jiggy with it!");
        
        // add tasks to list and test for returns true
        assertTrue(tList.addTask(task1));
        assertTrue(tList.addTask(task2));
        
        // tests for return false when trying to add a task that already exists
        assertFalse(tList.addTask(task1));
	}
	
	//test for deleting tasks
	@Test
	void testDeleteTask() {
		
		//Initialize a task list
		TaskService tList = new TaskService();
				
		//create test tasks
		Task task1 = new Task("123","Homework", "Complete Mile Stone Two!");
        Task task2 = new Task("420","Chillaxify", "Get thoroughly jiggy with it!");
		
		// add test tasks to array
		tList.addTask(task1);
		tList.addTask(task2);
		
		//delete existing task and test for returns true
		assertTrue(tList.deleteTask("420"));
		
		//try to delete nonexistent task and test for returns false
		assertFalse(tList.deleteTask("1986"));
		
	}
	
	//test for updating tasks
	@Test
	void testUpdateTask() {
		
		//Initialize a contact list
		TaskService tList = new TaskService();
						
		//create test tasks
		Task task1 = new Task("123","Homework", "Complete Mile Stone Two!");
				
		// add one test task to array
		tList.addTask(task1);
		
		// update existing task, test for return true
		assertTrue(tList.updateTask("123", "Laundry", "More Laundry... Always more laundry."));
		
		// attempt to update non-existent tasks, test for returns false
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			tList.updateTask("69", "Rick Roll", "Never gunna give you up...");
		});
	}

}

/*
 * Rip and Tear!
 */