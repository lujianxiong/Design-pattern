import java.util.Hashtable;
//设计模式之单例模式
//饿汉模式：
//在程序启动的时候就new一个MyFruitStore(),new的时候创建一个对象同时调用构造函数
//程序启动时该类的构造函数就实例化了一个水果货架。 需要用的时候直接通过Getfruitstore方法返回对象
public class MyFruitStore2 {
    private static Hashtable fruittable = null;
    private static MyFruitStore2 fruitStore2 = new MyFruitStore2();
    private MyFruitStore2(){
        fruittable = new Hashtable<Integer,MyFruit>();
    }
    public static MyFruitStore2 Getfruitstore(){
        return fruitStore2;
    }

    public void Add(Integer key, MyFruit fruit){
        fruittable.put(key,fruit);
    }

    //从货架上取,通过货架号取
    public MyFruit Get(Integer key) throws CloneNotSupportedException {
        MyFruit fruit = (MyFruit) fruittable.get(key);
        return (MyFruit) fruit.clone();
    }
}
