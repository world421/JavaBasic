package etc.stream;

import java.util.Comparator;
import java.util.stream.Collectors;

import static etc.stream.Menu.*;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Sorting {

    public static void main(String[] args) {


        // 음식 목록 중 칼로리가 낮은 순으로 정렬
        menuList.stream()
                .sorted(comparing(Dish::getCalories))
                .collect(toList())
                .forEach( System.out :: println);

        // 칼로리로 내림차 정렬
        System.out.println("===================================");
        menuList.stream()
                        .sorted(comparing(Dish::getCalories).reversed())
                        .collect(toList())
                        .forEach( System.out :: println);

        System.out.println(" ");
        System.out.println("=============top3 필터링 ============");
        // 500 칼로립다 작은 요리 중에 top3 필터링
        menuList.stream()
                .filter(dish -> dish.getCalories() < 500 ) // 칼로리가 500미만인 애들 걸러
                .sorted(comparing(Dish::getCalories).reversed()) //걸른 애들 정렬 (높은순)
                .limit(3)  // 정렬된 애들중 상위3개만 짤라
                .collect(toList()) // 리스트로줘
                .forEach(System.out::println); // 반복해서주

    }
}
