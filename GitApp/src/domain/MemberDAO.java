package domain;

import java.util.List;

public class MemberDAO {

	private static MemberDAO dao = new MemberDAO();

	private MemberDAO() {

	}

	public static MemberDAO getInstance() {
		return dao;
	}

	public int insertMember() {
		return 0;
	}

	public MemberVO selectMemberById(String id) {
		return null;
	}
	
	public List<MemberVO> selectMemberList() {
		return null;
	}
	

}
