package First.week.practice;

public class teacher extends person{
//构造方法
    public teacher() {
    }

    public teacher(String name, int age) {
        super(name, age);

    }
    //getset

    //方法
    public void teach(){
        System.out.println("教书");
    }
}
