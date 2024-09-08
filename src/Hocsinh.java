
public class Hocsinh {
  
    int id;
    String name;
    Hocsinh(int i, String n){
        id=i;
        name=n;
    }
    void Hocsinh()
    {
        System.out.println(id+ " "+ name);
    }
    public static void main(String[] args) {
        Hocsinh s1= new Hocsinh(111,"Karan");
        Hocsinh s2= new Hocsinh(222,"Aryan");
        s1.Hocsinh();
        s2.Hocsinh();
    }
}

