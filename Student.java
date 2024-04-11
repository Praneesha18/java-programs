import java.util.Scanner;

class Details {
    String registration;
    String name;
    String programme;
    String phone;

    protected Details(String registration, String name, String programme, String phone) {
        this.registration = registration;
        this.name = name;
        this.programme = programme;
        this.phone = phone;
    }
}

public class Student {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter the number of student details you want to store:");
        n=sc.nextInt();
        Details d[] = new Details[n];
        System.out.println("enter details of students");
        for(int i=0;i<n;i++){
            System.out.print("Enter Student Registration Number : ");
            String registration = sc.nextLine();
            sc.nextLine();
            System.out.print("Enter Student Name : ");
            String name = sc.nextLine();
            System.out.print("Enter Student Programme : ");
            String programme = sc.nextLine();
            System.out.print("Enter Student Phone Number : ");
            String phone = sc.nextLine();
            d[i] = new Details(registration, name, programme, phone);  
        }

        for (Details detail : d) {
            System.out.println(detail.registration);
            System.out.println(detail.name);
            System.out.println(detail.programme);
            System.out.println(detail.phone);
            System.out.println();
        }
    }
}
