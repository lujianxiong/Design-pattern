
public class SimpleFactoryPattern {
	public static void main(String[] args) {
//ProductFactory��ʹ��if����
		ProductFactory factory = new ProductFactory();
		factory.Creat("A").show();
		factory.Creat("B").show();
		factory.Creat("C").show();
		
//Factory��ʹ��switch����
//		Factory factory = new ProductFactory();
//		factory.Manufacture("A").show();
//		factory.Manufacture("B").show();
//		factory.Manufacture("C").show();


		

	}

}
