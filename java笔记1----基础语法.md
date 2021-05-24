# 第二章  Java语言开发环境搭建 

## 2.1 Java虚拟机——JVM 

JVM（Java Virtual Machine ）：Java虚拟机，简称JVM，是运行所有Java程序的假想计算机，是Java程序的 运行环境，是Java 具吸引力的特性之一。我们编写的Java代码，都运行在 JVM 之上。 

跨平台：任何软件的运行，都必须要运行在操作系统之上，而我们用Java编写的软件可以运行在任何的操作系 统上，这个特性称为Java语言的跨平台特性。该特性是由JVM实现的，我们编写的程序运行在JVM上，而JVM 运行在操作系统上。

![image-20201006142045777](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201006142045777.png)

## 2.2 JRE 和 JDK 

**JRE**  (Java Runtime Environment) ：是Java程序的运行时环境，包含 JVM 和运行时所需要的 核心类库 。

 **JDK**  (Java Development Kit)：是Java程序开发工具包，包含 JRE 和开发人员使用的工具。
我们想要运行一个已有的Java程序，那么只需安装 JRE 即可。 我们想要开发一个全新的Java程序，那么必须安装 JDK 





# 第三章 HelloWorld入门程序 

## 3.1 程序开发步骤说明 

开发环境已经搭建完毕，可以开发我们第一个Java程序了。
Java程序开发三步骤：编写、编译、运行。

![image-20201006150742191](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201006150742191.png)



## 3.2 编写Java源程序 



1. 在 d:\day01 目录下新建文本文件，完整的文件名修改为 HelloWorld.java ，其中文件名为 HelloWorld ，后 缀名必须为 .java 。 
2. 用记事本打开 使用notepad++记事本软件。
3.   在文件中键入文本并保存，代码如下

```java
public class HelloWorld {    
	public static void main(String[] args) {         				 		System.out.println("Hello World!");         
	}    
}
```

文件名必须是 HelloWorld ，保证文件名和类的名字是一致的，注意大小写。
每个字母和符号必须与示例代码一模一样。
第一个 HelloWord 源程序就编写完成了，但是这个文件是程序员编写的，JVM是看不懂的，也就不能运行，因此我 们必须将编写好的 Java源文件 编译成JVM可以看懂的 字节码文件 。





## 3.3 编译Java源文件 

在DOS命令行中，进入Java源文件的目录，使用 javac 命令进行编译。
命令：

```
javac Java源文件名.后缀名
实例：
javac HelloWorld.java
```

![image-20201006151056365](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201006151056365.png)







## 3.4 运行Java程序

在DOS命令行中，进入Java源文件的目录，使用 java 命令进行运行。
命令：

```
java 类名字
```

举例：

```
java HelloWorld
```

![image-20201006151207662](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201006151207662.png)





## 3.5 入门程序说明 

### 编译和运行是两回事 

​	编译：是指将我们编写的Java源文件翻译成JVM认识的class文件，在这个过程中， javac 编译器会检查我们 所写的程序是否有错误，有错误就会提示出来，如果没有错误就会编译成功。

​	运行：是指将 class文件 交给JVM去运行，此时JVM就会去执行我们编写的程序了。 

### 关于main方法 

​	main方法：称为主方法。写法是固定格式不可以更改。main方法是程序的入口点或起始点，无论我们编写多 少程序，JVM在运行的时候，都会从main方法这里开始执行。 





## 3.6 添加注释comment 

注释：就是对代码的解释和说明。其目的是让人们能够更加轻松地了解代码。为代码添加注释，是十分必须 要的，它不影响程序的编译和运行

Java中有单行注释和多行注释 

单行注释以     //开头 换行结束 

多行注释以      /*开头  以*/结束





## 3.7 关键字keywords 

关键字：是指在程序中，Java已经定义好的单词，具有特殊含义。 

HelloWorld案例中，出现的关键字有 public 、 class 、 static 、  void  等，这些单词已经被 Java定义好，全部都是小写字母，notepad++中颜色特殊。

 关键字比较多，不能死记硬背，学到哪里记到哪里即可。 







## 3.8 标识符 

标识符：是指在程序中，我们自己定义内容。比如类的名字、方法的名字和变量的名字等等，都是标识符。 

