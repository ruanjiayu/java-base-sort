package com.xian.array;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArrayApplicationTests {

    @Test
    public void contextLoads() {
        List<String> list = new ArrayList<>(2);
        list.add("a");
        list.add("b");
        String[] array= list.toArray(new String[0]);
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void arraysToListTest(){
        String[] str = new String[] {"a","b"};
        List<String> list = Arrays.asList(str);
        List<String> lists=new ArrayList(list);
        str[0] = "d";
        for(String string : lists){
            System.out.println(string);
        }
    }




}
