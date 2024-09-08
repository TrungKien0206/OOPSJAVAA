
public class OOpsss {
    int ID;
String name;
public OOpsss(int ID, String name) {
this.ID = ID;
this.name = name;
}
void OOps(){
System.out.println("ID: " + ID + ", Name: " + name);
}
public static void main(String[] args) {
OOpsss student1 = new OOpsss(1,"Long hay Sleep");
OOpsss student2 = new OOpsss(2,"Hang hay Dance");
OOpsss student3 = new OOpsss(3,"Minh hay live");
OOpsss student4 = new OOpsss(4,"Kien hay Song");
student1.OOps();
student2.OOps();
student3.OOps();
student4.OOps();
}
}
