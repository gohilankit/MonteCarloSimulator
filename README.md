# MonteCarloSimulator

__Modern Portfolio Theory__ says that it is not enough to look at the expected risk and return of one particular stock. By investing in more than one stock, an investor can reap the benefits of diversification- chief among them, a reduction in the riskiness of the portfolio.

A Real Time implementation of Modern Portfolio Theory is to build an optimal asset allocation of domestic stocks & bonds, international stock and bonds, alternatives and cash. Combining the risk & return of each asset class and correlations across them – we come up with the risk and return of the overall portfolio.  Two portfolios were created, one being extremely Conservative and one being Aggressive.

|__Portfolio Type__	| __Return(Mean)__ | __Risk(Standard Deviation)__ |
|-------------|------------|------------|
|Aggressive | %9.4324 |	15.675 |
|Conservative | %6.189	| 6.3438 |


This program test their performance by using forward-looking Monte Carlo Simulations.

__Monte Carlo Simulation__:
This is a statistical technique that uses pseudo-random uniform variables for a given statistical distribution based on past risk (SD) and return (mean) to predict outcomes over future time periods. Based on iterative evaluation of each random future value, we project the portfolio future value over 20 years. 10,000 simulations of projecting 20 year value are run to come up with following values.
1. Median value among all simulations for portfolio value after 20 years.
2. 10% Best Case -  90th Percentile value among all simulations for portfolio value after 20 years.
3. 10% Worst Case - 10th Percentile value among all simulations for portfolio value after 20 years.

__Assumptions__
1. A random number generator to ensure Gaussian distribution of random numbers that are generated.
2. Investment value after each year is inflation adjusted at the rate of 3.5% each year. Ie. Year 1 value of 103.5 is equivalent to 100 at Year 0.

__External jar dependencies__
1. Apache Common's Maths library is used to generate random numbers from a Gaussian distribution, and also calculate percentile value among simulations.
2. Junit for unit tests.

Run the unit MontoCarloSimulatorTest to print the outcomes for provided portfolio inputs.

