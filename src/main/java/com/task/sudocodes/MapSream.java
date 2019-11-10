package com.task.sudocodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class MapSream {
public static void main(String[] args) {
HashMap<Integer, String> m1 = new HashMap<>();
m1.put(1, "vikaram");
m1.put(15, "vikaram");
m1.put(19, "vikaram");
m1.put(29, "vikaram");
m1.put(86, "vikaram");
m1.put(33, "vikaram");
ArrayList<Integer> al = new ArrayList<Integer>(m1.keySet());
HashSet<Integer> hs = new HashSet<>(m1.keySet()); 
hs.stream().sorted().collect(Collectors.toSet()).forEach(t->System.out.println(t));
//al.stream().sorted().collect(Collectors.toSet()).forEach(t->System.out.println(t));
//m1.keySet(). stream().forEach(t->System.out.println(t));


//m1.keySet().stream().map(e->e.compareTo(e)).collect(Collectors.toList()).forEach(t->System.out.println(t));
}
}