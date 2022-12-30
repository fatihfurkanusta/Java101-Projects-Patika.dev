public class Main {
    public static void main(String[] args) {
        Employee e1=new Employee("Furkan",9000,50,2021);
        Employee e2=new Employee("Ahmet",11000,45,2017);

        Calculation c1=new Calculation(e1);
        c1.printInfo();
        //Calculation c2=new Calculation(e2);
        //c2.printInfo();

    }
}