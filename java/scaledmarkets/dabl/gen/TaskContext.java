package scaledmarkets.dabl.gen;

import java.util.HashMap;
import java.util.Date;

/**
 * The execution context of the task. Provides a task with access to the runtime,
 * when the task is executed. This can be used to obtain environment variables, etc.,
 * when the task is actually performed.
 */
public class TaskContext extends HashMap {
	
	public Object getValueForVariable(String variableName) {
		return get(variableName);
	}
	
	public int getTaskStatus(String taskName) throws Exception {
		Object obj = get(taskName);
		if (obj == null) throw new Exception("Task has not executed");
		if (!( obj instanceof Integer)) throw new Exception(
			"Status of task " + taskName + " is not an integer");
		return ((Integer)obj).intValue();
	}
	
	public Date getAge(String name) throws Exception {
		....
	}
}