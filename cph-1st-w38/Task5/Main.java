public class Main{
public static void main(String[] args) {
  student [] studentArray = new Student[10];
  studentArray[0] = new Student("Nick",21,false,"a",0);
  studentArray[1] = new Student("Emilie",19,true,"a",1);
  studentArray[2] = new Student("Ida",19,true,"a",2);
  studentArray[3] = new Student("Micki",21,false,"a",3);
  studentArray[4] = new Student("Mads",23,false,"a",4);
  studentArray[5] = new Student("Cecilie",20,true,"a",5);
  studentArray[6] = new Student("Nanna",22,true,"a",6);
  studentArray[7] = new Student("Emilio",21,false,"a",7);
  studentArray[8] = new Student("Luna",20,true,"a",8);
  studentArray[9] = new Student("Laura",22,true,"a",9);

  printStudent(studentArray,9);
  returnIndex(studentArray,"Nick");

      }
      static String printStudent(Student []studentArray, int index){

          String studentName = "";

          for(int i = 0; i < studentArray.length; i++){
              if (studentArray[i].studentID == index){

                  studentName = studentArray[i].name;
              }
          }
          System.out.println("Studentname for studentID " + index +  " is: "+ studentName);
          return studentName;

      }


      static int returnIndex(Student []studentArray, String studentName){

          int index = 0;

          for(int i = 0; i < studentArray.length; i++){
              if (studentArray[i].name == studentName){

                  index = studentArray[i].studentID;
              }
          }
          System.out.println("StudentID for " + studentName +  " is: "+ index);
          return index;

      }


  }
}
