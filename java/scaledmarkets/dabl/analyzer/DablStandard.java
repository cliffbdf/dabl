package scaledmarkets.dabl.analyzer;

public class DablStandard {
	public static final String PackageText = "package dabl.standard\n" +
		
		"//* Display a message to stdout. \n" +
		"public function report \n" +
			"\tstring /// the message to send to stdout \n" +
			"\tbinds to java method dabl.task.Standard.report \n" +
		
		"//* Execute a shell command. Blocks until the command finishes. \n" +
		"public function bash \n" +
			"\tstring /// the command to execute \n" +
			"\tnumeric /// maximum seconds before command should time out \n" +
			"\tbinds to java method dabl.task.Standard.bash \n" +
		
		"//* Execute a powershell command. \n" +
		"public function powershell \n" +
			"\tstring /// the command to execute \n" +
			"\tbinds to java method dabl.task.Standard.powershell \n" +
		
		"//* Deploy an artifact, using the specified template file. \n" +
		"public function deploy \n" +
			"\tstring /// template file \n" +
			"\tto string /// deployment \n" +
			"\tbinds to java method dabl.task.Standard.deploy \n" +
		
		"//* Execute a shell command via ssh. \n" +
		"public function ssh \n" +
			"\tstring /// target host \n" +
			"\tstring /// command string \n" +
			"\tbinds to java method dabl.task.Standard.ssh \n" +
		
		"//* Destroy a deployed environment. \n" +
		"public function destroy \n" +
			"\tstring /// deployment \n" +
			"\tbinds to java method dabl.task.Standard.destroy \n"
	;
}
