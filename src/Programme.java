import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Programme {
    public static void main(String[] args) {

        Function<Long,Long> doubler = (i) -> i*2 ;
        Function<Long,Long> moitie = (i) -> i/2 ;

        System.out.println(doubler.andThen(doubler).andThen(moitie).apply(3L));

        Predicate<String> isNotNull = Objects::nonNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<Integer> isPositif = (x) -> x>0 ;

        System.out.println(isPositif.test(0));

        Consumer<Person> display = Person::display;
        display.accept(new Person("chebihi","f.chebihi@gmail.com"));


    }
}
