import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Basic{
    public static void main(String[] args){
        // System.out.println("Hello World");
    //     Scanner input=new Scanner(System.in);
    //     System.out.print("Enter first number: ");
    //     int n1=input.nextInt();
    //     System.out.print("Enter second number: ");
    //     int n2=input.nextInt();
    //      System.out.print("Enter seconds: ");
    //     int n=input.nextInt();
    //     BasicFunctions obj1=new BasicFunctions(n1,n2);
    //     obj1.SecToTime(n);
    //    obj1.sum();
    //    obj1.minus();
    //    obj1.multiply();
    //    obj1.divdie();
    //    obj1.mod();
    //    Table obj=new Table(n1);
    //    obj.table();
//        double n=4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
//        System.out.println(n);
        // obj1.swap();
        // Binary obj2=new Binary();
        // obj2.IntToBinary(n1);
        // Strings obj3=new Strings();
        // obj3.substring();
    //    Arrays obj=new Arrays();
    //    obj.searchX();
    // Node tree = new Node(55);
    // tree.left = new Node(21);
    // tree.right = new Node(80);
    // tree.left.left = new Node(9);
    // tree.left.right = new Node(29);
    // tree.right.left = new Node(76);
    // tree.right.right = new Node(91);
    // tree.traversal(tree);
//  Animal a=new Animal();
//     a.makeSound();
    // Cat c=new Cat();
    // c.makeSound();
// Circle c1=new Circle(4);
// c1.calculatArea();
// Triangle t1=new Triangle(4);
// t1.calculatArea();
// Spacecraft s=new Spacecraft();
// s.fly_obj();
}

}
/**
 * InnerBasic
 */
interface Flyable {
    void fly_obj();
}
class Spacecraft implements Flyable{

    @Override
    public void fly_obj() {
        System.out.println("Can fly");
    }
    
}
class Airplane implements Flyable{

    @Override
    public void fly_obj() {
        System.out.println("will fly");
    }
    
}
class helicopter implements Flyable{

    @Override
    public void fly_obj() {
        System.out.println("Cant fly");
    }
    
}

class BankAcc{
    int bal;
    public BankAcc(int bal2) {
        this.bal=bal2;
    }
    public void deposit(int x){
        int a=bal+x;
            System.out.println("Bal: "+a);

    }
    public void withdraw(int x){
        if(x<bal){
            int a=bal-x;
            System.out.println("Bal: "+a);
        }
else{
                System.out.println("Insufficient funds");

}
    }
}
class Saving extends BankAcc{
    int with_limit;
    public Saving(int l,int bal){
        super(bal);
        this.with_limit=l;
    }
    public void withdraw(int x){
        if(with_limit>=x){
super.withdraw(x);
        }
    }
}
class Check extends BankAcc{
    int with_limit;
    public Check(int l,int bal){
        super(bal);
        this.with_limit=l;
    }
    public void withdraw(int x){
 if(with_limit>=x){
super.withdraw(x);
        }    }
}

class Student{
private int stu_id;
public int getStu_id() {
    return stu_id;
}
public void setStu_id(int stu_id) {
    this.stu_id = stu_id;
}
private String stu_name;
public String getStu_name() {
    return stu_name;
}
public void setStu_name(String stu_name) {
    this.stu_name = stu_name;
}
private List<Double> grade;
 public List<Double> getGrade() {
    return grade;
}
public void addGrade(double grades){
   
   if(grade==null){
grade=new ArrayList<>();
   }else{
    grade.add(grades);
   }
 }
}
abstract class Shape{
    public abstract void calculatArea();
    public abstract void calculatePerimeter();
}
class Circle extends Shape{
double radius;
public Circle(int r){
    this.radius=r;
}
    @Override
    public void calculatArea() {
        System.out.println("Circle Area: "+(3.15*radius*radius));

    }

