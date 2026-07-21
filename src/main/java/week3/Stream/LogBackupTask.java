package week3.Stream;

public class LogBackupTask implements Runnable{
    private String logName;

    public LogBackupTask(String logName){
        this.logName = logName;
    }
    @Override
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(logName+" 백업 중.. "+ i + "/5");
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
