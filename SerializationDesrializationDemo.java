import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.*;

class Employee implements Serializable {
	int id;
	String name;
	String address;
}

public Employee(int id. String name, String address) {
	this.id = id;
	this.name = name;
	this.address = address;
}

	public String getString() {
		return "My name is " + name + " and I live in " + address + ".";
	}
}

public class SerializationDesrializationDemo {
	public static void main(String[] args) {
		// Employee class
		class Employee implements Serializable {
		    int id;
		    String name;
		    String address;

		    // Constructor must be inside the class
		    public Employee(int id, String name, String address) {
		        this.id = id;
		        this.name = name;
		        this.address = address;
		    }

		    public String getString() {
		        return "My name is " + name + " and I live in " + address + ".";
		    }
		}

		// Main class
		public class SerializationDeserializationDemo {
		    public static void main(String[] args) {
		        try {
		            // Create objects
		            Employee e1 = new Employee(1, "Kunal", "Lalitpur");
		            Employee e2 = new Employee(2, "Nicksun", "Dhapakhel");

		            // ---------- WRITE OBJECTS (Serialization) ----------
		            File f = new File("employee.ser");
		            FileOutputStream fo = new FileOutputStream(f);
		            ObjectOutputStream oo = new ObjectOutputStream(fo);

		            oo.writeObject(e1);
		            oo.writeObject(e2);

		            oo.close();
		            fo.close();

		            // ---------- READ OBJECTS (Deserialization) ----------
		            FileInputStream fi = new FileInputStream(f);
		            ObjectInputStream oi = new ObjectInputStream(fi);

		            Employee emp1 = (Employee) oi.readObject();
		            Employee emp2 = (Employee) oi.readObject();

		            oi.close();
		            fi.close();

		            System.out.println(emp1.getString());
		            System.out.println(emp2.getString());

		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }
		}
        Employee(1, "Kunal", "Lalitpur");
		Employee e2 = new Employee(1, "Nicksun", "Dhapakhel");
		//Write e1 and e2 in a file;
		File f = new File("/media/kunal/500GB/adv_java$");
		FileInputStream fi = new FileInputStream(f);
		ObjectInputStream oo = new ObjectInputStream(fo);
		oo.writeObject(e1);
		oo.writeObject(e2);		
		//Read objects from a file:
		FileInputStream fi = new FileInputStream(f);
		ObjectInputStream oi = new ObjectInputStream(fi);
		Employee emp1 = (Employee)oi.readObject();
		Employee emp2 = (Employee) oi.readObject();
		System.out.println(emp1.getString());
		System.out.println(emp2.getString());

	}

}