package week2;

public class ServerMain {
    public static void main(String[] args){
        ServerConfig server1 = new ServerConfig("Web-Server", "192.168.0.10");
        ServerConfig server2 = new ServerConfig("DB-Server", "10.0.0.5", 3306);

        server1.showConfig();
        server2.showConfig();
    }
}
