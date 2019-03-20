package com.soft1841.constants;

enum  Week {
    Monday("星期一"),TuesDAy("星期二"),WenesDAy("星期三");
    String weekName;
    Week(String weekName){
        this.weekName = weekName;
    }
    public String getWeekName(){
        return weekName;

    }
    public static Week getResult(String input){
        switch (input){
            case "mon":
                return Week.Monday;
            case "tue":
                return Week.TuesDAy;
            case "wen":
                return Week.WenesDAy;
            default:
                return Week.Monday;
        }
    }
}
