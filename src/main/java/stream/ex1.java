package stream;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class ex1 {

    public static void main(String[] args) {
       /* Stream<String> stream = Stream.of("I", "Love", "You", "too");
        //stream.filter(x -> x.length() >= 3).forEach(x -> System.out.println(x));
        //stream.map(x->x.toUpperCase()).forEach(x->System.out.println(x));
        Integer length = stream.reduce(0,
                (sum, str) -> sum + str.length(),
                (a, b) -> a + b);

        System.out.println(length);
        List<String> list = stream.collect(Collectors.toList());
        Set<String> set = stream.collect(Collectors.toSet());
        Map<String, Integer> map = stream.collect(Collectors.toMap(Function.identity(), String::length));*/

        JSON.toJSONString("");
    }
}