package com.javaex.problem04;

public class Book {
    
    int bookNo;
    String title;
    String author;
    int stateCode;
    
    
    public Book( int bookNo, String title, String author) {
    	this.bookNo = bookNo;
    	this.title = title;
    	this.author = author;
    	this.stateCode =1;
    }
    
    public void rent() {
    	
    	if(stateCode == 1) {
    		stateCode = 0;
    		System.out.println(title +"이(가) 대여 됐습니다.");
    		
    	} else if(stateCode == 0) {
    		System.out.println("이미 대여중인 책입니다.");

    	}
    	
    }
    
    public void print() {
    	
    	String state = null;
    	
    	if(stateCode == 1) {
    		state = "재고있음";
    	} else if(stateCode == 0) {
    		state = "대여중";
    	}
    	System.out.printf("%d 책 제목: %s, 작가: %s, 대여 유무: %s%n",
    			bookNo, title, author, state);
    }

	public int getBookNo() {
		return bookNo;
	}


    
    
    
    
}
