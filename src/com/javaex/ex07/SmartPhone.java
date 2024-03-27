package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        if (str.equals("앱")) {
        	playApp();
        }
        else if (str.equals("음악")) {
        	super.execute(str);
        }
        else if (str.equals("통화")) {
        	super.execute(str);
        }
    }
 
    public void playApp() {
    	System.out.println("앱 실행");
    }
    
    
}
