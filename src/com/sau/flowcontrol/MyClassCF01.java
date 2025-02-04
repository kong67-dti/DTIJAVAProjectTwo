    package com.sau.flowcontrol;

public class MyClassCF01 {

    // Control Flow /Control Statement
    // กลุ่มที่ 1 Selection/Condition ( if / if-else / if-else-if / switch-case)
    public static void main(String[] args) {
        // พิสุจนครั้งเดียว ( จริง = ทำ เท็จ ไม่ทำ )

        int a = 50;
         if ( a > 50 ){
            System.out.println("Hello......");

        }
        System.out.println(".................");

        // พิสุจนครั้งเดียว (จริง = ทำ เท็จก็ = ทำ : if-else)

        String b = "xyz";
        if( b.equals("SAU") ){
            System.out.println("Southease Asia University");
        }
        else{
            System.out.println("No no no.........");

        }
    }
}
