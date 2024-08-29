class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        double[][] workers = new double[n][2];

        // Step 1: Calculate the ratio of wage to quality for each worker
        for (int i = 0; i < n; i++) {
            workers[i][0] = (double) wage[i] / quality[i]; // ratio
            workers[i][1] = quality[i];
        }

        // Step 2: Sort the workers based on the ratio
        Arrays.sort(workers, (a, b) -> Double.compare(a[0], b[0]));

        // Step 3: Use a max heap to store the quality of selected workers
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        double totalQuality = 0.0;
        double minCost = Double.MAX_VALUE;

        // Step 4: Iterate through the sorted workers and calculate the minimum cost
        for (double[] worker : workers) {
            double ratio = worker[0];
            int currentQuality = (int) worker[1];

            // Add the current worker's quality to the total
            totalQuality += currentQuality;
            maxHeap.offer(currentQuality);

            // If we have more than k workers, remove the one with the highest quality
            if (maxHeap.size() > k) {
                totalQuality -= maxHeap.poll();
            }

            // If we have exactly k workers, calculate the cost and update the minimum cost
            if (maxHeap.size() == k) {
                minCost = Math.min(minCost, ratio * totalQuality);
            }
        }

        return minCost;
    }
}