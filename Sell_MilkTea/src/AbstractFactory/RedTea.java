package AbstractFactory;

public class RedTea implements Tea{
	public RedTea()	{
		System.out.print("�Ӻ��");
	}
    	@Override
	public String getTea() {
		String string="�ڿ������Ӻ��";
		return string;
	}
}
