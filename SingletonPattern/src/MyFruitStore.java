import com.sun.org.apache.bcel.internal.generic.RETURN;
//设计模式之单例模式
//懒汉模式：
//程序启动时声明的水果店和货架都是null。 需要用到的时候，调用Getfruitstore函数
//如果水果店空，实例化一个水果店，调用构造函数，实例化一个水果架（Hashtable）
//如果水果店不为空，返回水果店对象。
import java.util.Hashtable;

public class MyFruitStore {
    //水果架    Hashtable里面放了很多原型，像一个池子一样
    private static Hashtable fruittable = null;
    private static MyFruitStore fruitStore = null;
    private MyFruitStore(){
        //构造函数私有化，将创建货架的功能放在构造函数里
        fruittable = new Hashtable<Integer,MyFruit>();
    }
    public static MyFruitStore Getfruitstore(){
        //通过全局的函数调用本类构造函数来实现new一个对象实例化
        if(fruittable == null){
            //这个是系统需要的时候，创建对象，进行实例化(俗称懒汉模式)
            //还有一种方法，是在最上面声明对象的时候直接进行实例化，这是（俗称的饿汉模式）
            fruitStore = new MyFruitStore();
        }
        return fruitStore;
    }

    public void Add(Integer key, MyFruit fruit){
       //将水果放到货架上
        fruittable.put(key,fruit);
    }

    //从货架上取,通过货架号取
    public MyFruit Get(Integer key) throws CloneNotSupportedException {
        MyFruit fruit = (MyFruit) fruittable.get(key); //get出来的是Object类型，需要强制转换
        return (MyFruit) fruit.clone();  //不能真把水果拿出去了，否则货架上就没有了，拿得是clone
    }
}
