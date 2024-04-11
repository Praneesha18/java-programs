import java.util.Scanner;
import java.util.StringTokenizer;
class customer{
    private String name;
    private String dateofbirth;
    customer(String name,String dateofbirth){
        this.name=name;
        this.dateofbirth=dateofbirth;
    }
    public void display(){
        System.out.println("name:"+" "+name);
        StringTokenizer st=new StringTokenizer(dateofbirth,"/");
        while(st.hasMoreTokens()){
            System.out.println("date:"+" "+st.nextToken());
            System.out.println("month:"+" "+st.nextToken());
            System.out.println("year:"+" "+st.nextToken());
        }
    }
    }
public class Details {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name;
        String dateofbirth;
        customer c=new customer("praneesha","18/08/2004");
        c.display();
    }
}
