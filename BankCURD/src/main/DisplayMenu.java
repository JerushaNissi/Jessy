package main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.AccountsDao;
import dao.UsersDao;
import dto.Accounts;
import dto.Users;

public class DisplayMenu {
		public static int testExistingUser() throws SQLException 
		{
			UsersDao udao=new UsersDao("jdbc:mysql://localhost:3306/nissi","root","root");
			Scanner sc=new Scanner(System.in);
			System.out.println("Bank customers application");
			System.out.println("Enter user name::");
			String uname=sc.next();
			System.out.println("Enter password::");
			String passwd=sc.next();
			Users user=new Users(uname,passwd);
			int status= udao.checkUser(user);
			return status;
		}
		public static void testNewUser() throws SQLException {
			UsersDao userdao = new UsersDao("jdbc:mysql://localhost:3306/nissi","root","root");
			Scanner sc = new Scanner(System.in);
			System.out.println("you have to register first...");
			System.out.println("Enter username");
			String uname = sc.next();
			System.out.println("Enter password");
			String pwd = sc.next();
			Users user = new Users(uname,pwd);
			System.out.println("Enter AccountNumber");
			String acctNumber = sc.next();
			System.out.println("Enter AccountType");
			String acctType = sc.next();
			System.out.println("Enter Customer Name");
			String custName = sc.next();
			System.out.println("Enter the amount");
			float balance = sc.nextFloat();
			Accounts accounts = new Accounts(acctNumber,acctType,custName,balance);
			UsersDao.createCustomer(accounts, user);
		}
		public void showMenuOptions() throws SQLException 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Bank Application");
			System.out.println("1.New user");
			System.out.println("2.Existing User");
			System.out.println("Enter your choice::");
			int choice=sc.nextInt();
			switch(choice) {
			default:
				System.out.println("Wrong choice");
			case 1:
				testNewUser();
				break;
			case 2:
				int status=testExistingUser();
				if(status==1) {
					System.out.println("1.Deposit");
					System.out.println("2.Withdraw");
					System.out.println("3.Balance");
					System.out.println("4.Exit");
					System.out.println("Enter your choice::");
					int ch=sc.nextInt();
					switch(ch) {
					case 1:
						System.out.println("Enter account number::");
						String acntnum=sc.next();
						System.out.println("Enter amount to deposit::");
						float amnt=sc.nextFloat();
						AccountsDao.deposit(acntnum,amnt);
						break;
					case 2:
						System.out.println("Enter account number::");
						String acntnum1=sc.next();
						System.out.println("Enter amount to deposit::");
						float amnt1=sc.nextFloat();
						AccountsDao.withdraw(acntnum1,amnt1);
						break;
					case 3:
						System.out.println("Enter account number::");
						String acntnum2=sc.next();
						AccountsDao.getBalance(acntnum2);
						break;
					}
					}
				break;
				}
			
		}
	}

