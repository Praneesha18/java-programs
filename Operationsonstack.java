import java.util.Scanner;
import java.util.Stack;
public class Operationsonstack{
    private static int n;
    private static int top=-1;
    private static Stack<Integer> s=new Stack<>();
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of stack");
        n=sc.nextInt();
        s.setSize(n);
        System.out.println("choose the operation you want to perform on stack ");
        System.out.println("1.push");
        System.out.println("2.pop");
        System.out.println("3.display");
        int choice=sc.nextInt();
        boolean wish=true;
        do{
        switch(choice) {
            case 1:
                System.out.println("enter the element you want to insert");
                insertelement(sc.nextInt());
                break;
            case 2:System.out.println("the element popped is");
                int element=deletedelement();
                System.out.println(element);
                break;
            case 3: System.out.println("the stack is displayed ");
                display();
                break;
            default:System.out.println("please choose appropriate option");
                break;
        }
        System.out.println("do you want to continue?if yes choose option else press 0"); 
        choice=sc.nextInt();
        if(choice==0)
        wish=false;  
    } while(wish);
    sc.close();
    }
    private static void insertelement(int element){
        if(isfull()){
            top++;
            s.push(element);
        }
    }
    private static int deletedelement(){
        int element=0;
        if(isempty()){
            element=s.pop();
            top--;
        }
        return element;
    }
    private static boolean isfull(){
        if(top==n-1){
           System.out.println("sorry! the stack is already full");
           return false;
        }
        else
        return true;
    }
    private static boolean isempty(){
        if(top==0){
        System.out.println("you have just popped the last element");
        return false;
        }
        else
        return true;
    }
    private static void display(){
        Object[] values=s.toArray();
        for(Object obj:values)
        System.out.println(obj);      
    }
        


    
}
