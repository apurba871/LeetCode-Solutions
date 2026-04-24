// Last updated: 4/24/2026, 8:14:11 AM
class Solution {
    private static int findMaxWeight(int[] weights) {
        int max = Integer.MIN_VALUE;
        for (int weight : weights) {
            max = Math.max(max, weight);
        }
        return max;
    }

    private static int numDaysForShipWeight(int[] weights, int shipWeight) {
        int numDays = 1;
        int weightPerDay = 0;
        //System.out.println("ShipWeight: " + shipWeight);
        for (int i = 0; i < weights.length; ++i) {
            //System.out.println("Weight: " + weights[i]);
            if (weightPerDay + weights[i] <= shipWeight) {
                weightPerDay += weights[i];
                //System.out.println("WeightPerDay: " + weightPerDay);
            } else {
                numDays++;
                //System.out.println("NumDays: " + numDays);
                weightPerDay = weights[i];
            }
        }
        return numDays;
    }

    private static int sumOfAllWeights(int[] weights) {
        int sum = 0;
        for (int i : weights) {
            sum += i;
        }
        return sum;
    }

    public int shipWithinDays(int[] weights, int days) {
        //Linear Search -> TLE
        // int shipWeight = findMaxWeight(weights);
        // while (numDaysForShipWeight(weights, shipWeight) > days) {
        //     shipWeight++;
        // }

        //BinarySearch
        int low = findMaxWeight(weights);
        int high = sumOfAllWeights(weights);
        int shipWeight = -1;
        while (low <= high) {
            shipWeight = (low + high) / 2;
            int numDaysReqd = numDaysForShipWeight(weights, shipWeight);
            if (numDaysReqd <= days)
                high = shipWeight - 1;
            else
                low = shipWeight + 1;
        }
        return low;
    }
}