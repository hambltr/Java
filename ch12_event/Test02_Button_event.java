package ch12_event;
import java.awt.*;
import java.awt.event.*;


public class Test02_Button_event extends Frame implements ActionListener {
	//변수
	Button bu_FileOpen, bu_FileSave, bu_Print, bu_Exit;
	Panel pNorth, pSouth;



	//생성자
	public Test02_Button_event(){
		super("FileDialog 예제");
		bu_FileOpen=new Button("파일 열기");
		bu_FileSave=new Button("파일 저장");
		bu_Print=new Button("인쇄");
		bu_Exit=new Button("종료");

		pNorth=new Panel();
		pSouth=new Panel();

		pNorth.setBackground(Color.red);
		pSouth.setBackground(Color.red);
		//
		//패널에 버튼 붙이기, FlowLayout 적용
		pNorth.add(bu_FileOpen);
		pNorth.add(bu_FileSave);
		pNorth.add(bu_Print);

		pSouth.add(bu_Exit);

		//Frame에 패널 붙이기 , BorderLayout 적용
		add(pNorth,"North");
		add(pSouth,"South");


		addWindowListener(new MyWin());//창종료 이벤트

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

	//오버라이딩
	public void actionPerformed(ActionEvent e){
		FileDialog fd=null;
		if(e.getSource()==bu_FileOpen){
			fd=new FileDialog(this,"파일 열기",FileDialog.LOAD);
			//			          부모객체, 창 제목,   mode
			fd.setVisible(true);
			
		}else if(e.getSource()==bu_FileSave){
			fd=new FileDialog(this,"파일 저장",FileDialog.SAVE);
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
