package com.montecarlo;

public class PortfolioStats {

	double bestCase;		//90th Percentile value among 10000 simulations.
	double worstCase;		//10th Percentile value among 10000 simulations.
	double median;			//Median value among 10000 simulations.
	
	public PortfolioStats(double bestCase, double worstCase, double median) {
		this.bestCase = bestCase;
		this.worstCase = worstCase;
		this.median = median;
	}
	
	public double getBestCase() {
		return bestCase;
	}

	public void setBestCase(double bestCase) {
		this.bestCase = bestCase;
	}

	public double getWorstCase() {
		return worstCase;
	}

	public void setWorstCase(double worstCase) {
		this.worstCase = worstCase;
	}

	public double getMedian() {
		return median;
	}

	public void setMedian(double median) {
		this.median = median;
	}

	@Override
	public String toString() {
		String format = "%.2f";
		
		return "PortfolioStats [bestCase=" + String.format(format, bestCase) + 
				", worstCase=" + String.format(format, worstCase) + 
				", median=" + String.format(format, median) + "]";
	}

}
