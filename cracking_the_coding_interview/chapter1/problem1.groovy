#!/usr/local/bin/groovy

package chapter1

class is_unique {
  /*time complexity is O(n) and space complexity is O(1)*/
  static boolean is_unique_chars(value){
    if (value.length > 128){
      return false
    }
    
    boolean[] char_set = new boolean[128]
    for (int i = 0; i < value.length; i++){
      int val = value[i]
      if (char_set[val]){
        return false;
      } 
      char_set[val] = true
    }
    return true
  }
  
  /*time complexity is O(n) and space complexity is O(1/8)*/
  static boolean is_unique_bit_vector(value){
    int checker = 0
    for (int i = 0; i < value.length; i++){
      int val = value[i] - (int)'a'
      if ((checker & (1 << val)) > 0) {
        return false
      }
      checker |= (1 << val)
    }
    return true
  }
  
  
  static void main(String[] args){
    String[] word = 'foo'
    boolean rc = false
    rc = is_unique_chars(word)
    println rc
    rc = is_unique_bit_vector(word)
    println rc
  }
}
