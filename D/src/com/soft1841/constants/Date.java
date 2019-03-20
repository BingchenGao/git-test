package com.soft1841.constants;


enum Date {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");
    String dateName;
    Date(String dateName) {
        this.dateName = dateName;
    }

    public String getDateName() {
        return dateName;
    }

    public static Date getResult(String input) {
        switch (input) {
            case "mon":
                return Date.MONDAY;
            case "tue":
                return Date.TUESDAY;
            case "wed":
                return Date.WEDNESDAY;
            case "thu":
                return Date.THURSDAY;
            case "fri":
                return Date.FRIDAY ;
            case "sat":
                return Date.SATURDAY ;
            case "sun":
                return Date.SUNDAY;
        }
        return null;
    }
}
class DateTest {
    public static void main(String[] args) {
        System.out.println(Date.MONDAY);
        for (Date e : Date.values()) {
            System.out.println(e );
        }
    }
}

