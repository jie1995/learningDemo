package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: 微笑天使
 * @Date: 2019/3/5 17:58
 * @Version 1.0
 */
public class StreamMap {


    public static void main(String[] args) {

        String[] upperWords={"A","B","C","D"};
        List<String> upperWordList=Arrays.asList(upperWords);
        // 一个集合映射成另外一个集合
        List<String> strings= upperWordList.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
        System.out.println(strings);
        //有选择性的映射,多条语句需加上{}，
        List<String> strings1 =upperWordList.stream().map(s -> {
            if ("A".equals(s)){
                return s.toLowerCase();
            }
            return s;
        }).collect(Collectors.toList());
        System.out.println(strings1);
    }

}
