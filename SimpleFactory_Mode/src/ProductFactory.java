
public class ProductFactory {
	public static Product Creat(String ProductName){
		//����������if����������������Ʒ��
		if("A".equals(ProductName))
			return new ProductA();
		if("B".equals(ProductName))
			return new ProductB();
		if("C".equals(ProductName))
			return new ProductC();
		return null;
	}

}
