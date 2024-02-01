public class GreenBottle {

	public static void main(String[] args) {
		int bottleNumber = 10;
		while (bottleNumber > 0) {
			String word = "bottles";
			if (bottleNumber == 1) {
				word = "bottle";
			}
			System.out.println(bottleNumber + " green " + word + " hanging on the wall,");
			System.out.println(bottleNumber + " green " + word + " hanging on the wall,");
			System.out.println("And if one green bottle should accidentally fall,");
			bottleNumber = bottleNumber - 1;
			if (bottleNumber > 0) {
				if (bottleNumber == 1) {
					word = "bottle";
				}
				System.out.println("There'll be " + bottleNumber + " green "+ word + " hanging on the wall");
			} else {
				System.out.println("There'll be no green bottles hanging on the wall");
			}
			System.out.println("");
		}
	}
}