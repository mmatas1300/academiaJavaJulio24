package com.curso.v8;

public class Main {
	
	public static void main(String[] args) {
		Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello");
        
        try {
            String item = stringBox.getItem();
            System.out.println(item);
        } catch (ClassCastException e) {
            System.out.println("Exception caught");
        }


	}

}
