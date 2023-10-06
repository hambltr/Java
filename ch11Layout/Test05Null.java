package ch11Layout;
import java.awt.*;
import java.awt.event.*;
//â���� ����
//Layout�� null ���: ���α׷��Ӱ� ���� ������

public class Test05Null extends Frame {
	//����
	Label la_Jemok;
	Label la_Name, la_Id, la_Email, la_Title, la_Content;
	TextField tf_Name, tf_Id, tf_Email, tf_Title;//���� ������ �� ���
	TextArea ta_Content; //������ �� �� ���
	Button bu_Insert, bu_Update, bu_Delete, bu_List, bu_Exit;

	//������
	public Test05Null(){
		super("GuestBook");
		
		setFont(new Font("Dialog",Font.BOLD,14));
		setBackground(new Color(232,217,255)); 
		// new Color(R,G,B)
		// new Color(0~255,0~255,0~255)
		// Color, cyan -- QBColor : 16���� ����
		
		la_Jemok=new Label("GuestBook",Label.CENTER);
		la_Jemok.setFont(new Font("Helvetica",Font.BOLD,20));
		
		la_Name=new Label("�̸�", Label.RIGHT);
		la_Id=new Label("ID",Label.RIGHT);
		la_Email=new Label("Email",Label.RIGHT);
		la_Title=new Label("Title",Label.RIGHT);
		la_Content=new Label("�� ����",Label.RIGHT);
		//
		tf_Name=new TextField();
		tf_Id=new TextField();
		tf_Email=new TextField();
		tf_Title=new TextField();
		ta_Content=new TextArea(); //���� -Content�� ta -> TextArea
		//
		bu_Insert=new Button("Insert");
		bu_Update=new Button("Update");
		bu_Delete=new Button("Delete");
		bu_List=new Button("List");
		bu_Exit=new Button("Exit");
		//
		//
		setLayout(null);//���α׷��Ӱ� ���� ������
		
		//�����̳�(Frame)�� ������Ʈ ������
		
		add(la_Jemok).setBounds(70, 50, 250, 30);
		//				     	x, y, width,height
		add(la_Name).setBounds(80, 90, 50, 30);
		add(tf_Name).setBounds(140, 90, 150, 30);
		
		add(la_Id).setBounds(80, 130, 50, 30);
		add(tf_Id).setBounds(140, 130, 150, 30);
		
		add(la_Email).setBounds(80, 170, 50, 30);
		add(tf_Email).setBounds(140, 170, 150, 30);
		
		add(la_Title).setBounds(80, 210, 50, 30);
		add(tf_Title).setBounds(140, 210, 150, 30);
		
		add(la_Content).setBounds(80, 250, 50, 30);
		add(ta_Content).setBounds(140, 250, 150, 100);
		//
		add(bu_Insert).setBounds(40, 370, 60, 30);
		add(bu_Update).setBounds(110, 370, 60, 30);
		add(bu_Delete).setBounds(180, 370, 60, 30);
		add(bu_List).setBounds(250, 370, 60, 30);
		add(bu_Exit).setBounds(320, 370, 60, 30);
		
		
	
		addWindowListener(new MyWin());//â���� �̺�Ʈ
		setBounds(300,300,420,520);
		setVisible(true);

	}//cons-end

	//inner-class
	class MyWin extends WindowAdapter{
		
		@Override
		public void windowClosing(WindowEvent we){
			System.exit(0);

		}//we
	}//inner-class-end
	public static void main(String[] args) {
		new Test05Null();
	}//main-end
}//class-end
