## 13일차 수업내용(2021-07-14.수)

#### 메서드(method) = 함수(function)

-  소스코드를 관리하기 쉽게 기능 단위로 묶어 놓은것.

##### *아규먼트를담는변수를 파라미터

#### 가변파라미터

- 0개이상의값을 받을때 선언하는 방식
- 맨마지막줄에 선언해야한다.
- 낱개의 값을 여러개 줄수있다.
- 배열에담아서 값을 줄 수 있다.

#### *메서드 호출과 메모리*

- 메서드를 호출 할때 HDD에서 RAM으로 가져오는걸` (loading) ` 이라고 한다.
- HDD에서는 절대 못 읽는다.



## 중요! = 실행파일,데이터파일을 실행시키려면 

## 무조건` HDD ` -> ` RAM ` 으로 읽어온후 ` CPU `로 보내서 실행시킨다!

#### 클래스 파일을 실행시키려면

#### ` HDD `  ->  ` RAM `  으로 이동후





####RAM에서의 호출과 3가지의 메모리영역

### `  Method Area ` , ` JVM Stack ` , ` Heap ` 

- #### Method Area 메모리영역

  - 메인메서드 ` main() ` 를 둔다
  - 클래스안의 자바코드를 둔다
  - class파일의 내용
    - 클래스 코드
    - 상수
    - 클래스 변수
  - 스웹메서드 ` swap() ` 를 둔다.

- #### JVM Stack 메모리영역

  - 메서드를 호출할때 생성되는 로컬 변수를 둔다.

- #### Heap 메모리 영역

  - new 명령으로 생성하는 변수를 둔다.  **` "인스턴스 변수" `**





##### 메모리(RAM)에서의 과정

- 1.JVM이 읽어들일때 클래스를 loading
- 2.main() 호출
- 3.JVM stack 에서 로컬변수



- 메서드 실행이 끝나면 메서드가사용할때 만들었던 ` 프레임(메서드의 로컬변수) `는 사라진다.

스왑에서 변수를넘기는게아니라 값을 넘긴다고보면된다!.

- ​
- 



### 스왑메서드 swap()

-  서로값을 교환하는게 스왑
-  값을 바꾼다. 즉 교환한다고 해서 스왑이라고 불린다.
-  swap은 변수를 저장 하는것이 아니라 값을 저장한다!
-  그래서 call by value 라고 부른다.



## *자바의 변수 종류

` #primitive data type 변수 `

```java
정수 값 저장변수
- byte b; 			//1byte
- short s; 			//2byte
- int i;			//4byte
- long l;			//8byte
부동소수점 값 저장변수
- float f;			//4byte
- double d;			//8byte
논리 값 저장 변수
- boolean bool;		//1byte  true,false만가능 0또는1
유니코드 저장 변수
- char c;			//2byte  문자1글자

//해당 변수는 값을 가지고있다.

```

` reference `

> **그외 모든 주소 변수 를 래퍼런스 라고 한다.(배열 레퍼런스 포함)**
>
> **String 도 주소 변수라고 할수있다. 데이타 타입 변수가 아니다!**
>
> **값이 아니라 레퍼런스(reference)주소를 담는다고 보면 된다.**
>
> **int[] arr;**
>
> - **arr[]**
>   - **[] 배열의 주소**
>   - **주소를 저장하는 변수를 ` "레퍼런스(reference)" `라 부른다**
>   - **C언어에서는 ` "포인터(pointer)" `라 부른다**



#### primitive data type변수는 값을 저장한다.

#### 그외는 주소를 저장한다.



### 메서드의 호출 과정

``` java
package com.eomcs.lang.ex07;

//# 메서드 : call by value
// 다음예제에서 메서드호출과정
// 1번. JVM이 HDD에서 RAM으로 파일을 읽어온후 클래스를 loading 시킨다 (Method Area메모리영역)
// 2번. main()메서드를 호출한다  >> public static void main <<	   (Method Area메모리영역)
// 3번. main()메서드의 로컬 변수를 호출한다. >> args, a, b <<		   (JVM stack메모리영역)
// 4번. swap()메서드를 호출한다  >> static void swap <<			   (Method Area메모리영역)
// 5번. swap()메서드의 로컬 변수를 호출한다. >> a, b, temp << swap()안의변수(JVM stack메모리영역)
// 6번. swap()메서드 로컬변수 a와b에 아큐먼트 값을 저장 >> 100,200을 저장 <<	(JVM stack메모리영역)
// - 즉 swap이란 메서드는 값을 바꾼다 즉 교환한다고해서 스왑이라고부른다.
//   temp라는 임시 변수에 값을 옮겨 담고 차례대로 값을 이동하여 값을 교환하는것
// - 메서드의 실행이 끝나면 그 메서드를 호출할 때 생성했던 프레임이 삭제된다.
//   Jvm이 OS로부터 받아서 쓴 메모리를 OS가 회수해 간다.
public class Exam0310 {

  static void swap(int a, int b) {
    System.out.printf("swap(): a=%d, b=%d\n", a, b); //결과 swap(): a=100, b=200
    int temp = a;
    a = b;
    b = temp;
    System.out.printf("swap(): a=%d, b=%d\n", a, b); //결과 swap(): a=200, b=100
  }

  public static void main(String[] args) {
    int a = 100;
    int b = 200;

    // swap() 호출할 때 a 변수의 값과 b 변수의 값을 넘긴다.
    // => 그래서 "call by value"라 부른다.
    // => 비록 swap()에서 a와 b라는 이름의 변수가 있지만,
    //    이 변수는 main()에 있는 변수와 다른 변수이다.
    swap(a, b);
    System.out.printf("main(): a=%d, b=%d\n", a, b); //결과 main(): a=100, b=200
  }
}

// call by value
// => 아규먼트가 primitive data type인 경우,
//    메서드를 호출할 때 값을 넘긴다.
// => 자바에서는 primitive data type에 대해서 
//    메모리(변수) 주소를 넘기는 방법이 없다.
// 
```



