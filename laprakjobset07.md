Name : adjie seto hidayatullah
Nim  : 264107020225
Class: TI-1i

## 1: OBJECTIVE

The following are the objectives of the practical work in this chapter:

● Students are able to explain the syntax for writing loop programs (for, while, and dowhile).
● Students are able to implement loop flowcharts using the Java programming
language.

---

## 2: LABS & ACTIVITIES

### 2.1 Experiment 1: Student Grades Case Study in SIAKAD – FOR Loop.

#### 2.1.1 Program Code Java
```java

import java.util.Scanner;

public class SiakadFor001 {
    public static void main(String[] args) {
        double nilai,tertinggi = 0, terendah = 100;
        Scanner scanner = new Scanner(System.in); 

        for (int i = 1; i <= 10; i++){
            System.out.print("Masukkan nilai ke-" + i + ": ");
            
            nilai = scanner.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            
            }
        }   System.out.println("Nilai tertinggi: " + tertinggi);
            System.out.println("Nilai terendah: " + terendah);
            scanner.close();

        }
    }

```

#### 2.1.2 Execution Result / Screenshot Output

![case study](<Screenshot 2026-11-03 213734.png>)

#### 2.1.3 Answers to Questions / Reflection Questions
1. Identify and indicate each component of the FOR loop in the program code of Experiment
The for loop in the code is: for (int i = 1; i <= 30; i++)
• Initialization: int i = 1 sets the starting point of the loop counter variable i to 1.
• Condition: i <= 30 is checked before each iteration. The loop continues running as long as this condition evaluates to true.
• Increment: i++ increases the loop counter by 1 at the end of each iteration.
• Loop Body: The block of code inside the curly braces { ... } that executes repeatedly (30 times in this case).
2. Why is the variable highest initialized to 0 and the variable lowest initialized to 100? What
happens if highest is initialized to 100 and lowest is initialized to 0?
• Why tertinggi = 0 and terendah = 100?
This setup ensures that the very first input score will correctly overwrite both initial values. Since student scores typically range between 0 and 100, any real score will be greater than or equal to 0 (updating tertinggi) and less than or equal to 100 (updating terendah).
• What happens if reversed (tertinggi = 100 and terendah = 0)?
If tertinggi starts at 100, the condition nilai > tertinggi will never be true (unless a score exceeds 100). The final output will falsely report 100 as the highest score. If terendah starts at 0, the condition nilai < terendah will never be true (unless a score is negative), falsely reporting 0 as the lowest score.
3. Explain the function and workflow of the following code snippet!
if (score > highest) {
 highest = score;
}
if (score < lowest) {
 lowest = score;
}
• Function:
This block filters through the inputted scores in real-time to track down the absolute highest and lowest marks recorded during the entire session.
• Workflow:
	1. The program evaluates the first if statement: Is the currently entered nilai (score) greater than the current tertinggi?
	2. If true, the variable tertinggi updates and stores this new, larger value. If false, it skips to the next step.
	3. The program then evaluates the second if statement: Is the current nilai less than the current terendah?
	4. If true, the variable terendah updates and stores this new, smaller value. If false, it moves forward to the next iteration of the loop.
4. Modify the program to count how many students pass and how many students fail, based
on the passing threshold (minimum score of 60). Display the number of students who
pass and fail after displaying the highest and lowest scores!

#### 2.1.1 Program Code Java
```java

import java.util.Scanner;

public class SiakadFor001 {
    public static void main(String[] args) {
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0;  
        int tidakLulus = 0; 
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 30; i++) {
            System.out.print("Masukkan nilai ke-" + i + ": ");
            nilai = scanner.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);
        
        scanner.close();
    }
}
```

5. Commit and push the program code to GitHub

---

### 2.2 Experiment 2: Student Grades Case Study in SIAKAD – WHILE Loop

