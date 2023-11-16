package etc.lambda;

@FunctionalInterface
public interface GenericPredicate<T> {
//객체가 생성될 때 지정한 타입으로 생성됨 !!
    boolean test(T t);
}
