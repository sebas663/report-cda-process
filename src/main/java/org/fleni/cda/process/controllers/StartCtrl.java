package org.fleni.cda.process.controllers;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.fleni.cda.cxf.client.ExternalReportRemotingServiceClient;
import org.fleni.cda.process.service.IProcessCdaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/cda/startProcess")
public class StartCtrl {
	/**
	 * 
	 */
	private static final Logger logger = LoggerFactory.getLogger(StartCtrl.class);

	/**
	 * 
	 */
	@Autowired
	private  IProcessCdaService processCdaService;
	
	/**
	 * 
	 * @return
	 */
	@GetMapping()
	public ResponseEntity<String> hello() {
		String resp = "Hola chango!!!";
		ResponseEntity<String> response = null;
		response = new ResponseEntity<String>(resp, HttpStatus.OK);
		return response;
	}
	
	/**
	 * 
	 * @param input
	 * @return
	 * @throws InterruptedException 
	 */
	@PostMapping()
	ResponseEntity<String> processCda(@RequestBody String input){
		ResponseEntity<String> response = null;
		if (input.equals("procesar")){
			try {
				processCdaService.processCda();
				response = new ResponseEntity<String>("Se estan procesando los cda de Sidca", HttpStatus.OK);
			} catch (Exception e) {
				logger.error(e.getMessage());
			} 
		}else{
			response = new ResponseEntity<String>("No se que queres decir con eso.", HttpStatus.BAD_REQUEST);
		}
		return response;
	}
}
