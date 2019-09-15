package assignment2.demo.api;


import assignment2.demo.api.repository.Level;
import assignment2.demo.api.repository.Game;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class WordMapper implements Mapper<Game> {
    @Override
    public Game map(Record r) {
         Set<Level> set =new HashSet<>();
         int i=0;
         while (r.get(i)!=null){
             if(r.get(i).length()==4){
                 set.add(new Level(1,r.get(i)));
             }else if(r.get(i).length()==5){
                 set.add(new Level(2,r.get(i)));
             }else if(r.get(i).length()==6){
                 set.add(new Level(3,r.get(i)));
             }else if(r.get(i).length()==7){
                 set.add(new Level(4,r.get(i)));
             }else if(r.get(i).length()==8){
                 set.add(new Level(5,r.get(i)));
             }
             i++;
         }


        return new Game(set);
    }

}
