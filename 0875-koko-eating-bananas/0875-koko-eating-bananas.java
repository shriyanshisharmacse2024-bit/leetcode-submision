import java.util.Arrays;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // The minimum possible eating speed is 1 banana per hour
        int low = 1;
        
        // The maximum useful eating speed is the size of the largest pile
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }
        
        int result = high;
        
        // Binary search for the minimum viable speed
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canEatAll(piles, mid, h)) {
                result = mid;      // mid is a valid speed, try to find a smaller one
                high = mid - 1;
            } else {
                low = mid + 1;     // mid is too slow, increase the speed
            }
        }
        
        return result;
    }
    
    private boolean canEatAll(int[] piles, int speed, int h) {
        long totalHours = 0; // Use long to prevent integer overflow
        
        for (int pile : piles) {
            // Ceiling division: effectively Math.ceil((double) pile / speed)
            totalHours += (pile + speed - 1) / speed;
        }
        
        return totalHours <= h;
    }
}
