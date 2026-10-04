public class Demo14 {
    public static void main(String[] args) {
        // 1. Objects created with the parameterized constructor
        Student14 student = new Student14("Budi Santoso",
                "budi@student.polinema.ac.id", "081234567890",
                "2541070601", "Business Information Systems");
        Lecturer14 lecturer = new Lecturer14("Siti Rahma",
                "siti@polinema.ac.id", "081298765432",
                "198501012010122001", "Software Engineering");

        // 2. Object created with the parameterless constructor
        Janitor14 janitor = new Janitor14();

        System.out.println("=== Student ===");
        student.displayInfo();
        student.study();

        System.out.println("\n=== Lecturer ===");
        lecturer.displayInfo();
        lecturer.teach();

        System.out.println("\n=== Janitor (parameterless) ===");
        janitor.displayInfo();

        // 3. Modify inherited attributes and the child attributes
        student.setPhoneNumber("085711122233");
        student.setMajor("Informatics Engineering");

        lecturer.setEmail("siti.rahma@polinema.ac.id");
        lecturer.setExpertise("Object Oriented Programming");

        janitor.setName("Joko Susilo");
        janitor.setEmail("joko@polinema.ac.id");
        janitor.setPhoneNumber("081377788899");
        janitor.setAssignedArea("Building A, 2nd floor");
        janitor.setShift("Morning");

        System.out.println("\n===== AFTER MODIFICATION =====");
        System.out.println("=== Student ===");
        student.displayInfo();
        student.study();

        System.out.println("\n=== Lecturer ===");
        lecturer.displayInfo();
        lecturer.teach();

        System.out.println("\n=== Janitor ===");
        janitor.displayInfo();
        janitor.cleanArea();
    }
}
