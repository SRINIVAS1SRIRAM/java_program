import java.util.Scanner;

class Demo2{
    public static void main(String arg[]){
        int k=0, l=1, m=2;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your string");
        String word = scan.next();
        int i=1, n=word.length();
        int j = n/3;
        if(n%3==0){
            while(i<=j){
                if(word.charAt(k)=='a' && word.charAt(l)=='a' && word.charAt(m)=='b'){
                    if(m ==n-1){
                        System.out.println(true);
                        break;
                    }
                    k +=3;
                    l +=3;
                    m +=3;
                    
                }
                else{
                    System.out.println(false);
                    break;
                }
                
                i++;
                
            }
        }
        else{
            System.out.println(false);
        }
        
           
                
                
    }
}
