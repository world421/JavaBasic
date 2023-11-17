package etc.stream.quiz;

import com.sun.jdi.Value;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Main {

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        System.out.println( " ======= 연습 1 =======");
           transactions.stream()
                  .filter(transaction -> transaction.getYear() == 2021)
                  .sorted(comparing(Transaction::getValue))
                  .collect(toList())
                  .forEach(System.out::println) ;

        // 연습 2: 거래자가 근무하는 모든 도시 이름을 중복 없이 나열하시오.
        System.out.println(" +======= 연습 2 =======");
        List<String> cities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList());
        System.out.println("cities = " + cities);

        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자 리스트로 이름순으로 오름차 정렬.

        System.out.println( " ======= 연습 3 =======");
            transactions.stream()
                    .map(transaction -> transaction.getTrader())
                    .filter(transaction -> transaction.getCity().equals("Cambridge"))
                    .distinct()
                    .sorted(comparing(trader -> trader.getName()))
                    .collect(toList())
                    .forEach(System.out::println);

        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차 정렬하여 반환
        System.out.println( " ======= 연습 4 =======");
        transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted() // 문자나 숫자는 Comparator 를 사용하지 않아도 됩니다.
                .collect(toList());
        System.out.println("cities = " + cities);

        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        System.out.println( " ======= 연습 5 =======");
        boolean flag = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("Milan")) ;
        System.out.println(flag);
        
        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
        System.out.println( " ======= 연습 6 =======");

          int totalvalue = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                .mapToInt(Transaction::getValue)
                .sum();
          System.out.println("totalvalue = " + totalvalue);

        // 연습 7: 모든 거래에서 최고 거래액은 얼마인가?
        System.out.println( " ======= 연습 7 =======");
        Transaction maxValue = transactions.stream()
                .max(comparing(Transaction::getValue))
                .get();
        System.out.println(" 최고 거래액: " + maxValue.getValue());


        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
        System.out.println( " ======= 연습 8- 1 =======");
//        Transaction minValue =  transactions.stream()
//                .min(comparing(transaction -> transaction.getValue()))
//                .get();
//        System.out.println(" 작은 거래액 " + minValue.getValue());

        System.out.println( " ======= get Int =======");
        int minValue = transactions.stream()
                .mapToInt(trs -> trs.getValue())
                .min()
                .getAsInt();
        System.out.println("minValue = " + minValue);

        System.out.println( " ======= ====");
        transactions.stream()
                .min(comparing(transaction -> transaction.getValue()))
                .ifPresent(System.out::println);

    }

}
