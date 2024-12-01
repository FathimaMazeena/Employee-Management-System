/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeemnagementsystem;

import java.io.File;

public class EmployeeMnagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //File f=new File("HRdepartment_employees.txt");
        //File f=new File("Employee_details.txt");
        //File f=new File("Department_details.txt");
        File f=new File("Designations.txt");
        
        
        try{
            
            System.out.println(f.createNewFile());
         
    }catch(Exception e){
            System.out.println("e");}
    
    
    }
    
}
