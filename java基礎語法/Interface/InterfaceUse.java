package Interface;

public class InterfaceUse implements Cars{

	@Override
	public void engineStart(String engineType, boolean isKeyless) {
		System.out.println("實現多個接口調用");

	}

}
