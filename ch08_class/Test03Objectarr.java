package ch08_class;
//��ü�迭 �ǽ�



class Sung{
	private String name;
	private int kor;
	private int eng;
	
	public Sung(){}//����Ʈ ������
	
	//���� �ִ� ������
	public Sung(String name, int kor, int eng){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}//cons-end
	
	//����� ���� �޼���
	public void disp(){
		System.out.println(name + " " + kor + " " + eng + " ");
		
	}//disp_end
	
}//class_end

public class Test03Objectarr {
	public static void main(String[] args) {
	
		int a=10;
		int b=20;
		int c=30;
		
		//��ü = ���۷������� = �������� = �ν��Ͻ�
		Sung kim=new Sung("Kim",77,88); //��ü ���
		Sung lee=new Sung("lee",11,22);
		Sung park=new Sung("park",33,44);
		
		//��ü.�޼���();
		kim.disp();
		lee.disp();
		park.disp();
		System.out.println("=======================");
		
		//����
		
		//��ü�迭
		int x[]=new int[3];
		x[0]=100;
		x[1]=200;
		x[2]=300;
		
		//��ü�迭
		Sung s[]=new Sung[3];
		s[0]=new Sung("aaa",66,77);
		s[1]=new Sung("bbb",11,22);
		s[2]=new Sung("ccc",33,44);
		
		
		//for���� ����ؼ� ����� ����Ͻÿ�
		
	    
        for(int i=0; i<s.length; i++){
        	s[i].disp();
        	
        }//for_end
        System.out.println("=======================");
		//
        int y[]={30,40,50};
        
        Sung m[]={new Sung("choi",77,88),
        		  new Sung("An",88,99),
        		  new Sung("aa",22,33)
        }; //Sung
        
        
        //for������ ����Ͻÿ�
        for(int i=0; i<m.length; i++){
        	m[i].disp();
        }//for_end
        System.out.println("=======================");
        
       
	}//main_end
}//class_end
	
