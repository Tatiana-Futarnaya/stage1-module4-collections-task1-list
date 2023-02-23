package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
    LinkedList<Integer> list=new LinkedList<>();
        for (Integer item: sourceList) {
            if(item%2!=0){
                list.addFirst(item);
            }else {
                list.addLast(item);
            }
        }
    return list;
    }
}
