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
			System.out.println("���� �����ϴ�.");
		}
		else{
			System.out.println("���� �����ϴ�.");
		}
	}
	
	static void move(int cnt)throws Exception{
		if(-2<=cnt && cnt<floor){
			if(cnt<0)	System.out.println("����"+(-cnt)+"������ �̵��մϴ�.");
			else System.out.println(cnt+"������ �̵��մϴ�.");
			for(int i=floor;cnt<=i;i--){
			if(i==0) System.out.print("L"+" ");
			else if(i<0) System.out.print("B"+(-i)+" ");
			else System.out.print(i+" ");
			Thread.sleep(1000);	// 1�� ���°�
			floor--;
			}System.out.println();
			//floor=-floor;
		}
		else if(cnt<=10 && cnt>=floor){
			if(cnt<0)	System.out.println("����"+(-cnt)+"������ �̵��մϴ�.");
			else System.out.println(cnt+"������ �̵��մϴ�.");
			for(int i=floor;cnt>=i;i++){
			if(i==0) System.out.print("L"+" ");
			else if(i<0) System.out.print("B"+(-i)+" ");
			else System.out.print(i+" ");
			Thread.sleep(1000);	// 1�� ���°�
			floor++;
			}System.out.println();
		}
		
		else {
			System.out.println("��ȿ�� ������ �Է��� �ּ���");
		}
		door=false;
	}
	
	void report(){
		if(floor==0) System.out.println("L�� �Դϴ�.");
		else  if (floor<0) System.out.println("����"+(-floor-1)+"�� �Դϴ�.");
		else  System.out.println((floor-1)+"�� �Դϴ�.");
	}
	
	
}

public class ElevatorTest2{
	public static void main(String [] args)throws Exception{
	Scanner sc = new Scanner (System.in);
	int cnt,cnt2;
	System.out.print("�������� �����?");
	cnt = sc.nextInt();
	Elevator e1 = new Elevator();
	e1.door();
	e1.move(cnt);
	e1.report();
	e1.door();
	Elevator e2 = new Elevator(cnt);
	System.out.print("�������� �����?");
	cnt2 = sc.nextInt();
	e1.door();
	e1.move(cnt2);
	e1.report();
	e1.door();
	
	}
}