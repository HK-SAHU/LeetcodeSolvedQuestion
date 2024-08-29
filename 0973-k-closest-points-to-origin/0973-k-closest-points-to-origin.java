class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Define a max heap (priority queue) where the point with the greatest distance is at the top
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(k, (a, b) -> {
            return (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]);
        });

        // Iterate over all points
        for (int[] point : points) {
            // Add each point to the max heap
            maxHeap.add(point);
            // If the heap size exceeds k, remove the point with the maximum distance
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        // Convert the heap to a result array
        int[][] result = new int[k][2];
        while (k > 0) {
            result[--k] = maxHeap.poll();
        }

        return result;
    }
}