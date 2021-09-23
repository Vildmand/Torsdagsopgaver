public class Main{

public static void main(String[] args) {
  //4a
  int intArray[] = {4,2,3};
  int variable =6,sum=0,average=0;
  String stringArray[] = {"Sylvanas, KT, FateScribe"};
  boolean booleanArray [] ={false, false, true};

  stringPrint(stringArray);

  sum = sumArray(intArray);
  System.out.println("Sum is: " + sum);

  average = arrayAverage(intArray);
  System.out.println("Average is: " + average);

  int newArray[] = arraySort(intArray);
  System.out.print("The sorted array is: ");
  for (int i = 0; i < newArray.length; i++){
      System.out.print(" " + newArray[i]);
  }
}
//4b
static void stringPrint (String [] Array){
  for(int i = 0; i<Array.length; i++){
      System.out.println(Array[i]);
  }
}
//4c
static int sumArray (int [] Array){
  int sum = 0;
  for(int i = 0; i<Array.length; i++){
      sum = sum + Array[i];
  }
  return sum;
}
//4d
static int arrayAverage (int [] Array){
  int sum = sumArray(Array);
  int average = sum / Array.length;
  return average;
}
//4e
static int[] arraySort (int [] Array){
  for(int i = 0; i<Array.length; i++){
      for(int y = i + 1; y<Array.length; y++){
          int tempValue = 0;
          if(Array[i] > Array[y]){

              tempValue = Array[i];
              Array[i] = Array[y];
              Array[y] = tempValue;

          }
      }
  }
  return Array;
}
}

}

}
