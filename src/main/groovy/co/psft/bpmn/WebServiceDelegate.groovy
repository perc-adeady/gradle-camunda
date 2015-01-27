package co.psft.bpmn

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate

import java.util.logging.Logger

public class WebServiceDelegate implements JavaDelegate {

	private static final Logger logger = Logger.getLogger(WebServiceDelegate.class.getName())
	
	public void execute(DelegateExecution arg0) throws Exception {
		logger.info('EUREKA2 from groovy!!!!!!')

		URL url = new URL('http://localhost:8081/fake-ws/resource?foo=bar')

		logger.info("response[$url.text]")
	}
}
