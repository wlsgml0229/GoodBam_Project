package mapper;

import java.util.List;

import domain.MemberDTO;

public interface MemberMapper {
	public int insertMember(MemberDTO params);
	public MemberDTO selectMemberDetail(Long idx);
	public int updateMember(MemberDTO params);
	public int deleteMember(Long idx);
	public List<MemberDTO>selectMemberList();
	public int selectBoardTotalCount();
}
