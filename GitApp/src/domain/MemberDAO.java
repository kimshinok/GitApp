package domain;

import java.util.List;

public class MemberDAO {

	private static MemberDAO dao = new MemberDAO();

	private MemberDAO() {

	}

	public static MemberDAO getInstance() {
		return dao;
	}

	public boolean insertMember() {
		return true;
	}

	public MemberVO selectMemberById(String id) {
		return null;
	}
	
	public List<MemberVO> selectMemberList() {
		return null;
	}
	
	
	

}
