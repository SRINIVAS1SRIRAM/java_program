class Demo1{
    public int a =5;
    public Demo1(){
        System.out.println("I'm in constructor");
    }
    public Demo1(int a){
        System.out.println(a);
    }
    public void Add(){
        System.out.println("a is: " + a);
        a++;
    }
    public static void main(String arg[]){
        System.out.println("I'm in main method");
        Demo1 obj = new Demo1();
        System.out.println("I'm againg in main method");
        obj.Add();
        Demo1 obj1 = new Demo1(100);
        obj.Add();
        obj1.Add();
    }
}