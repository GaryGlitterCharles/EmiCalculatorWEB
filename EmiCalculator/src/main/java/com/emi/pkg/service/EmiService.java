package com.emi.pkg.service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.emi.pkg.domain.Fields;
import com.emi.pkg.domain.Result;
import com.emi.pkg.repository.EmiRepository;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Service
public class EmiService implements ServiceInterface {

	@Autowired
	private EmiRepository emirepo;
	static double emi = 0.0;

	static boolean emiFlag = true;

	List<Fields> List = new ArrayList<>();

	@Override
	public void saveFields(Fields fields) {
		
		double loanAmount = fields.getLoanAmount();

		double rateOfInterest = fields.getRateOfInterest();
		double rateOfInPercentage = rateOfInterest / 100;

		int tenure = fields.getTenure();
		int numOfInstalments = fields.getNumberOfInstalments();

		for (int i = 0; i < numOfInstalments; i++) {

			loanAmount = calculateEMI(i, loanAmount, rateOfInPercentage, tenure, numOfInstalments);

		}

	}

	public double calculateEMI(int count, double loanAmount, double rateOfInPercentage, int tenure,
			int numOfInstalments) {
		Result result = new Result();
		double numerator = loanAmount * (rateOfInPercentage / numOfInstalments);
		double deno1 = 1 + (rateOfInPercentage / numOfInstalments);
		double deno2 = 1 / (Math.pow(deno1, tenure));

		double deominator = 1 - deno2;
		if (emiFlag) {
			emi = numerator / deominator;
			emiFlag = false;
		}

		double Pn = emi - numerator;
		double Opn = loanAmount - Pn;
		DecimalFormat formatter = new DecimalFormat("0.00");

		Double outprint = Double.parseDouble(formatter.format(loanAmount));
		Double interst = Double.parseDouble(formatter.format(numerator));
		Double principal = Double.parseDouble(formatter.format(Pn));
		Double emi1 = Double.parseDouble(formatter.format(EmiService.emi));
		result.setCount(count);
		result.setId(count+1);
		result.setOutsandingPrincipal(outprint);
		result.setInterst(interst);
		result.setPrincipal(principal);
		result.setEmi(emi1);
		emirepo.save(result);


		return Opn;
	}

	@Override
	public List<Result> repayment(Model model) {
		
		model.addAttribute("repay", emirepo.findAll());
		return emirepo.findAll();
	}

	@Override
	public void getSingle(Model model, Integer id) {

		
		model.addAttribute("single", emirepo.findById(id).get());
		
	}

	







}
