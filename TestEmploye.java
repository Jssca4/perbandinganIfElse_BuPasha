//Drive Class
public class TestEmploye {
        public static void main(String[] args) {
        //name, salary
        Employe e1 = new Employe("Jane", 3000.00);
        Employe e2 = new Employe("Brandon", 3900.00);
        Employe e3 = new Employe("Anna", 3000.00);

       // Perbandingan gaji
       if (e1.getSalary() > e2.getSalary() && e1.getSalary() > e3.getSalary()) {
        System.out.println("Jane memiliki gaji tertinggi.");
    } else if (e2.getSalary() > e1.getSalary() && e2.getSalary() > e3.getSalary()) {
        System.out.println("Brandon memiliki gaji tertinggi.");
    } else if (e1.getSalary() == e2.getSalary() && e1.getSalary() == e3.getSalary()) {
        System.out.println("Ke-3 karyawan memiliki gaji yang sama.");
    }else {
        System.out.println("Anna memiliki gaji tertinggi.");
    } 
    





        e1.print();
        e2.print();
        e3.print();

    }
    
}

    

