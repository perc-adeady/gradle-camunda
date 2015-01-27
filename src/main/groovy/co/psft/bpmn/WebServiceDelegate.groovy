package co.psft.bpmn

import java.util.logging.Logger

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate

public class WebServiceDelegate implements JavaDelegate {

	private static final Logger logger = Logger.getLogger(WebServiceDelegate.class.getName())
	
	public void execute(DelegateExecution arg0) throws Exception {
		logger.info("EUREKA from groovy!!!!!!")
	}
}
