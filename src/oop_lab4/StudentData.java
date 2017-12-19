package oop_lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//สร้าง Method สำหรับรับค่าข้อมูลนักเศึกษาประกอบด้วย
//1. ชื่อ-นามสกุล
//2. ที่อยู่
//3.รหัสนักศึกษา
//4. สาขาและมหาวิทยาลัย
//5. E-mail
public class StudentData {

    public static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    public static String getName() throws IOException{
        System.out.print("Enter your name : ");
        return reader.readLine();
    }//getName
    public static String getAddress() throws IOException {
        System.out.print("Enter your Address : ");
        return reader.readLine();
    }//getAddress
    public static String getStdID() throws IOException{
        System.out.print("Enter your ID : ");
        return reader.readLine();
    }//getID
    public static String getFaculty() throws IOException{
        System.out.print("Enter your Faculty : ");
        return reader.readLine();
    }//getFaculty
    public static String getEmail() throws IOException{
        System.out.print("Enter your Email : ");
        return reader.readLine();
    }//getEmail
    public static void main(String[] args) throws IOException{
        String Name = getName();
        String Address = getAddress();
        String ID = getStdID();
        String fac = getFaculty();
        String Email = getEmail();
        System.out.println(Name+"\n"+Address+"\n"+ID+"\n"+fac+"\n"+Email);

    }//main
}//class
