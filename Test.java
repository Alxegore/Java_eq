import java.util.*;
import java.lang.Integer;
import java.io.IOException;
import java.io.File;
import java.io.PrintStream;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.Label;

public class Test{

	private static int myTest(int x){
		return x+5;
	}

    public static void main(String[] args) throws IOException{

    	Frame frame = new Frame("A Frame");
		frame.setSize(250, 250);
		frame.setLocation(300,200);
		frame.setVisible(true);
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
			System.exit(0);
			}
		});
		Label label = new Label();
		label.setAlignment(java.awt.Label.CENTER);
		label.setText("Eqeq");
		label.setBounds(150, 100, 150, 20);

    	final int eqInwza = 190;
    	Animal golf = new Cat();
    	golf.bark();
    	List <Integer> myList = new ArrayList <Integer>();
    	myList.add(5);
    	myList.add(6);
    	myList.add(8);
    	myList.add(1,7);
    	System.out.println(myList);
    	int[] myArray = new int[10];
    	Testclass eqeqeq = new Testclass(5,5,"java");
		Testclass qeqeq = new Testclass(5,7,"java");
		eqeqeq.Testprint();
		qeqeq.Testprint();
		qeqeq = eqeqeq;
		qeqeq.Testprint();
		qeqeq.updateX(100);
		eqeqeq.Testprint();
		qeqeq.Testprint();
    	System.out.print("eq = " + eqInwza+ "\n");
        Scanner Sc = new Scanner(System.in);
        int eqeq = 0;
        eqeqeq.Testprint();
        for(int i=0;i<=5;i++)
        {
        	eqeq += myTest(eqInwza);
        } 

        Testclass.TestprintX();
        System.out.println(eqeqeq.getString());
        System.out.println(Testclass.getStaticString());
        System.out.println(Testextend.getStaticString());
        Testextend eqeqeqeq = new Testextend();
        System.out.println(eqeqeq.getMyString());
        System.out.println(eqeqeqeq.getMyString());
        System.out.println(eqeqeqeq.getMyMyString());
        System.out.print("Insert Num : ");
        int s = Sc.nextInt();
        for(int i=0;i<s;i++)
        {
        	myArray[i] = Sc.nextInt();
        }
        System.out.println("Yourname " + s);
        System.out.printf("%d\n",eqeq);
        Mergesort sorter = new Mergesort();
        sorter.sort(myArray,s);
        for(int i=0;i<s;i++)
        {
        	System.out.println(myArray[i]);
        }
    }
}