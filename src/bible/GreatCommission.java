package bible;

public class GreatCommission
{
	    public static void main(String[] args)
	    {
	        // Our constants
	    	double worldPopulation = 7_700_000_000.0;  // 7.7 billion
	        double initialDisciples = 13;
	        double newDisciplesPerDisciple = 2;  // each disciple trains 2 people
	        double yearsPerCycle = 3.0;

	        // Question 1: How long to reach entire population?
	        double multiplier = 1 + newDisciplesPerDisciple;  // 3x every 3 years per period
	        double k = Math.log(worldPopulation / initialDisciples) / Math.log(multiplier); // AI's formula...mathematically, it makes sense.
	        double totalYears = Math.ceil(k) * yearsPerCycle; // is ceil a math thing? I'm a little confused by that.

	        System.out.printf("1) It would take about %.0f years to reach %.1f billion people.%n",
	                          totalYears, worldPopulation / 1_000_000_000);

	        // Question 2: If done in 50 years, how many disciples would be per person per 3 years?
	        double totalCycles = 50.0 / yearsPerCycle;
	        double requiredMultiplier = Math.pow(worldPopulation / initialDisciples, 1 / totalCycles); // this is what AI came up for the formula
	        double disciplesPerPerson = requiredMultiplier - 1;

	        System.out.printf("2) To finish in 50 years, each disciple must train %.2f disciples every 3 years.%n",
	                          disciplesPerPerson);
	    }

}
