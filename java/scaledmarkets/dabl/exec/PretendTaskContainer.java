package scaledmarkets.dabl.exec;

import java.io.InputStream;
import java.io.StringBufferInputStream;

/**
 * Used by TaskSimulatorFactory for simulating task execution.
 */
public class PretendTaskContainer extends TaskContainer {
	
	private Task task;
	
	public PretendTaskContainer(Task task) {
		this.task = task;
	}
	
	public InputStream execute(int timeout) throws Exception {
		return new StringBufferInputStream(
			">> Simulator: Task " + this.task.getName() + " would be executed");
	}
	
	public int getExitStatus() throws Exception {
		return 0;
	}
	
	public void destroy() throws Exception {
	}
}
