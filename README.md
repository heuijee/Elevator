# JAVA

엘레베이터를 구현하는 코드입니다.

현재 층수, 문의 상태(open:true, close:false) 출력

class Elevator를 생성한 뒤 층, 문의 상태를 나타내는 변수를 설정합니다.
  
```c  
static int floor;
static boolean door;
```
  
초기치는 0과 true로 설정해주고 현재 층수를 cnt에 저장해줍니다.
 ```
  Elevator(){
		this.floor =0;
		this.door=true;
	}
	
	Elevator(int cnt){
		this.floor =cnt;
		this.door=true;
	} 
  ```
  
  문의 상태를 출력해주는 함수를 만듭니다.
  
  ```
  void door(){
		if(door==false){
			System.out.println("문이 열립니다.");
		}
		else{
			System.out.println("문이 닫힙니다.");
		}
	}
  ```
  
  엘레베이터가 움직이는 함수를 만듭니다. 
  
  예외가 발생할 수 있으므로 throws Exception을 사용해 코드가 유연하게 실행될 수 있도록 합니다.
  
  엘레베이터가 움직일 때 층수가 출력되는 시간을 Thread.sleep(1000)으로 1초로 설정합니다. 
  
  ```
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
  ```
  
  마지막으로 report함수를 사용해 현재 층수를 출력합니다. 0층은 L(lobby)로 표현합니다.
  
   ```
  void report(){
		if(floor==0) System.out.println("L층 입니다.");
		else  if (floor<0) System.out.println("지하"+(-floor-1)+"층 입니다.");
		else  System.out.println((floor-1)+"층 입니다.");
	}
   ```
   
  이제 main함수에서 Elevator class에 있는 함수를 호출해줍니다.
  
  또한 가고 싶은 층을 입력받을 수 있도록 scanf함수도 호출합니다.
  
   ```
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
} ```
  
  
 
