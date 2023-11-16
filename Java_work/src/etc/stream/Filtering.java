package etc.stream;

import java.nio.file.DirectoryStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import static etc.lambda.FilterApple.filter;
import static etc.stream.Menu.*;
import static java.util.stream.Collectors.*;

public class Filtering {
    public static void main(String[] args) {

        // Stream 의  filter
        // 필터 조건에 맞는 데이터들을 필터링하여 리스트로 반환

        // 메뉴 중에 채식주의자가 먹을 수 있는 요리를 필터링

        // 먼저 스트림 객체 받기.filter. .collect(Collectors.toList());
        menuList.stream()
                .filter(dish -> dish.isVegetarian())
                .collect(toList())
                .forEach(dish -> System.out.println("dish = " + dish));

        // 리스트 내부에 들어올때마다 출력
        //dishInVegiterian.forEach(dish -> System.out.println("dish = " + dish));

        System.out.println("============== 육류이면서 600 칼로리 미만의 요리를 필터링 =============");
        
        menuList.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT && d.getCalories() <600)
                .collect(toList())
                .forEach(d -> System.out.println("d의 값 :" + d));

        System.out.println("============== 요리중에 요리 이름이 4글자인 요리만 필터링  =============");

        menuList.stream().
                filter(dish -> dish.getName().length() == 4 )
                .collect(toList())
                .forEach(d -> System.out.println("dish = " + d));

        System.out.println("============== 요리중에 300 칼로리보다 큰 요리만 필터링 =============");
        menuList.stream()
                .filter(dish -> dish.getCalories()>300)
                .limit(3) // 상위 top3 추출
                .collect(toList())
                .forEach(d-> System.out.println("d = " + d));


        System.out.println("==========================================================");
        
        menuList.stream()
                .filter(dish -> dish.getCalories()>300)
                .skip(2) // 맨 앞 2개 제외시킴 (0번, 1번 인덱스 재껴버림)
                .collect(toList())
                .forEach(d-> System.out.println("d = " + d));

        System.out.println("====== 메뉴 목록에서 처음 등장하는 2개의 생선요리 필터링 ==========");
        
        menuList.stream()
                .filter(d-> d.getType() == Dish.Type.FISH)
                .limit(2)
                .collect(toList())
                .forEach(dish -> System.out.println("dish = " + dish));


        List<Integer> numbers = List.of(1, 2, 1, 2, 3, 4, 4, 5, 6);
        // 짝수만 걸러내기

        List<Integer> filteredNumber =  numbers.stream()
                .filter( n -> n % 2 == 0)
                .distinct() // 중복제거
                .collect(toList());
        System.out.println("filteredNumber = " + filteredNumber);

        // 중복 제거
//        Set<Integer> distinctNumbers = new HashSet<>(filteredNumber);
//        System.out.println(distinctNumbers);


    }
}