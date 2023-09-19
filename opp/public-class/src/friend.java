class Student {
   public int roll;
   public String name;
   public float mark;
    public void GetData (){
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
public  class friend{
    public static void main(String[] args){
        Student S = new Student();
        S.GetData();
        S.Display();
    }
}
