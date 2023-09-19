public class Student {
    String name , university, dept , gender;
    int id;
    public static void main(String[] args){
        Student s = new Student();
        s.name= "MD. Wahid ullah";
        s.university = "DUET";
        s.dept = "CSE";
        s.gender = "Male";
        s.id = 123;
        System.out.println("Name ia : "+ s.name);
        System.out.println("University ia : "+ s.university);
        System.out.println("Department ia : "+ s.dept);
        System.out.println("Gender ia : "+ s.gender);
        System.out.println("ID ia : "+ s.id);
    }
}