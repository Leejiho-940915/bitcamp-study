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
- boolean bool;		//true,false만가능 0또는1
유니코드 저장 변수
- char c;			//문자1글자 2byte

//해당 변수는 값을 가지고있다.

```

> 그외 모든 주소 변수 를 래퍼런스 라고 한다.(배열 레퍼런스 포함)
>
> String 도 주소 변수라고 할수있다. 데이타 타입 변수가 아니다!
>
> 값이 아니라 레퍼런스(reference)주소를 담는다고 보면 된다.

- ` reference `
  - int[] arr;
    - arr[]
      - [] 배열의 주소
      - 주소를 저장하는 변수를 ` "레퍼런스(reference)" `라 부른다
      - C언어에서는 ` "포인터(pointer)" `라 부른다