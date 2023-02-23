package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        ListComparator comparator=new ListComparator();
        Collections.sort(sourceList,comparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int result=0;
        int x=5*(int) Math.pow(Integer.parseInt(a),2)+3;
        int y=5*(int) Math.pow(Integer.parseInt(b),2)+3;
        if(x>y || x<y){
            result=x-y;
        }else{
            if(x==y){
                result=Integer.parseInt(a)-Integer.parseInt(b);
            }
        }

        return result;
    }
}
