# 컴싸 
### 참고
[게임 개발자 블로그](https://tenlie10.tistory.com/category/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D/Java)


[Wikidocs 점프투 자바](https://wikidocs.net/book/31)
#### 평가 
 -- 중간 기말 35% 35%
 -- 보고서
 -- 수업 태도 
#### 수업내용

 -- 자료구조
 -- 알고리즘
 ## 자바

레퍼런스 타입
4Gb의 메모리 핸들


## 자바쓰는 이유
* 무료
* platform free- jvm 

## 1st
* 참고
; 로 끝나는 모든 문장 --> statement
### datatype-primitive
``` java
int a = 3;
// int a; --> declaration
// a = 3; --> initialization
```
``` java
int, char... --> reserved keyword
```
정수**형**, 실수**형** 실제로 저장되는 값이 **정수, 실수**가 아님

* discrete number
	* 유한한 리소스로 유한한 숫자밖에 저장 가능
	* IEEE-754 : floating point
		- 알고리즘 개선 -- 코드 복잡해짐
		- 하드웨어 개선
### datatype-reference
주소로 4byte --> 4GB의 메모리 관리
1. array
2. ~~structure~~
3. class

#### array
동일한 datatype들을 하나의 identifier로 접근하기 위해서
배열 선언할때 메모리 변화
* 1차원
``` java
int[] a;
a = new int[70];
```

* 2차원
```java
int[][] b = new int[2][2];
```
b[0] & b[1] 은 레퍼런스이다

new --> dynamic memory allocator

#### structure
다양한 datatype을 하나의 identifier로 접근

#### class
Attribute + Method

structure + method

```java
class Student{
	String myname;
	int myAge;
	float myHeight
	float [] myScore;  // 이 요소들은 마치 배열처럼 메모리상에서 연속적ㅇ로 존재한다
}
//Student --> User defined datatype;

Student Roh = new Student(); // Roh 가 메모리에서 Student 안의 요소들을 가르킨다

```

메모리 상황

* Encapsulation ( 캡슐화 )

### operator

### 메모리 구조
jvm --> jre --> kernel  (메모리 요청 과정)

## 2nd
### class-code
``` java
public static StudentTest //class header
{
	public static void main(String[] args) // method header
	{
		int a = 2;
		System.out.println(a);
	}
}
```
System 클래스
```java
Public // 접근 제어자
Private // 외부에서 접근 불가능, 다른 public 함수를 통새 저베
Static // 정적
```
Super 클래스

### Object Class 
기본적으로 상속되는 클래스
```java
toString();
hashcode();
equals();
```
### Encapsulation  

* information hiding

### 메소드 override
메소드를 덮어 쓰는것

### . operator
자바에서 . 은 member access operator & 디렉토리 접근

## 3rd

### method
* construct
* access
	- this.
	- super.
* modify
#### 생성자
String은 생성 방법 다르게 생성 가능 --> String이 하나의 Class 이기 때문
```java
Student hong = new Student();
-->
public class Student
{
	String name;
	int myAge;
	int Height;
	public Student()
	{
		myName = "Hong Gildong";
		myAge = 17;
		myHeight = 180.2f;
	}
}
```
메모리는 어떻게 allocate 되는가
* reference
* primitive

```java
public Student(String name)
{
	myName = name;
}
```
--> 원래 name이 참조하던 주소를 myName도 참조하게 된다

Default Constructor
>만들어 주는 것이 좋다 -홍제T-

Actual & Formal Input Parameter



**Constructor Overloading**
* 같은 이름의 생성자가 존재 --> input parameter 에 의해서 구별된다

*Garbage Collector*
D-Allocation --> 쓸데없는거 메모리 삭제

### 객체 배열
```java
Student[] apcs = new Student[12];
// int[] a = new int[12]...
```
이로 인해 ```java new Student[12] ``` 에서 12 * 4 = 48 byte + ```java apcs ``` 변수 4byte

```java
for(..)
{
	apcs[i] = new Student[i];
	// 12 * 4 + 4 + (13 *2 + 4 + 4 +4)*12 byte
}
```
ex)
```java
public class Student
{
	String myName; 
	int myAge;
	int myHeight;
	float[] myScore = new float[3];
	
	public Student(String name, int age, int height)
	{
		myName = name;
		myAge = age;
		myHeight = height;
	}
}
```
메모리 allocation은?

```java
int getAge
```

## 4th
* OOP
* Overloading
* Inheritance

### java & 저장공간 & javadoc	관련..
파티션 분할..
jdk 설치 
* bin : binary의 약자
	* javac.exe , java.exe

javadoc 다운로드 --> jdk 폴더에 저장 --> 

## 5th 

* package --> java.lang java.math... 
```java
import java.lang 
import java.Math
```

*  ***.*** (Member access & Directory access)

### 연산자 우선 순위

![Image result for ìžë°” ì—°ì‚°ìž ìš°ì„  ìˆœìœ„](https://t1.daumcdn.net/cfile/tistory/997A014D5A90B9B00D)

* 괄호 	
* 단항연산자 (Unary)
* 이항연산자 (Binary)
* 삼항연산자 (Ternary)
* 관계연산자 -- with angle bracket & without angle bracket

### Java 에서의 Input

1. 메인 메서드 input 
```java
public static void main(String[] args)
// 변환하기위해서는 
Integer.parseInt()// wrapping class --> wrapping 은 encapsulation
```

[wrapper class](https://jusungpark.tistory.com/17)

2. API class 사용하기
	* chn package
3.  GUI를 통해 입력받기

* float double 

### Number를 저장하는 방법
정수 or 실수를 표현할때 컴퓨터는 리소스의 한계로 정수형 실수형이 된다

### Control Statement
* Selection
	- if
	- if - else
	- switch

* Iteration
	- for
	- for each

#### Err
* logic err
* syntax err

- throws

#### Import
[읽어봅시다](https://m.blog.naver.com/justkukaro/220777298211)

#### Javadoc package
[how to use](https://hsnote.tistory.com/entry/Javadoc-%EC%82%AC%EC%9A%A9%EB%B0%A9%EB%B2%95)

### Casting

> 서로 다른 데이터형의 연산에서..

* Explicit Casting
* Implicit Casting

### Class 상속관계
super class --> sub class

* 기능 : sub > super
* 범위 : sub < super

sub은 super로 implicit casting 가능

ex) Explicit	
```java
public class BusExam{
        public static void main(String args[]){
            Car car = new Bus();
            car.run();
            car.ppangppang(); // 컴파일 오류 발생
        }
    }`
-------------------------------------------------
    public class BusExam{
        public static void main(String args[]){
            Car car = new Bus();
            car.run();
            //car.ppangppang(); // 컴파일 오류 발생

            Bus bus = (Bus)car;  //부모타입을 자식타입으로 형변환 
            bus.run();
            bus.ppangppang();
        }
    }
```

ex) Implicit

```java

```	

[형변환 예시들](https://itmining.tistory.com/23)

### Final
* 오류의 가능성을 줄여준다
* 대문자를 사용한다
* underbar 사용

### 실수 Err
실수형을 == 으로 비교하면 err 가 발생할 수 있다

실수 a --> a를 많이 연산시킴 --> 원래 a랑 비교할때 같지 않을 수 있다

## 5th
### Operator
#### logical operator
* short-circuit evaluation
	* && 연산자 --> 앞부분이 false라면 뒤는 확인 하지 않는다
#### Assignment Operator
* 산술 연산자와 합쳐져 사용될 수 있다
#### Increment & Decrement Operator
* 앞인지 뒤인지에 따라서 달라짐

### Operator Priority
![Image result for ìžë°” ì—°ì‚°ìž ìš°ì„  ìˆœìœ„](https://t1.daumcdn.net/cfile/tistory/997A014D5A90B9B00D)

### Input & Output
* API Documentation

### Overloading

* Operator overloading
	- + : 문자열 & 연산...
	```java
	int a = 1;
	int b = 2;
	System.out.println("~"+a); //1
	System.out.println("~"+a+b); //12
	System.out.println("~"+(a+b)); //3
	```

### Escape Sequence
```java
\n : 개행(줄바꿈). 스크린 커서 위치를 다음줄의 처음으로 옮기, 아스키코드 : 10

\t : 수평탭. 스크린 커서를 다음 탭으로 옮김

\r : 캐리지리턴. 스크린커서의 위치를 현재 줄의 처음으로 옮긴다. 개행하지 않는다.

이 기호 다음에 오는 문자를 덮어 쒸운다. 아스키코드 : 13

\\ : 역슬래시 문자를 출력할때 사용.

\" : 큰 따옴표를 출력할때 사용

\' : 작은 따옴표를 출력할때 사용

\b : 백스페이스

\u : 유니코드 문자
```

### Selection Statement
* if
* switch - case
```java
switch (a){
case 1: ~~ ;
	break;
case 2: ~~ ;
	break;
case 3: ~~ ;
	break;
default: ~~;
	break;	
}
```

### Loop
* while
```java
while(조건)
{
	~~~~~; // 조건이 참일때 실행된다
}
```
 * do - while
```java
do{
	~~~~~: // 일단 한번 실행하고 조건을 후에 확인한다
}while(조건)
```
* for
```java
for(초기화식;조건식;증감식)
{
	
}
```
* for-each

 for each라는 키워드가 있는 것이 아니다..

평범한 for문은 다음과 같고
```java
String[] numbers = {"one", "two", "three"};
for(int i=0; i<numbers.length; i++) 
{ 
	System.out.println(numbers[i]); 
}
```
for each 구조로는
```java
String[] numbers = {"one", "two", "three"};
for(String number: numbers) 
{ 
	System.out.println(number); 
}
```
다양한 요소 (CFC를 포함한)들을 집어 넣을 수 있다

* CFC
	- Collection
	- Framework
	- Class
* ArrayList
* LinkedList
* TreeSet
* HashSet
* TreeMap
* HashMap
#### Nested Loop (중첩 반복)
반복문의 중첩 사용

### Err & Exception
![enter image description here](http://www.nextree.co.kr/content/images/2016/09/Exception-Class.png)
* throw
* throws
* try-catch-final

#### Err
* runtime err
	
* syntax err
#### Exception
* Arithmetic
* Null-Pointer
* Array Index Out of Bound
* Index Out of Bound

## 6th
* Class : User Defined Data Type	

* Data Type
	* Primitive
	* Reference

* Method
	* 

* Variable
	* Local
		* 명시적 초기화 없으면 쓰레기 값
		* D - Allocation -- JVM ( Garbage Collector ) --> 다시 access 할 수 없을 때
	* Global
		* Attribute -- 0 or NULL 로 초기화

### Object

### Class
* Object
	* String 
	* int 
	* void

* **Casting** 
	* Up 
	* Down
```java
List<Integer>a = new ArrayList<Integer>(); // upcasting 하는 이유는 List안에 다양한거가 포함될수 있다 ex) Linked List
List<Integer>c =  new LinkedList<Integer>();

List<Integer> list = getList();
				   = a;
				 
System.out.println(a); // ArrayList의 to string 실행

writeList(a); // 하나의 writeList만 있으면 된다
writeList(c);
```
* Interface
### Method
* equals 
	* String 문자열 비교
	* Object 동일하게 (Super)
* 더 가까이 속해있는 method가 실행된다

#### Static Method
* 클래스 명으로 바로 접근 가능하다

[static method](https://dev-jangwon.github.io/java/2017/06/26/java-static/)
#### Instance Method
## 7th
[Method Overloading & Overriding](https://animal-park.tistory.com/23)
### Method Overloading

### Method Overriding

* equals --> 오버라이딩 해서 사용하는 경우가 많다 ex) String 클래스
* hashcode

### Scope
* 변수의 범위 
### D-Allocation
* JVM - Garbage Collector

[ This](https://blog.naver.com/PostView.nhn?blogId=heartflow89&logNo=220957355593&beginTime=0&jumpingVid=&from=section&redirect=Log&widgetTypeCall=true)
### This
[ This](https://blog.naver.com/PostView.nhn?blogId=heartflow89&logNo=220957355593&beginTime=0&jumpingVid=&from=section&redirect=Log&widgetTypeCall=true)
* 현재 object 를 가르키는 reserved 키워드
* Unique 하지 않을때
### Super
* 뒤에 클래스가 생략되어있다 

### Call by Value & Reference
* Primitive & Reference 

### Inheritance & Polymorphism
- interface
- abstract
- class


```java
	public class A extends B implements C,D
```
* super class
* Single Inheritance --> A < B ex) A = UAZ , B = car

* Interface : 중복 가능 
	메소드의 head 만 존재한다
	A 클래스에서 realize 해주어야 한다 --> body 를 만들어 주어야 한다

* Abstract Class --> new 로 생성 못한다 abstract 하면,, realize 해주어야 하는거임 
	```java
		List<Integer> a = new ArrayList<Integer>();
	``` 
	casting 해야한다

A <-- B
A < - C
A < - D
```java
	A a = new A();
	B b = new A(); // upcasting
	C c = new A();
```
```java
	B b = new A(); // B 에 a(int a), A 에 a(int a, int b) 메소드 있음
	b.a(); // error
	((A)b).a(0,0); // 괄호가 이렇게 치는 이유는 우선 순위 때문
```

```java
	C c = new A();// C 에 b(); A에 a(); 
	c.b();
	c.a();
```
* Interface Example
```java
C --> a(); // 이게 인터페이스
A --> a(); // realize
B --> a(); // realize

a = new A();
a.a(); // A꺼 실행

C b =new B();
b.a; // B꺼 실행
```

## 8th

> 홍제T. 책 꼼꼼히 읽어라..

* Chp.4
* Protected : 같은 패키지에서는 접근가능, 다른 패키지에서는 **자식	클래스**만이 접근 가능 
### OOP
* Inheritance (  Code reuse )
* Polymorphism
* Encapsulation
### Casting
* Implicit
* Explicit

### Is-A & Has-A relationship
[읽어보기](https://gbs1995.tistory.com/41)

###  Super 
* 

### Dynamic & Static Binding

* Dynamic binding 은 다형성( Polymorphism ) 을 사용하여 메소드를 호출할때 발생, 동적바인딩은 runtime에 성격이 결정되며 Static Binding은 컴파일시에 결정되는 것이다

* 특정한 identifier에 어떤게 allocation
* 실행때마다 다를 수 있다

[Dynamic & Static](https://fors.tistory.com/144)
[Dynamic & Static 2 ](https://www.geeksforgeeks.org/static-vs-dynamic-binding-in-java/)
[Dynamic & Static 3](https://beginnersbook.com/2013/04/java-static-dynamic-binding/)


> 책 없는데 책 이야기만 하고 계심 Memory Allocation
> 


## 9th
### Abstract Class

> 추상클래스(Abstract Class)는 인터페이스의 역할도 하면서 뭔가 구현체도 가지고 있는 자바의 돌연변이 같은 클래스이다

* 하나 이상의 추상메소드( Abstract Method ) 가지고 있는것

[Abstract Class](https://limkydev.tistory.com/188)

### Interface

* Only 추상 메소드
* 모든 메서드는 public abstract 이어야 하며, 이를 생략할 수 있다.
* 모든 멤버변수는 public static final 이어야 하며, 이를 생략할 수 있다.

### Interface vs Abstract Class
[Interface & Abstract](http://alecture.blogspot.com/2011/05/abstract-class-interface.html)
> 추상클래스는 "일반변수(가능)+일반메소드(가능)+추상메소드" 형태이고 인터페이스는 "상수+추상메소드"만 가능하고 일반변수나 일반메소드를 쓰는 것은 불가능하다.

```java
abstract class Shpae
{
	abstract void draw(); // 추상 메소드
	void hit(int x)
	{
		x=10;
	}
}

interface Shape
{
	void draw(); // abstract 생략가능 
	abstract void move(int x);
}
```
```java
class Triangle extends Shape // abstract 클래스는 extends
{
	voidd draw()
	{
		System.out.println("draw Triangle");
	}
	//cuz we dont need hit(),, we dont need to realize hit()
}

class Square implements Shape
{
	public void draw() // 전부 구현해야 하며
	{
		System.out.println("draw Square");
	}
	public void move(int y) // 접근제어자를 완화시켜 public으로 구현해준다
	{
		System.out.println("move square");
	}
}
```


## 10th

## Null
### String 메모리
[String 에 관하여](https://hoit89.tistory.com/entry/String-Stringintern-String-poolequals)
### CHN 패키지 설치
* Path ( 환경변수 )
	- java 컴파일시 현재 디렉토리에 javac가 없으면 환경변수에서 찾아본다
[생활코딩 - classpath](https://www.opentutorials.org/course/1223/5527)
* .jar ( java archive )
	- ClassPath -- 현재 디렉토리에 클래스 파일이 없으면 어디에서부터 찾기 시작하는지
* 상대 디렉토리 & 절대 디렉토리
	* [상대 & 절대 경로](https://88240.tistory.com/122)

file IO 사용하기
### Java에서 foreach
```java
String[] numbers = {"one", "two", "three"}; 
for(String number: numbers) 
{
	System.out.println(number); 
}
```
## TO DO
* Class Casting..
* H/W 2D circle & square --> sphere & cube 손으로 그려오기
	* CAD처럼
<!--stackedit_data:
eyJoaXN0b3J5IjpbMTI0OTg4MDg5OSwtMTM0OTE5ODgyNywtMT
I2MTEwMTI2NiwtMTIzODQ3MjkwNSwzMDcyOTg1MDMsLTMzODMy
ODU1OSwtMTMxMTkzNjAxOSwtMTQxODcyMTU2NSwtMTA0MTA5Mz
M4LDcxMTU5NTcwNiwtOTYxMTM2MjQ5LDIxMTM0ODk0MTcsNzM4
MDA1MDM3LDEzMTI3NTkwMzgsMTA4MzIyMTAwNiwzOTY1OTY5ND
AsLTE1OTY4MzcwMjMsLTQ3MzAxOTI4MiwxMTUwMDA4Nzk0LDMx
MDk4MDE2N119
-->