package state;

public class BlockState extends ThreadState {
	public BlockState(){
		state=StateSet.BLOCKED;
		System.out.println("�����߳�");
	}
	public void resume(ThreadContext tc){
		System.out.println("������resume����");
		if(state==StateSet.BLOCKED){
			tc.setThreadState(new NewState());}
		else
			System.out.println("��ǰ�̲߳�������״̬");
	}
	
}
