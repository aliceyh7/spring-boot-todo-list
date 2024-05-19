package com.in28minutes.sprintboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	//Say Hello world
	
	@RequestMapping("say-hello") //maps a URL to this method
	@ResponseBody //without this, it can't print string (will look for a View instead)
	public String sayHello() {
		return "Hello! What are you learning today?";
	}
	
	@RequestMapping("say-hello-html") 
	@ResponseBody 
	public String sayHelloHTML() {
		StringBuilder htmlBuilder = new StringBuilder();
	    htmlBuilder.append("<html>");
	    htmlBuilder.append("<head><title>Hello Page</title></head>");
	    htmlBuilder.append("<body>");
	    htmlBuilder.append("<h1>Hello, World!</h1>");
	    htmlBuilder.append("</body>");
	    htmlBuilder.append("</html>");
	    
	    return htmlBuilder.toString();
	}
	
	//say-hello-jsp --> redirect to sayHello.jsp 
	@RequestMapping("say-hello-jsp") //maps a URL to this method
	public String sayHelloJsp() {
		return "sayHello";
	
	}
}

