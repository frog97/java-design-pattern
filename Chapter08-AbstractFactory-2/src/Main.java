import abst.Button;
import abst.GuiFac;
import abst.TextArea;
import concrete.FactoryInstance;

public class Main {

	public static void main(String[] args) {

		GuiFac fac = FactoryInstance.getGuiFac();
		//  이런 방식으로 main의 수정없이 OS마다 다른 factory 연결 가능.

		Button button = fac.createButton();
		TextArea area = fac.createTextArea();
		
		button.click();
		System.out.println(area.getText());
//		System.out.println(System.getProperty("os.name"));
	}
}
