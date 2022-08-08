public class TenMinWalk {


	public static boolean isValid(char[] walk) {
		if (walk.length != 10) {
			return false;
		}
		int x = 0, y = 0;
		for (char step : walk) {
			switch (step) {
			case 'n': y += 1; break;
			case 's': y -= 1; break;
			case 'w': x -= 1; break;
			case 'e': x += 1; break;
			}
		}
		if (x != 0 || y != 0) {
			return false;
		}
		return true;
	}
}
