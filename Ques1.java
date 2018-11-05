import java.util.*;
class Date{
	int d,m,y;
	String date;
	Date(String date){
		this.date=date;
	}
	String calculate(){
		int pos1=0,pos2=0;
		N:for(int i=0;i<date.length();i++){
			if(date.charAt(i)=='/'){
				pos1=i;
				break N;
			}
		}

		for(int i=pos1+1;i<date.length();i++){
			if(date.charAt(i)=='/'){
				pos2=i;
				break;
			}
		}
		d=Integer.parseInt(date.substring(0,pos1));
		m=Integer.parseInt(date.substring(pos1+1,pos2));
		y=Integer.parseInt(date.substring(pos2+1,date.length()));
		String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		return ""+d+" "+months[m-1]+" "+y;
	}
}

public class Ques1{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		Date d=new Date(s);
		System.out.println("Date " + d.calculate());
	}
}