HelloWorld案例中，出现的标识符有类名字 HelloWorld 。

**命名规则： 硬性要求**

1.标识符可以包含 英文字母26个(区分大小写) 、 0-9数字 、 $（美元符号） 和 _（下划线） 。 

2.标识符不能以数字开头。 

3.标识符不能是关键字。 

**命名规范： 软性建议 ：**

1.类名规范：首字母大写，后面每个单词首字母大写（大驼峰式）。 

2.方法名规范： 首字母小写，后面每个单词首字母大写（小驼峰式）。 

3.变量名规范：全部小写。 



# 第四章 常量 

## 4.1 概述 

常量：是指在Java程序中固定不变的数据。



## 4.2 分类 

![image-20201006152036232](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201006152036232.png)





# 第五章 变量和数据类型 

## 5.1 变量概述 

- **变量**：常量是固定不变的数据，那么在程序中可以变化的量称为变量。
  数学中，可以使用字母代替数字运算,例如 x=1+5 或者 6=x+5。
  程序中，可以使用字母保存数字的方式进行运算，提高计算能力，可以解决更多的问题。比如x保存5，x也可 以保存6，这样x保存的数据是可以改变的，也就是我们所讲解的变量。 

Java中要求一个变量每次只能保存一个数据，必须要明确保存的数据类型。 

## 5.2 数据类型 

数据类型分类 
Java的数据类型分为两大类： 

- 基本数据类型：包括 整数 、 浮点数 、 字符 、 布尔 。 
- 引用数据类型：包括 类 、 数组 、 接口 。 



![image-20201006152306060](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201006152306060.png)





## 5.3 变量的定义 

变量定义的格式包括三个要素： 数据类型 、 变量名 、 数据值 。 

**格式** 



```java
数据类型 变量名 = 数据值;
```

**练习** 

定义所有基本数据类型的变量，代码如下：

```java
public class Variable { 
    public static void main(String[] args){             
        //定义字节型变量         
        byte b = 100;         
        System.out.println(b);         
        //定义短整型变量         
        short s = 1000;         
        System.out.println(s);         
        //定义整型变量         
        int i = 123456;         
        System.out.println(i);         
        //定义长整型变量         
        long l = 12345678900L;         
        System.out.println(l);         
        //定义单精度浮点型变量         
        float f = 5.5F;         
        System.out.println(f);        
        //定义双精度浮点型变量         
        double d = 8.5;         
        System.out.println(d);         
        //定义布尔型变量         
        boolean bool = false;        
        System.out.println(bool);         
        //定义字符型变量         
        char c = 'A';         System.out.println(c); }      }
```

## 5.4 注意事项 

变量名称：在同一个大括号范围内，变量的名字不可以相同。 变量赋值：定义的变量，不赋值不能使用。





# 第六章 数据类型转换 

Java程序中要求参与的计算的数据，必须要保证数据类型的一致性，如果数据类型不一致将发生类型的转换。 

## 注意  字符串定义不同cpp中string,是String，S大写！！







## 6.1 自动转换 

一个 int 类型变量和一个 byte 类型变量进行加法运算， 结果会是什么数据类型？

```java
int i = 1;  
byte b = 2;
```

运算结果，变量的类型将是 int 类型，这就是出现了数据类型的自动类型转换现象。 

- **自动转换**：将 取值范围小的类型 自动提升为 取值范围大的类型 。

```java
public static void main(String[] args) {     
    int i = 1;     
    byte b = 2;    
    // byte x = b + i; // 报错        
    //int类型和byte类型运算，结果是int类型     
    int j = b + i;     
    System.out.println(j); 
}
```

**转换原理图解** 
byte 类型内存占有1个字节，在和 int 类型运算时会提升为 int 类型 ，自动补充3个字节，因此计算后的结果还是 int 类 型。



![image-20201006162628216](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201006162628216.png)

同样道理，当一个 int 类型变量和一个 double 变量运算时， int 类型将会自动提升为 double 类型进行运算。

```java
public static void main(String[] args) {     
    int i = 1;     
    double d = 2.5;     
    //int类型和double类型运算，结果是double类型     
    //int类型会提升为double类型     
    double e = d+i;     
    System.out.println(e); 
}
```

