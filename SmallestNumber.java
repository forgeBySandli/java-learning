public class SmallestNumber {
    public static void main(String[] args){
        int a= 25;
        int b= 30;
        int c= 12;
        int d= 10;
        if(a < b && a < c && a < d)
        {
            System.out.println(a +" is smallest number");

        }
        if(b < c && b < d  && b < a){
            System.out.println(b +"is smallest number");


        }
    if(c < a && c < b && c < d){
        System.out.println(c +" is a smallest number");
    }
    if(d < a && d < b && d < c){
        System.out.println(d + " is smallest number");
    }
    }
    
}
