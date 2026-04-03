# Inventory Management System

## Overview
A real-world Pharmacy Inventory Management System developed for *Shanthi Medicals* to automate daily operations such as managing medicines, handling sales, maintaining customer records, and generating bills.

This system replaces manual processes, reducing errors and improving efficiency in pharmacy management.

---

## Features

- User Authentication  
  - Role-based login (Admin / Pharmacist)

- Admin Functionalities  
  - Add and update users  
  - View users and customers  

- Medicine Management  
  - Add new medicines  
  - Update medicine details  
  - View available stock  

- Billing System  
  - Sell medicines  
  - Generate bill (PDF)  
  - Track transactions  

- Customer Management  
  - Add customers  
  - View customer details  
  - Maintain purchase history  

- Inventory Tracking  
  - Real-time stock updates  
  - Reduces manual errors  

---

## Tech Stack

- Language: Java  
- UI: Java Swing  
- Database: MySQL  
- Connectivity: JDBC  
- IDE: NetBeans  

---

## System Workflow

1. User logs in as Admin or Pharmacist  
2. Admin manages users and monitors system data  
3. Pharmacist performs operations such as:
   - Adding medicines  
   - Adding customers  
   - Selling medicines  
4. During sales:
   - Items are added to a cart  
   - Bill is generated as a PDF  
   - File is stored locally  
5. Database updates automatically after each operation  

---

## Project Structure

- Login: Handles authentication  
- AdminDashboard: Admin operations  
- PharmacistDashboard: Pharmacy operations  
- AddMedicine / UpdateMedicine: Inventory management  
- SellMedicine: Billing system  
- Customer modules: Customer handling  

---

## Installation and Setup

1. Clone the repository:

2. Open the project in NetBeans  

3. Configure MySQL database:
   - Create the required database  
   - Import tables (if SQL file is provided)  

4. Update database connection in:
   ```java
   package dao;
    import java.sql.Connection;
    import java.sql.DriverManager;
    /**
     *
     * @author yokes
     */
    public class Connecter {
        public static Connection getCon(){
            try{
                class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Medical?useSSL=false","root","pass");
                return con;
            }
            catch(Exception e){
                    System.out.println(e);
                    return null;
                    }
        }
    }

5. Run the project  

---
## Screenshots

### Admin Dashboard
<img width="1378" height="775" alt="Picture1" src="https://github.com/user-attachments/assets/60294a67-0d97-4164-b594-60590111052b" />

### Pharmacist Dashboard
<img width="601" height="341" alt="Picture6" src="https://github.com/user-attachments/assets/d853b995-9d23-4aef-bde2-fe8adfc488d2" />

### Add Medicine
<img width="601" height="304" alt="Picture7" src="https://github.com/user-attachments/assets/d0c664a3-d57e-4285-ac97-0628c42bbfea" />

### Bill
<img width="410" height="389" alt="Picture9" src="https://github.com/user-attachments/assets/6c798c35-0391-469e-a25b-be2d06c66778" />


## Contributors

- Yokeshwar J  
- Dinesh G  
- Madhesh S  

---

## Future Improvements

- Web-based version  
- Mobile application support  
- Cloud database integration  
- Low stock notification system  
- Enhanced authentication and security    
- Low stock notification system  
- Enhanced authentication and security  