**转换规则** 
范围小的类型向范围大的类型提升， byte、short、char 运算时直接提升为 int 。

```
byte、short、char‐‐>int‐‐>long‐‐>float‐‐>double
```





## 6.2 强制转换 

将 6.5 赋值到 int 类型变量会发生什么？产生编译失败，肯定无法赋值。

```java
int i = 1.5; // 错误
```

double 类型内存8个字节， int 类型内存4个字节。 1.5 是 double 类型，取值范围大于 int 。可以理解为 double 是8 升的水壶， int 是4升的水壶，不能把大水壶中的水直接放进小水壶去。 

想要赋值成功，只有通过强制类型转换，将 double 类型强制转换成 int 类型才能赋值。

- **强制类型转换：**将 取值范围大的类型 强制转换成 取值范围小的类型 。

比较而言，自动转换是Java自动执行的，而强制转换需要我们自己手动执行。

**转换格式：**

```
数据类型 变量名 = （数据类型）被转数据值；
```

将 1.5 赋值到 int 类型，代码修改为：

```java
// double类型数据强制转成int类型，直接去掉小数点。 
int i = (int)1.5;
```

同样道理，当一个 short 类型与 1 相加，我们知道会类型提升，但是还想给结果赋值给short类型变量，就需要强制转换。

```java
public static void main(String[] args) {      
    //short类型变量，内存中2个字节      
    short s = 1;      
    /*        出现编译失败        
    s和1做运算的时候，1是int类型，s会被提升为int类型        
    s+1后的结果是int类型，将结果在赋值会short类型时发生错误        
    short内存2个字节，int类型4个字节        
    必须将int强制转成short才能完成赋值      
    */      
    s = s + 1；//编译失败      
    s = (short)(s+1);//编译成功 
}
```

转换原理图解 
![image-20201006163203004](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201006163203004.png)

**强烈注意** 

- 浮点转成整数，直接取消小数点，可能造成数据损失精度。
-  int 强制转成 short 砍掉2个字节，可能造成数据丢失

```java
// 定义s为short范围内最大值 
short s = 32767; 
// 运算后，强制转换，砍掉2个字节后会出现不确定的结果 
s = (short)(s + 10);
```

**注意**

byte/short/char这三种类型在运算的时候，都会首先提升为int类型，然后再计算

```java
byte num4 = 40;
byte num5 = 50;
// byte + byte = int + int -->
byte result1 = num4 + num5 //报错
int result2 = num4 + num5 //正确
```

**boolean类型不能发生数据类型转换！！！！（和cpp不同）**

## 6.3 ASCII编码表

```java
public static void main(String[] args) {   //字符类型变量   
    char c = 'a';   
    int i = 1;   
    //字符类型和int类型计算   
    System.out.println(c+i);
    //输出结果是98 
}
```

在计算机的内部都是二进制的0、1数据，如何让计算机可以直接识别人类文字的问题呢？就产生出了编码表的概念。 

- 编码表 ：就是将人类的文字和一个十进制数进行对应起来组成一张表格。

人们就规定

![image-20201006163416114](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201006163416114.png)





# 第七章 运算符 

## 7.1 算数运算符 

![image-20201006163454001](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201006163454001.png)

Java中，整数使用以上运算符，无论怎么计算，也不会得到小数。

```java
public static void main(String[] args) {    
    int i = 1234;       
    System.out.println(i/1000*1000);
    //计算结果是1000    
}
```

**注意**  一旦运算当中有不同类型的数据，那么结果将会十数据类型范围大的那种

```java
//int + double --> double +double -->double
int x = 10;
double result = x + 2.5;
System.out.println(result); //12.5
```





**字符串**  

- 对字符串String(首字母大写，并不是关键字)来说，加号代表字符串连接操作
- 任何数据类型和字符串进行连接的时候，结果都会编程字符串

```java
String str1 = "hello";
System.out.println(str1);

System.out.println("hello"+"world"); //helloworld

String str2 = "java";
System.out.println(str2+20);//java20
//string+int+int
System.out.println(str2+20+30);//java2030
System.out.println(str2+(20+30);//java50
```

