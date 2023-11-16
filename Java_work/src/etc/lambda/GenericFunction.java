package etc.lambda;

@FunctionalInterface // 문법체크 하는고  , 다른곳에서 람다쓰구있구낭
public interface GenericFunction<X, Y>{

    // X에서 Y를 추출해줄게
    Y apply (X x);


}
