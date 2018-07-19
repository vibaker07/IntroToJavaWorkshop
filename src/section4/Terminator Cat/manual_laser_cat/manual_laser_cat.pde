int acceleration = 5;
int xright = 392;
int yright = 258;
int xleft = 244;
int yleft = 255;
PImage catPic;
void setup() {
  size(800, 800);
  catPic = loadImage("cat 2.jpg");
  catPic.resize(800,800);
  background(catPic);
}

void draw() {
  if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
}
 if(xright > width){
   background(catPic);
   xright = 392;
   yright = 258;
   xleft = 244;
   yleft = 255;
   acceleration = 5;
 }
 fill(#ED0C10);
 noStroke();
 ellipse(xright, yright, 50, 50);
 ellipse(xleft, yleft, 50, 50);
}
void keyPressed() {

   xright+=2*acceleration;
   yright+=2*acceleration;
   xleft+=2*acceleration;
   yleft+=2*acceleration;
 
  
  
 
}