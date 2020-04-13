package cn.i623.arithmetic1.array;

import java.util.ArrayList;
import java.util.List;

public class ImageBox {
    /*
     * 金银铜匣子，一个肖像，已一真二假。
     * 金：肖像不在金
     * 银：肖像在金
     * 铜：肖像不在铜
     * -----------
     * 金银铜用box=0 1 2 表示，则肖像image取值【0，2】
     * 条件：image!=0;//1，2
     *       image=0;
     *       image!=2;//0，1
     * 以上条件当且仅当一项为真，取box=image [真]
     * ---
     * 假设image分别位于box[0,2],观察哪个符合题意
     * */


    public static void main(String[] args) {
        System.out.println("    有三个判断 1.金：肖像不在金 2.银：肖像在金 3.铜：\n肖像不在铜" +
                "有且仅有一个判断为真，则：\n---");
        List<String> imageRealIndex = whereImageIndex();
        System.out.println("---\n【结论】image在盒子 " + imageRealIndex + " 中");
    }

    private static List<String> whereImageIndex() {
        //3个盒子，编号0，1，2
        int[] boxs = new int[]{0, 1, 2};
        List<String> realJudge;
        List<String> imageAddress = new ArrayList<String>();
        String boxIndexStr = null;
        //image分别在不同box的情况
        for (int boxIndex : boxs) {
            realJudge = new ArrayList<>();//初始化
            if (boxIndex != 0) {
                realJudge.add("金：肖像不在金");
            }
            if (boxIndex == 0) {
                realJudge.add("银：肖像在金");
            }
            if (boxIndex != 2) {
                realJudge.add("铜：肖像不在铜");
            }
            boxIndexStr = index2BoxName(boxIndex);
            if (realJudge.size() == 1) {
                imageAddress.add(boxIndexStr);
            } else {
                System.out.println("\n【假设】image在 " + boxIndexStr + "盒子 【不成立】因为" +
                        "三个判断中,有\n " + realJudge.toString() + " [为真]，不满足条件:有且仅有一个判断真");
            }
        }
        return imageAddress;
    }

    private static String index2BoxName(int boxIndex) {
        String str4Boxindex = "";
        switch (boxIndex) {
            case 0:
                str4Boxindex = "金";
                break;
            case 1:
                str4Boxindex = "银";
                break;
            case 2:
                str4Boxindex = "铜";
                break;
            default:
                System.out.println(boxIndex + "不能转换对应盒子");
        }
        return str4Boxindex;
    }
}
