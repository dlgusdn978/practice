package week2;

public class ServerConfig {
    private String serverName;
    private String ipAddress;
    private final int port;

    public ServerConfig(String serverName, String ipAddress){
        this(serverName, ipAddress, 8080);
    }
    public ServerConfig(String serverName, String ipAddress, int port){
        this.serverName = serverName;
        this.ipAddress = ipAddress;
        this.port = port;
    }

    public void showConfig(){
        System.out.println("["+this.serverName+"] IP : "+this.ipAddress+", Port : "+this.port);
    }
}
