package scaledmarkets.dabl.exec;

/**
 * Provides ability to control a container, in which a TaskExecutor is running.
 */
public abstract class TaskContainer {
	
	/**
	 * Perform a task's procedural statements.
	 * The container is contacted and instructed to perform the task.
	 */
	public abstract void executeTask(Task task) throws Exception;
}