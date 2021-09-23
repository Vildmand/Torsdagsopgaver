public class Main{
public static void main(String[] args) {
  Teacher t = new Teacher("Tess",21,true);
  Student s1 = new Student("Nick",21,false,"a");
  Student s2 = new Student("Claes",21,true,"a");
  System.out.println(t.name);
  System.out.println(s1.name +" " + s1.team);
  System.out.println(s2.name +" " + s2.team);
}

}
