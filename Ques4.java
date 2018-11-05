


import java.util.*;
class Detail implements Comparable<Detail>{
	String dob;
	String name;
	int date;
	int month;
	int year;
	String getName(){
		return name;
	}
	String getDob(){
		return dob;
	}
	Detail(String dob,String name){
		this.name=name;
		this.dob=dob;
	}
	public int compareTo(Detail ob){
		if((this.name).compareTo(ob.name)>1){
			return 1;
		}
		else if((this.name).compareTo(ob.name)<0){
			return -1;
		}
		else{
		if(this.year<ob.year){
			return -1;
		}
		else{
			if(this.month>ob.month){
				return 1;
				}
			else if(this.month<ob.month){
				return -1;
			}
			else{
				if(this.date>ob.date){
					return 1;
				}
				else if(this.date<ob.date){
					return -1;
				}
				else{
					return 0;
				}
			}
		}
		}
	}	
	
}
public class Ques4{

	void findDetail(Detail d){
		String dob=d.getDob();
		String[] s=dob.split("/",0);
		d.date=Integer.parseInt(s[0]);
		d.month=Integer.parseInt(s[1]);
		d.year=Integer.parseInt(s[2]);
	}
	void print(List<Detail> l){
		Iterator it=l.iterator();
		while(it.hasNext())
			findDetail(((Detail)it.next()));

		Collections.sort(l);

		it=l.iterator();
		while(it.hasNext()){
			Detail d=((Detail)it.next());
			System.out.println(d.name+"	"+d.date+" "+d.month+" "+d.year);
		}
	}

	public static void main(String[] args){
		List<Detail> l=new ArrayList<Detail>();
		l.add(new Detail("1/4/1999","xyz") );
		l.add(new Detail("1/5/1999","arun") );
		l.add(new Detail("1/6/1997","abhi") );
		l.add(new Detail("1/7/1996","himalya") );
		QuestionFour d=new QuestionFour();
		d.print(l);
	}
}
