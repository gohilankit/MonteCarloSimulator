package com.montecarlo;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class MonteCarloSimulator {
	int numSimulations;		//Number of simulations to run
	int duration;			//The duration over which projection needs to be calculated
	double inflation;		//Inflation adjustment per duration unit
		
	public MonteCarloSimulator(int numSimulations, int duration, double inflation) {
		super();
		this.numSimulations = numSimulations;
		this.duration = duration;
		this.inflation = inflation;
	}

	public void run(Portfolio portfolio) {
		NormalDistribution dist = new NormalDistribution(portfolio.getMeanReturn(), portfolio.getSdRisk());
		double[] simulationValues = new double[numSimulations];
		
		//Run simulations and store result of each simulation in a collection.
		for(int i=0; i<numSimulations; i++) {
			double investment = portfolio.investment;
			
			for(int j=1; j<=duration; j++) {
				//Next Gaussian sample from distribution
				double nextSample = dist.sample();
				
				//Value at end of period without inflation
				investment *= (1+nextSample);
				
				//Inflation adjustment
				investment *= (1-inflation);
			}	
			//Store current simulation result
			simulationValues[i] = investment;
		}
		
		DescriptiveStatistics ds = new DescriptiveStatistics(simulationValues);
		double bestCase = ds.getPercentile(90);		//90th percentile
        double worstCase = ds.getPercentile(10);	//10th percentile
        double median = ds.getPercentile(50);		//50th percentile
        
        portfolio.setStats(new PortfolioStats(bestCase, worstCase, median ));
	}
}
