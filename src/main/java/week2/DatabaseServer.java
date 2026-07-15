package week2;

public class DatabaseServer extends AbstractServer implements Alertable{

    public DatabaseServer(String ip, String serverName){
        super(ip, serverName);
    }

    @Override
    public void processJob(){
        System.out.println("SQL 쿼리를 실행하여 데이터를 안전하게 저장하고 관리한다.");
    }

    @Override
    public void sendAlert(String message){
        System.out.println("[DB 긴급알림 시스템 가동] 매니저에게 발송 " + message);
    }
}
