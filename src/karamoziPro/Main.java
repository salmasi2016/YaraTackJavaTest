package karamoziPro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	Scanner input = new Scanner(System.in);
	String name, jp, id;
	int we;

	public Main() {
		System.out.println("position: write or read ? (w or r)");
		char position = input.next().charAt(0);
		if (position == 'w') {
			write();
		} else if (position == 'r') {
			read();
		} else {
			new Main();
		}
	}

	private void write() {
		System.out.println("jobPosition: mobileDeveloper or webDeveloper or accountant ? (m or w or a)");
		char jobPosition = input.next().charAt(0);
		if (jobPosition == 'm') {
			writeMobileDeveloper();
		} else if (jobPosition == 'w') {
			writeWebDeveloper();
		} else if (jobPosition == 'a') {
			writeAccountant();
		} else {
			isFinished();
		}
	}

	private void writeMobileDeveloper() {
		getBasisInfo();
		System.out.printf("lastJobPosition: ");
		String ljp = input.next();
		System.out.printf("numApp: ");
		int numApp = input.nextInt();
		MobileDeveloper mobileDeveloper = new MobileDeveloper(name, jp, id, we, ljp, numApp);
		try {
			File file = new File("D:\\mobileDeveloper.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			BufferedWriter buffer = new BufferedWriter(new FileWriter(file, true));
			buffer.write("******");
			buffer.newLine();
			buffer.write("name: " + mobileDeveloper.getName());
			buffer.newLine();
			buffer.write("jobPosition: " + mobileDeveloper.getJobPosition());
			buffer.newLine();
			buffer.write("id: " + mobileDeveloper.getId());
			buffer.newLine();
			buffer.write("workExperievce: " + mobileDeveloper.getWorkExperience());
			buffer.newLine();
			buffer.write("lastJobPosition: " + mobileDeveloper.getLastJobPosition());
			buffer.newLine();
			buffer.write("numApp: " + mobileDeveloper.getNumApp());
			buffer.newLine();
			buffer.close();
			System.out.println("write a new mobileDeveloper: yes or no ? (y or n)");
			char isWriting=input.next().charAt(0);
			if(isWriting=='y'){
				writeMobileDeveloper();
			}else{
				isFinished();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void writeWebDeveloper() {
		getBasisInfo();
		System.out.printf("lastJobPosition: ");
		String ljp = input.next();
		System.out.printf("programmingLanguage: ");
		String pl = input.next();
		WebDeveloper webDeveloper = new WebDeveloper(name, jp, id, we, ljp, pl);
		try {
			File file = new File("D:\\webDeveloper.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			BufferedWriter buffer = new BufferedWriter(new FileWriter(file, true));
			buffer.write("******");
			buffer.newLine();
			buffer.write("name: " + webDeveloper.getName());
			buffer.newLine();
			buffer.write("jobPosition: " + webDeveloper.getJobPosition());
			buffer.newLine();
			buffer.write("id: " + webDeveloper.getId());
			buffer.newLine();
			buffer.write("workExperievce: " + webDeveloper.getWorkExperience());
			buffer.newLine();
			buffer.write("lastJobPosition: " + webDeveloper.getLastJobPosition());
			buffer.newLine();
			buffer.write("programmingLanguage: " + webDeveloper.getProgrammingLanguage());
			buffer.newLine();
			buffer.close();
			System.out.println("write a new webDeveloper: yes or no ? (y or n)");
			char isWriting=input.next().charAt(0);
			if(isWriting=='y'){
				writeWebDeveloper();
			}else {
				isFinished();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void writeAccountant() {
		getBasisInfo();
		System.out.printf("lastDegree: ");
		String ld = input.next();
		Accountant accountant = new Accountant(name, jp, id, we, ld);
		try {
			File file = new File("D:\\accountant.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			BufferedWriter buffer = new BufferedWriter(new FileWriter(file, true));
			buffer.write("******");
			buffer.newLine();
			buffer.write("name: " + accountant.getName());
			buffer.newLine();
			buffer.write("jobPosition: " + accountant.getJobPosition());
			buffer.newLine();
			buffer.write("id: " + accountant.getId());
			buffer.newLine();
			buffer.write("workExperievce: " + accountant.getWorkExperience());
			buffer.newLine();
			buffer.write("lastDegree: " + accountant.getLastDegree());
			buffer.newLine();
			buffer.close();
			System.out.println("write a new accountant: yes or no ? (y or n)");
			char isWriting=input.next().charAt(0);
			if(isWriting=='y'){
				writeAccountant();
			}else {
				isFinished();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void getBasisInfo() {
		System.out.printf("name: ");
		name = input.next();
		jp = "mobileDeveloper";
		System.out.printf("id: ");
		id = input.next();
		System.out.printf("workExperievce: ");
		we = input.nextInt();
	}
	
	private void read() {
		System.out.println("jobPosition: mobileDeveloper or webDeveloper or accountant ? (m or w or a)");
		char jobPosition = input.next().charAt(0);
		if (jobPosition == 'm') {
			readAndShow("D:\\mobileDeveloper.txt");
		} else if (jobPosition == 'w') {
				readAndShow("D:\\webDeveloper.txt");
		} else if (jobPosition == 'a') {
			readAndShow("D:\\accountant.txt");
		} else {
			isFinished();
		}
	}

	private void readAndShow(String address) {
		try {
			File file = new File(address);
			if (file.exists()) {
				System.out.println("Reading file ...");
				BufferedReader buffer = new BufferedReader(new FileReader(file));
				String line;
				while ((line = buffer.readLine()) != null) {
					System.out.println(line);
				}
				System.out.println("******");
				System.out.println("Finish Reading file");
				isFinished();
			} else {
				System.out.println(file.getAbsolutePath() + " not exist");
				isFinished();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void isFinished() {
		System.out.println("finish: yes or no ? (y or n)");
		char finish=input.next().charAt(0);
		if (finish=='y') {
			return;	
		}else {
			new Main();
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}
}