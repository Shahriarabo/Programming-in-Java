class Student {
    private int roll;
    private String name;
    private float mark;
    void GetData(){
        roll = 12;
        name = "Abdullah";
        mark = 89.90f;

    }
    void Display(){
        System.out.println("Roll is :"+ roll);
        System.out.println("Name is :"+ name);
        System.out.println("Mark is :"+ mark);
    }
}
public class protect{
    public static void main(String[] args){
        Student s =new Student();
        s.GetData();
        s.Display();
    }
}