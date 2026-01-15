//enum Day {
//    MONDAY,
//    TUESDAY,
//    WEDNESDAY,
//    THURSDAY,
//    FRIDAY,
//    SATURDAY,
//    SUNDAY,
//}
enum TrafficLight {
    RED,
    YELLOW,
    GREEN,
}
public class Main {
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.GREEN;
        switch (light) {
            case RED:
                System.out.println(light + " light mean is stop!");
                break;
            case YELLOW:
                System.out.println(light + " light mean is be ready!");
                break;
            default:
                System.out.println(light + " light mean is can be go!");
        }
//        Day today = Day.SUNDAY;
//        switch (today) {
//            case SATURDAY:
//            case SUNDAY:
//                System.out.println(today + " is a weekend" );
//                break;
//            default:
//                System.out.println(today + " is a weekday");
//        }
    }
}