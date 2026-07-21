package week3.Stream;

public class UserTask implements Runnable{
    private TicketSystem system;
    private String userName;

    public UserTask(String userName, TicketSystem system){
        this.userName = userName;
        this.system = system;
    }
    @Override
    public void run(){
        this.system.bookTicket(userName);
    }
}
