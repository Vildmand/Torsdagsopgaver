color red = color(255, 0, 0);
color yellow = color(255, 255, 0);
color green = color(0, 255, 0);
color grey = color (155);
float bg = (0);
float w = 200;
float h = 200;

void setup () {
  size(350, 800);
  background(bg);
  stroke(0);
  fill(0);
  strokeWeight(5);
  ellipseMode(CENTER);
  fill(grey);
  //ellipse(width/2, height-650, w, h);
  ellipse(width/2, height/2, w, h);
  //ellipse(width/2, height-150, w, h);
}
int i = 1;
void draw() {
  frameRate(6);
  println(i);
  if (i > 30) {
    fill(red);
    ellipse(width/2, height-650, w, h); 
    fill(grey);
    ellipse(width/2, height-150, w, h);
  } else {
    fill(green);
    ellipse(width/2, height-150, w, h);
    fill(grey);
    ellipse(width/2, height-650, w, h);
  }
  i++;
  if (i == 60) {
    i = 1;
  }
}
