package ch14_io;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;//제공해준 대화상자 사용 하려고(메시지 출력)

//MenuBar
//Menu
//MenuItem
public class Test11_Memo extends Frame implements ActionListener{
	//변수
	JTextArea ta;//메모장 
	
	//생성자:객체 초기화(필드 초기화)
	public Test11_Memo(){
		super("메모장");
		
		setFont(new Font("Dailog",Font.BOLD,20));
		
		MenuBar mb=new MenuBar();//메뉴바,객체생성
		
		Menu filemenu=new Menu("파일");
		Menu editmenu=new Menu("편집");
		Menu formatmenu=new Menu("서식");
		Menu viewmenu=new Menu("보기");
		Menu helpmenu=new Menu("도움맣");
		
		mb.add(filemenu);//메뉴바에 메뉴 추가
		mb.add(editmenu);//메뉴바에 메뉴 추가
		mb.add(formatmenu);//메뉴바에 메뉴 추가
		mb.add(viewmenu);//메뉴바에 메뉴 추가
		mb.add(helpmenu);//메뉴바에 메뉴 추가
		
		//항목메뉴 만들기 
		
		//1. 새파일
		MenuItem newFile=new MenuItem("새파일",new MenuShortcut('N'));
		filemenu.add(newFile);//메뉴/항목메뉴
		newFile.addActionListener(this);//이벤트 등록
		newFile.setActionCommand("new");
		
		//2. 파일열기
		MenuItem openFile=new MenuItem("파일열기",new MenuShortcut('O'));
		filemenu.add(openFile);//메뉴/항목메뉴
		openFile.addActionListener(this);//이벤트 등록
		openFile.setActionCommand("open");
		
		//3. 파일저장
		MenuItem saveFile=new MenuItem("파일저장",new MenuShortcut('S'));
		filemenu.add(saveFile);//메뉴/항목메뉴
		saveFile.addActionListener(this);//이벤트 등록
		saveFile.setActionCommand("save");
		
		//4. 분리선,구분선
		filemenu.addSeparator();
		
		//5.인쇄
		MenuItem filePrint=new MenuItem("인쇄",new MenuShortcut('P'));
		filemenu.add(filePrint);//메뉴/항목메뉴
		filePrint.addActionListener(this);//이벤트 등록
		filePrint.setActionCommand("print");
		
		//6. 분리선,구분선
		filemenu.addSeparator();
		
		//7. 종료
		MenuItem exitItem=new MenuItem("종료",new MenuShortcut('X'));
		filemenu.add(exitItem);//메뉴/항목메뉴
		exitItem.addActionListener(this);//이벤트 등록
		exitItem.setActionCommand("exit");
		
		addWindowListener(new MyWin());//창종료 이벤트 등록
		
		setMenuBar(mb);//메뉴바 붙이기
		ta=new JTextArea();
		ta.setFont(new Font("궁서체",Font.BOLD,20));
		add(ta,"Center");
		
		setSize(500,500);
		setVisible(true);
	}//cons-end
	
	//inner class
	class MyWin extends WindowAdapter{
		//오버라이딩
		public void windowClosing(WindowEvent w){
			System.exit(0);
		}
	}//inner-class-end
	
	//메서드 오버라이딩
	public void actionPerformed(ActionEvent e){
		FileDialog fd=null;
		String cmd=e.getActionCommand();//이벤트가 발생한 소스를 얻는다 / "new" open save print exit
		
		if(cmd.equals("new")){//새글쓰기
			ta.setText("\r");
		}else if(cmd.equals("open")){
			fd=new FileDialog(this,"파일열기",FileDialog.LOAD);
			fd.setVisible(true);//창표시
			
			String fn=fd.getDirectory()+fd.getFile();
			if(fn != null){
				fileOpen(fn);//메서드 호출 
			}//if-end
			
		}else if(cmd.equals("save")){
			fd=new FileDialog(this,"파일저장",FileDialog.SAVE);
			                  //this는 파일 대화 상자가 소속될 부모창
			fd.setVisible(true);
			
			String fn=fd.getDirectory()+fd.getFile();
			if(fn != null){
				fileSave(fn);//저장 메서드 호출
			}
		}else if(cmd.equals("print")){
			PrintJob pj=getToolkit().getPrintJob(this, "인쇄", null);
			 //                                  부모창
		}else if(cmd.equals("exit")){
			System.exit(0);
		}
	}//actionPerformed()-end
	
	//메서드 : 사용자 정의 메서드 => 파일로 저장
	public void fileSave(String fn){
		PrintWriter out=null;
		try{
			out=new PrintWriter(new BufferedWriter(new FileWriter(fn)));
			String str=ta.getText();//메모장 내용을 str에 할당
			out.println(str);
			
			setTitle("파일이름:"+fn);
			
		}catch(Exception e){
			System.out.println(e);
		}finally{
			try{
				out.close();
			}catch(Exception e2){}
		}//finally-end
		
	}//fileSave()-end
	
	//메서드 : 사용자 정의 메서드 => 파일로 부터 읽어오기
	public void fileOpen(String fn){
		BufferedReader in=null;
		ta.setText("\r");
		try{
			in=new BufferedReader(new FileReader(fn),1024);//1024 버퍼크기 지정
			String str="";
			
			while((str=in.readLine()) != null){//파일 끝이 아닌 동안 반복 수행
				ta.append(str+"\n");
			}//while-end
			
			setTitle("파일이름:"+fn);//창 제목 
			
		}catch(Exception e){
			System.out.println(e);
		}finally{
			try{
				in.close();
			}catch(Exception e2){}
		}//-finally-end
	}//fileOpen()-end
	
	//main
	public static void main(String[] args) {
		new Test11_Memo();//객체생성, 생성자 호출
	}
	
}//class-end


//문자열 생성자 .equals 쪽지시험  문제 :: 구구단