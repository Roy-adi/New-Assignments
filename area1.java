public class Rectangle {
    private int length;
    private int breadth;

    Rectangle (int length , int breadth){
      public int getlength(int length) {
            return length;
        }
    
    
    public void setlength(int length){}
    public int getbreadth(int breadth){
        return breadth;
    }

    public void setbreadth (int breadth){}

 void calculation (){
    System.out.println(length*breadth);
 }

}



class Rectangle1 {
    public static void main (String []args){
        Rectangle obj = new Rectangle(80, 100);
        System.out.print("Area = ");
        obj.calculation();
        obj.setlength(40);
        obj.setbreadth(20);
        System.out.print("New Area");
        obj.calculation();
    }
}
