package assignment2.demo.api;


import assignment2.demo.api.repository.WordList;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class WordMapper implements Mapper<WordList> {
    @Override
    public WordList map(Record r) {
         Map<Object,String> map = new HashMap<>();
         int i=0;
         while (r.get(i)!=null){
             if(r.get(i).length()==4){
                 map.put(1,r.get(i));
             }else if(r.get(i).length()==5){
                 map.put(2,r.get(i));
             }else if(r.get(i).length()==6){
                 map.put(3,r.get(i));
             }else if(r.get(i).length()==7){
                 map.put(4,r.get(i));
             }else if(r.get(i).length()==8){
                 map.put(5,r.get(i));
             }
             i++;
         }


        return new WordList(map);
    }

}
