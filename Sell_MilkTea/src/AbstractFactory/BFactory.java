package AbstractFactory;

public class BFactory extends Factory{
	//B��
    public Milk CreateMilk(){
    	Milk milk = new Yogurt();
    	System.out.println("(���أ�B��)");
        return milk;
    }

    public Tea CreateTea(){
    	Tea tea = new RedTea();
    	System.out.println("(���أ�B��)");
        return tea;
    }
}
