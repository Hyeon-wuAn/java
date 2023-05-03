package quiz;

public class WonToYuan extends Converter {
	
	public WonToYuan(double ratio) {
		this.ratio=ratio;
	}

	@Override
	public double convert(double src) {
		return (double)(Math.round((src/ratio)*100))/100;
	} // double 앞에 추가해 묶어주거나 뒤에 나누는 수에 100.0 이런 식으로
//			소수점을 붙여 실수형으로 만들어준다.

	@Override
	public String srcString() {
		// TODO Auto-generated method stub
		return "원";
	}

	@Override
	public String destString() {
		// TODO Auto-generated method stub
		return "위안";
	}

}
