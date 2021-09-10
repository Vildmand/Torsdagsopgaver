void setup() {
  
  int a = 0;
  int b = 0;
  if (a == 10 || b == 10 || a+b == 10) {
    println("Success!");
  } else {
    println("failure!!");
  }

  int x = 17;
  int y = 1;
  int z = 12;
  if (x + y + z == 30){
    if(x % 10 == 0 || y % 10 == 0 || z % 10 == 0){
      println("Failure");
    }
    else{ 
      println("SUCCESS!");
    }   
  }
  else{
    println("Failure!");
  }
  
}

void draw() {

}
