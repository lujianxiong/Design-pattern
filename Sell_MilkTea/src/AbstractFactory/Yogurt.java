package AbstractFactory;

public class Yogurt implements Milk{
	public Yogurt(){
		System.out.print("������");
	}
    	@Override
	public String getMilk() {
		String string="�ڽ�����������";
		return string;
	}
}
