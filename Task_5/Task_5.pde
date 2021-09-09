void setup() {
  MethodOne(); 
  MethodTwo();
}

/*
  The following method has an error in it. Fix the error and run it. 
 */

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line. 

  int max = 10;

  if (i > max)
  {
    String output = i +" is greater than "+max+"."; 
    println(output); // Moved this up
  }
}

/* 
 Finish the following method so that we can change the number assigned 
 to the weekday and it prints the correct output.  
 */
void MethodTwo() 
{
  int weekDay = 2; // 0 = Monday, 6 = Sunday. 
  boolean weekend = false;

  if (weekDay < 5)
  {
    weekend = false;
  } else 
  {
    weekend = true;
  }

  // Print the name of the weekday here: 
  if (weekDay == 0) {
    println("The current weekday is Monday");
  } else if (weekDay == 1) {
    println("The current weekday is Tuesday");
  } else if (weekDay == 2) {
    println("The current weekday is Wednesday");
  } else if (weekDay == 3) {
    println("The current weekday is Thursday");
  } else if (weekDay == 4){
    println("The current weekday is Friday");
  }

  // Print if it is weekend here:
  if (weekDay >= 5) {
    println("The current weekday is Saturday");
    weekend=true;
  } else if (weekDay >= 6) {
    println("The current weekday is Sunday"); 
    weekend=true;
  }
}
