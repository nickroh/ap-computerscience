# 컴싸 
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
switch 
```
	 
<!--stackedit_data:
eyJoaXN0b3J5IjpbLTE2MTI5OTQwOSwxNzM2NzY4MDUyXX0=
-->