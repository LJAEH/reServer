package edu.kh.community.member.model.service;

import java.sql.Connection;

import static edu.kh.community.common.JDBCTemplate.*;

import edu.kh.community.member.model.dao.MemberDAO;
import edu.kh.community.member.model.vo.Member;

public class MemberService {
	private MemberDAO dao = new MemberDAO();

	/** 회원정보조회서비스
	 * @param memberEmail
	 * @return
	 */
	public Member selectOne(String memberEmail) throws Exception {
		
		Connection conn = getConnection();
		
		Member member = dao.selectOne(conn, memberEmail);
		
		close(conn);
		
		
		return member;
	}

}
