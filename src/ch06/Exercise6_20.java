package ch06;

public class Exercise6_20 {

	public static int[] shuffle(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int idx = (int)((double)Math.random()*10);
			if(idx<arr.length)
				arr[idx] = arr[i];
			else
				continue;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));

		// System.out.println((int)((double)Math.random()*10));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}
