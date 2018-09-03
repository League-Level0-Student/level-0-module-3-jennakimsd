  int move=200;
  int move2=800;
  int speed=1;
void setup(){
  size(1000,400);
}

void draw(){
  int bullseye=400;
  background(#FFFFFF);
  for (int i=0; i<40; i++){
    noFill();
    bullseye=bullseye-10;
    ellipse(move,200,bullseye,bullseye);
  }
    move=move+speed;
    bullseye=400;
  for (int i=0; i<40; i++){
    noFill();
    bullseye=bullseye-10;
    ellipse(move2,200,bullseye,bullseye);
  }
  move2= move2-speed;
  if(move>=width||move2>=width){
    speed*=-1;
  }
}