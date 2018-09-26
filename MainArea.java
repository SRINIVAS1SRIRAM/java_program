import java.util.Scanner;
class AreaOfTheTriangle{
    private double breadth, height;
    public double getBreadth(){
        return breadth;
    }
    public void setBreadth(double b){
        breadth = (b>0)?b:-b;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double h){
        height = (h>0)?h:-h;
    }
    public double Area(){
        double area = 0.5*breadth*height;
        return area;
    }
    
}
class MainArea{
    public static void main(String arg[]){
        double b,h;
        AreaOfTheTriangle area = new AreaOfTheTriangle();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Breadth value: ");
        b = scan.nextDouble();
        System.out.print("Enter the Height value: ");
        h = scan.nextDouble();
        area.setBreadth(b);
        area.setHeight(h);
        System.out.println("Breadth is " + area.getBreadth());
        System.out.println("Height is " +area.getHeight());
        System.out.println("area is " + area.Area());
        scan.close(); 
    }
      
}