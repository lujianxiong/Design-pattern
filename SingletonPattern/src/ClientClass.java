//设计模式之原型模式
//懒汉模式
public class ClientClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyFruit fruit1 = new Apple();
        MyFruit fruit2 = new Banana();
        //通过构造函数创建一个水果店
        MyFruitStore mfs1 = MyFruitStore.Getfruitstore();

        mfs1.Add(1,fruit1);
        mfs1.Add(2,fruit2);
        mfs1.Add(3,new Apple());
        mfs1.Add(4,new Banana());

        //创建第二个水果店
        MyFruitStore mfs2 = MyFruitStore.Getfruitstore();

        //上面的代码一般用的时候启动的时候就都准备好了
        //用的时候直接去取
        MyFruit f1= (MyFruit) mfs1.Get(3);
        f1.Display();
        //MyFruit f2 = (MyFruit) mfs1.Get(4);
        //f2.Display();
        System.out.println("mfs1:"+mfs1.toString());
        System.out.println("mfs2"+mfs2.toString());
        //创建的两个水果店通过打印的哈希值可以发现：这两个水果店其实是一个水果店
        //只是不同的所谓的指针指向同一个对象，这就是单例模式
    }
}
