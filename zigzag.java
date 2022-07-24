/*


*/

import java.util.*;

class zigzag{
	public static void main(String[] args){
		zigzag zz = new zigzag();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string > ");
		String phrase = in.next();
		System.out.print("Enter amount of rows > ");
		int rows = in.nextInt();
		zz.solve(phrase, rows);
	}
	
	private void solve(String phrase, int rows){
		char[][] board = new char[rows][phrase.length()];
		for(int f=0;f<rows;f++){
			for(int d=0;d<phrase.length();d++){
				board[f][d] = ' ';
			}
		}
		char[] word = phrase.toCharArray();
		int i = 0;
		int j = 0;
		int k = 0;

		while(k < phrase.length()){
			if(rows==1){
				print(word);
				break;
			}
			
			while(i < rows && k < phrase.length()){
				board[i][j] = word[k];
				i++;
				k++;
			}
			i=rows-2;
			j++;
			
			while(i >= 0 && k < phrase.length()){
				board[i][j] = word[k];
				i--;
				j++;
				k++;
			}
			i=1;
			j--;
		}
		if(rows != 1){	
			for(int h=0;h<rows;h++){
				for(int g=0;g<phrase.length();g++){
					System.out.print(board[h][g] + " ");
				}
				System.out.println();
			}
		}
	}
	
	private void print(char[] word){
		for(int i=0; i<word.length;i++){
			System.out.print(word[i]);
		}
		System.out.println();
	}
}
