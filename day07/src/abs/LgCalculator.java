package abs;

public class LgCalculator extends Calculator {

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		return a-b;
	}

	@Override
	public double average(int[] nums) {
		double sum = 0;
		for(int num: nums) { //each문 nums에 속한 num들
			sum+=num;
		}
		return sum/nums.length;
	}

}
