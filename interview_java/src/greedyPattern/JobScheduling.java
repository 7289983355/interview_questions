package greedyPattern;

import java.util.Arrays;

public class JobScheduling {

	// jobid, deadline and profit
//	Input: jobs[] = [(1,4,20), (2,1,1), (3,1,40), (4,1,30)]
//	Output: [2, 60]
//	Explanation: job1 and job3 can be done with maximum profit of 60 (20+40).

	public static void main(String[] args) {
		// create a Array of the Job object

		Jobs[] jobs = { new Jobs(1, 4, 20), new Jobs(2, 1, 1), new Jobs(3, 1, 40), new Jobs(4, 1, 30) };

		// Sort jobs by profit in descending order
		Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

//		Each job comes with a deadline, which tells us the latest time by which the 
//		job must be finished. The maximum deadline across all jobs tells us the number
//		of available slots (or units of time) we have to schedule jobs.

		int maxDeadLine = 0;

		for (Jobs job : jobs) {

			maxDeadLine = Math.max(maxDeadLine, job.deadline);

		}
		
		// Create a time slot array to keep track of free slots
		
		boolean slots[] = new boolean[maxDeadLine+1];
		
		for(Jobs job : jobs) {
		for(int j=Math.min(maxDeadLine, maxDeadLine) ; ;) {
			
			
		}
		}

	}

}

class Jobs {

	public Jobs(int id, int deadline, int profit) {
		super();
		this.id = id;
		this.deadline = deadline;
		this.profit = profit;
	}

	int id;
	int deadline;
	int profit;

}
