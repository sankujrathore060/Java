package com.Sankuj.JavaCorePractice.Generic;
import java.util.*;
public class WildCard {
    public static void PrintList(ArrayList<?> array){
        for(Object item : array){
            System.out.println(item);
        }
    }
}
