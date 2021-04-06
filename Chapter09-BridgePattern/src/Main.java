
public class Main {

	public static void main(String[] args) {


		PrintMorseCode code = new PrintMorseCode(new DefaultMCF());
		code.g().a().r().a().m();
		System.out.println("");

		code.setFunction(new SoundMCF());
		code.g().a().r().a().m();
		System.out.println("");

		code.setFunction(new FlashMCF());
		code.g().a().r().a().m();


	}
}
