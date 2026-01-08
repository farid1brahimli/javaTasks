public class Main {
    public static void main(String[] args) {

        OnlineCourse course =
                new OnlineCourse("Java Basics", "Mr. Smith", 3,
                        "Udemy", 45);

        course.displayDetails();

        if (course.isEligibleForCertificate()) {
            System.out.println("Certificate available");
        } else {
            System.out.println("Certificate is not available");
        }
    }
}