    @Override
    public void calculatePerimeter() {
                System.out.println("Circle Perimeter "+(2*3.14*radius));

    }
    
}
class Triangle extends Shape{
double side;
public Triangle(int side){
    this.side=side;
}
    @Override
    public void calculatArea() {
        System.out.println("Tri Area: "+(side*side*side));

    }

    @Override
    public void calculatePerimeter() {
                System.out.println("Tri Perimeter "+(side+side+side));

    }
    
}
abstract class Animal{
    public abstract void makeSound();
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("Bark");
    }
}
class Node{
    int root;
    public Node left,right;
    public Node(int root){
        this.root=root;
        this.left=this.right=null;
    }
    public void traversal(Node n){
        if(n== null){
            return;
        }
        System.out.println(n.root+" ");
        if(n.left!=null) {
            traversal(n.left);
        }
        if(n.right!=null){
            traversal(n.right);
        }
    }
}

class Arrays{
    int arr1[]=new int[10];
    int arr2[]=new int[10];
    int n=10;
    public Arrays(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter array: ");
        for(int i=0;i<n;i++){
            arr1[i]=in.nextInt();
        }
        System.out.print("Enter array: ");
        for(int i=0;i<n;i++){
            arr2[i]=in.nextInt();
        }
    }
    public void  searchX(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number to search in array: ");
        int num=in.nextInt();
        int flag=0;
        int check=0;
        for(int i=0;i<n&&(flag<3);i++){
            if(arr1[i]==num){
            flag+=1;
        }
        if(i>0 && i<=n-1){
             if(arr1[i]==num && arr1[i-1]==num){
                check+=1;
        }
        }
    }
        if(flag!=0){
            System.out.println("Exist "+flag+" times");
        }
        if(check!=0){
            System.out.println("next to each other "+check+" times");

        }

    }
    public void joinArray(){
        int newarr[]=new int[5];
        int j=0;
        for(int i=0;i<2;i++){
            newarr[j]=arr1[i];j++;
        }
        for(int i=n-1;i>(n-3);i--){
        newarr[j]=arr1[i];j++;
        }
        System.out.println("New Array: ");
        for(int i=0;i<j;i++){
            System.out.println(newarr[i]);
        }
    }
}
class Strings{
    public void substring(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a string");
        String str=in.nextLine();
        int halfLength=str.length()/2;
        System.out.println("First half of "+str+": "+str.substring(0, halfLength));
    }
}
class BasicFunctions{
    int n1,n2;
    public BasicFunctions(int n1,int n2){
    this.n1=n1;
    this.n2=n2;
    }
    public void sum(){
        int res=n1+n2;
        System.out.println(n1+" + "+n2+ " = "+res);
    }
    public void minus(){
        int res=n1-n2;
        System.out.println(n1+" - "+n2+" = "+res);
    }
    public void multiply(){
        int res=n1*n2;
        System.out.println(n1+" * "+n2+" = "+res);
    }
    public void divdie(){
        int res=n1/n2;
        System.out.println(n1+" / "+n2+" = "+res);
    }
    public void mod(){
        int res=n1%n2;
        System.out.println(n1+" % "+n2+" = "+res);
    }
    public void swap(){
        int a=n1;
        n1=n2;
        n2=a;
        System.out.println("Swapped: Firstnumber: "+n1+" Second number: "+n2);
    }
    public void SecToTime(int seconds){
        int s=seconds%60;
        int s1=seconds/60;
        int m=s1%60;
        int h=s1/60;
        System.out.println(seconds+"seconds: "+h+":"+m+":"+s);
    }
}
class Table{
    int n;
    public Table(int n){
        this.n=n;
    }
    public void table(){
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
}
class Binary{
    public void IntToBinary(int n){
        int quot,i=0;
        int bin[]=new int[100];
        quot=n;
        while (quot!=0) {
            bin[i++]=quot%2;
            quot=quot/2;
        }
        System.out.println("Binary number for "+n+" : ");
        for(int j=i-1;j>=0;j--){
            System.out.println(bin[j]);
        }
    }
}
