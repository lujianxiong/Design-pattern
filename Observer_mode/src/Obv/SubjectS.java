package Obv;

import java.util.ArrayList;
import java.util.List;

public abstract class SubjectS {
	protected List <Observer0> observers;
	public SubjectS(){            //���췽����newһ��Ŀ������
		observers=new ArrayList<Observer0>();
		//ArrayList�Ƕ�̬���飬�򵥵�˵����Array�ĸ��Ӱ汾��
		//���ṩ�˶�̬�����Ӻͼ���Ԫ�أ�ʵ����ICollection��IList�ӿڣ�������������Ĵ�С�Ⱥô�
	}
	public void Add(Observer0 observer){
		observers.add(observer);      //����Ŀ����
	}
	public void Remove(Observer0 observer){
		observers.remove(observer);    
	}
	public abstract void notifyObserver();
}
