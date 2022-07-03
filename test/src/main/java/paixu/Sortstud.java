package paixu;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sortstud {
    /**
     * 排序算法学习
     */

    public static void main(String[] args) {
        int[] array = new int[]{12,9,32,45,5,3,35,67,7,1};

        Sortstud st = new Sortstud();

        System.out.println("============冒泡排序============");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(st.bubbleSort(array)));
        System.out.println("============选择排序============");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(st.selectSort(array)));
        System.out.println("============插入排序============");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(st.insertSort(array)));


    }

    /**
     * 冒泡排序
     * @param array
     * @return
     */
    public int[] bubbleSort(int[] array){
        int[] newArray = Arrays.copyOf(array,array.length);
        if (newArray.length == 1){
            return newArray;
        }
        for (int i = 0; i < newArray.length; i++) {
            for (int j=0; j<newArray.length-1-i;j++){
                if (newArray[j]>newArray[j+1]){
                    int temp =newArray[j];
                    newArray[j] = newArray[j+1];
                    newArray[j+1] = temp;
                }
            }
        }
        return newArray;
    }

    /**
     * 选择排序
     * @param array
     * @return
     */
    public int[] selectSort(int[] array){
        int[] newArray = Arrays.copyOf(array,array.length);
        if (newArray.length == 1){
            return newArray;
        }
        int min;
        for (int i = 0; i < newArray.length; i++) {
            min =i;
            for (int j=i;j<newArray.length;j++) {
                if (newArray[min] > newArray[j]) {
                    min = j;
                }
            }
            int temp = newArray[i];
            newArray[i] = newArray[min];
            newArray[min] = temp;
        }
        return newArray;
    }

    /**
     * 插入排序
     * @param array
     * @return
     */
    public int[] insertSort(int[] array){
        int[] newArray = Arrays.copyOf(array,array.length);
        if (newArray.length == 1){
            return newArray;
        }
        int current;
        for (int i = 0; i < newArray.length-1; i++) {
            current = newArray[i+1];
            int preIndex =i;
            while (preIndex>=0 && current< newArray[preIndex]){
                newArray[preIndex+1]=newArray[preIndex];
                preIndex--;
            }
            newArray[preIndex+1] = current;
        }
        return newArray;
    }
}
