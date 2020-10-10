package AdapterModel;

import AbstractFactory.Milk;
import AbstractFactory.Tea;
import BuilderModel.MilkMachine;

public class Adapter extends MilkMachine implements newMachineTarget{
	public void newmaking(Milk milk,Tea tea) {
		makingMilk(milk);
		
		//�¼ӵĿ��蹦��
		String makeString=tea.getTea();
		System.out.println(makeString);
	}
}