### call by reference

``` java
package com.eomcs.lang.ex07;

//# 메서드 : call by reference
// 다음예제에서 메서드호출과정
// 1번. JVM이 HDD에서 RAM으로 파일을 읽어온후 클래스를 loading 시킨다 (Method Area메모리영역)
// 2번. main()메서드를 호출한다  >> public static void main <<	   (Method Area메모리영역)
// 3번. main()메서드의 로컬 변수를 호출한다. >> args, arr <<		   (JVM stack메모리영역)
// 4번. 배열 인스턴스 생성 int타입의 [0],[1]의 배열을 생성		    (Heap 메모리영역)
// 5번. 배열이 시작된 메모리의 주소를 메인로컬변수인 arr안에 담는다
// 6번. swap(배열이시작된메모리주소) 호출							   (JVM stack메모리영역)
// 7번. swap로컬변수 준비										     (JVM stack메모리영역)
// 8번. 메인로컬변수 arr의 메모리주소를 swap로컬변수 arr안에담는다.
public class Exam0320 {

  static void swap(int[] arr) {
    System.out.printf("swap(): arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
    //위의 콘솔 결과 : swap(): arr[0]=100, arr[1]=200
    int temp = arr[0];
    arr[0] = arr[1];
    arr[1] = temp;
    System.out.printf("swap(): arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
    //위의 콘솔 결과 : swap(): arr[0]=200, arr[1]=100
  }

  public static void main(String[] args) {
    int[] arr = new int[] {100, 200};
    swap(arr); // 배열 인스턴스(메모리)를 넘기는 것이 아니다. 
    // 주소를 넘기는 것이다.
    // 그래서 "call by reference" 라 부른다.
    System.out.printf("main(): arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
    //위의 콘솔 결과 : main(): arr[0]=200, arr[1]=100
  }
}
```



### 클래스 와 메모리

``` java
package com.eomcs.lang.ex07;

//# 메서드 : call by reference II
// 다음예제에서 메서드호출과정
// 1번. JVM이 HDD에서 RAM으로 파일을 읽어온후 Exam0330클래스 파일를 loading 시킨다 
//    -(Method Area메모리영역)
// 2번. main()메서드를 호출한다  >> public static void main <<	   (Method Area메모리영역)
// 3번. main()메서드의 로컬 변수를 호출한다. >> args, ref<<		   (JVM stack메모리영역)
// 4번. JVM이 HDD에서 RAM으로 파일을 읽어온후 MyObject클래스 파일를 loading 시킨다 
//    -(Method Area메모리영역)
// 5번. MyObject설계도에 따라 변수를 생성한다. >>int타입의 a와b 		(Heap 메모리영역)
// 6번. swap(배열이시작된메모리주소) 호출							   (JVM stack메모리영역)
// 7번. swap()을 실행하는 동안 사용할 로컬 변수 준비					 (JVM stack메모리영역)
public class Exam0330 {

  // main()에서 만든 int a와 int b의 값을 바꾸고 싶다면,
  // primitive data type 값을 직접 넘기지 말고 
  // 객체에 담아 넘겨라!
  static class MyObject {
    // => class 는 메모리의 구조를 설계하는 문법이다.
    // => new 명령을 이용하여 변수를 생성할 수 있다.
    int a;
    int b;
  }

  static void swap(MyObject ref) {
    System.out.printf("swap(): a=%d, b=%d\n", ref.a, ref.b);
    int temp = ref.a;
    ref.a = ref.b;
    ref.b = temp;
    System.out.printf("swap(): a=%d, b=%d\n", ref.a, ref.b);
  }

  public static void main(String[] args) {
    // MyObject 설계도에 따라 int a와 int b 메모리를 만든다.
    // 그리고 그 메모리(인스턴스=객체)의 주소를 ref 변수에 저장한다.
    MyObject ref = new MyObject();
    ref.a = 100;
    ref.b = 200;

    // a, b 변수가 들어 있는 인스턴스(객체=메모리)의 주소를 
    // swap()에 넘긴다. => 그래서 "call by reference"인 것이다.
    swap(ref);
    System.out.printf("main(): a=%d, b=%d\n", ref.a, ref.b);
  }
}

```

0410 실행순서 보기

0410~0461