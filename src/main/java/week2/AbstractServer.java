package week2;

public abstract class AbstractServer {
    private String ip;
    private String serverName;
    public abstract void processJob();

    public AbstractServer(String ip, String serverName){
        this.ip = ip;
        this.serverName = serverName;
    }

    public void boot(){
        System.out.println("[" + serverName + "] 서버(IP : " + ip + ")의 전원을 켭니다.");
    }
}
