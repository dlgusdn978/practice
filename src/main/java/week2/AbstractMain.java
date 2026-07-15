package week2;

public class AbstractMain {
    public static void main(String[] args){
        AbstractServer[] as = new AbstractServer[2];
        as[0] = new DatabaseServer("192.168.1.0", "데이터베이스");
        as[1] = new WebServer("192.168.1.1", "웹");

        for(AbstractServer el : as){
            el.boot();
            el.processJob();
            if(el instanceof Alertable) ((Alertable) el).sendAlert("디스크 공간 부족");
        }
    }
}
