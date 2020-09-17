package day3;

import day3.Person;

/**
 *
 */
public class PersonCircle {
    private  int count =0; //圈子大小
    private Person first;//第一个人
    private Person last;//最后一个人

    //圈子大小
    public PersonCircle(int count) {
        //循环创建Person对象 加入圈子中
        for (int i = 0; i <count ; i++) {
            day3.Person p=new day3.Person(i);
            //加入到圈子中
            add(p);
        }
        this.count = count;
    }
//加人到圈子中
    private void add(day3.Person p) {
       //圈子如果没有一个人，圈子的第一个和最后一个人都是新添加的人，新人的左右都是自己本身
  if(this.count==0){
      this.first=p;
      this.last =p;
      p.setLeft(p);
      p.setRight(p);

  }else {
      this.last.setRight(p);
      p.setLeft(this.last);
      p.setRight(this.first);
      this.first.setLeft(p);
      this.last=p;

  }
        //圈子已经有人

        this.count ++;
    }

    /**
     * 从圈子删除对象
     * @param p
     */
    public void delete(Person p){
        //圈子中的人数需要减1
        if(p.equals(this.first)){
            //删除的是第一个对象

            this.last.setRight(p.getRight());
            p.getRight().setLeft(this.last);
            this.first = p.getRight();
        }else if(p.equals(this.last)){
            //删除最后一个
            p.getLeft().setRight(this.first);
            this.first.setLeft(p.getLeft());
            this.last=p.getLeft();
        }else {
            //删除中间元素
            p.getLeft().setRight(p.getRight());
            p.getRight().setLeft(p.getLeft());

        }
     count --;
        //圈子中人数需要减一

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Person getFirst() {
        return first;
    }

    public void setFirst(Person first) {
        this.first = first;
    }

    public Person getLast() {
        return last;
    }

    public void setLast(Person last) {
        this.last = last;
    }
}
