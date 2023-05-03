package day06;
// kor, eng, math
// 평균 출력하는 class
//Grade myGrade = new Grade(60, 80, 70);
//double myGrade.average(); // return 타입 더블
//나의 평균은 82.5입니다.
public class Grade {
	public double kor, eng, math;
		public Grade(){
		
	}
	public Grade(double kor, double eng, double math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public double average(int digit) {
		double num=1;
		for(int i=0; i<digit; i++) {
			num=num*10;
		}
		//Math.pow(10, digit); 제곱해줌. 
		double avg = Math.round((kor+eng+math)/3*num);
		return avg/num;
		//public void 는 결과가 없는것 d
		//함수의 결과가 있는것을 return 한다고 함
		//return 97; 하면 계속 평균값 97 나옴.
	}
	//둘째자리까지 해서 반올림 *100
	//셋째자리까지 해서 반올림 *1000


	
	
	
}
