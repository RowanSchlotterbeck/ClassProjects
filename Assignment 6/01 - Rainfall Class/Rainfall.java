public class Rainfall {

    // An array that stores the monthly rainfall
    private double[] monthlyRainfall;

    /**
     * Constructor that initialies rainfall
     * 
     * @param rainfall
     */
    public Rainfall(double[] rainfall) {

        this.monthlyRainfall = rainfall;

    }

    /* Calculates and sums up the rainfall for all months */
    public double getTotalRainFall() {

        double total = 0.0;
        for (int i = 0; i < monthlyRainfall.length; i++) {

            total += monthlyRainfall[i];

        }
        return total;

    }

    /* Method that gets average rainfall over all the months */
    public double getAverageRainFall() {

        return getTotalRainFall() / monthlyRainfall.length;

    }

    /* Method that finds the month with the highest rainfall */
    public int getHighestMonth() {

        int highestMonth = 0;

        for (int i = 1; i < monthlyRainfall.length; i++) {

            if (monthlyRainfall[i] > monthlyRainfall[highestMonth]) {

                highestMonth = i;

            }

        }

        return highestMonth;

    }

    /* Method that finds the month with the lowest rainfall */
    public int getLowestMonth() {

        int leastMonth = 0;

        for (int i = 1; i < monthlyRainfall.length; i++) {

            if (monthlyRainfall[i] < monthlyRainfall[leastMonth]) {

                leastMonth = i;

            }

        }

        return leastMonth;

    }

    /* Method that returns the monthly rain at an index */
    public double getRainAt(int n) {

        return monthlyRainfall[n];

    }

}