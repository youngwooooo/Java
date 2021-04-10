package j_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import e_oop.ScanUtil;

public class Board {

	public static void main(String[] args) {
		/*
		 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고,
		 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요
		 * 
		 * 번호(PK), 제목, 내용, 작성자, 작성일
		 * 
		 * ------------------------------------------
		 * 번호			제목			작성자		작성일
		 * 4	   	     안녕하세요		홍길동		 4/7
		 * 3	   	     안녕하세요		홍길동		 4/7
		 * 2	   	     안녕하세요		홍길동		 4/7
		 * 1	   	     안녕하세요		홍길동		 4/7
		 * ------------------------------------------
		 * 1.조회	2.등록	0.종료
		 * 
		 * - 조회 후 수정 및 삭제 가능
		 */
		
		ArrayList<HashMap<String, Object>> boardTable = new ArrayList<>();  // 게시판테이블 생성
		// 등록하면 콘솔에 출력되도록하고, 등록해야 조회가능
		while(true){
			System.out.println("--------------------------------");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("--------------------------------");
				for(int i=boardTable.size()-1; i>=0; i--){
					HashMap<String, Object> board = boardTable.get(i);
					System.out.println(board.get("number") + "\t" + board.get("title") + "\t" + board.get("writer") + "\t" + board.get("date"));
				}
				System.out.println("--------------------------------");
				System.out.println("1.조회\t2.등록\t0.종료");
				System.out.print("입력 > ");
				int input = ScanUtil.nextInt();
				
				switch(input){
					case 1:  // 1.조회
						read(boardTable);
						break;
					case 2:  // 2.등록
						insert(boardTable);
						break;
					case 0:  // 0.종료
						System.out.println("게시판을 닫습니다.");
						System.exit(0);
						break;
				}
		}
	}
	
	static void read(ArrayList<HashMap<String, Object>> boardTable){  // 게시판을 '조회'하려면 게시판테이블이 필요하다. 파라미터로 게시판테이블을 받아 사용하자!
		System.out.println("조회할 게시글 번호를 입력해주세요 > ");
		String num = ScanUtil.nextLine();
		
		HashMap<String, Object> board = null;
		for(int i=0; i<boardTable.size(); i++){
			board = boardTable.get(i);
			if(board.get("number").equals(num)){
				
			}
		}
				
		System.out.println("-----------------------------");
		System.out.println("번호 : " +board.get("number"));
		System.out.println("제목 : " +board.get("title"));
		System.out.println("작성자 : " +board.get("writer"));
		System.out.println("작성일 : " +board.get("date"));
		System.out.println("내용 : " +board.get("contents"));
		System.out.println("-----------------------------");
		System.out.println("1.수정\t2.삭제\t0.목록");
		int input = ScanUtil.nextInt();
		
		switch(input){
			case 1:
				update(board);
				break;
			case 2:
				delete(boardTable, board);
				break;
			case 0:
				break;
				
		}
		
	}
	static void update(HashMap<String, Object> board){
		System.out.println("번호 >");
		String updatenum = ScanUtil.nextLine();
		System.out.println("제목 >");
		String updatetitle = ScanUtil.nextLine();
		System.out.println("작성자 >");
		String updatewriter = ScanUtil.nextLine();
		System.out.println("작성일 >");
		String updatedate = ScanUtil.nextLine();
		System.out.println("내용 >");
		String updatecontents = ScanUtil.nextLine();
		
		board.put("number", updatenum);
		board.put("title", updatetitle);
		board.put("writer", updatewriter);
		board.put("date", updatedate);
		board.put("contents", updatecontents);
		
		System.out.println("게시글이 수정되었습니다.");
		
	}
	
	static void delete(ArrayList<HashMap<String, Object>> boardTable, HashMap<String, Object> board){
		for(int i=0; i<boardTable.size(); i++){
			board = boardTable.get(i);
			if(boardTable.get(i).get("number").equals(board.get("number"))){
				boardTable.remove(i);
				System.out.println("게시글이 삭제되었습니다.");
			}
		}
		
		
		
	}
	
	static void insert(ArrayList<HashMap<String, Object>> boardTable){
		System.out.print("번호 > ");
		String boardnum = ScanUtil.nextLine();
		System.out.print("제목 > ");
		String boardtitle = ScanUtil.nextLine();
		System.out.print("작성자 > ");
		String boardwriter = ScanUtil.nextLine();
		System.out.print("작성일 > ");
		String boarddate = ScanUtil.nextLine();
		System.out.print("내용 > ");
		String boardcontents = ScanUtil.nextLine();
		
		HashMap<String, Object> boardinsert = new HashMap<>();
		boardinsert.put("number", boardnum);
		boardinsert.put("title", boardtitle);
		boardinsert.put("writer", boardwriter);
		boardinsert.put("date", boarddate);
		boardinsert.put("contents", boardcontents);
		
		boardTable.add(boardinsert);
		System.out.println("게시글이 등록되었습니다.");
		
	}

}

	
