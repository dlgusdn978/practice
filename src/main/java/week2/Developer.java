package week2;

public class Developer extends Employee{

    private String language;

    public Developer(String name, int salary, String language){
        super(name, salary);
        this.language = language;
    }

    @Override
    public void work(){
        System.out.println(this.getName() + "이(가) "+this.language + "로 코딩을 합니다.");
    }
}