### **注意** c++中string类型不可与其他类型加减

```cpp
    string str1 = "hello";
    cout<<str1<<endl;
    string str2 = "hzy";
    cout << str2 << endl;
    cout << str1 + str2 << endl;

 //   cout << str1 + 20 << endl; “std::string”不定义该运算符或到预定义运算符可接收的类型的转换	

    return 0;
```



- ++ 运算，变量自己增长1。反之， -- 运算，变量自己减少1，用法与 ++ 一致。
- [ ] ​	 独立运算： 

1. ​			变量在独立运算时， 前++ 和 后++ 没有区别 。 
2. ​			变量 前++   ：例如 ++i 。
3.  			变量 后++   ：例如 i++.
   - [ ] ​    混合运算： 

1. 和其他变量放在一起， 前++ 和 后++ 就产生了不同。 
2. 变量 前++ ：变量a自己加1，将加1后的结果赋值给b，也就是说a先计算。a和b的结果都是2。

```java
public static void main(String[] args) {     
    int a = 1;     
    int b = ++a;     
    System.out.println(a);
    //计算结果是2     
    System.out.println(b);
    //计算结果是2 
}
```

​    3.变量 后++ ：变量a先把自己的值1，赋值给变量b，此时变量b的值就是1，变量a自己再加1。a的结果是2，b 的结果是1

```java
public static void main(String[] args) {     
    int a = 1;     
    int b = a++;     
    System.out.println(a);//计算结果是2     
    System.out.println(b);//计算结果是1 
}
```

+ 符号在字符串中的操作： 
  + 符号在遇到字符串的时候，表示连接、拼接的含义。
  + "a"+"b"的结果是“ab”，连接含义



```java
public static void main(String[] args){   
    System.out.println("5+5="+5+5);
    //输出5+5=55     }
```





## 7.2 赋值运算符

![image-20201006164118472](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201006164118472.png)

```java
public static void main(String[] args){     
    int i = 5;     
    i+=5;//计算方式 i=i+5 变量i先加5，再赋值变量i     
    System.out.println(i); //输出结果是10  
}
```



## 7.3 比较运算符

![image-20201006164233360](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201006164233360.png)

```java
public static void main(String[] args) {     System.out.println(1==1);//true     
    System.out.println(1<2);//true     
    System.out.println(3>4);//false    
    System.out.println(3<=4);//true    
    System.out.println(3>=4);//false   
    System.out.println(3!=4);//true 
}
```





## 7.4 逻辑运算符

![image-20201006164351753](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201006164351753.png)

```java
public static void main(String[] args)  {     System.out.println(true && true);//true
    System.out.println(true && false);//false
	System.out.println(false && true);//false，右边不计算   
	System.out.println(false || false);//falase    
	System.out.println(false || true);//true    
	System.out.println(true || false);//true，右边不计算        
	System.out.println(!false);//true 
                                        }
```

### **注意** 与cpp不同  java中 逻辑符号就是true和false

- 不可与其他类型（如int）加减

**注意**  && || 由短路效果，例如&&前面flase，后面就不执行了

```java
int a = 1;
System.out.println(2>1&&a++>3);
```



## 7.5 三元运算符

- 三元运算符格式

  ```java
  数据类型 变量名 = 布尔类型表达式？结果1：结果2
  ```

  

- 三元运算符计算方式： 

  布尔类型表达式结果是true，三元运算符整体结果为结果1，赋值给变量。 

  布尔类型表达式结果是false，三元运算符整体结果为结果2，赋值给变量

```java
public static void main(String[] args) {     
	int i = (1==2 ? 100 : 200);     
	System.out.println(i);//200     
	int j = (3<=4 ? 500 : 600);     
	System.out.println(j);//500 
}
```





# 第八章 方法入门 

## 8.1 概述 

我们在学习运算符的时候，都为每个运算符单独的创建一个新的类和main方法，我们会发现这样编写代码非常的繁琐，而且 重复的代码过多。能否避免这些重复的代码呢，就需要使用方法来实现。

- **方法**：就是将一个功能抽取出来，把代码单独定义在一个大括号内，形成一个单独的功能。

