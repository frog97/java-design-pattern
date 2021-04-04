package com.parkgaram.dp.templatemethod;

public class ConcreteConnectHelper extends AbstConnectHelper {

	@Override
	protected String doSecurity(String info) {

		System.out.println("강화된 방식으로 디코드 // 추가 요구 사항.");
		return info;
	}

	@Override
	protected String authentication(String id, String password) {
		if(id.equals("abc")|password.equals("abc"))
			return "true info";
		else
			return "false info";
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("권한 확인");
		// 서버에서 유저나이 확인하고
		// 청소년이면 권한이 없는 것으로 간주 // 추가 요구 사항.
		return 0;
	}

	@Override
	protected String connection(String info) {
		
		return info;
	}

}
