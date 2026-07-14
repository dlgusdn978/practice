package week2;

public class EmployeeMain {
    public static void main(String[] args){
        Employee[] e = new Employee[3];
        e[0] = new Employee("이개발", 6000);
        e[1] = new Developer("김개발", 5000, "Java");
        e[2] = new Manager("박팀장", 7000, "인프라 구축");

        for(Employee el : e){
            el.work();
            System.out.println(el.getSalary());
        }
    }
}
