使用Comparator需注意
Comparator是个类，需要在开头加入
import java.util.Comparator;
使用的时候，
new Comparator<T>() {
//  使用compare
@Override
public int compare(T a1, T a2) {
  0
  1
 -1
}
}
这样。