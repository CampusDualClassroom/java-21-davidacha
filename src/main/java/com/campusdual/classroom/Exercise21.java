package com.campusdual.classroom;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    public static Set<String> createHashSet() {
        Set<String> hs=new HashSet<>();
        String[] s={"ELEMENT KPRBC",
                "ELEMENT YPBTM",
                "ELEMENT AADXU",
                "ELEMENT RXCGJ",
                "ELEMENT WYMVD",
                "ELEMENT WFGEJ",
                "ELEMENT TYGBS",
                "ELEMENT MAPTK",
                "ELEMENT GJXVE",
                "ELEMENT BAFGL"};
        hs.addAll(Arrays.asList(s));
        return hs;
    }

    public static Set<String> createTreeSet() {
        Set<String> ts=new TreeSet<>();
        String[] s={"ELEMENT KPRBC",
                "ELEMENT YPBTM",
                "ELEMENT AADXU",
                "ELEMENT RXCGJ",
                "ELEMENT WYMVD",
                "ELEMENT WFGEJ",
                "ELEMENT TYGBS",
                "ELEMENT MAPTK",
                "ELEMENT GJXVE",
                "ELEMENT BAFGL"};
        ts.addAll(Arrays.asList(s));
        return ts;
    }

    private static void printSet(Set<String> customSet) {
        for (String item : customSet) {
            System.out.println(item);
        }
    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        int cont=set.size();
        set.add(elementToAdd);
        if(set.size()>cont){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Set<String> hs=createHashSet();
        Set<String> ts=createTreeSet();
        printSet(hs);
        printSet(ts);
        addElementToSet(hs,"ELEMENT AAAA");
        printSet(hs);
    }

}
