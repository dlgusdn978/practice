package week2;

public class Manager extends Employee{

    private String teamName;

    public Manager(String name, int salary, String teamName){
        super(name, salary);
        this.teamName = teamName;
    }

    @Override
    public void work(){
        System.out.println(this.getName()+" 이(가)" + this.teamName + "팀의 일정을 조율합니다.");
    }
}
