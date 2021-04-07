
public abstract class Armor implements Defense {

	private Defense nextDefense; // 책임 사슬의 연결 고리 객체
	
	public void setNextDefense(Defense nextDefense) {
		this.nextDefense = nextDefense;
	}
	
	@Override
	public void defense(Attack attack) {

		// point... 중요.. check 안하고진행.
		process(attack);
		if(nextDefense!=null)
			nextDefense.defense(attack);
	}

	abstract protected void process(Attack attack);

}
