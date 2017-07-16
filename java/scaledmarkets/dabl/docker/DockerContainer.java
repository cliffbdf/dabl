package scaledmarkets.dabl.docker;

import java.io.InputStream;

/**
 * A wrapper for a docker container. Enables one to start, stop, and remove
 * the container.
 */
public class DockerContainer {
	
	private Docker docker;
	private String containerId;
	
	public DockerContainer(Docker docker, String containerId) {
		this.docker = docker;
		this.containerId = containerId;
	}
	
	public String getContainerId() { return this.containerId; }
	
	public InputStream start(String stdin) throws Exception {
		
		return this.docker.startContainer(this.containerId, stdin);
	}
	
	public void stop() throws Exception {
		
		this.docker.stopContainer(this.containerId);
	}
	
	public void destroy() throws Exception {
		
		this.docker.destroyContainer(this.containerId);
	}
	
	public boolean isRunning() throws Exception {
		
		return this.docker.containerIsRunning(this.containerId);
	}
	
	public boolean exited() throws Exception {
		return this.docker.containerExited(this.containerId);
	}
	
	public boolean exists() throws Exception {
		return this.docker.containerExists(this.containerId);
	}
	
	public int getExitStatus() throws Exception {
		return this.docker.getExitStatus(this.containerId);
	}
}
