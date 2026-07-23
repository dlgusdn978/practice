package week4;

public class Member {
    public static void main(String[] args){
        MemberDao md = new MemberDao();

//        md.insertMember("test", "1234");
        md.selectMember("test");

        MemberDto result = md.selectMember("test");
        if(result != null){
            System.out.println(result.getPw());
        }else{
            System.out.println("해당 아이디를 찾을 수 없습니다.");
        }

        md.updatePassword("test", "12345");
        md.deleteMember("test");
    }
}
