/*
all missing number from given array.
*/

package examcode.test_7;

public class ReturnMissinghNum {
	int num ;

	int MissingNum(int[] arr) {
		for (int num = 1; num <= 10; num++) {
			boolean isNumPresent = false;
			for (int index = 0; index < arr.length; index++) {
				if (num == arr[index]) {
					isNumPresent = true;
					break;
				}
			}
			if (isNumPresent == false)
				System.out.println("missing num = " + num);
		}
		return num;
	}

	public static void main(String[] a) {
		ReturnMissinghNum return1 = new ReturnMissinghNum();
		int[] input = {1, 3, 4, 7, 9, 10};
		int output = return1.MissingNum(input);
		System.out.println(output);
	}

}
