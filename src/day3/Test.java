package day3;
public class Test {
    public static void main(String[] args) {
        Person p= new Person(2);
        System.out.println(p);
        //希望创建对象

        //创建一个五个人的圈子
        PersonCircle circle =new PersonCircle(5);
        System.out.println("圈子的大小： "+circle.getCount());

        //循环数3退一
        // 声明一个变量表示当前数数的人
        Person p2 =circle.getFirst();
        //计数器
        int count =0;
        while (circle.getCount() > 1){
            count ++;
            if(count == 3){
                circle.delete(p2);
                count = 0;
            }
            //下一个人
            p2=p2.getRight();
            System.out.println("剩余的人：" + circle.getFirst().getId());

        }






    }


}
