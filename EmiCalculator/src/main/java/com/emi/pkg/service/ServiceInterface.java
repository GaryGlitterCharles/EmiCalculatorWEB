package com.emi.pkg.service;

import java.util.List;

import org.springframework.ui.Model;

import com.emi.pkg.domain.Fields;
import com.emi.pkg.domain.Result;

public interface ServiceInterface
{

	public void saveFields(Fields fields);
	public List<Result> repayment(Model model);
	public void getSingle(Model model,Integer id);
	

}
