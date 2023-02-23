package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> list=new ArrayList<>();
        Iterator<String> iterator=sourceList.iterator();
        int i=1;
        while (iterator.hasNext()){
            String element=iterator.next();
            if(i%3==0){
                list.add(element);
                list.add(element);
            }
            i++;
        }
        return list;
    }
}
