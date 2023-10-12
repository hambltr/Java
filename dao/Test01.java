package dao;

public class Test01 {
	public static void main(String[] args) {
		
		BoardDAO dao=new BoardDAOImpl();//°´Ã¼»ý¼º
		
		dao.boardWrite();
	
		dao.boardList();
		
		dao.boardContent();
		
		dao.boardDelete();
		
		dao.boardEdit();
		
	}//main-end
}//class-end
