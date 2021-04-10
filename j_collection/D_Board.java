package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import e_oop.ScanUtil;

public class D_Board {

	public static void main(String[] args) {
		/*
		 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고,
		 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.
		 * 
		 * 번호(PK), 제목, 내용, 작성자, 작성일
		 * 
		 * -------------------------------
		 * 번호		제목		작성자	작성일
		 * -------------------------------
		 * 1	안녕하세요		홍길동	7/23
		 * 1	안녕하세요		홍길동	7/23
		 * 1	안녕하세요		홍길동	7/23
		 * -------------------------------
		 * 1.조회		2.등록	3.종료
		 */
		
		ArrayList<HashMap<String, Object>> boardList = new ArrayList<>();  // 게시판테이블 생성
		
		while(true){
			System.out.println("------------------------------");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("------------------------------");
			for(int i = boardList.size() - 1; i >= 0 ; i--){  // 게시판은 가장 최근글이 상단으로 올라가야함! for문을 거꾸로 돌릴 것!
				HashMap<String, Object> board = boardList.get(i);
				System.out.println(board.get("board_no") + "\t"
						+ board.get("title") + "\t"
						+ board.get("user") + "\t"
						+ board.get("reg_date"));
			}
			System.out.println("------------------------------");
			System.out.println("1.조회\t2.등록\t0.종료");
			System.out.print("입력>");
			int input = ScanUtil.nextInt();
			
			switch (input) {
			case 1:
				read(boardList);
				break;
				
			case 2:
				insert(boardList);  // 메서드안에서 테이블을 쓰고 싶으면 전역변수로 만들거나, 메서드 안에서 쓸 수 있게 파라미터로 넘겨서 사용!
				break;
				
			case 0:
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				break;
			}
		}
	}
	
	static void read(ArrayList<HashMap<String, Object>> boardList){
		System.out.print("게시글 번호 입력>");
		String bn = ScanUtil.nextLine();
		
		HashMap<String, Object> board = null;
		for(int i = 0; i < boardList.size(); i++){
			board = boardList.get(i);
			if(board.get("board_no").equals(bn)){
				break;
			}
		}
		
		System.out.println("--------------------------");
		System.out.println("번호\t: " + board.get("board_no"));
		System.out.println("작성자\t: " + board.get("user"));
		System.out.println("작성일\t: " + board.get("reg_date"));
		System.out.println("제목\t: " + board.get("title"));
		System.out.println("내용\t: " + board.get("content"));
		System.out.println("--------------------------");
		System.out.println("1.수정\t2.삭제\t0.목록");
		System.out.print("입력>");
		int input = ScanUtil.nextInt();
		
		switch (input) {
		case 1:
			update(board);
			break;
			
		case 2:
			delete(boardList, board);
			break;
			
		case 0:
			
			break;
		}
	}
	
	static void update(HashMap<String, Object> board){
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		
		board.put("title", title);
		board.put("content", content);
		
		System.out.println("수정이 완료되었습니다.");
	}
	
	static void delete(ArrayList<HashMap<String, Object>> boardList, HashMap<String, Object> board){
		for(int i = 0; i < boardList.size(); i++){
			if(boardList.get(i).get("board_no").equals(board.get("board_no"))){
				boardList.remove(i);
				System.out.println("삭제가 완료되었습니다.");
				break;
			}
		}
	}

	static void insert(ArrayList<HashMap<String, Object>> boardList){
		System.out.print("번호>");
		String boardNo = ScanUtil.nextLine();
		System.out.print("제목>");
		String title = ScanUtil.nextLine();
		System.out.print("내용>");
		String content = ScanUtil.nextLine();
		System.out.print("이름>");
		String user = ScanUtil.nextLine();
		
		HashMap<String, Object> temp = new HashMap<>();
		temp.put("board_no", boardNo);
		temp.put("title", title);
		temp.put("content", content);
		temp.put("user", user);
		temp.put("reg_date", new Date());
		
		boardList.add(temp);
		System.out.println("게시물 등록이 완료되었습니다.");
	}

}








