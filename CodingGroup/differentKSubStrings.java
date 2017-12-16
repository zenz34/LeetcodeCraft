package com.amazon_oa;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/*
*
*
* awaglknagawybagwkwagl
* awa x 'a' exist
* wagl y
* aglk y
* glkn y
* lkna y
* knag y
* naga x 'a' exist
* gawy y
* awyb y
* ybag y
* wyba y
* bagw y
* agwk y
* gwkw x 'w' exist
* wkw x 'w' exist
* kwag y
* wagl x  'wagl' exist
*
*
*
*
*
*
* */





public class differentKSubStrings {
    public static void diffKSubStrings(String str, int k) {
        List<String> ret = new ArrayList<>();
        HashSet<String> str_set = new HashSet<>();


        for (int i = 0; i < str.length() - k; i ++) {
            HashSet<Character> ch_set = new HashSet<>();    //  ??  every time it creates a new Object or once we created, ignore it.

            for (int j = 0; j < k && i + j < str.length(); j++) {   //  !! remember inside the loop ,add and notice it's not && j < str.length()
                if (ch_set.contains(str.charAt(i + j))) {
                    break;
                }
                ch_set.add(str.charAt(i + j));
            }

            if (ch_set.size() == k) {
                str_set.add(str.substring(i, i + k));
            }

            ch_set.clear();
        }

        //  add element in set to the arraylist
        Iterator<String> iterator = str_set.iterator();

        while (iterator.hasNext()) {
            ret.add(iterator.next());   //  Iterator 的实现
        }

        //  print ret
        for (String item : ret) {
            System.out.println(item);
        }

        return;
    }


    public static void main(String[] args) {
        diffKSubStrings("awaglknagawybagwkwagl", 4);
    }
}

