package bible;

public class GreatCommission
{
	    public static void main(String[] args)
	    {
	        double worldPopulation = 7_700_000_000.0;  // 7.7 billion
	        double initialDisciples = 13;
	        double newDisciplesPerDisciple = 2;  // each disciple trains 2
	        double yearsPerCycle = 3.0;

	        // Question 1: How long to reach entire population?
	        double multiplier = 1 + newDisciplesPerDisciple;  // 3x every 3 years
	        double k = Math.log(worldPopulation / initialDisciples) / Math.log(multiplier);
	        double totalYears = Math.ceil(k) * yearsPerCycle;

	        System.out.printf("1) It would take about %.0f years to reach %.1f billion people.%n",
	                          totalYears, worldPopulation / 1_000_000_000);

	        // Question 2: If we want it done in 50 years, how many disciples per person per 3 years?
	        double totalCycles = 50.0 / yearsPerCycle;
	        double requiredMultiplier = Math.pow(worldPopulation / initialDisciples, 1 / totalCycles);
	        double disciplesPerPerson = requiredMultiplier - 1;

	        System.out.printf("2) To finish in 50 years, each disciple must train %.2f disciples every 3 years.%n",
	                          disciplesPerPerson);
	    }

}
