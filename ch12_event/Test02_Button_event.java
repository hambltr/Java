package ch12_event;
import java.awt.*;
import java.awt.event.*;


public class Test02_Button_event extends Frame implements ActionListener {
	//����
	Button bu_FileOpen, bu_FileSave, bu_Print, bu_Exit;
	Panel pNorth, pSouth;



	//������
	public Test02_Button_event(){
		super("FileDialog ����");
		bu_FileOpen=new Button("���� ����");
		bu_FileSave=new Button("���� ����");
		bu_Print=new Button("�μ�");
		bu_Exit=new Button("����");

		pNorth=new Panel();
		pSouth=new Panel();

		pNorth.setBackground(Color.red);
		pSouth.setBackground(Color.red);
		//
		//�гο� ��ư ���̱�, FlowLayout ����
		pNorth.add(bu_FileOpen);
		pNorth.add(bu_FileSave);
		pNorth.add(bu_Print);

		pSouth.add(bu_Exit);

		//Frame�� �г� ���̱� , BorderLayout ����
		add(pNorth,"North");
		add(pSouth,"South");


		addWindowListener(new MyWin());//â���� �̺�Ʈ

		bu_FileOpen.addActionListener(this);
		bu_FileSave.addActionListener(this);
		bu_Print.addActionListener(this);
		bu_Exit.addActionListener(this);

		setBounds(300,300,500,500);
		setVisible(true);

	}//cons-end

	//inner-class
	class MyWin extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);

		}//we
	}//inner-class-end

	//�������̵�
	public void actionPerformed(ActionEvent e){
		FileDialog fd=null;
		if(e.getSource()==bu_FileOpen){
			fd=new FileDialog(this,"���� ����",FileDialog.LOAD);
			//			          �θ�ü, â ����,   mode
			fd.setVisible(true);
			
		}else if(e.getSource()==bu_FileSave){
			fd=new FileDialog(this,"���� ����",FileDialog.SAVE);
			fd.setVisible(true);
			
		}else if(e.getSource()==bu_Print){
			PrintJob pj=getToolkit().getPrintJob(this, "", null);
			
		}else if(e.getSource()==bu_Exit){
			System.exit(0);
		}
	}//actionPerformed()-end
	public static void main(String[] args) {
		new Test02_Button_event();
	}//main-end
}//class-end
