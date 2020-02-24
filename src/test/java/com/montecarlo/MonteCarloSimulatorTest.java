package com.montecarlo;

import org.junit.*;

public class MonteCarloSimulatorTest {

	@Test
	public void testSimulator(){
		Portfolio portfolio1 = new Portfolio("Aggressive", 100000.00, 0.094324, 0.15675);
		Portfolio portfolio2 = new Portfolio("Conservative", 100000.00, 0.06189, 0.063438);
		
		//Inflation = 3.5% = 0.035
		MonteCarloSimulator simulator = new MonteCarloSimulator(10000, 20, 0.035);
		
		simulator.run(portfolio1);
		simulator.run(portfolio2);

		System.out.println(portfolio1);
		System.out.println(portfolio2);
	}

}
