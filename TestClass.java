
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        //System.out.println("Enter array size and element to be search");
        int size = s.nextInt();
        int[] a = new int[size];
        int ele = s.nextInt();
        int res=-1;
        //System.out.println("Enter array elements");
        for(int i = 0 ; i < size ; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0 ; i < size ; i++)
        {
            if(a[i] == ele)
            {
                res = i;
            }
        }
        System.out.println(""+(res+1));

    }
}