#### 2.2.1 Program Code Java
```java

import java.util.Scanner; 

public class siakadwhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("masukkan jumlah mahasiswa: ");
        int jumlah = scanner.nextInt();

        int i = 0;
        while (i < jumlah){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            double nilai = scanner.nextDouble();

            if (nilai< 0 || nilai > 100){
                System.out.println("Nilai tidak valid. Masukkan nilai antara 0 dan 100.");
            } 
            
            if (nilai > 80 && nilai <= 100){
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
            } else if (nilai >= 73 && nilai <= 80){
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
            } else if (nilai >= 65 && nilai <= 73){
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
            } else if (nilai >= 60 && nilai <= 65){
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C+");
            } else if (nilai >= 50 && nilai <= 60){
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C");
            } else if (nilai >= 39 && nilai <= 50){
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E");
            }
            i++;
        
        }scanner.close();
    }
}
```
#### 2.2.2 Execution Result / Screenshot Output
![case study](<Screenshot 2026-11-03 213823.png>)

#### 2.2.3 Answers to Questions / Reflection Questions
*1. In the following code snippet, determine the meaning and purpose of the following
syntax:
if (score < 0 || score > 100) {
 System.out.println("Invalid score. Please enter a valid score!");
 continue;
}
a. score < 0 || score > 100
b. continue
• a. score < 0 || score > 100: This is a logical condition used for input validation. It uses the logical OR operator (||) to check if the entered score is invalid—meaning it is either less than 0 OR greater than 100.
• b. continue: This statement skips the remaining code inside the loop for the current iteration and jumps directly back to the loop's condition check. In input validation, it prevents an invalid score from being processed by the grading logic bel

2. Why is the i++ statement written at the end of the WHILE loop? What happens if it is
written at the beginning of the WHILE loop?
• Why it is at the end: Writing i++ at the end ensures that the current student (i) is fully processed and graded before moving on to the next one. This keeps the zero-based index aligned with the loop condition while (i < jumlah).
• What happens if written at the beginning: If placed at the start, i increments immediately upon entering the loop. As a result:
	• The program will skip the first index (i = 0).
	• The text prompts will display incorrect numbering (e.g., the first prompt will say "Masukkan nilai mahasiswa ke-2" instead of 1).

3. If the number of students entered is 19, how many times will the WHILE loop run?
• 9 times. The loop starts at i = 0 and runs as long as i < 19, executing exactly once for each student from index 0 through 18.
4. Modify the program so that, if a student receives grade A, the program displays an
additional message “Well done, keep up the good work!”

#### 2.2.1 Program Code Java
```java
import java.util.Scanner;

public class siakadwhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlah = scanner.nextInt();

        int i = 0;
        while (i < jumlah) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            double nilai = scanner.nextDouble();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai tidak valid. Masukkan nilai antara 0 dan 100.");
                continue; // Skips to next iteration without incrementing i if input is invalid
            }

            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah A");
                System.out.println("Well done, keep up the good work!");
            } else if (nilai >= 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B+");
            } else if (nilai >= 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah B");
            } else if (nilai >= 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C+");
            } else if (nilai >= 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah C");
            } else if (nilai >= 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-" + (i + 1) + " adalah E");
            }
            i++;
        }
        scanner.close();
    }
}

5. Commit and push the program code to GitHub

---

### 2.3 Experiment 3:  Café Transaction Case Study – DO-WHILE Loop

#### 2.2.1 Program Code Java
```java
import java.util.Scanner;
public class kafedowhile001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hargakopi = 5000, hargateh = 3000, hargasusu = 4000;
        double totalharga;
        int jumlahkopi, jumlahteh, jumlahsusu;
        scanner.nextLine(); 
        
        do{System.out.print("masukan nama pelangngan (ketik 'keluar' untuk berhenti): ");
            String namaPelanggan = scanner.nextLine();
            if (namaPelanggan.equalsIgnoreCase("keluar")){
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("jumlah kopi: ");
            jumlahkopi = scanner.nextInt();
            System.out.print("jumlah teh: ");
            jumlahteh = scanner.nextInt();
            System.out.print("jumlah susu: ");
            jumlahsusu = scanner.nextInt();

            totalharga=(hargakopi * jumlahkopi) + (hargateh * jumlahteh) + (hargasusu * jumlahsusu);
            System.out.println("Total harga: " + totalharga);
            scanner.nextLine();
            
        }while (true);

        System.out.println("Program selesai.");
        scanner.close();
    }
}
```

#### 2.3.2 Execution Result / Screenshot Output
![case study ](<Screenshot 2026-11-03 213942.png>)

#### 2.2.3 Answers to Questions / Reflection Questions
1. In this DO-WHILE loop, if the first customer name entered is “cancel”, how many times is
the loop executed?
The loop is executed once initially, but because "cancel" does not match "keluar", the transaction continues. The loop repeats afterward.

2. State the stopping condition used in this DO-WHILE loop! The loop stops when the user enters "keluar", which triggers the break statement.

3. What is the function of using the value true in the DO-WHILE condition?The value true makes the DO-WHILE loop run continuously because the condition is always true, unless stopped by break.

4. Why does this DO-WHILE loop still run even though it has no initialization and update
components?Because DO-WHILE does not require initialization and update components. It executes the code inside do first, then checks the condition after each iteration.

---

## 3: ASSIGNMENT
A cinema manager wants to create a program to calculate the total ticket sales in one
day. Tickets are sold at Rp 50,000 per ticket. The program must calculate the total number
of tickets sold and the total ticket sales revenue for the day, subject to the following rules:
• If a customer buys more than 4 tickets, the customer receives a 10% discount.
• If a customer buys more than 10 tickets, the customer receives a 15% discount.
• If the ticket quantity entered is invalid (negative), the program ignores the input and
asks for it to be re-entered
 
#### 3.1.1 Program Code Java
```java
import java.util.Scanner;

