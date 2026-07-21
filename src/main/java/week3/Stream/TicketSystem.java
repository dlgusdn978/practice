package week3.Stream;

public class TicketSystem {
    private int availableTickets = 2;

    public synchronized void bookTicket(String userName){
        if(availableTickets>0){
            System.out.println("예매 시도 중.. ");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            availableTickets-=1;
            System.out.println(userName + "님 예매 성공! (남은 티켓 : "+availableTickets + ")");
        }else{
            System.out.println(userName + "님 예매 실패! 매진되었습니다.");
        }
    }
}
