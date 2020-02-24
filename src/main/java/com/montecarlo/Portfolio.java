package com.montecarlo;

public class Portfolio {
	String name;		//Portfolio name
	double investment;	//Initial investment
	double meanReturn;	//Mean return percentage
	double sdRisk;		//Risk standard deviation
	PortfolioStats stats;
	
	public Portfolio(String name, double investment, double meanReturn, double sdRisk) {
		this.name = name;
		this.investment = investment;
		this.meanReturn = meanReturn;
		this.sdRisk = sdRisk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getInvestment() {
		return investment;
	}

	public void setInvestment(double investment) {
		this.investment = investment;
	}

	public double getMeanReturn() {
		return meanReturn;
	}

	public void setMeanReturn(double meanReturn) {
		this.meanReturn = meanReturn;
	}

	public double getSdRisk() {
		return sdRisk;
	}

	public void setSdRisk(double sdRisk) {
		this.sdRisk = sdRisk;
	}

	public PortfolioStats getStats() {
		return stats;
	}

	public void setStats(PortfolioStats stats) {
		this.stats = stats;
	}

	@Override
	public String toString() {
		return "Portfolio [name=" + name + ", investment=" + investment + ", meanReturn=" + meanReturn + ", sdRisk="
				+ sdRisk + ", stats=" + stats + "]";
	}	
}
