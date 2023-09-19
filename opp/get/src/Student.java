class Student {
    public int roll;
    public String name;
    public float mark;

    public void GetData(){
        name= "Abdullah ";
        roll = 12234;
        mark = 85.25f;
    }
    void show(){
        System.out.println("Name is "+name);
        System.out.println("Roll is "+roll);
        System.out.println("Mark is "+mark);
    }

}
class test{
    public static void main(String[] args){
        Student s= new Student();
        s.GetData();
        s.show();

    }
}
