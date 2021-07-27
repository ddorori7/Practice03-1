package com.javaex.problem02;

public class Friend {

    private String name;
    private String hp;
    private String school;

    
    //필요한 메소드 작성
    Friend(String name, String hp, String school) {
    	this.hp = hp;
    	this.name = name;
    	this.school = school;
    }
    
    
    public void showInfo(){
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
    }

}
