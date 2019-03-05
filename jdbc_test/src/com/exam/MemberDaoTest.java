package com.exam;

import java.util.List;
import com.exam.dao.MemberDao;
import com.exam.vo.Member;

public class MemberDaoTest {

	public static void main(String[] args) {
		// 생성자 호출 시 테이블 없으면 생성
		MemberDao memberDao = new MemberDao();
		
		// member 테이블 내용 모두 삭제
		memberDao.deleteAll();
		
		// 사용자 입력 값을 Member 객체로 변환
		// 첫번째 샘플 데이터 준비
		Member member1 = new Member();
		member1.setId(1); // 사용자 입력 값
		member1.setName("홍길동"); // 사용자 입력 값
		// 두번째 샘플 데이터 준비
		Member member2 = new Member(2,"박보검");
		// 세번째 샘플 데이터 준비
		Member member3 = new Member(3,"송혜교");
		
		// 레코드 3개 추가
		memberDao.insert(member1);
		memberDao.insert(member2);
		memberDao.insert(member3);
		
		// member 테이블 전체 내용 확인
		List<Member> list = memberDao.getMembers();
		for(Member m : list) {
			System.out.println(m); // m.toString() 자동호출
		}
		
		System.out.println("===================");
		
		// id가 1인 member의 name을 "홍길동"에서 "원빈"으로 업데이트 수행
		Member updateMember = new Member(1, "원빈"); // 업데이트 시킬 데이터
		memberDao.updateById(updateMember);
		// 업데이트된 행을 select로 가져와서 확인
		Member updatedMember = memberDao.getMemberById(updateMember.getId()); 
		System.out.println(updatedMember);
		
		System.out.println("프로그램 정상 종료");
	}

}
