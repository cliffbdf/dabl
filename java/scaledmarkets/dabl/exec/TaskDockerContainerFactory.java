package scaledmarkets.dabl.exec;

public class TaskDockerContainerFactory {
	
	/**
	 * Create a container, containing the task interpreter. Return an object
	 * that enables one to control the container.
	 */
	public TaskContainer createTaskContainer() {
		return new TaskContainer();
	}
	
	public boolean isASimulation() { return false; }
}
