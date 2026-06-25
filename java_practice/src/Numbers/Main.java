package Numbers;
import java.util.*;

	// Base class
	class KYC {
	    String name;
	    int age;
	    String gender;
	    String idNumber;

	    void getKYCDetails(Scanner sc) {
	        System.out.print("Enter Name: ");
	        name = sc.nextLine();

	        System.out.print("Enter Age: ");
	        age = sc.nextInt();
	        sc.nextLine(); // consume newline

	        System.out.print("Enter Gender (Male/Female/Other): ");
	        gender = sc.nextLine();

	        generateID(); // generate ID after input
	    }

	    void generateID() {
	        Random r = new Random();

	        int randomNum = 100 + r.nextInt(900); // 3-digit random number
	        int nameLength = name.length();

	        String genderCode;

	        if (gender.equalsIgnoreCase("Male")) {
	            genderCode = "M";
	        } else if (gender.equalsIgnoreCase("Female")) {
	            genderCode = "F";
	        } else {
	            genderCode = "OTH";
	        }

	        idNumber = randomNum + "" + nameLength + genderCode;
	    }

	    void displayKYCDetails() {
	        System.out.println("\n--- KYC Details ---");
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Gender: " + gender);
	        System.out.println("Generated ID: " + idNumber);
	    }
	}

	// Derived class
	class Project extends KYC {
	    String projectName;
	    String projectDomain;

	    void getProjectDetails(Scanner sc) {
	        System.out.print("Enter Project Name: ");
	        projectName = sc.nextLine();

	        System.out.print("Enter Project Domain: ");
	        projectDomain = sc.nextLine();
	    }

	    void displayProjectDetails() {
	        System.out.println("\n--- Project Details ---");
	        System.out.println("Project Name: " + projectName);
	        System.out.println("Project Domain: " + projectDomain);
	    }
	}

	// Main class
	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        Project p = new Project();

	        // Input
	        p.getKYCDetails(sc);
	        p.getProjectDetails(sc);

	        // Output
	        p.displayKYCDetails();
	        p.displayProjectDetails();

	        sc.close();
	    }
	}