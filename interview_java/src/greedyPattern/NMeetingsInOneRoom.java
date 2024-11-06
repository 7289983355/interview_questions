package greedyPattern;

import java.util.ArrayList;
import java.util.List;

public class NMeetingsInOneRoom {

	public static void main(String[] args) {
		int[] start = { 1, 3, 0, 5, 8, 5 };
		int[] end = { 2, 4, 6, 7, 9, 9 };

		System.out.println("Maximum number of meetings: " + maxMeetings(start, end));
	}

	private static int maxMeetings(int[] start, int[] end) {

		List<Meeting> meetings = new ArrayList<>();

		for (int i = 0; i < start.length; i++) {

			meetings.add(new Meeting(start[i], end[i]));

		}

		meetings.sort((m1, m2) -> m1.end - m2.end);

		int meetingCount = 0;
		int meetingEndTime = 0;

		for (Meeting meeting : meetings) {

			if (meeting.start > meetingEndTime) {

				meetingCount++;

				meetingEndTime = meeting.end;
			}

		}

		return meetingCount;
	}
}

class Meeting {

	int start;

	public Meeting(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	int end;

}