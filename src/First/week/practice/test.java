package First.week.practice;

public class test {
    public static void main(String[] args) {
        undergraduate u=new undergraduate("何婧雯",20,"大二");
        System.out.println(u.getAge()+" "+u.getName()+" "+u.getGrade());
        u.study();
        u.eat();
        u.sleep();

        master m=new master("何婧雯",20,"大二");
        System.out.println(m.getAge()+" "+m.getName()+" "+m.getGrade());
        m.study();
        m.sleep();
        m.eat();

        teacher t=new teacher("何婧雯",20);
        System.out.println(t.getAge()+" "+t.getName());
        t.teach();
        t.eat();
        t.sleep();

        majorcourseteacher mct=new majorcourseteacher("何婧雯",20,"软件工程");
        System.out.println(mct.getAge()+" "+mct.getName()+" "+mct.getSubject());
        mct.teach();
        mct.eat();
        mct.sleep();

        generalcourseteacher gct=new generalcourseteacher("何婧雯",20);
        System.out.println(gct.getAge()+" "+gct.getName());
        gct.teach();
        gct.eat();
        gct.sleep();

        person p=new person();
        System.out.println(p.getAge()+" "+p.getName());
        p.eat();
        p.sleep();
        p.setAge(20);
        p.setName("何婧雯");
        System.out.println(p.getAge()+" "+p.getName());




    }

}
