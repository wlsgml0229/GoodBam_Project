package domain;

import java.time.LocalDateTime;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDTO {
	private String userID; 
	private String userPass;
	private String userName;
	private String userQue;
	private String userAns;
	private LocalDateTime userSignupdate;
}
