package domain;



public class MemberDAO {

	private static MemberDAO dao = new MemberDAO();

	private MemberDAO() {

	}

	public static MemberDAO getInstance() {
		return dao;
	}

	public MemberVO selectMemberById(String name) {
		return null;
	}
	
	public void insert() {
		
	}

	
}
