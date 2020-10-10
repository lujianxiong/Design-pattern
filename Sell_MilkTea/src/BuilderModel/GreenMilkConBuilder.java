package BuilderModel;

import AdapterModel.Adapter;
import AdapterModel.newMachineTarget;
import ArchetypalModel.MilkTeaBuilder;

public class GreenMilkConBuilder extends MilkTeaBuilder{
	@Override
	public void buildMilk() {
		openDoor(1);
		milk=cloneFactory.CreateMilk();
		System.out.println("Factory: " + cloneFactory);
	}
	@Override
	public void buildTea() {
		openDoor(1);
		tea=cloneFactory.CreateTea();
		System.out.println("Factory: " + cloneFactory);
	}
	@Override
	public void create() {
		System.out.println("正在准备牛奶绿茶中......");	
        //MilkMachine.makingMilk(milk);
		//TeaMachine.makingTea(tea);
		newMachineTarget machine=new Adapter();
		machine.newmaking(milk,tea);//用新机器加工
	}
}
