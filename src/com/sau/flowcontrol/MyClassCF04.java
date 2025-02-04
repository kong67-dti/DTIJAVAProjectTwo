package com.sau.flowcontrol;

public class MyClassCF04 {
    // คำสั่ง break และ continue ใน loop
    //break ใน loop ทำงานเมื่อไหร่จบเลย
    //continue ใน loop ทำงานเมื่อไหร่จบนั้นเลย แล้วไปต่อ
    public static void main(String[] args) {
        for( int k = 1; k <= 5; k++){
            if( k ==3 ){
                break;
            }
            System.out.println(k + "Ho....");
        }
        System.out.println("=============================================");
        for( int k = 1; k <= 5; k++){
            if( k ==3 ){
                continue;
            }
            System.out.println(k + "Ho....");
        }

    }
}
