package Generic;

public class GenericWithBubbleSort {
    public static void main(String[] args) {

        Integer[] a = { 100, 22, 58, 41, 6, 50 };
        String[] name = { "Amiya", "Kuna", "Gudly", "Sweta","Mama", "Rani", "Kandhei" };

        System.out.println("Sort Integer values :");
        Bubble.sort_bubble(a);

        System.out.println("sort String name : ");
        Bubble.sort_bubble(name);

    }
}

class Bubble
{
    public static  <T extends Comparable<T>> void sort_bubble(T[] a)
    {
        //bubble sort logic
        for(int i = 0; i < a.length -1 ; i++)
        {
            for (int j = 0; j < a.length - i -1 ; j++)
            {
                if (a[j].compareTo(a[j + 1]) > 0)
                {
                    swap(j, j+1, a);
                }
            }
        }

        //print the elements
        for(T i : a)
        {
            System.out.println(i + ", ");
        }
    }

    public static <T> void swap( int i , int j , T[] a)
    {
        //swap array function
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }
}
