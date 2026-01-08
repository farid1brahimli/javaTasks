class OnlineCourse extends Course {

    String platform;
    int duration; // hours

    OnlineCourse(String courseName, String instructor, int credits,
                 String platform, int duration) {

        super(courseName, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }

    boolean isEligibleForCertificate() {
        return duration >= 40;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Duration: " + duration + " hours");
    }
}
