package week3.Stream;

public class LogBackupMain {
    public static void main(String[] args){
        LogBackupTask systemLog = new LogBackupTask("시스템 로그");
        LogBackupTask errorLog = new LogBackupTask("에러 로그");

        Thread thread1 = new Thread(systemLog);
        Thread thread2 = new Thread(errorLog);

        thread1.start();
        thread2.start();

        System.out.println("메인 스레드 회수");
    }
}
