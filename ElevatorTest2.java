import java.util.Scanner;
class Elevator{
	static int floor;
	static boolean door;
	
	Elevator(){
		this.floor =0;
		this.door=true;
	}
	
	Elevator(int cnt){
		this.floor =cnt;
		this.door=true;
	}
	
	void door(){
		if(door==false){
			System.out.println("문이 열립니다.");
		}
		else{
			System.out.println("문이 닫힙니다.");
		}
	}
	
	static void move(int cnt)throws Exception{
		if(-2<=cnt && cnt<floor){
			if(cnt<0)	System.out.println("지하"+(-cnt)+"층으로 이동합니다.");
			else System.out.println(cnt+"층으로 이동합니다.");
			for(int i=floor;cnt<=i;i--){
			if(i==0) System.out.print("L"+" ");
			else if(i<0) System.out.print("B"+(-i)+" ");
			else System.out.print(i+" ");
			Thread.sleep(1000);	// 1초 쉬는것
			floor--;
			}System.out.println();
			//floor=-floor;
		}
		else if(cnt<=10 && cnt>=floor){
			if(cnt<0)	System.out.println("지하"+(-cnt)+"층으로 이동합니다.");
			else System.out.println(cnt+"층으로 이동합니다.");
			for(int i=floor;cnt>=i;i++){
			if(i==0) System.out.print("L"+" ");
			else if(i<0) System.out.print("B"+(-i)+" ");
			else System.out.print(i+" ");
			Thread.sleep(1000);	// 1초 쉬는것
			floor++;
			}System.out.println();
		}
		
		else {
			System.out.println("유효한 층수로 입력해 주세요");
		}
		door=false;
	}
	
	void report(){
		if(floor==0) System.out.println("L층 입니다.");
		else  if (floor<0) System.out.println("지하"+(-floor-1)+"층 입니다.");
		else  System.out.println((floor-1)+"층 입니다.");
	}
	
	
}

public class ElevatorTest2{
	public static void main(String [] args)throws Exception{
	Scanner sc = new Scanner (System.in);
	int cnt,cnt2;
	System.out.print("몇층으로 갈까요?");
	cnt = sc.nextInt();
	Elevator e1 = new Elevator();
	e1.door();
	e1.move(cnt);
	e1.report();
	e1.door();
	Elevator e2 = new Elevator(cnt);
	System.out.print("몇층으로 갈까요?");
	cnt2 = sc.nextInt();
	e1.door();
	e1.move(cnt2);
	e1.report();
	e1.door();
	
	}
}