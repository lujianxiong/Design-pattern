package AbstractFactory;

public class GreenTea implements Tea{
	public GreenTea(){
    	System.out.print("���̲�");
	}
    	@Override
	public String getTea() {
		String string="�ڿ��������̲�";
		return string;
	}
}
