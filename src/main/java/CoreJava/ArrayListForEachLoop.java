import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListForEachLoop {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr.size());
        arr.add(40);
        arr.add(60);
        System.out.println(arr.size());
        for (int a : arr) {
            System.out.println(a);
        }
        arr.remove(1);
        for (int a : arr) {
            System.out.println(a);
        }
        System.out.println(arr.size());

        Employee e1 = new Employee("sarath", 38, "QA");
        Employee e2 = new Employee("bhrath", 35, "dev");

        ArrayList<Employee> arEmp = new ArrayList<Employee>();
        arEmp.add(e1);
        arEmp.add(e2);

        //Iterator to traverse through the values.
       Iterator<Employee> i= arEmp.iterator();
       while (i.hasNext()){
          Employee emp= i.next();
           System.out.println(emp.name);
           System.out.println(emp.age);
           System.out.println(emp.dept);

       }
    }



}
