
public class Application {

	public static void main(String[] args) {
		
		Attack attack = new Attack();
 		attack.setAmount(100);
		
		Armor armorA = new Armor() {

			@Override
			protected void process(Attack attack) {
				int amount = attack.getAmount();
				amount *= 0.8;
				attack.setAmount(amount);
			}
		};
		
		Armor armorB = new Armor() {
			
			@Override
			protected void process(Attack attack) {
				int amount = attack.getAmount();
				amount -= 10;
				if(amount < 0 )
					amount = 0;
				attack.setAmount(amount);
			}
		};
		// point 중요.. 동적으로 책임 사슬 추가 가능.
		armorA.setNextDefense(armorB);
		
		armorA.defense(attack);
		
		System.out.println(attack.getAmount());
		
		armorA.setNextDefense(new Armor() {
			
			@Override
			protected void process(Attack attack) {
				int amount = attack.getAmount();
				amount -= 50;
				if(amount < 0 )
					amount = 0;
				attack.setAmount(amount);
			}
		});
		
		attack.setAmount(100);

		armorA.defense(attack);
		
		System.out.println(attack.getAmount());
	}
}
