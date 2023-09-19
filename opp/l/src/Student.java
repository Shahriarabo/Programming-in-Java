class Student {
    int roll = 12;
    String name = "Abdulla Al Shahriar";
    void show(){
            System.out.println(name+"  "+roll);
    }

}
class test{
    public static void main(String[] args){
        Student s = new Student();
        s.show();
    }
}
