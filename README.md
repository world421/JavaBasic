# JavaBasic

자바 기본 문법 공부

- begin
  - 주석 연습하기
  - 변수(Variable)의 선언과 초기화
  - 식별자의 규칙
  - 자바의 표준 출력 형식 : print ,println, printf
- casting
  - UpCasting,DownCasting
  - 형 변환
  - 데이터 연산

\*datatupe (8)

- boolean : true, false
- float, double(default)
- byte, short,int(defaul),long
- string \*\*객체

* operator
  - 대입(할당) 연산자: =
  - 복합 대입 연산자 : +=, -=, \*=, /=, %=
  - 3항연산자 : (조건식? true : false)
  - 난수 발생 : Math.random()
  - 비교(관계) 연산자 : <,<=,>,>=,==,!=
  - 논리 연산자 : &, &&, |, ||
  - 증감 연산자 : ++,--
    Variable ++ 후위연산 , ++Variable 전위연산

===================
2023.08.24

- 반복문
  - for문
  - 무한반복
  - 반복문 중첩
- 탈출문
- 배열
  =========2023.08.25============

  - 배열

    - 배열의 수정
    - 배열 인덱스 탐색
    - 배열의 삭제 (구현)

=========2023.08.28============

- 2차원 배열
- 메서드 (method)

* 메서드는 반복되는 코드 블록에 이름을 붙여놓은 것
* 메서드의 선언은 반드시 메서드 블록 외부 and 클래스 블록 내부에서만 가능합니다.

- 매개 변수 (parameter, argument)
- 반환값, 반환 유형 (return value, return type)

============= Inte

# 인텔리제이 설정

1. 한글버전 설치

- shift 두번 연타 후 plugin 검색

2. 테마, 아이콘 테마 설치

- plugin에서 material검색
- Atom material icon, Material Theme UI
  - 테마 적용하기
  - 파일 -> 설정 -> 테마 검색 후 -> 모양 탭에서 테마 선택

3. 기본 폰트사이즈, 폰트사이즈 조절 설정

- 파일 -> 설정 -> 글꼴 검색 후 사이즈 조정
- 파일 -> 설정 -> 마우스 검색 후 -> 일반 탭에서 -> 마우스 휠로 크기조절 + 모든에디터 적용 체크

4. 깃허브 연동

- 파일 -> 설정 -> 버전관리 -> github 계정 등록
- 하단부 터미널 열고 $ git rm -r --cached 입력

## 자바 8 람다 문법

- 여러가지 람다 표현식

1. `(String s) -> s.length()` : String형식의 파라미터 하나를 가지며 int를 반환한다. 람다표현식에는 return이 함축되어 있다.
1. `(Apple a) -> a.getWeight() > 150` : Apple형식의 파라미터 하나를 가지며 boolean을 반환한다.
1. int형식의 2개의 파라미터를 가지며 리턴값이 없다.

   (int x, int y) -> {
   System.out.println("Result:");
   System.out.println(x + y);
   }

   1. `() -> 42` : 파라미터가 없으며 42를 반환한다.

- 제공되는 함수형 인터페이스
  함수형 인터페이스 | 함수 디스크립터 |
  ---|---|
  Predicate<T> | T -> boolean
  Consumer<T> | T -> void
  Function<T, R> | T -> R
  Supplier<T> | () -> T
  UnaryOperator<T> | T -> T
  BinaryOperator<T> | (T, T) -> T
  BiPredicate<L, R> | (T, U) -> boolean
  BiConsumer<T, U> | (T, U) -> void
  BiFunction<T, U, R> | (T, U) -> R
- 메서드 참조
  - `(args) -> ClassName.staticMethod(args)` => `ClassName::staticMethod`
    - `() -> Math.random()` => `Math::random`
    - `message -> System.out.println(message)` => `System.out::println`
  - `(args0, rest) -> args0.instanceMethod(rest)` => `ClassName::instanceMethod`
    - `(str, i) -> str.substring(i)` => `String::substring`
    - `(apple) -> apple.getWeight()` => `Apple::getWeight`
  - `(args) -> expr.instanceMethod(args)` => `expr::instanceMethod`
    - `(s) -> this.isValidName(s)` => `this::isValidName`
- 생성자 참조
  - `() -> new Constructor()` => `ClassName::new`
    - `() -> new Apple()` => `Apple::new`
  - `(args) -> new Constructor(args)` => `ClassName::new`
    - `(weight) -> new Apple(weight)` => `Apple::new`