当我们需要这个功能的时候，就可以去调用。这样即实现了代码的复用性，也解决了代码冗余的现象



## 8.2 方法的定义 

定义格式：

```java
修饰符 返回值类型 方法名 （参数列表）｛      
	代码...              
	return ;       
｝

```

定义格式解释： 

- 修饰符： 目前固定写法 public static 。
- 返回值类型： 目前固定写法 void ，其他返回值类型在后面的课程讲解。 
- 方法名：为我们定义的方法起名，满足标识符的规范，用来调用方法。 
- 参数列表： 目前无参数， 带有参数的方法在后面的课程讲解。
-  return：方法结束。因为返回值类型是void，方法大括号内的return可以不写。 

例子：

```java
public static void methodName() {    
    System.out.println("这是一个方法");    
}
```

### 注意：和cpp不同，方法不能嵌套方法



## 8.3 方法的调用 

方法在定义完毕后，方法不会自己运行，必须被调用才能执行，我们可以在主方法main中来调用我们自己定义好的方法。在 主方法中，直接写要调用的方法名字就可以调用了。

```java
public static void main(String[] args) {     
    //调用定义的方法method     
    method(); 
} 
/定义方法，被main方法调用 
    public static void method() {    
    System.out.println("自己定义的方法，需要被main调用运行");    
}
```

## 8.4 调用练习 

将三元运算符代码抽取到自定义的方法中，并调用。

![image-20201006165153276](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201006165153276.png)





## 8.5 注意事项 

方法定义注意事项： 

- ​	方法必须定义在一类中方法外 
- ​	方法不能定义在另一个方法的里面

![image-20201006165258184](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201006165258184.png)





# 第九章 JShell脚本工具 

**JShell脚本工具是JDK9的新特性** 

什么时候会用到 JShell 工具呢，当我们编写的代码非常少的时候，而又不愿意编写类，main方法，也不愿意去编译和运 行，这个时候可以使用JShell工具。

启动JShell工具，在DOS命令行直接输入JShell命令

![image-20201006165339417](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201006165339417.png)

接下来可以编写Java代码，无需写类和方法，直接写方法中的代码即可，同时无需编译和运行，直接回车即可

![image-20201006165354176](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201006165354176.png)

![image-20201006165403357](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201006165403357.png)





# 第十章 扩展知识点

## 10.1 +=符号的扩展 

下面的程序有问题吗？

![image-20201006165447079](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201006165447079.png)





## 5.2 常量和变量的运算 

下面的程序有问题吗？

![image-20201006165507543](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201006165507543.png)

![image-20201006165516211](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201006165516211.png)

![image-20201008151648263](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201008151648263.png)







# 第十一章 流程控制 

## 11.1 概述 

在一个程序执行的过程中，各条语句的执行顺序对程序的结果是有直接影响的。也就是说，程序的流程对运行结果 有直接的影响。所以，我们必须清楚每条语句的执行流程。而且，很多时候我们要通过控制语句的执行顺序来实现 我们要完成的功能。 



## 11.2 顺序结构 

```java
public static void main(String[] args){     
    //顺序执行，根据编写的顺序，从上到下运行     
    System.out.println(1);     
    System.out.println(2);     
    System.out.println(3); }
```







## 12.1 判断语句1--if 

- if语句第一种格式： if

```java
if(关系表达式)｛
	语句体;    
}
```

![image-20201008152124581](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201008152124581.png)

### 12.2 判断语句2--if...else 

- if语句第二种格式： if...else

```java
if(关系表达式) {     
    语句体1;    
}else {    
    语句体2;    
}
```

![image-20201008152229109](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201008152229109.png)

### 12.3 判断语句3--if..else if...else 

if语句第三种格式： if...else if ...else

![image-20201008152259978](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201008152259978.png)



### 12.4 if语句和三元运算符的互换 

在某些简单的应用中，if语句是可以和三元运算符互换使用的。

```java
public static void main(String[] args) {     
    int a = 10;     
    int b = 20;     
    //定义变量，保存a和b的较大值     
    int c;     
    if(a > b) {        
        c = a;        
    } else {        
        c = b;        
    }     
    //可以上述功能改写为三元运算符形式     
    c = a > b ? a:b; 
}
```

