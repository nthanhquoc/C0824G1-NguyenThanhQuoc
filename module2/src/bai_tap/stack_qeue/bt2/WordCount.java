package bai_tap.stack_qeue.bt2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
    public static void countWords(String input){
        input = input.toLowerCase();
        String[]words=input.split(" ");
        Map<String,Integer> map= new TreeMap<>();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }else{
                map.put(word, 1);
            }
        }
        for(int i=0;i<map.size();i++){
            String key = (String) map.keySet().toArray()[i];
            Integer value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input;
        System.out.println("Input String: ");
        input =sc.nextLine();
        countWords(input);
    }
}

