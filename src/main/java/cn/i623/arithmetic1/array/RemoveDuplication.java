package cn.i623.arithmetic1.array;

import java.util.LinkedList;
import java.util.List;

public class RemoveDuplication {
     static void pratice(){
        int[] repeatArray = {1, 1, 2, 3, 1123, 123, 4, 123, 4, 2, 2, 3, 4, 1, 1, 1, 1425, 10, 123, 4, 1, 1, 23, 4, 1, 5, 5, 10, 2, 5, 3, 3};
        //思路一：遍历当前数组，int值写入到统计数组，写入条件是：统计数组不存在当前值。
        List uniqueList = new LinkedList();
        for (int i = 0; i < repeatArray.length; i++) {
            //统计list没有该值时
            if (uniqueList == null || uniqueList.contains(repeatArray[i]) == false) {
                uniqueList.add(repeatArray[i]);
            }
        }
        System.out.println(uniqueList);
    }
    static int myAnswer(){
         //前提：数组递增，不可新建数组空间，空间复杂度小于O（1）
         int[]repeatArray={1,2,6,7,8,9,9,10086};
         for (int i=0;i<repeatArray.length-1;i++){//-1且<是因为,i是最后一位的时候，没有下一位了
             //当与前一位相同，包括当前到结尾，全部前移一位
                //因补位小于任何位，条件2防止补位间比较，无限循环。
                 if (repeatArray[i] == repeatArray[i+1]&&repeatArray[0] <= repeatArray[i]) {//
                     for (int j = i; j < repeatArray.length-1; j++) {//-1或<是正常循环次数，-1加<是因为末尾值没下一位
                         repeatArray[j] = repeatArray[j+1];
                     }
                      repeatArray[repeatArray.length-1]=repeatArray[0]-1;//补位，且比首位小一点
                     i--;
                     //  break;
                 }
         }
         for(int i=0;i<repeatArray.length;i++){
             if(repeatArray[i]<repeatArray[0]){
                 return i;
             }
         }
        return repeatArray.length;
    }
    static int standardAnswer(int nums[]){
         //一个数组俩个指针，一快一慢，快指的是按照重复数组进行索引，慢指的仅索引不重复的值，快指针负责看，慢指针负责操作
        //参数中的变量，方法中接用就是，不需要再定义一下
        //思路：仅记录不同的值（i）
        int i = 0;//统计数组第一位不必修改，保证第二位和第一位一样即可，i=1说的是第二位
        //数组真实长度为1的情况特殊处理下
        if(nums.length == 0){
            return 0;
        }
        else if(nums.length==1){
            return 1;
        }else{
            for(int j=0;j<nums.length;j++){//这里j的值会不断的增加，所以叫快指针，i的值只有需要改动才增加，所以叫慢指针
                if(nums[i]!=nums[j]){
                    //如果i与j的值不同，说明终于遇到了应该更新的i了。
                    i++;//这样下次发现不同的值的时候，就会放在下一位了,i++保证了当前位的正常值不被覆盖
                    nums[i]=nums[j];

                }
            }

        }
        for(int j=0;j<=i;j++){

                System.out.println(nums[j]);;
        }
        return i+1;

    }
    public static void main(String[] args) {
        int[] nums={};
        standardAnswer(nums);//不能把传入的数组直接写入，最好传一个已经写好的指针

        //思路二：数组sort方法排序，遍历时保存当前轮次int值，第二轮值等于第一轮，打删除标记（数组动态删除可能引起异常，考虑俩轮次相同不写入，不同写入值到新数组）

    }/*


     1.for循环要写在main里面
     2.新建LIST要new：arrylist或者linklist（增删快）、Vector（线程安全）

     */




}
