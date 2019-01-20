package com.emi.pkg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.emi.pkg.domain.Fields;
import com.emi.pkg.domain.Result;
import com.emi.pkg.service.EmiService;

@Controller
public class EmiController
{
	@Autowired
	private EmiService emiService;

	@RequestMapping(value = "/showPage", method = RequestMethod.GET)
	public String inputFromUser(Model model)
	{
		
		model.addAttribute("fields", new Fields());
		return "design";

	}

	@RequestMapping(value = "/insertFields", method = RequestMethod.POST)
	public String insertedFields(@ModelAttribute("fields") Fields fields, Model model)
	{

		emiService.saveFields(fields);
		emiService.repayment(model);
		model.addAttribute("emiID", new Result());
		return "display";

	}

	@RequestMapping(value = "/viewRecord", method = RequestMethod.POST)
	public String particularInstalments(Model model, @RequestParam("id") Integer ids)
	{
		emiService.getSingle(model, ids);
		//emiService.repayment(model);
		model.addAttribute("emiID", new Result());
		return "singleRecord";
	}
	

}
