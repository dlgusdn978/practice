package week3.Collections;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsMain {
    public static void main(String[] args){
        // ArrayList
        ArrayList<String> employeeList = new ArrayList<>();
        employeeList.add("김개발");
        employeeList.add("이팀장");
        employeeList.add("박사원");

        employeeList.remove(1);

        for(String str : employeeList){
            System.out.println(str);
        }

        // HashMap
        HashMap<String, Integer> priceMap = new HashMap<>();
        priceMap.put("아메리카노", 4500);
        priceMap.put("카페라떼", 5000);
        priceMap.put("조각케이크", 6500);

        System.out.println(priceMap.get("조각케이크"));
    }
}
