import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.lang.String;

public class MaxSwap {






    private static int maximumSwap(Integer num) {

        class digitValueIndexPair {
            private int digitVal;
            private int index;

            public digitValueIndexPair(int val, int index) {
                this.digitVal = val;
                this.index = index;
            }
        }

  /*
  pseudo code
      from highest digit to the 2nd digit
          search from highest to the 1st, find if any num (higher) is greater than cur digit
              if exist
                  return swap(cur digit, higher);


      return num;


      how about we sort the digits?
      if it's sort, we can easily tell if there's any bigger digit than cur, and we can simply get the index of higher digit

      hashmap?    no, search still cost O(n)
      priority queue is the best

      if I have to use js, I can use arr.sort() and add cunstom func.

      than, we iterator the arry
      compare to the leftmost digit??
      or
          iterator the arry, check the val, if it's index is not the highset, swap. But how can we know which is the highest?
          we have index!!

      from the highest to the 2nd
          find if it's the 1st in the array
              if it is
                  move to the next digit
                  move the array index to the next also
              else
                  swap

      it's cool
      T: O(n)
      S: O(n)
  */



        List<digitValueIndexPair> arr = new ArrayList<>();
        int index = 0;

        int loopNum = num;
        while (loopNum != 0) {
            int digit = loopNum % 10;
//            System.out.println(digit);
//            System.out.println(index);

            arr.add(new digitValueIndexPair(digit, index));

            loopNum = loopNum / 10;
            index++;
        }

//        System.out.println(index);
//        for (digitValueIndexPair pair : arr) {
//            System.out.println("pair index: " + pair.index + " pair val: " + pair.digitVal);
//        }


        arr.sort(new Comparator<digitValueIndexPair>(){
            @Override
            public int compare(digitValueIndexPair a,digitValueIndexPair b) {
                //TODO return 1 if rhs should be before lhs
                //     return -1 if lhs should be before rhs
                //     return 0 otherwise
                if (a.digitVal == b.digitVal) {
                    return a.index - b.index;
                }

                return a.digitVal - b.digitVal;
            }
        });

//        for (digitValueIndexPair pair : arr) {
//            System.out.println("pair index: " + pair.index + " pair val: " + pair.digitVal);
//        }


        for (int i = 0; i < arr.size(); i++) {
            System.out.printf("\n  ******  val is %d, index : %d  ", arr.get(i).digitVal, arr.get(i).index);
//            //System.out.printf("/n  ******  char is %s " , arr.get(1).digitVal + '0');
        }


      int indexOfArr = 0;
      --index;
      //int index = 0;
        char[] chArr = ("" + num).toCharArray();


//chArr [9,9,3,7]
//arr [{9, 3}, {9, 2}, {7, 0}, {3, 1}]
        /*  ? String is immutable, so how can I change some part (not continual) of it  */

        System.out.println("Before the loop indexOri : " + index + "  indexOfArr: " + indexOfArr);
        System.out.println("Before the index : " + index + "  array size : " + arr.size());
      while (index >= 0 && indexOfArr < arr.size()) {
          System.out.println(" indexOri.index : " + arr.get(indexOfArr).index + "  indexOfArr: " + indexOfArr);

          if (arr.get(indexOfArr).index != index) {
              char tmp = chArr[index];
              chArr[index] = (char) (arr.get(indexOfArr).digitVal + '0');
              chArr[indexOfArr] = tmp;
              return Integer.parseInt(new String(chArr));


//              System.out.printf("/n  ******  char is %s " , arr.get(indexOfArr).digitVal + '0');


//              for (char ch : chArr) {
//                  System.out.println(ch);
//              }

//                System.out.println(new String(chArr));


              /*
              * do swap here
              *
              * StringBuilder
              * */
              //return swap(num.toString(), index, arr.get(index), arr.get(indexOfArr).index, arr.get(indexOfArr).digitVal).parseInt();
          } else {
              index++;
              indexOfArr++;
          }
      }

        return num;
    }



    public static void main(String[] args) {


        //System.out.println(maximumSwap(71173458));

        System.out.println(maximumSwap(9937));

        //System.out.println(maximumSwap(0));

        //System.out.println(maximumSwap(1));

//        System.out.println(maximumSwap(9913));

//        System.out.println(maximumSwap(991388));
    }



}

