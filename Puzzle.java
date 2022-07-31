package Puzzle1;
import java.util.*;
public class Puzzle {
	static Scanner sc=new Scanner(System.in);
	static int row=3;
	static int gamearray[][]= {{1,2,0},{4,5,3},{7,8,6}};
	
	
	public static void up() {
		int spaceindexrow=-1,spaceindexcol=-1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				if(gamearray[i][j]==0) {
				spaceindexrow=i;
				spaceindexcol=j;
				}
			}
		}
		if(spaceindexrow-1>=0) {
			gamearray[spaceindexrow][spaceindexcol]=gamearray[spaceindexrow-1][spaceindexcol];
			gamearray[spaceindexrow-1][spaceindexcol]=0;
		}
	}
	public static void down() {
		int spaceindexrow=-1,spaceindexcol=-1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				if(gamearray[i][j]==0) {
				spaceindexrow=i;
				spaceindexcol=j;
				}
			}
		}
		if(spaceindexrow+1<row) {
			gamearray[spaceindexrow][spaceindexcol]=gamearray[spaceindexrow+1][spaceindexcol];
			gamearray[spaceindexrow+1][spaceindexcol]=0;
		}
	}
	public static void left() {
		int spaceindexrow=-1,spaceindexcol=-1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				if(gamearray[i][j]==0) {
				spaceindexrow=i;
				spaceindexcol=j;
				}
			}
		}
		if(spaceindexcol-1>=0) {
			gamearray[spaceindexrow][spaceindexcol]=gamearray[spaceindexrow][spaceindexcol-1];
			gamearray[spaceindexrow][spaceindexcol-1]=0;
		}
	}
	public static void right() {
		int spaceindexrow=-1,spaceindexcol=-1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				if(gamearray[i][j]==0) {
				spaceindexrow=i;
				spaceindexcol=j;
				}
			}
		}
		if(spaceindexcol+1<row) {
			gamearray[spaceindexrow][spaceindexcol]=gamearray[spaceindexrow][spaceindexcol+1];
			gamearray[spaceindexrow][spaceindexcol+1]=0;
		}
	}
	
	public static int check(){
		int count=1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				if(gamearray[i][j]==count||(row-1)+(row-1)==i+j){
					count++;
				}
				else {
					break;
				}
			}
		}
		if(count==(row*row)+1) {
			return 10;
		}
		return 9;
		
	}
	
	public static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
	public static void main(String[] args) {
		int n=3,number;
		while(true) {
			clearScreen();
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(gamearray[i][j]+" ");
				}
				System.out.println();
			}
			if(check()==10) {
				number=10;
			}
			else {
			System.out.println("1.UP \n2.DOWN \n3.LEFT \n4.RIGHT");
			 number=sc.nextInt();
			}
			switch(number) {
			case 1:
				up();
				break;
			case 2:
				down();
				break;
			case 3:
				left();
				break;
			case 4:
				right();
				break;
			case 10:
				System.out.println("***********you won*****************");
				System.exit(0);
				default:
					System.out.println("can't");
			}
		}
	}

}
