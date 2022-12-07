class NthSeries {
	public static String seriesSum(int n) {
		// loop from 1 to the given number n 
        // each iteration, add 1 divide by the denominator to a sum variable
		// before interating, increase the denominator by 3
		// interate through till n times
		// return the sum variable 

	double sum =0.00;
    double den =1.00;
    for (int x=1; x<=n; x++) {
      sum += 1.00/den;
      den=den+3.00;
    }
    return String.format("%.2f", sum);
	}
}