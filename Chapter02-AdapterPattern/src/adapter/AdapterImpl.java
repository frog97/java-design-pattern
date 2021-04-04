package adapter;



public class AdapterImpl implements Adapter {

	@Override
	public Double twiceOf(Float num) {
		return Math.doubled(num.doubleValue());
	}

	@Override
	public Double halfOf(Float num) {
		//log 추가... // 즉 main도 안고치고, 라이브러리도 안고치고 내가 원하는 기능을 추가 할 수 있음.
		System.out.println("half 함수 호출 시작.");
		return Math.half(num);
	}

}
