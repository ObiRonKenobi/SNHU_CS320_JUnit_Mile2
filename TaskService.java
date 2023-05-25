/*
 * Ronald W. Sudol III
 * SNHU CS320
 * Milestone Two
 * 05/28/2023
 */

// import arrays for storing and searching tasks
import java.util.ArrayList;

public class TaskService {

	// Holds the list of tasks
    private final ArrayList<Task> taskList;
    
    //construct new task list
    public TaskService() {
        
    	// Initialize the task list array
        taskList = new ArrayList<>();
    }
	
    // define method for adding task if doesn't already exist
    public boolean addTask(Task task) {
       
    	//initialize bool as false, assumes task does not exist
    	boolean taskExists = false;
        
    	// check if task already exists
        for (Task taskObject : taskList) {
            
        	// if task in array, return true
            if (taskObject.equals(task)) {
            	taskExists = true;
                
            	break;
            }
        }
        
        // If the task is not in the array, add it
        if (!taskExists) {
        	taskList.add(task);
            
        	// Returns true if the task was added
            return true;
        }
        
        // Returns false if the task was not added
        return false;
    }
    // searches for task by id number
    public Task getTask(String id) {
        for (Task taskObject : taskList) {
            
        	// if object found, return it
            if (taskObject.getId().equals(id)) {
                return taskObject;
            }
        }
        // else return null
        return null;
    }
    
    // Method to delete a task by id
    public boolean deleteTask(String id) {
        Task taskObject = getTask(id);
        
        // if task found, delete it and return true
        if (taskObject != null) {
            taskList.remove(taskObject);
            return true;
        }
        // else return false
        return false;
    }
  //method to update existing task
    public boolean updateTask(String id, String name, String description) {
    	
    	// check if id exists in array
    	for (Task idNums : taskList){
    		if ( id == idNums.getId()) {
    			break;
    		}
    		else {
    			throw new IllegalArgumentException("No Task with that ID");
    		}
    	}
    	
    	//initialize task object
    	Task taskObject = getTask(id);
    	
    	
    	//find task to update
    	 for (Task tasks : taskList){
    		 
    		 // when task found, update it and return true
    		 if (taskObject.getId() == tasks.getId()){
    			 tasks.setFirst(name);
    	         tasks.setLast(description);
    	         return true;
    		 }
    	 }
    	 //else return false
    	 return false;
    }
}

/*
 * Rip and Tear!
 */