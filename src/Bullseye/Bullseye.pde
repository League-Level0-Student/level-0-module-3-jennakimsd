void setup(){
  size(400,400);
}

void draw(){
  int bullseye=300;
  for (int i=20; i>10; i--){
    if(i%2==0){
  fill(#FFFFFF);
}
else{
  fill(#FF0000);
}
    bullseye=bullseye-25;
    ellipse(200,200,bullseye,bullseye);}
  }