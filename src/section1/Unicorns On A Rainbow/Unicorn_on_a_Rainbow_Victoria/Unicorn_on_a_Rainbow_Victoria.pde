PImage rainbow;
PImage unicorn;
void setup() {
  rainbow = loadImage("rainbow.jpg.jpg");
  size(850,500);
  rainbow.resize(width,height);
  unicorn = loadImage("unicorn.png");
  unicorn.resize(100,100);
}

void draw() {
  background(rainbow);
  
}