package ch14_io;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;//�������� ��ȭ���� ��� �Ϸ���(�޽��� ���)

//MenuBar
//Menu
//MenuItem
public class Test11_Memo extends Frame implements ActionListener{
	//����
	JTextArea ta;//�޸��� 
	
	//������:��ü �ʱ�ȭ(�ʵ� �ʱ�ȭ)
	public Test11_Memo(){
		super("�޸���");
		
		setFont(new Font("Dailog",Font.BOLD,20));
		
		MenuBar mb=new MenuBar();//�޴���,��ü����
		
		Menu filemenu=new Menu("����");
		Menu editmenu=new Menu("����");
		Menu formatmenu=new Menu("����");
		Menu viewmenu=new Menu("����");
		Menu helpmenu=new Menu("�����");
		
		mb.add(filemenu);//�޴��ٿ� �޴� �߰�
		mb.add(editmenu);//�޴��ٿ� �޴� �߰�
		mb.add(formatmenu);//�޴��ٿ� �޴� �߰�
		mb.add(viewmenu);//�޴��ٿ� �޴� �߰�
		mb.add(helpmenu);//�޴��ٿ� �޴� �߰�
		
		//�׸�޴� ����� 
		
		//1. ������
		MenuItem newFile=new MenuItem("������",new MenuShortcut('N'));
		filemenu.add(newFile);//�޴�/�׸�޴�
		newFile.addActionListener(this);//�̺�Ʈ ���
		newFile.setActionCommand("new");
		
		//2. ���Ͽ���
		MenuItem openFile=new MenuItem("���Ͽ���",new MenuShortcut('O'));
		filemenu.add(openFile);//�޴�/�׸�޴�
		openFile.addActionListener(this);//�̺�Ʈ ���
		openFile.setActionCommand("open");
		
		//3. ��������
		MenuItem saveFile=new MenuItem("��������",new MenuShortcut('S'));
		filemenu.add(saveFile);//�޴�/�׸�޴�
		saveFile.addActionListener(this);//�̺�Ʈ ���
		saveFile.setActionCommand("save");
		
		//4. �и���,���м�
		filemenu.addSeparator();
		
		//5.�μ�
		MenuItem filePrint=new MenuItem("�μ�",new MenuShortcut('P'));
		filemenu.add(filePrint);//�޴�/�׸�޴�
		filePrint.addActionListener(this);//�̺�Ʈ ���
		filePrint.setActionCommand("print");
		
		//6. �и���,���м�
		filemenu.addSeparator();
		
		//7. ����
		MenuItem exitItem=new MenuItem("����",new MenuShortcut('X'));
		filemenu.add(exitItem);//�޴�/�׸�޴�
		exitItem.addActionListener(this);//�̺�Ʈ ���
		exitItem.setActionCommand("exit");
		
		addWindowListener(new MyWin());//â���� �̺�Ʈ ���
		
		setMenuBar(mb);//�޴��� ���̱�
		ta=new JTextArea();
		ta.setFont(new Font("�ü�ü",Font.BOLD,20));
		add(ta,"Center");
		
		setSize(500,500);
		setVisible(true);
	}//cons-end
	
	//inner class
	class MyWin extends WindowAdapter{
		//�������̵�
		public void windowClosing(WindowEvent w){
			System.exit(0);
		}
	}//inner-class-end
	
	//�޼��� �������̵�
	public void actionPerformed(ActionEvent e){
		FileDialog fd=null;
		String cmd=e.getActionCommand();//�̺�Ʈ�� �߻��� �ҽ��� ��´� / "new" open save print exit
		
		if(cmd.equals("new")){//���۾���
			ta.setText("\r");
		}else if(cmd.equals("open")){
			fd=new FileDialog(this,"���Ͽ���",FileDialog.LOAD);
			fd.setVisible(true);//âǥ��
			
			String fn=fd.getDirectory()+fd.getFile();
			if(fn != null){
				fileOpen(fn);//�޼��� ȣ�� 
			}//if-end
			
		}else if(cmd.equals("save")){
			fd=new FileDialog(this,"��������",FileDialog.SAVE);
			                  //this�� ���� ��ȭ ���ڰ� �Ҽӵ� �θ�â
			fd.setVisible(true);
			
			String fn=fd.getDirectory()+fd.getFile();
			if(fn != null){
				fileSave(fn);//���� �޼��� ȣ��
			}
		}else if(cmd.equals("print")){
			PrintJob pj=getToolkit().getPrintJob(this, "�μ�", null);
			 //                                  �θ�â
		}else if(cmd.equals("exit")){
			System.exit(0);
		}
	}//actionPerformed()-end
	
	//�޼��� : ����� ���� �޼��� => ���Ϸ� ����
	public void fileSave(String fn){
		PrintWriter out=null;
		try{
			out=new PrintWriter(new BufferedWriter(new FileWriter(fn)));
			String str=ta.getText();//�޸��� ������ str�� �Ҵ�
			out.println(str);
			
			setTitle("�����̸�:"+fn);
			
		}catch(Exception e){
			System.out.println(e);
		}finally{
			try{
				out.close();
			}catch(Exception e2){}
		}//finally-end
		
	}//fileSave()-end
	
	//�޼��� : ����� ���� �޼��� => ���Ϸ� ���� �о����
	public void fileOpen(String fn){
		BufferedReader in=null;
		ta.setText("\r");
		try{
			in=new BufferedReader(new FileReader(fn),1024);//1024 ����ũ�� ����
			String str="";
			
			while((str=in.readLine()) != null){//���� ���� �ƴ� ���� �ݺ� ����
				ta.append(str+"\n");
			}//while-end
			
			setTitle("�����̸�:"+fn);//â ���� 
			
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
		new Test11_Memo();//��ü����, ������ ȣ��
	}
	
}//class-end


//���ڿ� ������ .equals ��������  ���� :: ������