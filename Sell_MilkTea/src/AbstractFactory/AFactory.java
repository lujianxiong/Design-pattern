package AbstractFactory;

public class AFactory extends Factory{
//A��
    public Milk CreateMilk(){
    	Milk milk = new PureMilk();
    	System.out.println("(���أ�A��)");
        return milk;
    }

    public Tea CreateTea(){
    	Tea tea = new GreenTea();
    	System.out.println("(���أ�A��)");
        return tea;
    }
}
