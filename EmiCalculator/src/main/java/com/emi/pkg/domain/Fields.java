package com.emi.pkg.domain;




public class Fields
{
	private int id;
	private Double loanAmount;
	private Double rateOfInterest;
	private int tenure;
	private int numberOfInstalments;
	

	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public Double getLoanAmount()
	{
		return loanAmount; 
	}
	public void setLoanAmount(Double loanAmount)
	{
		this.loanAmount = loanAmount;
	}
	public Double getRateOfInterest()
	{
		return rateOfInterest;
	}
	public void setRateOfInterest(Double rateOfInterest)
	{
		this.rateOfInterest = rateOfInterest;
	}
	public int getTenure()
	{
		return tenure;
	}
	public void setTenure(int tenure)
	{
		this.tenure = tenure;
	}
	public int getNumberOfInstalments()
	{
		return numberOfInstalments;
	}
	public void setNumberOfInstalments(int numberOfInstalments)
	{
		this.numberOfInstalments = numberOfInstalments;
	}



}
