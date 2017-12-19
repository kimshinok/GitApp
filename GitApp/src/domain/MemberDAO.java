package domain;

import java.util.ArrayList;
import java.util.List;

public class MemberDAO {

	private static MemberDAO dao = new MemberDAO();

	private MemberDAO() {

	}

	public static MemberDAO getInstance() {
		return dao;
	}

	public MemberVO selectMemberByName(String name) {
		return null;
	}
	
	
	

		
}
