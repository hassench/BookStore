package com.spring.project.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class AuthorController {

	@RequestMapping(value="/authors") 
	public String Books ()
	{
		return "authors.jsp" ;
		
	}
}
