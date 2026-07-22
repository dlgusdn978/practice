package week4;

public class MemberDto {
    private String userId;
    private String userPw;

    public MemberDto(String userId, String userPw){
        this.userId = userId;
        this.userPw = userPw;
    }

    public String getId(){
        return this.userId;
    }

    public String getPw(){
        return this.userPw;
    }

    public void setId(String userId){
        this.userId = userId;
    }
    public void setPw(String userPw){
        this.userPw = userPw;
    }

}
