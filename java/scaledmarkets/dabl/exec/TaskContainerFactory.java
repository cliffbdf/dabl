package scaledmarkets.dabl.exec;

public abstract class TaskContainerFactory {
	
	/**
	 * Create a container, containing the task interpreter. Return an object
	 * that enables one to control the container.
	 */
	public abstract TaskContainer createTaskContainer();
	
	public abstract boolean isASimulation();
}