public class Tiketbioskop {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);  
      int hargatiket = 50000;
      int tiketterjual= 0;
      double pendapatanhariini = 0;
      System.out.print("=====Sistem penjualana tiket bioskop=====\n");
      System.out.print("Ketik 0 untuuk selesai dan melihat total penghasilan hari ini\n");

      while(true){
        System.out.println("Masukan jumlah pembeli tiket penonton:");
        int jumlahpembelitiket = scanner.nextInt();
        
        if (jumlahpembelitiket <0){
            System.out.println("Jumlah pembeli tiket tidak valid. Masukkan jumlah yang benar.");
            continue;
        }
        if (jumlahpembelitiket == 0){
            break;
        }
        
        int hargaasli = hargatiket * jumlahpembelitiket;
        double diskon = 0;

        if (jumlahpembelitiket > 10){
            diskon = 0.15;
        } else if (jumlahpembelitiket > 4){
            diskon = 0.10;
        }
        double  totalhargasetelahdiskon = hargaasli * (1 - diskon);
        tiketterjual += jumlahpembelitiket;
        pendapatanhariini += totalhargasetelahdiskon;

        System.out.printf("Diskon yang didapatkan: %.0f%%\n", diskon * 100);
        System.out.printf("Total harga yang harus dibayar: Rp %.0f\n\n", totalhargasetelahdiskon);
      }
      System.out.println("================================");
      System.out.println("Laporan penjualan tiket hari ini:");
      System.out.println("Total tiket terjual: "+ tiketterjual +" tiket"); 
      System.out.printf("Total pendapatan hari ini: Rp %.0f\n", pendapatanhariini);
      System.out.println("===============================");
      scanner.close();
       
    }
}
```
#### 3.1.2 Execution Result / Screenshot Output

![case study](<Screenshot 2026-11-03 213857.png>)

#### Task 2: 

A parking lot operator wants to create a program to calculate the total parking fees of
several vehicles. The parking rate is Rp 3,000 per hour for cars and Rp 2,000 per hour for
motorcycles. The program keeps asking for input as long as the input is not 0. Implement
the flowchart as a Java program!

#### 3.2.1 Program Code Java
```java
import java.util.Scanner;

public class ProgramParkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int jenis, durasi, total = 0;
        
        do {
            System.out.print("Input jenis (1: Mobil, 2: Motor, 0: Keluar): ");
            jenis = scanner.nextInt();
            
            
            if ((jenis == 1) || (jenis == 2)) {
                System.out.print("Input durasi (jam): ");
                durasi = scanner.nextInt();
    
                if (jenis == 1) {
                    total += durasi * 3000;
                } else {
                    total += durasi * 2000; 
                }
            }
            
        } while (jenis != 0);
    
        System.out.println("Total pembayaran parkir: Rp " + total);
        scanner.close();
    }
}

```

#### 3.1.2 Execution Result / Screenshot Output
![case study](<Screenshot 2026-11-03 214328.png>)

---



