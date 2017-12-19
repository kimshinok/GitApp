package domain;

import java.util.List;

public class MemberDAO {

	private static MemberDAO dao = new MemberDAO();

	private MemberDAO() {

	}

	public static MemberDAO getInstance() {
		return dao;
	}

	public MemberVO selectMemberById(String id) {
		return null;
	}

	public List<MemberVO> selectMemberByName(String name) {
		return null;
	}

	public MemberVO selectMemberByEmail(String email) {
		return null;
	}

}
