/*
 * Ronald W. Sudol III
 * SNHU CS320
 * Milestone Two
 * 05/28/2023
 */

//define class
public class Task {
	
	//declare variables
	private String taskId;
	private String taskName;
	private String taskDescription;

	// constructor 
	public Task(String id, String name, String description) {
		
		//assert ID isn't null or greater than 10 characters
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		//assert name isn't null or greater than 20 characters
		if (name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid Name");
		}
		
		//assert description isn't null or greater than 50 characters
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		
		// if inputs validated, create Task object
		this.taskId = id;
		this.taskName = name;
		this.taskDescription = description;
	}
	
	//getters
	public String getId() {
		return taskId;
	}
	public String getName() {
		return taskName;
	}
	public String getDescription() {
		return taskDescription; 
	}
	
	//setters
	public void setFirst(String name) {
		this.taskName = name;
	}
	public void setLast(String description) {
		this.taskDescription = description;
	}
	
}

/*
 * Rip and Tear!
 */