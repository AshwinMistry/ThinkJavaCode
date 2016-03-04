public class DateUSAEuro {

    public static void main(String[] args) {
        // generate some simple output
    
    String day;
    int date;
    String month;
    int year;
    
    day = "Friday";
    date = 4;
    month = "March";
    year = 2016;

    System.out.println("American format:");
    System.out.print(day + ", ");
    System.out.print(month + " ");
    System.out.print(date + ", ");
    System.out.println(year);

    System.out.println("European format:");
    System.out.print(day + " ");
    System.out.print(date + " ");
    System.out.print(month + ", ");
    System.out.println(year);

    }
}
