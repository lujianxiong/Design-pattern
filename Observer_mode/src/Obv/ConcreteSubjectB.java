package Obv;

public class ConcreteSubjectB extends SubjectS {

	public ConcreteSubjectB(){
		super();
	}
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		System.out.println("BĿ�귢���ı���");
		for(Observer0 obs:observers){
			obs.response();
	}
	}
}

