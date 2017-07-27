package com.nf.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nf.app.service.system.SystemService;

@Controller
@RequestMapping("/")
public class HellowController {

	@Autowired
	private SystemService service;

	@RequestMapping(value = "/hello/{dlmc}", method = RequestMethod.GET)
	@ResponseBody
	public String abc(@PathVariable("dlmc") String dlmc) {
		String hymc = service.selectByDlmc(dlmc).getHymc();
		return "Hello " + hymc + "!";
	}

}