## 13.1 选择语句--switch 

switch语句格式：

![image-20201008152510986](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201008152510986.png)

![image-20201008152527250](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201008152527250.png)

### 3.2 case的穿透性 

在switch语句中，如果case的后面不写break，将出现穿透现象，也就是不会在判断下一个case的值，直接向后运 行，直到遇到break，或者整体switch结束。

![image-20201008152608943](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201008152608943.png)

## 14.1 循环概述 

循环语句可以在满足循环条件的情况下，反复执行某一段代码，这段被重复执行的代码被称为循环体语句，当反复 执行这个循环体时，需要在合适的时候把循环判断条件修改为false，从而结束循环，否则循环将一直执行下去，形 成死循环

### 14.2 循环语句1--for 

![image-20201008152703658](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201008152703658.png)

![image-20201008152711955](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201008152711955.png)

### 14.3 循环语句2--while 

![image-20201008152749238](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201008152749238.png)







### 14.4 循环语句3--do...while 

![image-20201008152759088](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201008152759088.png)





### 14.5 循环语句的区别 

![image-20201008152849813](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201008152849813.png)





### 14.6  跳出语句 

**break** 
使用场景：终止switch或者循环 

- ​	在选择结构switch语句中 
- ​	在循环语句中 
- ​	离开使用场景的存在是没有意义的

![image-20201008152940283](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201008152940283.png)





# IDEA常用快捷键

![image-20201008173736790](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201008173736790.png)

![image-20201009144501830](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009144501830.png)

# 第十二章 方法 

## 12.1 回顾--方法的定义和调用 

前面的课程中，使用过嵌套循环输出矩形，控制台打印出矩形就可以了，因此将方法定义为 void ，没有返回值。 在主方法 main 中直接被调用。

![image-20201009145913528](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009145913528.png)



## 12.2 定义方法的格式详解 

![image-20201009145938300](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009145938300.png)





## 12.3 定义方法的两个明确

![image-20201009150003674](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009150003674.png)





## 12.4 调用方法的流程图解 

![image-20201009150025430](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009150025430.png)

## 12.4 方法重载（overload）

- **方法重载**：指在同一个类中，允许存在一个以上的同名方法，只要它们的参数列表不同即可，与修饰符和返回值类型无关。 
- 参数列表：个数不同，数据类型不同，顺序不同。 
- 重载方法调用：JVM通过方法的参数列表，调用不同的方法。

![image-20201009153443519](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009153443519.png)

# 第十三章 数组定义和访问 

## 13.1 容器概述 案例分析 

现在需要统计某公司员工的工资情况，例如计算平均工资、找到最高工资等。假设该公司有50名员工，用前面所学 的知识，程序首先需要声明50个变量来分别记住每位员工的工资，然后在进行操作，这样做会显得很麻烦，而且错 误率也会很高。因此我们可以使用容器进行操作。将所有的数据全部存储到一个容器中，统一操作。 

**容器概念** 

- 容器：是将多个数据存储到一起，每个数据称为该容器的元素。
- 生活中的容器：水杯，衣柜，教室



## 13.2 数组概念 

数组概念： 数组就是存储数据长度固定的容器，保证多个数据的数据类型要一致。 





## 13.3 数组的定义 

**方式一** 

格式：

```java
 数组存储的数据类型[] 数组名字 = new 数组存储的数据类型[长度];
```

![image-20201009162707089](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009162707089.png)

**方式二** 
格式：

![image-20201009162724298](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009162724298.png)

**方式三** 

格式：

![image-20201009162748403](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009162748403.png)





13.4 数组的访问 

![image-20201009162809463](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009162809463.png)

![image-20201009162819918](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009162819918.png)





# 第十四章 数组原理内存图 



## 14.1 内存概述 

内存是计算机中的重要原件，临时存储区域，作用是运行程序。我们编写的程序是存放在硬盘中的，在硬盘中的程 序是不会运行的，必须放进内存中才能运行，运行完毕后会清空内存。
Java虚拟机要运行程序，必须要对内存进行空间的分配和管理。





## 14.2 Java虚拟机的内存划分 

