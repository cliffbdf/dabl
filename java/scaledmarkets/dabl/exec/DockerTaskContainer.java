package scaledmarkets.dabl.exec;

import scaledmarkets.dabl.docker.*;
import java.io.File;
import java.io.PrintStream;
import java.io.InputStream;

/**
 * Provides ability to control a container, in which a TaskExecutor is running.
 */
public class DockerTaskContainer extends TaskContainer {
	
	private Task task;
	private DockerContainer dockerContainer;
	private File workspace;
	
	public DockerTaskContainer(Task task, DockerContainer dockerContainer, File workspace) {
		
		this.task = task;
		this.dockerContainer = dockerContainer;
		this.workspace = workspace;
	}
	
	/**
	 * Perform a task's procedural statements.
	 * The container is contacted and instructed to perform the task.
	 * Direct container stdout to the specified print stream.
	 */
	public InputStream execute() throws Exception {
		
		// Start the container.
		// The container starts with its configured entrypoint, which is a
		// call to the TaskExecutor JAR. Each procedural statement is passed
		// via stdin. This is a blocking call.
		InputStream containerOutput = this.dockerContainer.start(task.getTaskProgram());
		
		return containerOutput;
	}
	
	public int getExitStatus() throws Exception {
		return dockerContainer.getExitStatus();
	}
	
	public void stop() throws Exception {
		this.dockerContainer.stop();
	}

	public void destroy() throws Exception {
		
		dockerContainer.destroy();
	}
	
	public void validateRequiredConfiguration() throws Exception {
		// Verify that the required base image is present.
		//....
		
		
	}
}
