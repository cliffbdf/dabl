package scaledmarkets.dabl.exec;

import java.util.Set;

/**
 * For creating task containers in simulation mode, whereby containers are not
 * actually created, and tasks are not actually executed.
 */
public class TaskSimulatorFactory extends TaskContainerFactory {
	
	/**
	 * Create a pretend-container.
	 */
	public TaskContainer createTaskContainer(String[] pathsToMap) throws Exception {
		return new PretendTaskContainer();
	}
	
	public void containerWasDestroyed(TaskContainer container) {
		
		//....
	}

	public Set<TaskContainer> getTaskContainers() {
		
		return null;
		//....
	}

	public boolean isASimulation() { return true; }
}
