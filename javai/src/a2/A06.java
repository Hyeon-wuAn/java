package a2;

public class A06 {
	public static void main(String[] args) {
		double scoreList[][] = {{4.49,4.38}, {2.34,3.5}, {3.87,2.88}, {4.1,3.9}};
		// year, term
		double sum = 0;
		for(int year=0; year<scoreList.length; year++) {
			for(int term=0; term<scoreList[year].length; term++) {
				sum+=scoreList[year][term];
			}
		}
		System.out.println(sum);
		System.out.println(sum/scoreList.length*scoreList[0].length);
		
		
	}
}
