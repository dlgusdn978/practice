package org.example;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


class Employee{

    String name;
    String department;
    int salary;
    public Employee(String name, String department, int salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
public class Main {
    public static void main(String[] args) {
        List<Employee> employee = Arrays.asList(
                new Employee("김철수", "Developer", 5000000),
                new Employee("이영희", "HR", 4000000),
                new Employee("박디자", "Design", 4500000),
                new Employee("최개발", "Developer", 6000000),
                new Employee("정네트", "SysAdmin", 5500000)
        );

       double avgSalary = employee.stream()
               .filter(e -> e.department.equals("Developer"))   // 1. 부서가 "Developer" 인 사람만 필터링
               .mapToDouble(e -> e.salary*1.1)                  // 2. 급여를 10% 인상한 double stream으로 전환
               .average()                                       // 3. 인상된 급여들의 평균 구하기
               .orElse(0.0);                              // 4. 데이터가 없을 때 Optional로 0.0 기본값 설정
       System.out.println("최종 결과 : "+avgSalary);
    }
}