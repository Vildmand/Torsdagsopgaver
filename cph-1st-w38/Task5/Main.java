public class Main {

public static void main(String[] args) {
  Student [] studentArray = new Student[10];

  studentArray[0] = new Student("Emilio", 21,false,"b",0);
  studentArray[1] = new Student("Nicklas", 21,false,"b",1);
  studentArray[2] = new Student("Micki", 21,false,"b",2);
  studentArray[3] = new Student("Tanja", 22,true,"b",3);
  studentArray[4] = new Student("Christina", 22,true,"a",4);
  studentArray[5] = new Student("Nanna", 22,true,"b",5);
  studentArray[6] = new Student("Jeppe", 21,false,"b",6);
  studentArray[7] = new Student("Daniel", 23,false,"b",7);
  studentArray[8] = new Student("Stefan", 22,false,"b",8);
  studentArray[9] = new Student("Ida", 21,true,"b",9);

  printStudent(studentArray,9);
  returnIndex(studentArray,"Nicklas");
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
