package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Author: 微笑天使
 * @Date: 2019/3/17 22:53
 * @Version 1.0
 */
public class StreamFilter {


    public static void main(String[] args) {
        // 注意这里返回的是布尔值，没有花括号省略return
        List<String> strings= Arrays.asList("abcde","a","b","c","d");
        strings.stream().filter(s ->
                "a".equals(s)
        ).forEach(System.out::println);
        // 配合predicate使用
        Predicate<String> lenghtLimit=(n)->n.length()>4;
        strings.stream().filter(s -> lenghtLimit.test(s)).forEach(System.out::println);
    }
}
