package com.nb.practice;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class SocksColorMatching {
  /*
   * Complete the 'sockMerchant' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER n
   *  2. INTEGER_ARRAY ar
   */

  public static int sockMerchant(int n, List<Integer> ar) {
    HashMap<Integer, Integer> socksPileByColor = new HashMap();
    int pairs = 0;
    for (int i=0; i < ar.size(); i++) {
      int key = ar.get(i);
      if(socksPileByColor.containsKey(key)) {
        socksPileByColor.put(key, socksPileByColor.get(key)+1);
      }
      else {
        socksPileByColor.put(key, 1);
      }
      if (socksPileByColor.get(key) % 2 == 0) {
        pairs++;
      }
      System.out.println("key: " + key);
      System.out.println("value: " + socksPileByColor.get(key));
      System.out.println("count: " + socksPileByColor.get(key));
      System.out.println("pairs: " + pairs);
    }
    return pairs;
  }
}

 class Solution {
  public static void main(String[] args) {
    List<Integer> input = Arrays.asList(1,1,3,1,2,1,3,3,3,3);
    int result = SocksColorMatching.sockMerchant(input.size(), input);
    System.out.println("Matching Pairs: " + result);
  }
}
