class Room {
int length, breadh;
public Room() {
length = breadth = 0;
}
public Room(int length, int breadth){
this.length = length;
this.breadth = breadth;
}
int area(){
return length * breadth;
}
}

class Kitchen extends Room{
int height;
public Kitchen(){
height = 0;
}
public Kitchen(int length, int breadth, int height) {
this.length = length;
this.breadth = breadth;
this.height = height;
}
}

