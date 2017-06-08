package scaledmarkets.dabl.analyzer;

/**
 * For creating analysis components that analyze DABL input in a client context.
 */
public class DablAnalyzerFactory implements AnalyzerFactory {
	
	DablAnalyzerFactory() {
		this.state = new ClientState();
	}
	
	DablAnalyzerFactory(ClientState state) {
		this.state = state;
	}
	
	public ClientState getClientState() { return this.state; }
	
	public NamespaceProcessor createNamespaceProcessor() {
		return new NamespaceProcessor(createAnalyzer(state));
	}
	
	public Analyzer createAnalyzer(CompilerState state) {
		return new LanguageAnalyzer(state, createImportHandler());
	}
	
	public ImportHandler createImportHandler() {
		return new FileImportHandler(this);
	}
	
	private ClientState state;
}
