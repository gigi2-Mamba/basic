package day3;

import java.io.Serializable;

public class Person  implements Serializable {
    private  int id;
    /*
        右边的人
         */
    private  Person right;
    /*
           左边的人
            */
    private  Person left;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "人的id是"+id ;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getLeft() {
        return left;
    }

    public void setLeft(Person left) {
        this.left = left;
    }

    public Person getRight() {
        return right;
    }

    public void setRight(Person right) {
        this.right = right;
    }


}
