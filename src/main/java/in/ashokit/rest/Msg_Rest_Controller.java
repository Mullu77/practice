package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Msg_Rest_Controller {
	
	//obj is already created for the rest controller
	//beacuse rest controller is a spring bean when the ioc container r stated obj r created by spring bean which r having scope as singleton
	public  Msg_Rest_Controller() {
		System.out.println(" Msg_Rest_Controller ::Constructor");
	}
	
	
	// for custom status code
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg(){
		String msg = "pikavv thee";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		String msg = "moda gudu";
		return msg;
	}

}
