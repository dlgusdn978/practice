package week3.StreamRW;

public class FileRWMain {
    public static void main(String[] args){
        FileBackupManager fbm = new FileBackupManager("error_log.txt");

        fbm.saveLog("Critical Error : NullPointerException occurred at line 45.");
        fbm.readLog();
    }
}
