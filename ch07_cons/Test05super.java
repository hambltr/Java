package ch07_cons;
import java.awt.*;//Frame �̸� ��ӹ޾Ƽ� â�� �����

public class Test05super extends Frame{
	//������
	public Test05super(){
		super("����");//���� Ŭ���� ������ ȣ��, ������ �ȿ��� ù�ٿ� �����ؾ� �Ѵ�
		//this.setSize(450,450);//x,y ��ǥ/ â ũ��, �ȼ� ����
		//super.setSize(450,450);
		//setSize(450,450); // â ũ�� 
		//setVisible(true); // â ǥ��
		setBackground(Color.MAGENTA);//Math.PI
		setSize(450,450);// â ũ�� 
		setVisible(true);// â ǥ��
		
	}//cons_end
	
	
	public static void main(String[] args) {
		new Test05super();//��ü����, ������ ȣ��
		
		
	}//main_end
}//class-end
