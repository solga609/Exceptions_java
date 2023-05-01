public class Exceptions{
    public static void main(String [] args){
    System.out.println(wrongPos());
    System.out.println(divisionByZero());
    System.out.println(nullStr());
    }

public static float divisionByZero(){
   float num = 10/0f;
   return num;
}
public static int[] wrongPos(){
    int[] arr = new int[10];
    arr[1000] = 1;
    return arr;
}
public static int nullStr(){
    String str1 = null;
    return str1.length();
}
}