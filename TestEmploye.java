//Drive Class
public class TestEmploye {
        public static void main(String[] args) {
        //name, salary
        Employe e1 = new Employe("Jane", 350000.00);
        Employe e2 = new Employe("Brandon", 200000.00);
        Employe e3 = new Employe("Anna", 250000.00);

       // Bandingkan gaji dan cetak karyawan dengan gaji tertinggi.
       if (e1.getSalary() > e2.getSalary() && e1.getSalary() > e3.getSalary()) {
        System.out.println("Jane memiliki gaji tertinggi..");
    } else if (e2.getSalary() > e1.getSalary() && e2.getSalary() > e3.getSalary()) {
        System.out.println("Brandon memiliki gaji tertinggi..");
    } else {
        System.out.println("Anna memiliki gaji tertinggi.");
    }

        


        e1.print();
        e2.print();
        e3.print();

    }
    
}

    

