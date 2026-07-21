package week3.StreamRW;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileBackupManager {

    // field
    private String fileName;
    public FileBackupManager(String fileName){
        this.fileName = fileName;
    }
    //
    public void saveLog(String logMessage){
        try(FileWriter fw = new FileWriter(fileName)){
            fw.write(logMessage);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void readLog(){
        try(FileReader fr = new FileReader(this.fileName)){
            int data;
            while((data = fr.read()) != -1){
                System.out.print((char) data);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
