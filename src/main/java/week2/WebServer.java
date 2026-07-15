package week2;

public class WebServer extends AbstractServer{
    public WebServer(String ip, String serverName){
        super(ip, serverName);
    }

    @Override
    public void processJob(){
        System.out.println("클라이언트의 HTTP 요청을 받아 웹 페이지를 응답한다.");
    }
}
