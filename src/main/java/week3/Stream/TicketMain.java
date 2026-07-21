package week3.Stream;

public class TicketMain {
    public static void main(String[] args){
        TicketSystem system = new TicketSystem();

        UserTask taskA = new UserTask("A", system);
        UserTask taskB = new UserTask("B", system);
        UserTask taskC = new UserTask("C", system);

        Thread[] threads = new Thread[3];
        threads[0] = new Thread(taskA);
        threads[1] = new Thread(taskB);
        threads[2] = new Thread(taskC);

        for(Thread t : threads){
            t.start();
        }
    }
}
