package com.emi.pkg.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Result
{
	private int count;
	private int id;
	private Double outsandingPrincipal;
	private Double interst;
	private Double principal;
	private Double emi;
	
	@Id
	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}
	public Double getOutsandingPrincipal()
	{
		return outsandingPrincipal;
	}

	public void setOutsandingPrincipal(Double outsandingPrincipal)
	{
		this.outsandingPrincipal = outsandingPrincipal;
	}

	public Double getInterst()
	{
		return interst;
	}

	public void setInterst(Double interst)
	{
		this.interst = interst;
	}

	public Double getPrincipal()
	{
		return principal;
	}

	public void setPrincipal(Double principal)
	{
		this.principal = principal;
	}

	public Double getEmi()
	{
		return emi;
	}

	public void setEmi(Double emi)
	{
		this.emi = emi;
	}

	public int getCount()
	{
		return count;
	}

	public void setCount(int count)
	{
		this.count = count;
	}



}
