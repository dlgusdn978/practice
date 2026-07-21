package week3.Stream;

import java.util.ArrayList;

public class StreamMain {
    public static void main(String[] args){
        ArrayList<Integer> salaryList = new ArrayList<>();

        salaryList.add(3000);
        salaryList.add(5500);
        salaryList.add(4000);
        salaryList.add(7000);
        salaryList.add(4800);

//      salaryList.stream()
//              .filter(salary -> salary>=5000)
//              .forEach(salary -> System.out.println(salary));
        salaryList.stream()
                .filter(salary -> salary>=5000)
                .forEach(System.out::println);
    }
}
