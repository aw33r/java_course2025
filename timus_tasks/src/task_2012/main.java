package timus_tasks.src.task_2012;

import java.io.PrintWriter;
import java.util.Scanner;

public class main {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);


        int numberOfTusks = in.nextInt();

        int difference = 12 - numberOfTusks;

        int time = difference * 45;

        if(time <=240){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        out.flush();

    }
}
