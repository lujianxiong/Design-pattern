//设计模式之原型模式
//饿汉模式
public class ClientClass2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyFruit fruit1 = new Apple();
        MyFruit fruit2 = new Banana();

        MyFruitStore2 store = MyFruitStore2.Getfruitstore();

        store.Add(1,fruit1);
        store.Add(2,fruit2);
        store.Add(3,fruit1);
        store.Add(4,fruit2);

        MyFruit f1= (MyFruit) store.Get(1);
        f1.Display();
        MyFruit f2 = (MyFruit) store.Get(2);
        f2.Display();
    }
}