为了提高运算效率，就对空间进行了不同区域的划分，因为每一片区域都有特定的处理数据方式和内存管理方式。

![image-20201009162917267](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009162917267.png)



![image-20201009175839343](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009175839343.png)

#### cpp中（方法区类似cpp中代码区）

{这就证明了一个对象所占的空间大小只取决于该对象中数据成员所占的空间，而与成员函数无关。

函数代码是存储在对象空间之外的。如果对同一个类定义了10个对象，这些对象的成员函数对应的是同一个函数代码段，而不是10个不同的函数代码段。需要注意的是： 虽然调用不同对象的成员函数时都是执行同一段函数代码，但是执行结果一般是不相同的。

不同的对象使用的是同一个函数代码段，它怎么能够分别对不同对象中的数据进行操作呢？
原来C++为此专门设立了一个名为this的指针，用来指向不同的对象。需要说明： 
不论成员函数在类内定义还是在类外定义，成员函数的代码段都用同一种方式存储。
不要将成员函数的这种存储方式和inline(内置)函数的概念混淆。
应当说明： 常说的“某某对象的成员函数”，是从逻辑的角度而言的，而成员函数的存储方式，是从物理的角度而言的，二者是不矛盾的。}

C++程序的内存格局通常分为四个区：全局数据区(data area)，代码区(code area)，栈区(stack area)，堆区(heap area)(即自由存储区)。全局数据区存放全局变量，静态数据和常量；所有类成员函数和非成员函数代码存放在代码区；为运行函数而分配的局部变量、函数参数、返回数据、返回地址等存放在栈区；余下的空间都被称为堆区。根据这个解释，我们可以得知在类的定义时，类成员函数是被放在代码区，而类的静态成员变量在类定义时就已经在全局数据区分配了内存，因而它是属于类的。对于非静态成员变量，我们是在类的实例化过程中(构造对象)才在栈区或者堆区为其分配内存，是为每个对象生成一个拷贝，所以它是属于对象的。

## 14.3 数组在内存中的存储 

一个数组内存图 



![image-20201009162938499](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009162938499.png)

![image-20201009162945220](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009162945220.png)



![image-20201009182228028](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009182228028.png)

![image-20201009163008108](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009163008108.png)

![image-20201009163015572](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009163015572.png)







# 第十五章 数组的常见操作 

## 15.1 数组越界异常 

观察一下代码，运行后会出现什么结果。

![image-20201009163101787](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009163101787.png)





## 15.2 数组空指针异常 

观察一下代码，运行后会出现什么结果。

![image-20201009163122852](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009163122852.png)

![image-20201009163129332](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009163129332.png)





## 15.3 数组长度遍历【重点】 





数组长度

![image-20201009183111435](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009183111435.png)

![image-20201009183124142](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009183124142.png)









数组遍历： 就是将数组中的每个元素分别获取出来，就是遍历。遍历也是数组操作中的基石。

快捷键（arr.fori）数组名称.fori



## 15.4 数组获取最大值元素

![image-20201009163441941](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009163441941.png)

![image-20201009163449407](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009163449407.png)





## 15.5 数组反转 

![image-20201009163515068](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009163515068.png)

![image-20201009163524732](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009163524732.png)





# 第十六章  数组作为方法参数和返回值 

## 16.1 数组作为方法参数 

以前的方法中我们学习了方法的参数和返回值，但是使用的都是基本数据类型。那么作为引用类型的数组能否作为 方法的参数进行传递呢，当然是可以的。

- 数组作为方法参数传递，传递的参数是数组内存的地址。

![image-20201009163623491](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009163623491.png)

![image-20201009163631348](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009163631348.png)

## 16.2 数组作为方法返回值 

数组作为方法的返回值，返回的是数组的内存地址

![image-20201009163653945](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009163653945.png)

![image-20201009163700363](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009163700363.png)

![image-20201009163705919](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009163705919.png)

## 16.3 方法的参数类型区别 

代码分析 

1. 分析下列程序代码，计算输出结果。

![image-20201009163726019](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009163726019.png)

![image-20201009163733477](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201009163733477.png)

**总结:** 

方法的参数为基本类型时,传递的是数据值. 方法的参数为引用类型时,传递的是地址值.