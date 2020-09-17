package day3;

public class day3circle {
    public static void main(String[] args) {
        boolean[] circle = new boolean[500];
        for (int i = 0; i <circle.length ; i++) {
            circle[i] = true;
        }
        //数组汇总剩余的个数
        int left = circle.length ;

        //计数器
        int count =0;
        int index = 0;
        while (left >1){
            if(circle[index]){
                count ++;
                if (count == 3){
                    circle[index] =false;
                    //还远计算器
                    count =0;
                    left --;

                }
            }
            index ++;
            if(index >=circle.length){
                index=0;
            }
        }
        //打印最后剩余的元素的位置
        for (int i = 0; i <circle.length ; i++) {
            //5个人的圈
            if(circle[i]) System.out.println("剩余元素的位置： "+ i);
        }


    }
}
