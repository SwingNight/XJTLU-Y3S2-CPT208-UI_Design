/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelbooking;

/**
 *
 * @author lnasw
 */
public class Room {
    String type;
    String number;
    String inMonth;
    String inDay;
    String outMonth;
    String outDay;

    public Room(String type, String number, String inMonth, String inDay, String outMonth, String outDay) {
        this.type = type;
        this.number = number;
        this.inMonth = inMonth;
        this.inDay = inDay;
        this.outMonth = outMonth;
        this.outDay = outDay;
    }

    @Override
    public String toString() {
        return "Room Type: " + type + ", " + number + " people, From " + inMonth + " " + inDay + " To " + outMonth + " " + outDay;
    }

    public String getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }

    public String getInMonth() {
        return inMonth;
    }

    public String getInDay() {
        return inDay;
    }

    public String getOutMonth() {
        return outMonth;
    }

    public String getOutDay() {
        return outDay;
    } 
    
    public boolean isNotEmpty() {
        return !inMonth.equals("Month") && !inDay.equals("Day") && !outMonth.equals("Month") && !outDay.equals("Day");
    }
    
    public boolean rightDate() {
        int firstMonth = monthChange(inMonth);
        int secondMonth = monthChange(outMonth);
        int firstDay = dayChange(inDay);
        int secondDay = dayChange(outDay);
        return firstMonth <= secondMonth && firstDay <= secondDay;
    }
    
    private int monthChange(String month) {
        int intMonth = 0;
        switch(month){
            case "Jan.":
                intMonth = 1;
                break;
            case "Feb.":
                intMonth = 2;
                break;
            case "Mar.":
                intMonth = 3;
                break;
            case "Apr.":
                intMonth = 4;
                break;
            case "May.":
                intMonth = 5;
                break;
            case "Jun.":
                intMonth = 6;
                break;
            case "Jul.":
                intMonth = 7;
                break;
            case "Aug.":
                intMonth = 8;
                break;
            case "Sept.":
                intMonth = 9;
                break;
            case "Oct.":
                intMonth = 10;
                break;
            case "Nov.":
                intMonth = 11;
                break;
            case "Dec.":
                intMonth = 12;
                break;
        }       
        return intMonth;
    }
    
    private int dayChange(String day) {
        return Integer.valueOf(day).intValue();
    }
}
