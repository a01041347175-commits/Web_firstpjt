package com.office.ex;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {

	public int insertNewMember(MemberDto memberDto) {
		
		Map<String, MemberDto> memDB = new HashMap<String, MemberDto>();
		
		memDB.put(memberDto.getMemId(), memberDto);
		
		return memDB.get((memberDto).getMemId()) != null ? 1 : 0;
	}

}
