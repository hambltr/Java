package ch14_io;
import java.io.Serializable;// implements 하면 됨
//객체 직렬화

public class Test12_Phone implements Serializable {
	String name;
	int price;
	
	//생성자
	public Test12_Phone(String name,int price){
		this.name=name;
		this.price=price;
	}//cons-end

	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	

	
}//class-end
