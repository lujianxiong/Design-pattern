package AbstractFactory;

public class PureMilk implements Milk{
	PureMilk(){
		System.out.print("�Ӵ�ţ��");
	}
	@Override
	public String getMilk(){
		String string="�ڽ������Ӵ�ţ��";
		return string;
	}

}
