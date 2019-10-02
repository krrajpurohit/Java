package problems;

public class HourMinute {

	public float calculateAngle(int hour, int minute) {

		float hourAngle, minuteAngle, angle;
		hourAngle = (float) ((hour * 30) + (0.5 * minute));
		minuteAngle = (float) (minute * 6);

		if (hourAngle >= 360) {
			hourAngle = (float) (0.5 * minute);
		}

		if (minuteAngle > hourAngle) {
			angle = minuteAngle - hourAngle;
		} else {
			angle = hourAngle - minuteAngle;
		}

		return angle;

	}

	public static void main(String[] args) {
		HourMinute test = new HourMinute();

		System.out.println(test.calculateAngle(8, 15));
	}

}
