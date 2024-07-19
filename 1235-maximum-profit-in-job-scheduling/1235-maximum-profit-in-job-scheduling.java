class Solution {
    class Job {
        int start, end, profit;
        Job(int start, int end, int profit) {
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }
    
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        Job[] jobs = new Job[n];
        
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }
        
        // Sort jobs by end time
        Arrays.sort(jobs, (a, b) -> a.end - b.end);
        
        int[] maxProfit = new int[n];
        maxProfit[0] = jobs[0].profit;
        
        for (int i = 1; i < n; i++) {
            // Profit including the current job
            int pr = jobs[i].profit;
            int lastNonConflict = binarySearch(jobs, i);
            if (lastNonConflict != -1) {
                pr += maxProfit[lastNonConflict];
            }
            
            // Max profit is the maximum of including or excluding the current job
            maxProfit[i] = Math.max(pr, maxProfit[i-1]);
        }
        
        return maxProfit[n-1];
    }
    
    private int binarySearch(Job[] jobs, int index) {
        int low = 0, high = index - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            if (jobs[mid].end <= jobs[index].start) {
                if (mid == index - 1 || jobs[mid + 1].end > jobs[index].start) {
                    return mid;
                }
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return -1;
    }
}