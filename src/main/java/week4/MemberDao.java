package week4;

import java.io.FileReader;
import java.io.Reader;
import java.sql.*;
import java.util.Properties;

public class MemberDao {
    private static String url = "";
    private static String id = "";
    private static String pw = "";
    static {
        Properties props = new Properties();
        try(Reader reader = new FileReader("src/main/resources/db.properties");){
            props.load(reader);

            url = props.getProperty("db.url");
            id = props.getProperty("db.id");
            pw = props.getProperty("db.pw");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("properties 로드 실패.");
        }
    }
    public void insertMember(String userId, String userPwd){
        String sql = "INSERT INTO user(id, pw) VALUES(?, ?)";
        try(Connection con = DriverManager.getConnection(url, id, pw);
            PreparedStatement pstmt = con.prepareStatement(sql)){
            pstmt.setString(1, userId);
            pstmt.setString(2, userPwd);
            pstmt.executeUpdate();
            System.out.println("DB에 회원가입 완료 : " + userId);
        }catch(SQLException e){
            System.out.println("JDBC 라이브러리?");
            e.printStackTrace();
        }


    }
    public MemberDto selectMember(String targetId){
        String sql = "SELECT * FROM user WHERE id = ?";
        MemberDto md = null;
        try(Connection con = DriverManager.getConnection(url, id, pw);
            PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, targetId);

            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                md = new MemberDto(targetId, rs.getString("pw"));
            }
            rs.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return md;
    }
}

