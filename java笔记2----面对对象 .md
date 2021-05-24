

# 第1章 面向对象思想 

## 1.1 面向对象思想概述 

**概述** 
Java语言是一种面向对象的程序设计语言，而面向对象思想是一种程序设计思想，我们在面向对象思想的指引下， 使用Java语言去设计、开发计算机程序。 这里的对象泛指现实中一切事物，每种事物都具备自己的属性和行为。面 向对象思想就是在计算机程序设计过程中，参照现实中事物，将事物的属性特征、行为特征抽象出来，描述成计算 机事件的设计思想。 它区别于面向过程思想，强调的是通过调用对象的行为来实现功能，而不是自己一步一步的去 操作实现。



**举例** 
洗衣服: 

- 面向过程：把衣服脱下来-->找一个盆-->放点洗衣粉-->加点水-->浸泡10分钟-->揉一揉-->清洗衣服-->拧干-->晾 起来 
- 面向对象：把衣服脱下来-->打开全自动洗衣机-->扔衣服-->按钮-->晾起来



**区别:**

- 面向过程：强调步骤。
- 面向对象：强调对象，这里的对象就是洗衣机



**特点** 
面向对象思想是一种更符合我们思考习惯的思想，它可以将复杂的事情简单化，并将我们从执行者变成了指挥者。 面向对象的语言中，包含了三大基本特征，即封装、继承和多态。 



## 1.2 类和对象 

环顾周围，你会发现很多对象，比如桌子，椅子，同学，老师等。桌椅属于办公用品，师生都是人类。那么什么是 类呢？什么是对象呢

**什么是类** 
类：是一组相关属性和行为的集合。可以看成是一类事物的模板，使用事物的属性特征和行为特征来描述该 类事物。

现实中，描述一类事物：

- 属性：就是该事物的状态信息。 
- 行为：就是该事物能够做什么。



举例：小猫。

 属性：名字、体重、年龄、颜色。   行为：走、跑、叫。

 

**什么是对象** 

**对象**：是一类事物的具体体现。对象是类的一个实例（对象并不是找个女朋友），必然具备该类事物的属性 和行为。

现实中，一类事物的一个实例：一只小猫。

举例：一只小猫。

 属性：tom、5kg、2 years、yellow。   行为：溜墙根走、蹦跶的跑、喵喵叫。 



类与对象的关系 

- 类是对一类事物的描述，是抽象的。 
- 对象是一类事物的实例，是具体的。 
- 类是对象的模板，对象是类的实体。



## 1.3 类的定义 

**事物与类的对比** 
现实世界的一类事物：

![image-20201010152503552](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010152503552.png)

![image-20201010152532936](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010152532936.png)





## 1.4 对象的使用 

对象的使用格式 

![image-20201010152604554](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010152604554.png)

![image-20201010152617248](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010152617248.png)



## 1.5 类与对象的练习 

定义手机类：

![image-20201010152719602](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010152719602.png)

![image-20201010152729849](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010152729849.png)





## 1.6 对象内存图 









例子

![image-20201010164804941](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010164804941.png)





两个对象

![image-20201010170221588](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010170221588.png)





类作为返回值

![image-20201010180647222](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010180647222.png)



**一个对象，调用一个方法内存图** 

![image-20201010152800505](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010152800505.png)





**两个对象，调用同一方法内存图** 

![image-20201010152827880](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010152827880.png)





**一个引用，作为参数传递到方法中内存图** 

![image-20201010152847472](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010152847472.png)





## 1.7 成员变量和局部变量区别 

![image-20201010181531613](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010181531613.png)



变量根据定义位置的不同，我们给变量起了不同的名字。如下图所示：

![image-20201010152906911](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010152906911.png)



![image-20201010152916081](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010152916081.png)





## 1.8 static修饰

**1.static修饰成员方法**

 

​    static修饰的方法一般称作静态方法，由于静态方法不依赖于任何对象就可以进行访问，因此对于静态方法来说，是没有this的，因为它不依附于任何对象，既然都没有对象，就谈不上this了。并且由于这个特性，在静态方法中不能访问类的非静态成员变量和非静态成员方法，因为非静态成员方法/变量都必须依赖具体的对象才能够被调用。





**2.static修饰成员变量**

 

​    static修饰的变量也称为静态变量，静态变量和非静态变量的区别是：静态变量被所有对象共享，在内存中只有一个副本，它当且仅当在类初次加载时会被初始化。而非静态变量是对象所拥有的，在创建对象的时候被初始化，存在多个副本，各个对象拥有的副本互不影响。

 

​    static成员变量的初始化顺序按照定义的顺序进行初始化。

 

3. **static修饰代码块**

​    static关键字还有一个比较重要的作用就是用来形成静态代码块以优化程序性能。static块可以置于类中的任何地方，类中可以有多个static块。在类初次被加载的时候，会按照static块的顺序来依次执行每个static块，并且只会执行一次。

​    static块可以优化程序性能，是因为它的特性：只会在类被初次加载的时候执行一次。如下：



# 第2章 封装 

## 2.1 封装概述 

**概述** 

面向对象编程语言是对客观世界的模拟，客观世界里成员变量都是隐藏在对象内部的，外界无法直接操作和修改。 封装可以被认为是一个保护屏障，防止该类的代码和数据被其他类随意访问。要访问该类的数据，必须通过指定的 方式。适当的封装可以让代码更容易理解与维护，也加强了代码的安全性。 

**原则** 

将属性隐藏起来，若需要访问某个属性，提供公共方法对其访问。





## 2.2 封装的步骤 

1. 使用 private 关键字来修饰成员变量。 
2. 对需要访问的成员变量，提供对应的一对 getXxx 方法 、 setXxx 方法。



## 2.3 封装的操作——private关键字 

private的含义 

1. private是一个权限修饰符，代表最小权限。
2. 可以修饰成员变量和成员方法。 
3. 被private修饰后的成员变量和成员方法，只在本类中才能访问。 

![image-20201010153125524](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010153125524.png)





## 2.4 封装优化1——this关键字

![image-20201010153201425](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010153201425.png)

![image-20201010153212738](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010153212738.png)

小贴士：方法中只有一个变量名时，默认也是使用 this 修饰，可以省略不写。 



## 2.5 封装优化2——构造方法 

当一个对象被创建时候，构造方法用来初始化该对象，给对象的成员变量赋初始值。

小贴士：无论你与否自定义构造方法，所有的类都有构造方法，因为Java自动提供了一个无参数构造方法， 一旦自己定义了构造方法，Java自动提供的默认无参数构造方法就会失效。 

![image-20201010153305225](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010153305225.png)



![image-20201011130653554](D:\java学习\java笔记\image-20201011130653554.png)





## 2.6 标准代码——JavaBean 

JavaBean 是 Java语言编写类的一种标准规范。符合 JavaBean 的类，要求类必须是具体的和公共的，并且具有无 参数的构造方法，提供用来操作成员变量的 set 和 get 方法。

![image-20201010153330423](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010153330423.png)

![image-20201010153343097](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010153343097.png)

![image-20201010153418439](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010153418439.png)

![image-20201010153428967](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010153428967.png)











# 第3章 API 

**概述** 

API(Application Programming Interface)，应用程序编程接口。Java API是一本程序员的字典 ，是JDK中提供给 我们使用的类的说明文档。这些类将底层的代码实现封装了起来，我们不需要关心这些类是如何实现的，只需要学 习这些类如何使用即可。所以我们可以通过查询API的方式，来学习Java提供的类，并得知如何使用它们





API使用步骤 

1. 打开帮助文档。
2. 点击显示，找到索引，看到输入框。 
3. 你要找谁？在输入框里输入，然后回车。
4. 看包。java.lang下的类不需要导包，其他需要。
5. 看类的解释和说明。 
6. 学习构造方法。

7. 使用成员方法。













# 第4章 Scanner类 

了解了API的使用方式，我们通过Scanner类，熟悉一下查询API，并使用类的步骤。 

## 4.1 什么是Scanner类 

一个可以解析基本类型和字符串的简单文本扫描器。 例如，以下代码使用户能够从 System.in 中读取一个数：

![image-20201010190122015](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010190122015.png)





## 4.2 引用类型使用步骤 

**导包** 
使用import关键字导包，在类的所有代码之前导包，引入要使用的类型，java.lang包下的所有类无需导入。 格式：

![image-20201010190158062](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010190158062.png)

![image-20201010190214195](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010190214195.png)



![image-20201011135637245](D:\java学习\java笔记\image-20201011135637245.png)





## 4.3 Scanner使用步骤 

![image-20201010190233469](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010190233469.png)





## 4.4 匿名对象【了解】 

**概念** 
创建对象时，只有创建对象的语句，却没有把对象地址值赋值给某个变量。虽然是创建对象的简化写法，但是应用 场景非常有限。



![](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010190310610.png)

![image-20201010190336905](D:\java学习\java笔记\image-20201011141457714.png)

![image-20201011141543834](D:\java学习\java笔记\image-20201011141543834.png)







![image-20201010190345932](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010190345932.png)

![image-20201010190359323](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010190359323.png)





# 第5章 Random类 

## 5.1 什么是Random类 

![image-20201010190456026](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010190456026.png)

## 5.2 Random使用步骤 

![image-20201010190522316](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010190522316.png)

## 3.3 练习 

**获取随机数** 

获取1-n之间的随机数，包含n，代码如下：

![image-20201010190611603](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010190611603.png)

**猜数字小游戏** 
游戏开始时，会随机生成一个1-100之间的整数 number 。玩家猜测一个数字 guessNumber ，会与 number 作比 较，系统提示大了或者小了，直到玩家猜中，游戏结束。 

![image-20201010190629989](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010190629989.png)





# 第6章 ArrayList类 

## 6.1 引入——对象数组 



到目前为止，我们想存储对象数据，选择的容器，只有对象数组。而数组的长度是固定的，无法适应数据变化的需 求。为了解决这个问题，Java提供了另一个容器 java.util.ArrayList 集合类,让我们可以更便捷的存储和操作对 象数据。 



```java
Person[] array = new Person[3];
```

以上不可扩展！！！

## 6.2 什么是ArrayList类

java.util.ArrayList 是大小可变的数组的实现，存储在内的数据称为元素。此类提供一些方法来操作内部存储 的元素。 ArrayList 中可不断添加元素，其大小也自动增长





## 6.3 ArrayList使用步骤 

![image-20201010190852742](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010190852742.png)

![image-20201010190917037](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010190917037.png)

![image-20201010190924522](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010190924522.png)





## 6.4 常用方法和遍历

对于元素的操作,基本体现在——增、删、查。常用的方法有： 

- public boolean add(E e) ：将指定的元素添加到此集合的尾部。 
- public E remove(int index) ：移除此集合中指定位置上的元素。返回被删除的元素。  
- public E get(int index) ：返回此集合中指定位置上的元素。返回获取的元素。
- public int size() ：返回此集合中的元素数。遍历集合时，可以控制索引范围，防止越界。 

这些都是基本的方法，操作非常简单，代码如下:

![image-20201010191129598](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010191129598.png)





## 6.5 如何存储基本数据类型 

ArrayList对象不能存储基本类型，只能存储引用类型的数据。**类似 <int> 不能写**，（因为基本数据类型无地址值）但是存储基本数据类型对应的包装类型是可以的。所以，想要存储基本类型数据， <> 中的数据类型，必须转换后才能编写，转换写法如下：

![image-20201010191242259](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010191242259.png)

![image-20201010191250275](C:\Users\HZY\AppData\Roaming\Typora\typora-user-images\image-20201010191250275.png)





# 第6章 String类 

## 6.1 String类概述 

**概述** 

java.lang.String 类代表字符串。Java程序中所有的字符串文字（例如 "abc" ）都可以被看作是实现此类的实 例。

类 String 中包括用于检查各个字符串的方法，比如用于比较字符串，搜索字符串，提取子字符串以及创建具有翻 译为大写或小写的所有字符的字符串的副本





特点 

1. 字符串不变：字符串的值在创建后不能被更改。

![image-20201012160641416](D:\java学习\image-20201012160641416.png)





## 6.2 使用步骤 

![image-20201012160702280](D:\java学习\image-20201012160702280.png)





## 6.3 常用方法 

判断功能的方法 

- **对于基本类型来说，==是进行数值的比较**
- **对于引用类型来说，==是进行【地址值】的比较**

![image-20201012163527135](D:\java学习\java笔记图片\image-20201012163527135.png)

![image-20201012164328734](D:\java学习\java笔记图片\image-20201012164328734.png)





方法

### **【注意】** 对于引用数据类型，==是比较地址，所以对于字符串类型，需要.equals

【注意】 推荐“abc”.equals(str)        不推荐: str.equals("abc")  （可能空指针 ）

![image-20201012165102746](D:\java学习\java笔记图片\image-20201012165102746.png)



### 1.equals

### 2.equalsIgnoreCase





![image-20201012164454045](D:\java学习\java笔记图片\image-20201012164454045.png)





### 3.length()

### 4.concat()

### 5.charAt()

### 6.indexOf()

### 7substring()



![image-20201012161349112](D:\java学习\java笔记图片\image-20201012161349112.png)

![image-20201012161356870](D:\java学习\java笔记图片\image-20201012161356870.png)

### 8.toCharArray ()

### 9.getBytes ()

### 10.replace()

转换功能的方法 

- public char[] toCharArray () ：将此字符串转换为新的字符数组。 
- public byte[] getBytes () ：使用平台的默认字符集将该 String编码转换为新的字节数组。 
- public String replace (CharSequence target, CharSequence replacement) ：将与target匹配的字符串使 

用replacement字符串替换。
方法演示，代码如下：

![image-20201012161439245](D:\java学习\java笔记图片\image-20201012161439245.png)

![image-20201012161448302](D:\java学习\java笔记图片\image-20201012161448302.png)





### 11.split

[**注意**]

split按照“.”切分，要改为“ \\JJJKKI,KK.”

![image-20201012172302888](D:\java学习\java笔记图片\image-20201012172302888.png)

![image-20201012161456814](D:\java学习\java笔记图片\image-20201012161456814.png)





## 6.4String遍历方法

遍历字符串，获取每一个字符

1、String类的方法toCharArray，把字符串转换为一个字符数组，遍历数组

2、String类的方法length()+charAt(索引)

## 6.5 String类的练习 

拼接字符串 
定义一个方法，把数组{1,2,3}按照指定个格式拼接成一个字符串。格式参照如下：[word1#word2#word3]。

![image-20201012161523009](D:\java学习\java笔记图片\image-20201012161523009.png)

![image-20201012161529790](D:\java学习\java笔记图片\image-20201012161529790.png)

![image-20201012161537504](D:\java学习\java笔记图片\image-20201012161537504.png)





# 第7章 static关键字 

## 7.1 概述 

关于 static 关键字的使用，它可以用来修饰的成员变量和成员方法，被修饰的成员是属于类的，而不是单单是属 于某个对象的。也就是说，既然属于类，就可以不靠创建对象来调用了。 

**我的理解****即不依赖于任何对象，是类的属性**

**特别的，直接用类调用static修饰的类内成员函数，较为推荐！！！**

【**注意**】

1、静态方法不能访问非静态

![image-20201014204158133](D:\java学习\java笔记图片\image-20201014204158133.png)

![image-20201014204315481](D:\java学习\java笔记图片\image-20201014204315481.png)





![image-20201012190716013](D:\java学习\java笔记图片\image-20201012190716013.png)

## 7.2 定义和使用格式 类变量 

当 static 修饰成员变量时，该变量称为类变量。该类的每个对象都共享同一个类变量的值。任何对象都可以更改 该类变量的值，但也可以在不创建该类的对象的情况下对类变量进行操作。

![image-20201012161629383](D:\java学习\java笔记图片\image-20201012161629383.png)

![image-20201012161635506](D:\java学习\java笔记图片\image-20201012161635506.png)

![image-20201012161643112](D:\java学习\java笔记图片\image-20201012161643112.png)





**静态方法** 
当 static 修饰成员方法时，该方法称为类方法 。静态方法在声明中有 static ，建议使用类名来调用，而不需要 创建类的对象。调用方式非常简单。

![image-20201012161704134](D:\java学习\java笔记图片\image-20201012161704134.png)







【**注意**】

![image-20201012194303461](D:\java学习\java笔记图片\image-20201012194303461.png)







**调用格式** 
被static修饰的成员可以并且建议通过**类名直接访问**。虽然也可以通过对象名访问静态成员，原因即多个对象均属 于一个类，共享使用同一个静态成员，但是不建议，会出现警告信息。
格式：

![image-20201012161731314](D:\java学习\java笔记图片\image-20201012161731314.png)

【**注意**】

![image-20201012194518058](D:\java学习\java笔记图片\image-20201012194518058.png)



## 7.3 静态原理图解 

static 修饰的内容：

- 是随着类的加载而加载的，且只加载一次。 
- 存储于一块固定的内存区域（静态区），所以，可以直接被类名调用。 
- 它优先于对象存在，所以，可以被所有对象共享。





![image-20201012161802271](D:\java学习\java笔记图片\image-20201012161802271.png)



![image-20201014205209810](D:\java学习\java笔记图片\image-20201014205209810.png)

















## 7.4 静态代码块 



静态代码块：定义在成员位置，使用static修饰的代码块{ }。

- 位置：类中方法外。 
- 执行：随着类的加载而执行且执行一次，优先于main方法和构造方法的执行。

格式：

![image-20201012161844263](D:\java学习\java笔记图片\image-20201012161844263.png)

![image-20201014205605960](D:\java学习\java笔记图片\image-20201014205605960.png)

**结果**

![image-20201014205618768](D:\java学习\java笔记图片\image-20201014205618768.png)







# 第8章 Arrays类 

## 8.1 概述 

java.util.Arrays 此类包含用来操作数组的各种方法，比如排序和搜索等。其所有方法均为静态方法，调用起来 非常简单。





## 8.2 操作数组的方法

![image-20201012161946701](D:\java学习\java笔记图片\image-20201012161946701.png)

![image-20201012161952541](D:\java学习\java笔记图片\image-20201012161952541.png)





8.3 练习 
请使用 Arrays 相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。

![image-20201012162010765](D:\java学习\java笔记图片\image-20201012162010765.png)





# 第9章 Math类 

## 9.1 概述 

java.lang.Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。类似这样的工具 类，其所有方法均为静态方法，并且不会创建对象，调用起来非常简单。 





## 9.2 基本运算的方法 

![image-20201012162059221](D:\java学习\java笔记图片\image-20201012162059221.png)

![image-20201012162119592](D:\java学习\java笔记图片\image-20201012162119592.png)





## 9.3 练习 

![image-20201012162135814](D:\java学习\java笔记图片\image-20201012162135814.png)







# 第10章 继承 

## 10.1 概述 

**由来** 
多个类中存在相同属性和行为时，将这些内容抽取到单独一个类中，那么多个类无需再定义这些属性和行为，只要 继承那一个类即可。如图所示：

![image-20201015182033329](D:\java学习\java笔记图片\image-20201015182033329.png)



其中，多个类可以称为**子类**，单独那一个类称为**父类**、超类（superclass）或者**基类**。

继承描述的是事物之间的所属关系，这种关系是： is-a 的关系。例如，图中兔子属于食草动物，食草动物属于动 物。可见，父类更通用，子类更具体。我们通过继承，可以使多种事物之间形成一种关系体系。 



**定义** 

- 继承：就是子类继承父类的属性和行为，使得子类对象具有与父类相同的属性、相同的行为。子类可以直接 访问父类中的非私有的属性和行为。 



**好处** 

1. 提高代码的复用性。 
2.  类与类之间产生了关系，是多态的前提。 





## 10.2 继承的格式 

通过 extends 关键字，可以声明一个子类继承另外一个父类，定义格式如下：

```java
class 父类 { 
    ...      
}   
class 子类 extends 父类 { 
    ...      
} 
```

继承演示，代码如下：

```java
/*
 * 定义员工类Employee，做为父类
*/ class Employee { 
    String name; // 定义name属性      
    // 定义员工的工作方法      
    public void work() {      
        System.out.println("尽心尽力地工作");          
    }      
}   
/*  
* 定义讲师类Teacher 继承 员工类Employee  
*/ 
class Teacher extends Employee { 
    // 定义一个打印name的方法      
    public void printName() {      
        System.out.println("name=" + name);          
    }      
}   
/*  
* 定义测试类  
*/ 
public class ExtendDemo01 { 
    public static void main(String[] args) {              
        // 创建一个讲师类对象 
        Teacher t = new Teacher();                         
        // 为该员工类的name属性进行赋值 
        t.name = "小明";                         
        // 调用该员工的printName()方法    
        t.printName(); // name = 小明                          
        // 调用Teacher类继承来的work()方法           
        t.work();  // 尽心尽力地工作    
    }      
} 
```

## 10.3 继承后的特点——成员变量 （考虑成员变量重名）

当类之间产生了关系后，其中各类中的成员变量，又产生了哪些影响呢？ 

**成员变量不重名** 

如果子类父类中出现**不重名**的成员变量，这时的访问是没有影响的。代码如下：

```java
class Fu { 
    // Fu中的成员变量。      
    int num = 5;      
}
class Zi extends Fu {
    // Zi中的成员变量      
    int num2 = 6;      
    // Zi中的成员方法      
    public void show() {      
        // 访问父类中的num，          
        System.out.println("Fu num="+num); // 继承而来，所以直接访问。          
        // 访问子类中的num2          
        System.out.println("Zi num2="+num2);          
    }      
} 
class ExtendDemo02 { 
    public static void main(String[] args) {              
    // 创建子类对象 
    Zi z = new Zi();                  
    // 调用子类中的show方法    
    z.show();            
	}      
}   

演示结果： 
    Fu num = 5 
    Zi num2 = 6

```

**成员变量重名** 
如果子类父类中出现重名的成员变量，这时的访问是有影响的。代码如下：

```java
class Fu { 
    // Fu中的成员变量。      
    int num = 5;      
} 
class Zi extends Fu { 
    // Zi中的成员变量      
    int num = 6;      
    public void show() {      
        // 访问父类中的num          
        System.out.println("Fu num=" + num);          
        // 访问子类中的num          
        System.out.println("Zi num=" + num);          
    }      
} 
class ExtendsDemo03 {
    public static void main(String[] args) {             
        // 创建子类对象    
        Zi z = new Zi();                  
        // 调用子类中的show方法    
        z.show();           
    }      
} 



演示结果： 
    Fu num = 6 
    Zi num = 6
```

子父类中出现了同名的成员变量时，在子类中需要访问父类中非私有成员变量时，需要使用 super 关键字，修饰 父类成员变量，类似于之前学过的 this 。

### super关键字

使用格式：

```java
super.父类成员变量名
```

子类方法需要修改，代码如下：

```java
class Zi extends Fu { 
// Zi中的成员变量      
    int num = 6;      
    public void show() {      
        //访问父类中的num          
        System.out.println("Fu num=" + super.num);          
        //访问子类中的num          
        System.out.println("Zi num=" + this.num);          
    }      
} 

演示结果： 
    Fu num = 5 
    Zi num = 6
```

**小贴士：**Fu 类中的成员变量是非私有的，子类中可以直接访问。若Fu 类中的成员变量私有了，子类是不能 直接访问的。通常编码时，我们遵循封装的原则，使用private修饰成员变量，那么如何访问父类的私有成员 变量呢？对！可以在父类中提供公共的getXxx方法和setXxx方法。 

【注意】

- 局部变量: 直接写成员变量名
- 本来的成员变量：  this.成员变量名
- 父类的成员变量： super。成员变量  



重名访问规则

![image-20201015194310587](D:\java学习\java笔记图片\image-20201015194310587.png)







## 10.4 继承后的特点——成员方法 （考虑成员方法重名）

当类之间产生了关系，其中各类中的成员方法，又产生了哪些影响呢？ 

**成员方法不重名** 
如果子类父类中出现**不重名**的成员方法，这时的调用是**没有影响**的。对象调用方法时，会先在子类中查找有没有对 应的方法，若子类中存在就会执行子类中的方法，若子类中不存在就会执行父类中相应的方法。代码如下：

```java
class Fu{ 
    public void show(){      
    System.out.println("Fu类中的show方法执行");          
	}      
} 
class Zi extends Fu{ 
    public void show2(){      
        System.out.println("Zi类中的show2方法执行");          
    }      
} 
public  class ExtendsDemo04{ 
    public static void main(String[] args) {      
        Zi z = new Zi();                //子类中没有show方法，但是可以找到父类方法去执行
        z.show();          
        z.show2();          
    }      
}
```



### (cpp中是加作用域::,来访问父类中的重名函数或者值)

**成员方法重名——重写(Override)** 
如果子类父类中出现重名的成员方法，这时的访问是一种特殊情况，叫做**方法重写** (Override)。

- **方法重写 ：**子类中出现与父类一模一样的方法时（返回值类型，方法名和参数列表都相同），会出现覆盖效 果，也称为重写或者复写。**声明不变，重新实现**

代码如下：

```java
class Fu { 
    public void show() {      
        System.out.println("Fu show");          
    }      
} 
class Zi extends Fu { 
    //子类重写了父类的show方法      
    public void show() {      
        System.out.println("Zi show");          
    }      
} 
public class ExtendsDemo05{ 
    public static void main(String[] args) {      
        Zi z = new Zi();                
        // 子类中有show方法，只执行重写后的show方法     
        z.show();  
        // Zi show          
    }      
}
```

**重写的应用** 
子类可以根据需要，定义特定于自己的行为。既沿袭了父类的功能名称，又根据子类的需要重新实现父类方法，从 而进行扩展增强。比如新的手机增加来电显示头像的功能，代码如下：

```java
class Phone { 
    public void sendMessage(){      
        System.out.println("发短信");          
    }      
    public void call(){      
        System.out.println("打电话");          
    }      
    public void showNum(){      
        System.out.println("来电显示号码");          
    }      
}
//智能手机类 
class NewPhone extends Phone {      
    //重写父类的来电显示号码功能，并增加自己的显示姓名和图片功能      
    public void showNum(){      
        //调用父类已经存在的功能使用super          
        super.showNum();          
        //增加自己特有显示姓名和图片功能          
        System.out.println("显示来电姓名");          
        System.out.println("显示头像");          
    }      
}   
public class ExtendsDemo06 { 
    public static void main(String[] args) {             
    // 创建子类对象           
    NewPhone np = new NewPhone()；                     
        // 调用父类继承而来的方法         
        np.call();               
    // 调用子类重写的方法           
    np.showNum();      
	}
}      
```

![image-20201015202007360](D:\java学习\java笔记图片\image-20201015202007360.png)

**小贴士：**这里重写时，用到super.父类成员方法，表示调用父类的成员方法。 



![image-20201015195943027](D:\java学习\java笔记图片\image-20201015195943027.png)



**注意事项** 

1. 子类方法覆盖父类方法，必须要保证权限大于等于父类权限。 
2. 子类方法覆盖父类方法，返回值类型、函数名和参数列表都要一模一样。





## 10.5 继承后的特点——构造方法 

当类之间产生了关系，其中各类中的构造方法，又产生了哪些影响呢？
首先我们要回忆两个事情，构造方法的定义格式和作用。

1. 构造方法的名字是与类名一致的。所以子类是无法继承父类构造方法的。 
2. 构造方法的作用是初始化成员变量的。所以子类的初始化过程中，必须先执行父类的初始化动作。子类的构 造方法中**默认有一个 super()** ，表示调用父类的构造方法，父类成员变量初始化后，才可以给子类使用。代 码如下：

```java
class Fu {   
    private int n;   
    Fu(){     
        System.out.println("Fu()");   
    }
}
class Zi extends Fu {   
    Zi(){     
        // super（），调用父类构造方法     
        super();     
        System.out.println("Zi（）");   
    }   
} 
public class ExtendsDemo07{   
    public static void main (String args[]){     
        Zi zi = new Zi();   
    } 
} 


输出结果： 
    Fu（） 
    Zi（）  
```



## 10.6 super和this 

**父类空间优先于子类对象产生** 
在每次创建子类对象时，先初始化父类空间，再创建其子类对象本身。目的在于子类对象中包含了其对应的父类空 间，便可以包含其父类的成员，如果父类成员非private修饰，则子类可以随意使用父类成员。代码体现在子类的构 造方法调用时，一定先调用父类的构造方法。理解图解如下：

**![image-20201015184153618](D:\java学习\java笔记图片\image-20201015184153618.png)**

super和this的含义 

- super ：代表父类的存储空间标识(可以理解为父亲的引用)。 
- this ：代表当前对象的引用(谁调用就代表谁)。 

super和this的用法 

1. 访问成员

```java
	this.成员变量     ‐‐    本类的     
    super.成员变量     ‐‐    父类的      
    this.成员方法名()   ‐‐    本类的        
    super.成员方法名()   ‐‐    父类的
```

用法演示，代码如下：

```java
class Animal {     
    public void eat() {         
        System.out.println("animal : eat");     
    } 
}   
class Cat extends Animal {     
    public void eat() {         
        System.out.println("cat : eat");     
    }     
    public void eatTest() {         
        this.eat();   // this  调用本类的方法         
        super.eat();  // super 调用父类的方法     
    } 
}   
public class ExtendsDemo08 {     
    public static void main(String[] args) {         
        Animal a = new Animal();         
        a.eat();         
        Cat c = new Cat();         
        c.eatTest();     
    } 
}   


输出结果为： 
    animal : eat 
    cat : eat 
    animal : eat
```

2. 访问构造方法

```java
	this(...)     ‐‐    本类的构造方法     
    super(...)    ‐‐    父类的构造方法
```

子类的每个构造方法中均有默认的super()，调用父类的空参构造。手动调用父类构造会覆盖默认的super()。 super() 和 this() 都必须是在构造方法的第一行，所以不能同时出现。 



## 10.7 继承的特点 

1. Java只支持单继承，不支持多继承。**（c++可以多继承）**

```java
//一个类只能有一个父类，不可以有多个父类。 
class C extends A{}  //ok      
class C extends A，B... //error
```

2. Java支持多层继承(继承体系)。

```java
class A{} 
class B extends A{} 
class C extends B{}
```

顶层父类是Object类。所有的类默认继承Object，作为父类。 

3. 子类和父类是一种相对的概念。 





# 第11章 抽象类 

## 11.1 概述 

**由来** 
父类中的方法，被它的子类们重写，子类各自的实现都不尽相同。那么父类的方法声明和方法主体，只有声明还有 意义，而方法主体则没有存在的意义了。我们把没有方法主体的方法称为**抽象方法**。Java语法规定，包含抽象方法 的类就是**抽象类**。



**定义** 

- **抽象方法 ：** 没有方法体的方法。 
- **抽象类：**包含抽象方法的类。





## 11.2 abstract使用格式 

**抽象方法** 

使用 abstract 关键字修饰方法，该方法就成了抽象方法，抽象方法只包含一个方法名，而没有方法体。

定义格式：

```java
修饰符 abstract 返回值类型 方法名 (参数列表);
```

代码举例：

```java
public abstract void run();
```

**抽象类** 
如果一个类包含抽象方法，那么该类必须是抽象类。
定义格式：

```java
abstract class 类名字 {     
ja}
```

代码举例：

```java
public abstract class Animal {     
    public abstract void run()； 
}
```

**抽象的使用** 
继承抽象类的子类**必须重写父类所有的抽象方法**。否则，该子类也必须声明为抽象类。最终，必须有子类实现该父 类的抽象方法，否则，从最初的父类到最终的子类都不能创建对象，失去意义。

代码举例：

```java
public class Cat extends Animal {     
    public void run (){        
        System.out.println("小猫在墙头走~~~")；               
    } 
}   
public class CatTest {    
    public static void main(String[] args) {             
        // 创建子类对象         
        Cat c = new Cat();                  
        // 调用run方法         
        c.run();    
    }    
} 
输出结果： 
    小猫在墙头走~~~
```

此时的方法重写，是子类对父类抽象方法的完成实现，我们将这种方法重写的操作，也叫做实现方法。 



## 11.3 注意事项 

关于抽象类的使用，以下为语法上要注意的细节，虽然条目较多，但若理解了抽象的本质，无需死记硬背。

1. 抽象类**不能创建对象**，如果创建，编译无法通过而报错。只能创建其非抽象子类的对象。(理解：假设创建了抽象类的对象，调用抽象的方法，而抽象方法没有具体的方法体，没有意义。)

2. 抽象类中，可以有构造方法，是供子类创建对象时，初始化父类成员使用的。(理解：子类的构造方法中，有默认的super()，需要访问父类构造方法。 )
3.  抽象类中，不一定包含抽象方法，但是有抽象方法的类必定是抽象类。(理解：未包含抽象方法的抽象类，目的就是不想让调用者创建该类对象，通常用于某些特殊的类结构设 计。)
4.  抽象类的子类，必须重写抽象父类中所有的抽象方法，否则，编译无法通过而报错。除非该子类也是抽象 类。(理解：假设不重写所有抽象方法，则类中可能包含抽象方法。那么创建对象后，调用抽象的方法，没有 意义)





# 第12章 继承的综合案例 

## 12.1 综合案例：群主发普通红包 

群主发普通红包。某群有多名成员，群主给成员发普通红包。普通红包的规则：
1. 群主的一笔金额，从群主余额中扣除，平均分成n等份，让成员领取。 
2.  成员领取红包后，保存到成员余额中。

请根据描述，完成案例中所有类的定义以及指定类之间的继承关系，并完成发红包的操作。 

## 12.2案例分析 

根据描述分析，得出如下继承体系：

![image-20201015190047642](D:\java学习\java笔记图片\image-20201015190047642.png)



## 12.3 案例实现 

定义用户类：

```java
public class User {       
    // 成员变量        
    private String username; 
    // 用户名          
    private double leftMoney; 
    // 余额      
   
    
    // 构造方法
    public User() { }     
    public User(String username, double leftMoney) {         this.username = username;         
        this.leftMoney = leftMoney;     
	} 
    // get/set方法          
    public String getUsername() {         
        return username;     
    }       
    public void setUsername(String username) {         
        this.username = username;     
    }       
    public double getLeftMoney() {         
        return leftMoney;     
    }       
    public void setLeftMoney(double leftMoney) {         this.leftMoney = leftMoney;     } 
    // 展示信息的方法          
    public void show() {         
        System.out.println("用户名:"+ username +" , 余额为:" + leftMoney + "元");     } 
}
```

定义群主类：

```java
public class QunZhu extends User { 
    // 添加构造方法          
    public QunZhu() {     
    }       
    public QunZhu(String username, double leftMoney) {        
        // 通过super 调用父类构造方法            
        super(username, leftMoney);     
    } 
    /*      群主发红包，就是把一个整数的金额，分层若干等份。          
    1.获取群主余额,是否够发红包.          
    	不能则返回null,并提示.              
    	能则继续.              
    2.修改群主余额.          
    3.拆分红包.          
    3.1.如果能整除，那么就平均分。             
    3.2.如果不能整除，那么就把余数分给最后一份。              
    */          
    public ArrayList<Double> send(int money, int count) {        
        // 获取群主余额           
        double leftMoney = getLeftMoney();            
        if(money > leftMoney) {
            return null;          
        }        
        // 修改群主余额的            
        setLeftMoney(leftMoney ‐ money);               
        // 创建一个集合,保存等份金额            
        
        ArrayList<Double> list = new ArrayList<>();               
        
        // 扩大100倍,相当于折算成'分'为单位,避免小数运算损失精度的问题            
        money = money * 100;                
        // 每份的金额         
        int m = money / count;         
        // 不能整除的余数         
        int l = money % count;               
        // 无论是否整除,n‐1份,都是每份的等额金额           
        for (int i = 0; i < count ‐ 1; i++) {            
            // 缩小100倍,折算成 '元'                
            list.add(m / 100.0);         
        }              
        // 判断是否整除            
        if (l == 0) {            
            // 能整除, 最后一份金额,与之前每份金额一致                
            list.add(m / 100.0);         
        } else {            
            // 不能整除, 最后一份的金额,是之前每份金额+余数金额                
            list.add((m + l) / 100.00);         
        }               
        // 返回集合            
        return list;     
    } 
}
         
```

定义成员类：

```java
public class Member extends  User {     
    public Member() {     
    }       
    public Member(String username, double leftMoney) {         
        super(username, leftMoney);     
    }     
    // 打开红包,就是从集合中,随机取出一份,保存到自己的余额中     
    public void openHongbao(ArrayList<Double> list) {        
        // 创建Random对象           
        Random r = new Random();           
        // 随机生成一个角标           
        int index = r.nextInt(list.size());           
        // 移除一个金额    
        Double money = list.remove(index);        // 直接调用父类方法,设置到余额            
        setLeftMoney( money );     
    } 
}
```

定义测试类：

```java
public class Test {     
    public static void main(String[] args) {           
        // 创建一个群主对象         
        QunZhu qz = new QunZhu("群主" , 200);                 
        // 创建一个键盘录入           
        Scanner sc = new Scanner();            
        System.out.println("请输入金额:");         
        int money = sc.nextInt();         
        System.out.println("请输入个数:");         
        int count = sc.nextInt();                
        // 发送红包             
        ArrayList<Double> sendList = s.send(money,count);                  
        // 判断,如果余额不足         
        if(sendList == null){             
            System.out.println(" 余额不足...");             
            return;         
        }           
        // 创建三个成员         
        Member m = new Member();         
        Member m2 = new Member();         
        Member m3 = new Member();                 
        // 打开红包            
        m.openHongbao(sendList);         
        m2.openHongbao(sendList);        
        m3.openHongbao(sendList); // 展示信息                  
        qz.show();         
        m.show();         
        m2.show();         
        m3.show();     
    } 
}
```





# 第13章 接口 

## 13.1 概述 

接口，是Java语言中一种引用类型，是方法的集合，如果说类的内部封装了成员变量、构造方法和成员方法，那么 接口的内部主要就是封装了方法，包含抽象方法（JDK 7及以前），默认方法和静态方法（JDK8），私有方法 （JDK 9）。 

接口的定义，它与定义类方式相似，但是使用 interface 关键字。它也会被编译成.class文件，但一定要明确它并 不是类，而是另外一种引用数据类型。

引用数据类型：数组，类，接口。

接口的使用，它不能创建对象，但是可以被实现（ implements ，类似于被继承）。一个实现接口的类（可以看做 是接口的子类），需要实现接口中所有的抽象方法，创建该类对象，就可以调用方法了，否则它必须是一个抽象 类。 



## 13.2 定义格式 

```java
public interface 接口名称 {     
    // 抽象方法     
    // 默认方法     
    // 静态方法     
    // 私有方法 
}
```

**含有抽象方法** 
抽象方法：使用 abstract 关键字修饰，可以省略，没有方法体。该方法供子类实现使用。
代码如下：

```java
public interface InterFaceName {     
    public abstract void method(); 
}
```

**含有默认方法和静态方法** 

默认方法：使用 default 修饰，不可省略，供子类调用或者子类重写。 

静态方法：使用 static 修饰，供接口直接调用。

代码如下：

```java
public interface InterFaceName {     
    public default void method() {         
        // 执行语句     
    }     
    public static void method2() {         
        // 执行语句         
    } 
}
```

**含有私有方法和私有静态方法** 

私有方法：使用 private 修饰，供接口中的默认方法或者静态方法调用。

代码如下：

```java
public interface InterFaceName {     
    private void method() {         
        // 执行语句     
    } 
}
```



## 13.3 基本的实现 

**实现的概述** 
类与接口的关系为实现关系，即**类实现接口**，该类可以称为接口的实现类，也可以称为接口的子类。实现的动作类 似继承，格式相仿，只是关键字不同，实现使用 implements 关键字。

非抽象子类实现接口：

1. 必须重写接口中所有抽象方法。 
2. 继承了接口的默认方法，即可以直接调用，也可以重写。

实现格式：

```java
class 类名 implements 接口名 {     
    // 重写接口中抽象方法【必须】    
    // 重写接口中默认方法【可选】    
}
```

### 1.抽象方法的使用

必须全部实现，代码如下：

定义接口：

```java
public interface LiveAble {     
    // 定义抽象方法     
    public abstract void eat();     
    public abstract void sleep(); 
}
```

定义实现类：

```java
public class Animal implements LiveAble {     
    @Override     
    public void eat() {         
        System.out.println("吃东西");     
    }       
    @Override     
    public void sleep() {         
        System.out.println("晚上睡");     
    } 
}
```

定义测试类：

```java
public class InterfaceDemo {     
    public static void main(String[] args) {         
        // 创建子类对象           
        Animal a = new Animal();         
        // 调用实现后的方法         
        a.eat();         
        a.sleep();     
    } 
} 

输出结果： 
    吃东西 
    晚上睡
```



### **2.默认方法的使用** 

可以继承，可以重写，二选一，但是只能通过实现类的对象来调用。

1. 继承默认方法，代码如下：

定义接口：

```java
public interface LiveAble {     
    public default void fly(){         
        System.out.println("天上飞");     
    } 
}
```

定义实现类：

```java
public class Animal implements LiveAble { 
    // 继承，什么都不用写，直接调用      
}
```

定义测试类：

```java
public class InterfaceDemo {     
    public static void main(String[] args) {         
        // 创建子类对象           
        Animal a = new Animal();         
        // 调用默认方法         
        a.fly();     
    } 
} 

输出结果： 
    天上飞
```



2.重写默认方法，代码如下（**default**）：

定义接口

```java
public interface LiveAble {     
    public default void fly(){         
        System.out.println("天上飞");     
    } 
}
```

定义实现类：

```java
public class Animal implements LiveAble {     
    @Override     
    public void fly() {         
        System.out.println("自由自在的飞");     
    } 
}
```

定义测试类：

```java
public class InterfaceDemo {     
    public static void main(String[] args) {         
        // 创建子类对象           
        Animal a = new Animal();         
        // 调用重写方法         
        a.fly();     
    } 
} 

输出结果： 
    自由自在的飞
```

### **3.静态方法的使用** 

静态与.class 文件相关，只能使用接口名调用，不可以通过实现类的类名或者实现类的对象调用，代码如下：

定义接口：

```java
public interface LiveAble {     
    public static void run(){         
        System.out.println("跑起来~~~");     
    } 
}
```

定义实现类：

```java
public class Animal implements LiveAble { 
    // 无法重写静态方法      
}
```

定义测试类：

```java
public class InterfaceDemo {     
    public static void main(String[] args) {         
        // Animal.run(); // 【错误】无法继承方法,也无法调用         
        LiveAble.run(); //      
    } 
} 

输出结果： 跑起来~~~
```

### **4.私有方法的使用** 

- 私有方法：只有默认方法可以调用。 
- 私有静态方法：默认方法和静态方法可以调用。

如果一个接口中有多个默认方法，并且方法中有重复的内容，那么可以抽取出来，封装到私有方法中，供默认方法 去调用。从设计的角度讲，私有的方法是对默认方法和静态方法的辅助。同学们在已学技术的基础上，可以自行测 试。

```java
public interface LiveAble {     
    default void func(){         
        func1();         
        func2();     
    }       
    private void func1(){         
        System.out.println("跑起来~~~");     
    }       
    private void func2(){         
        System.out.println("跑起来~~~");     
    } 
}
```



### 5.接口的常量定义和使用

![image-20201017165807476](D:\java学习\java笔记图片\image-20201017165807476.png)



### 6.定义小结

![image-20201017170110332](D:\java学习\java笔记图片\image-20201017170110332.png)



### 7.注意事项

![image-20201017171102605](D:\java学习\java笔记图片\image-20201017171102605.png)







## 13.4 接口的多实现 

之前学过，在继承体系中，一个类只能继承一个父类。而对于接口而言，一个类是可以实现多个接口的，这叫做接口的**多实现**。并且，一个类能继承一个父类，同时实现多个接口。
实现格式：

```java
class 类名 [extends 父类名] implements 接口名1,接口名2,接口名3... {     
    // 重写接口中抽象方法【必须】    
    // 重写接口中默认方法【不重名时可选】    
}
```

[ ]： 表示可选操作。 



**抽象方法** 
接口中，有多个抽象方法时，实现类必须重写所有抽象方法。如果抽象方法有重名的，只需要重写一次。代码如 下：
定义多个接口：

```java
interface A {     
    public abstract void showA();     
    public abstract void show(); 
}   
interface B {     
    public abstract void showB();     
    public abstract void show(); 
}
```

定义实现类：

```java
public class C implements A,B{
    @Override     
    public void showA() {         
        System.out.println("showA");     
    }       
    @Override     
    public void showB() {         
        System.out.println("showB");     
    }       
    @Override     
    public void show() {         
        System.out.println("show");     
    } 
}
```

**默认方法** 
接口中，有多个默认方法时，实现类都可继承使用。**如果默认方法有重名的，必须重写一次**。代码如下：
定义多个接口：

```java
interface A {     
    public default void methodA(){}     
    public default void method(){} }   
interface B {     
    public default void methodB(){}     
    public default void method(){} 
}
```

定义实现类：

```java
public class C implements A,B{    
    @Override     
    public void method() {         
        System.out.println("method");     
    } 
}
```

**静态方法** 
接口中，存在同名的静态方法并不会冲突，原因是只能通过各自接口名访问静态方法。 

**优先级的问题** 
当一个类，既继承一个父类，又实现若干个接口时，父类中的成员方法与接口中的默认方法重名，子类就近选择执 行父类的成员方法。代码如下：

定义接口：

```java
interface A {     
    public default void methodA(){         
        System.out.println("AAAAAAAAAAAA");     
    } 
}
```

定义父类：

```java
class D {    
    public void methodA(){        
        System.out.println("DDDDDDDDDDDD");     
    } 
}
```

定义子类：

```java
class C extends D implements A {    
    // 未重写methodA方法    
}
```

定义测试类：

```java
public class Test {     
    public static void main(String[] args) {         
        C c = new C();         
        c.methodA();      
    } 
} 

输出结果: DDDDDDDDDDDD
```



## 13.5 接口的多继承【了解】 

![image-20201017171614064](D:\java学习\java笔记图片\image-20201017171614064.png)

一个接口能继承另一个或者多个接口，这和类之间的继承比较相似。接口的继承使用 extends 关键字，子接口继 承父接口的方法。**如果父接口中的默认方法有重名的，那么子接口需要重写一次。**代码如下：

定义父接口：

```java
interface A {     
    public default void method(){         
        System.out.println("AAAAAAAAAAAAAAAAAAA");     
    } 
}   
interface B {     
    public default void method(){         
        System.out.println("BBBBBBBBBBBBBBBBBBB");     
    } 
}
```

定义子接口：

```java
interface D extends A,B{     
    @Override     
    public default void method() {         
        System.out.println("DDDDDDDDDDDDDD");     
    } 
}
```

小贴士：

子接口重写默认方法时，default关键字可以保留。 

子类重写默认方法时，default关键字不可以保留。

## 13.6 其他成员特点 

接口中，无法定义成员变量，但是可以定义常量，其值不可以改变，默认使用public static ﬁnal修饰。 接口中，没有构造方法，不能创建对象。 接口中，没有静态代码块







# 第14章 多态 

## 14.1 概述（即子类重写） 

父类引用指向子类对象，其对象只能实现父类中的方法和其中子类重写的方法

![image-20201017205222738](D:\java学习\java笔记图片\image-20201017205222738.png)

![image-20201017205255824](D:\java学习\java笔记图片\image-20201017205255824.png)

**=================================

![image-20201017210121654](D:\java学习\java笔记图片\image-20201017210121654.png)

**=================================

**引入** 
多态是继封装、继承之后，面向对象的第三大特性。

生活中，比如跑的动作，小猫、小狗和大象，跑起来是不一样的。再比如飞的动作，昆虫、鸟类和飞机，飞起来也 是不一样的。可见，同一行为，通过不同的事物，可以体现出来的不同的形态。多态，描述的就是这样的状态。 



**定义** 

- 多态： 是指同一行为，具有多个不同表现形式。 



**前提【重点】** 

1. 继承或者实现【二选一】 
2. 方法的重写【意义体现：不重写，无意义】 
3. .父类引用指向子类对象【格式体现】



=====================================================

**父类的引用指向子类的对象**

=====================================================



## 14.2 多态的体现 

多态体现的格式：

```java
父类类型 变量名 = new 子类对象； 
变量名.方法名();

```

父类类型：指子类对象继承的父类类型，或者实现的父接口类型。

代码如下：

```java
Fu f = new Zi(); 
f.method();
```

**当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误；如果有，执行的是子类重写后方法。**
代码如下：
定义父类：

```java
public abstract class Animal {       
    public abstract void eat();   
}
```

定义子类：

```java
class Cat extends Animal {       
    public void eat() {           
        System.out.println("吃鱼");       
    }   
}     
class Dog extends Animal {       
    public void eat() {           
        System.out.println("吃骨头");       
    }   
}
```

定义测试类：

```java
public class Test {     
    public static void main(String[] args) {         
        // 多态形式，创建对象         
        Animal a1 = new Cat();          
        // 调用的是 Cat 的 eat         
        a1.eat();                     
        // 多态形式，创建对象         
        Animal a2 = new Dog();          
        // 调用的是 Dog 的 eat         
        a2.eat();                    
    }   
}
```





## 14.3 多态的好处 

**！！！！！！注意！！！！！！！**  

![image-20201017205708821](D:\java学习\java笔记图片\image-20201017205708821.png)



![image-20201017210038412](D:\java学习\java笔记图片\image-20201017210038412.png)

实际开发的过程中，父类类型作为方法形式参数，传递子类对象给方法，进行方法的调用，更能体现出多态的扩展 性与便利。代码如下：
定义父类：

```java
public abstract class Animal {       
    public abstract void eat();   
} 
```

定义子类：

```java
class Cat extends Animal {       
    public void eat() {           
        System.out.println("吃鱼");       
    }   
}     
class Dog extends Animal {       
    public void eat() {           
        System.out.println("吃骨头");       
    }   
}
```

定义测试类：

```java
public class Test {     
    public static void main(String[] args) {         
        // 多态形式，创建对象         
        Cat c = new Cat();           
        Dog d = new Dog();            
        // 调用showCatEat          
        showCatEat(c);         
        // 调用showDogEat               
        showDogEat(d);            
        /*         
        以上两个方法, 均可以被showAnimalEat(Animal a)方法所替代         
        而执行效果一致         */         
        showAnimalEat(c);         
        showAnimalEat(d);      
    }       
    public static void showCatEat (Cat c){         
        c.eat();      
    }       
    public static void showDogEat (Dog d){        
        d.eat();     
    }       
    public static void showAnimalEat (Animal a){
        a.eat();     
    } 
}
```

由于多态特性的支持，showAnimalEat方法的Animal类型，是Cat和Dog的父类类型，父类类型接收子类对象，当 然可以把Cat对象和Dog对象，传递给方法。

当eat方法执行时，多态规定，执行的是子类重写的方法，那么效果自然与showCatEat、showDogEat方法一致， 所以showAnimalEat完全可以替代以上两方法。 

不仅仅是替代，在扩展性方面，无论之后再多的子类出现，我们都不需要编写showXxxEat方法了，直接使用 showAnimalEat都可以完成。

所以，多态的好处，体现在，可以使程序编写的更简单，并有良好的扩展。 



14.4多态的弊端

不能调用子类特有的方法，只能调用子类重写的方法

栗子：

```java
public abstract class Fu {
    public abstract void demo1();
}



public class Zi extends Fu{
    @Override
    public void demo1() {
        System.out.println("嘿嘿嘿");
    }

    public void demo2() {
        System.out.println("biubiubiu");
    }
}


public class Demo1 {
    public static void main(String[] args) {
        Fu t = new Zi();
        t.demo1();
        Zi t2 = new Zi();
        t2.demo1();
        t2.demo2();
    }
}

```



## 14.4 引用类型转换 

多态的转型分为向上转型与向下转型两种： 

### **向上转型** 

- 向上转型：多态本身是子类类型向父类类型向上转换的过程，这个过程是默认的。

当父类引用指向一个子类对象时，便是向上转型。

使用格式：

```java
父类类型  变量名 = new 子类类型(); 
如：Animal a = new Cat();

```

### **向下转型** 

- 向下转型：父类类型向子类类型向下转换的过程，这个过程是强制的。

一个已经向上转型的子类对象，将父类引用转为子类引用，可以使用强制类型转换的格式，便是向下转型。
使用格式

```java
子类类型 变量名 = (子类类型) 父类变量名; 
如:Cat c =(Cat) a;  
```

**为什么要转型** 

当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误。也就是说，不能调用子类拥 有，而父类没有的方法。编译都错误，更别说运行了。这也是多态给我们带来的一点"小麻烦"。所以，想要调用子 类特有的方法，必须做向下转型。

转型演示，代码如下：

定义类：

```java
abstract class Animal {       
    abstract void eat();   
}     
class Cat extends Animal {       
    public void eat() {           
        System.out.println("吃鱼");       
    }       
    public void catchMouse() {           
        System.out.println("抓老鼠");       
    }   
}     
class Dog extends Animal {       
    public void eat() {           
        System.out.println("吃骨头");       
    }       
    public void watchHouse() {           
        System.out.println("看家");       
    }   
}
```

定义测试类：

```java
public class Test {     
    public static void main(String[] args) {        
        // 向上转型           
        Animal a = new Cat();           
        a.eat();  
        
        // 调用的是 Cat 的 eat                          
        // 向下转型           
        Cat c = (Cat)a;                
        c.catchMouse(); 
        // 调用的是 Cat 的 catchMouse              
    }  
}
```

**转型的异常** 

转型的过程中，一不小心就会遇到这样的问题，请看如下代码：

```java
public class Test {     
    public static void main(String[] args) {         
        // 向上转型           
        Animal a = new Cat();           
        a.eat();               
        // 调用的是 Cat 的 eat           
        
        // 向下转型           
        Dog d = (Dog)a;                
        d.watchHouse();        // 调用的是 Dog 的 watchHouse 【运行报错】     
    }   
}
```

这段代码可以通过编译，但是运行时，却报出了 ClassCastException ，类型转换异常！这是因为，明明创建了 Cat类型对象，运行时，当然不能转换成Dog对象的。这两个类型并没有任何继承关系，不符合类型转换的定义。 

为了避免ClassCastException的发生，Java提供了 instanceof 关键字，给引用变量做类型的校验，格式如下：

```java
变量名 instanceof 数据类型  
如果变量属于该数据类型，返回true。 
如果变量不属于该数据类型，返回false。
```

所以，转换前，我们好先做一个判断，代码如下：

```java
public class Test {     
    public static void main(String[] args) {         
        // 向上转型           
        Animal a = new Cat();           
        a.eat();               
        // 调用的是 Cat 的 eat           
        
        // 向下转型           
        if (a instanceof Cat){             
            Cat c = (Cat)a;                    c.catchMouse();        
            // 调用的是 Cat 的 catchMouse         
        } else if (a instanceof Dog){             Dog d = (Dog)a;                    d.watchHouse();                   
            // 调用的是 Dog 的 watchHouse         
        }     
    }   
}
```



## 14.4 笔记本电脑 案例

笔记本电脑（laptop）通常具备使用USB设备的功能。在生产时，笔记本都预留了可以插入USB设备的USB接口， 但具体是什么USB设备，笔记本厂商并不关心，只要符合USB规格的设备都可以。 

定义USB接口，具备基本的开启功能和关闭功能。鼠标和键盘要想能在电脑上使用，那么鼠标和键盘也必须遵守 USB规范，实现USB接口，否则鼠标和键盘的生产出来也无法使用。 

![image-20201017160456108](D:\java学习\java笔记图片\image-20201017160456108.png)

![image-20201017160501656](D:\java学习\java笔记图片\image-20201017160501656.png)

![image-20201017160508391](D:\java学习\java笔记图片\image-20201017160508391.png)

![image-20201017160515232](D:\java学习\java笔记图片\image-20201017160515232.png)

![image-20201017160521065](D:\java学习\java笔记图片\image-20201017160521065.png)

![image-20201017160527888](D:\java学习\java笔记图片\image-20201017160527888.png)



## 14.5 接口与抽象类

**抽象类**是从一些类中抽取出它们**共有的属性**（例如某些相同的成员变量、属性相同（修饰符、函数名、参数类型、参数个数）的方法），注意方法的修饰符可以为public或者protected（因为假如是private则子类无法继承），缺修饰符情况下默认为public，抽象类注重于对类本身的抽象，抽象方法没有方法体，仅仅是声明了该方法，让继承它的子类去实现。
 而**接口**主要是对类的**行为的抽象**，接口也可以有变量和方法，但是变量以及方法的修饰符都必须分别是public static final（省略时也会默认是这个）和public abstract（省略时也会默认是这个）。





第一点． 接口是抽象类的变体，接口中所有的方法都是抽象的。而抽象类是声明方法的存在而不去实现它的类。
第二点． 接口可以多继承，抽象类不行
第三点． 接口定义方法，不能实现，而抽象类可以实现部分方法。
第四点． 接口中基本数据类型为static 而抽类象不是的。



当你关注一个事物的本质的时候，用抽象类；当你关注一个操作的时候，用接口。



抽象类的功能要远超过接口，但是，定义抽象类的代价高。因为高级语言来说（从实际设计上来说也是）每个类只能继承一个类。在这个类中，你必须继承或编写出其所有子类的



所有共性。虽然接口在功能上会弱化许多，但是它只是针对一个动作的描述。而且你可以在一个类中同时实现多个接口。在设计阶段会降低难度的。



【注意】

**将类当成参数传入方法，其实就是将类的对象传入方法，如果是抽象类，其实就是将抽象类的子类的对象传入方法，如果是接口，其实就是将接口实现类的对象传入方法。**



**因为抽象类和接口是不能实例化成对象的，所以必须找它们的子类或实现类**



## 14.6instance

ava 中的instanceof 运算符是用来在运行时指出对象是否是特定类的一个实例。instanceof通过返回一个布尔值来指出，这个对象是否是这个特定类或者是它的子类的一个实例。



用法： 

```java
result = object instanceof class 
```

参数： 
Result：布尔类型。 
Object：必选项。任意对象表达式。 
Class：必选项。任意已定义的对象类。 
说明： 
如果 object 是 class 的一个实例，则 instanceof 运算符返回 true。如果 object 不是指定类的一个实例，或者 object 是 null，则返回 false。 



但是instanceof在Java的编译状态和运行状态是有区别的：



在编译状态中，class可以是object对象的父类，自身类，子类。在这三种情况下Java编译时不会报错。



在运行转态中，class可以是object对象的父类，自身类，不能是子类。在前两种情况下result的结果为true，最后一种为false。但是class为子类时编译不会报错。运行结果为false。

## 14.7c++与java的多态

首先，java中有接口的概念，

```java
public interface 接口名 {
    
}
```

而c++中没有接口的概念

首先，于2020年10月18日尝试，java中接口可以作为函数参数传递，而c++中的抽象类不可之间传递，需要加上*或者&。

抽象类 对象不可以，不bai过抽象类 指针和引用方du式就可以，比如下面函数是zhi合法的。

```c++
void fun(CAbstract *p);

void fun(CAbstract &a);

非法的例子：void fun(CAbstract obj);
```

指针和引用dao方式合法的原因，是因为指针和引用方式指向的对象可以是抽象类的派生类型的对象。而这些派生类可能不是抽象类。





上述java的笔记本例子中

```java
Usb u = new Mouse();
It.useUSB(u);

KeyBoard kb = new KeyBoard();
It.useUSB(kb)
```

可以看到，传入函数参数的既可以是**多态对象**，也可以是实体对象



区别c++中

首先在抽象类中的定义

```cpp
void useUSB(Usb& usb);
```

不可传递抽象类，只能传递抽象类的**指针**或者**引用**

```
KeyBoard kb；
It.useUSB(kb)
```

所有参数传递只能是实体对象，不可以是抽象对象。

指针和引用方式合法的原因，是因为指针和引用方式指向的对象可以是抽象类的派生类型的对象。而这些派生类可能不是抽象类。





# 第15章 ﬁnal关键字 

## 15.1 概述 

学习了继承后，我们知道，子类可以在父类的基础上改写父类内容，比如，方法重写。那么我们能不能随意的继承 API中提供的类，改写其内容呢？显然这是不合适的。为了避免这种随意改写的情况，Java提供了 final 关键字， 用于修饰不可改变内容。

- ﬁnal： 不可改变。可以用于修饰类、方法和变量。 

1. 类：被修饰的类，不能被继承。 
2. 方法：被修饰的方法，不能被重写。 
3. 变量：被修饰的变量，不能被重新赋值（局部变量和成员变量）



## 15.2 使用方式 

### 1.修饰类 (太监类)

格式如下

```java
final class 类名 {    

}
```

查询API发现像 public final class String 、 public final class Math 、 public final class Scanner 等，很多我们学习过的类，都是被ﬁnal修饰的，目的就是供我们使用，而不让我们所以改变其内容。 

### **2.修饰方法** 

格式如下：

```java
修饰符 final 返回值类型 方法名(参数列表){     
    //方法体 
}
```

重写被 final 修饰的方法，编译时就会报错。 

[**注意**]不能覆盖重写父类中final的方法



### **3.修饰变量** 

#### 1.局部变量——基本类型

**一次覆盖**，**终身不变**

基本类型的局部变量，被ﬁnal修饰后，只能赋值一次，不能再更改。代码如下：

```java
public class FinalDemo1 {     
    public static void main(String[] args) {         
        // 声明变量，使用final修饰         
        final int a;         
        // 第一次赋值          
        a = 10;         
        // 第二次赋值         
        a = 20; 
        // 报错,不可重新赋值             
        
        // 声明变量，直接赋值，使用final修饰         
        final int b = 10;         
        // 第二次赋值         
        b = 20; 
        // 报错,不可重新赋值     
    } 
}
```

思考，如下两种写法，哪种可以通过编译？

写法1：

```java
final int c = 0; 
for (int i = 0; i < 10; i++) {     
    c = i;     
    System.out.println(c); 
}
```

写法2：

```java
for (int i = 0; i < 10; i++) {     
    final int c = i;     
    System.out.println(c); 
}
```

根据 final 的定义，写法1报错！写法2，为什么通过编译呢？因为每次循环，都是一次新的变量c。这也是大家 需要注意的地方。



#### 2.局部变量——引用类型 

引用类型的局部变量，被ﬁnal修饰后，只能指向一个对象，**地址不能再更改**。但是不影响对象内部的成员变量值的 修改，代码如下：

```java
public class FinalDemo2 {     
    public static void main(String[] args) {         
        // 创建 User 对象         
        final   User u = new User();         
        // 创建 另一个 User对象         
        u = new User(); 
        // 报错，指向了新的对象，地址值改变。           
        // 调用setName方法         
        u.setName("张三"); 
        // 可以修改     
    } 
}
```



#### 3.成员变量

成员变量涉及到初始化的问题，初始化方式有两种，只能二选一：（**必须初始化时候，手动赋值！！**）

- 显示初始化；

```java
public class User {     
    final String USERNAME = "张三";     
    private int age; 
}
```

- 构造方法初始化。

```java
public class User {     
    final String USERNAME ;     
    private int age;     
    public User(String username, int age) {         
        this.USERNAME = username;         
        this.age = age;     
    } 
}
```

被ﬁnal修饰的常量名称，一般都有书写规范，所有字母都大写。 





# 第16章 权限修饰符 

## 16.1 概述 

在Java中提供了四种访问权限，使用不同的访问权限修饰符修饰时，被修饰的内容会有不同的访问权限， 

- public：公共的。 
- protected：受保护的 
- default：默认的 
- private：私有的 



## 16.2 不同权限的访问能力

![image-20201019153532953](D:\java学习\java笔记图片\image-20201019153532953.png)

![image-20201019164826242](D:\java学习\java笔记图片\image-20201019164826242.png)

可见，public具有最大权限。private则是最小权限。

编写代码时，如果没有特殊的考虑，建议这样使用权限：

- 成员变量使用 private ，隐藏细节。 
- 构造方法使用 public ，方便创建对象。 
- 成员方法使用 public ，方便调用方法。 

小贴士：不加权限修饰符，其访问能力与default修饰符相同 



# 第17章 内部类 

## 17.1 概述 

**什么是内部类** 

将一个类A定义在另一个类B里面，里面的那个类A就称为内部类，B则称为外部类。

分为两种：成员内部类与局部内部类，其中匿名内部类又属于局部内部类。 

## 17.2**成员内部类** 

- 成员内部类 ：定义在类中方法外的类。

定义格式：

```java
class 外部类 {     
    class 内部类{       
    } 
}
```

在描述事物时，若一个事物内部还包含其他事物，就可以使用内部类这种结构。比如，汽车类 Car 中包含发动机 类 Engine ，这时， Engine 就可以使用内部类来描述，定义在成员位置。

代码举例：

```java
class Car { //外部类     
    class Engine { //内部类       
    
    } 
}
```

**访问特点** 

- 内部类可以直接访问外部类的成员，包括私有成员。 
- 外部类要访问内部类的成员，必须要建立**内部类的对象**。

**注意：内用外，随意访问；外用内，需要内部类对象。**



创建内部类对象格式：

```java
外部类名.内部类名 对象名 = new 外部类型().new 内部类型()；
```

访问演示，代码如下：
定义类：

```java
public class Person {     
    private  boolean live = true;     
    class Heart {         
        public void jump() {             
            // 直接访问外部类成员             
            if (live) {                 
                System.out.println("心脏在跳动");             
            } else {                 
                System.out.println("心脏不跳了");             
            }         
        }     
    }       
    public boolean isLive() {         
        return live;     
    }      
    
    public void setLive(boolean live) {         
        this.live = live;     
    }  
    
}
```

定义测试类：

```java
public class InnerDemo {
    public static void main(String[] args) {         
        // 创建外部类对象         
        Person p  = new Person();         
        // 创建内部类对象        
        Heart heart = p.new Heart();         
        // 调用内部类方法      
        heart.jump();       
        // 调用外部类方法     
        p.setLive(false);      
        // 调用内部类方法      
        heart.jump();     
    } 
} 

输出结果: 
心脏在跳动 
心脏不跳了

```

内部类仍然是一个独立的类，在编译之后会内部类会被编译成独立的.class文件，但是前面冠以外部类的类名 和$符号 。
比如，Person$Heart.class 



如果出现了重名的现象，那么格式时：

```java
外部类名称.this.外部成员变量名
```

![image-20201019170954268](D:\java学习\java笔记图片\image-20201019170954268.png)





## 17.3局部内部类

![image-20201019171659696](D:\java学习\java笔记图片\image-20201019171659696.png)



![image-20201019172140440](D:\java学习\java笔记图片\image-20201019172140440.png)





## 17.4局部内部类中的 匿名内部类【重点】 

- 匿名内部类 ：是内部类的简化写法。它的本质是一个 带具体实现的 父类或者父接口的 匿名的 **子类对象**。

开发中，最常用到的内部类就是匿名内部类了。以接口举例，当你使用一个接口时，似乎得做如下几步操作，

1. 定义子类 
2. 重写接口中的方法 
3. 创建子类对象 
4. 调用重写后的方法

我们的目的，最终只是为了调用方法，那么能不能简化一下，把以上四步合成一步呢？匿名内部类就是做这样的快 捷方式。 

**有啥用？**

不用创建对象，直接使用抽象类或接口







**是匿名类不是匿名对象！！**

![image-20201019172753593](D:\java学习\java笔记图片\image-20201019172753593.png)

**蓝色区域就是匿名内部类！！**

![image-20201019195039821](D:\java学习\java笔记图片\image-20201019195039821.png)



```java
package day10test.EX1;

public class PlayGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setAge(23);
        hero.setName("李明鹏");

        Skill skill = new Skill() {     //匿名内部类
            @Override
            public void use() {
                System.out.println("pa_pa_pa");
            }
        };

        hero.setSkill(skill);

        hero.attack();

        System.out.println("=================================");



        //匿名对象+匿名内部类
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("哒哒哒");
            }
        });
        hero.attack();
    }
}

```















**前提** 

匿名内部类必须继承一个**父类**或者实现一个**父接口**。 

**格式** 

```java
new 父类名或者接口名(){     
    // 方法重写     
    @Override      
    public void method() {         
        // 执行语句     
    } 
};
```

使用方式

以接口为例，匿名内部类的使用，代码如下：

定义接口：

```java
public abstract class FlyAble{     
    public abstract void fly(); 
}
```

创建匿名内部类，并调用：

```java
public class InnerDemo {     
    public static void main(String[] args) {         
        /*         1.等号右边:是匿名内部类，定义并创建该接口的子类对象         
        		   2.等号左边:是多态赋值,接口类型引用指向子类对象         */         FlyAble  f = new FlyAble(){             
               public void fly() {                 
                    System.out.println("我飞了~~~");             
               }         
        };           
        //调用 fly方法,执行重写后的方法         
        f.fly();     
    } 
}
```

通常在方法的形式参数是接口或者抽象类时，也可以将匿名内部类作为参数传递。代码如下：

```java
public class InnerDemo2 {     
    public static void main(String[] args) {         
        /*         1.等号右边:定义并创建该接口的子类对象         
        		   2.等号左边:是多态,接口类型引用指向子类对象        */         FlyAble  f = new FlyAble(){             
            public void fly() {                 
                System.out.println("我飞了~~~");             
            }         
        };         
        // 将f传递给showFly方法中         
        showFly(f);     
    }     
    public static void showFly(FlyAble f) {         
        f.fly();     
    } 
}
```

以上两步，也可以简化为一步，代码如下：

```java
public class InnerDemo3 { 
    public static void main(String[] args) {                     
        /*         
             创建匿名内部类,直接传递给showFly(FlyAble f)          
        */         
        showFly( new FlyAble(){             
            public void fly() {                 
                System.out.println("我飞了~~~");             
            }         
        });     
    }       
    
    public static void showFly(FlyAble f) {         
        f.fly();     
    } 
}
```





# 第18章 引用类型用法总结 

实际的开发中，引用类型的使用非常重要，也是非常普遍的。我们可以在理解基本类型的使用方式基础上，进一步 去掌握引用类型的使用方式。基本类型可以作为成员变量、作为方法的参数、作为方法的返回值，那么当然引用类 型也是可以的。 

## 18.1 class作为成员变量 

在定义一个类Role（游戏角色）时，代码如下：

```java
class Role {    
    int id; // 角色id       
    int blood; // 生命值      
    String name; // 角色名称   
}
```

使用 int 类型表示 角色id和生命值，使用 String 类型表示姓名。此时， String 本身就是引用类型，由于使用 的方式类似常量，所以往往忽略了它是引用类型的存在。如果我们继续丰富这个类的定义，给 Role 增加武器，穿 戴装备等属性，我们将如何编写呢？

定义武器类，将增加攻击能力：

```java
class Weapon {   
    String name； 
        // 武器名称         
    int hurt； 
        // 伤害值  
} 

```

定义穿戴盔甲类，将增加防御能力，也就是提升生命值：

```java
class Armour {    
    String name；// 装备名称        
    int protect；// 防御值   
}
```

定义角色类：

```java
class Role {     
    int id；     
    int blood；     
    String name；     
    // 添加武器属性        
    Weapon wp；    
    // 添加盔甲属性     
    Armour ar；       
        // 提供get/set方法     
    public Weapon getWp() {         
        return wp;     
    }     
    public void setWeapon(Weapon wp) {         
        this.wp = wp;     
    }     
    public Armour getArmour() {         
        return ar;     
    }     
    public void setArmour(Armour ar) {         
        this.ar = ar;     
    }      
    // 攻击方法    
    public void attack(){        
        System.out.println("使用"+ wp.getName() +", 造成"+wp.getHurt()+"点伤害");       
    }   
    // 穿戴盔甲    
    public void wear(){         
        // 增加防御,就是增加blood值         
        this.blood += ar.getProtect();        
        System.out.println("穿上"+ar.getName()+", 生命值增加"+ar.getProtect());     
    }   
}
```

测试类：

```java
public class Test {    
    public static void main(String[] args) {         
        // 创建Weapon 对象              
        Weapon wp = new Weapon("屠龙刀" , 999999);                 
        // 创建Armour 对象           
        Armour ar = new Armour("麒麟甲",10000);           
        // 创建Role 对象           
        Role r = new Role();                          
        // 设置武器属性           
        r.setWeapon(wp);    
       // 设置盔甲属性    
        r.setArmour(ar);                 
        // 攻击           
        r.attack();            
        // 穿戴盔甲        
        r.wear();       
    }    
} 


输出结果: 
使用屠龙刀,造成999999点伤害 
穿上麒麟甲 ,生命值增加10000
```

类作为成员变量时，对它进行赋值的操作，实际上，是赋给它该类的一个对象。 



## 18.2 interface作为成员变量 

接口是对方法的封装，对应游戏当中，可以看作是扩展游戏角色的技能。所以，如果想扩展更强大技能，我们在 Role 中，可以增加接口作为成员变量，来设置不同的技能。
定义接口：

```java
// 法术攻击
public interface FaShuSkill {     
    public abstract void faShuAttack(); 
}
```

定义角色类：

```java
public class Role {     
    FaShuSkill fs;       
    public void setFaShuSkill(FaShuSkill fs) {         
        this.fs = fs;     
    }    
    // 法术攻击      
    public void faShuSkillAttack(){         
        System.out.print("发动法术攻击:");         
        fs.faShuAttack();         
        System.out.println("攻击完毕");     
    } 
}
```

定义测试类：

```java
public class Test {     
    public static void main(String[] args) {        
        // 创建游戏角色         
        Role role = new Role();        
        // 设置角色法术技能         
        role.setFaShuSkill(new FaShuSkill() {
            
            @Override
			public void faShuAttack() {                 
                System.out.println("纵横天下");             
            }         
        });           
        // 发动法术攻击         
        role.faShuSkillAttack();           
        // 更换技能        
        role.setFaShuSkill(new FaShuSkill() {             
            @Override             
            public void faShuAttack() {                
                System.out.println("逆转乾坤");             
            }         
        });         
        // 发动法术攻击         
        role.faShuSkillAttack(); 
    }      
} 


输出结果: 
发动法术攻击:纵横天下 
攻击完毕   
    
发动法术攻击:逆转乾坤 
攻击完毕
```

我们使用一个接口，作为成员变量，以便随时更换技能，这样的设计更为灵活，增强了程序的扩展性。
接口作为成员变量时，对它进行赋值的操作，实际上，是赋给它该接口的一个子类对象。 



## 18.3 interface作为方法参数和返回值类型 

当接口作为方法的参数时,需要传递什么呢？当接口作为方法的返回值类型时，需要返回什么呢？对，其实都是它的 子类对象。 ArrayList 类我们并不陌生，查看API我们发现，实际上，它是 java.util.List 接口的实现类。所 以，当我们看见 List 接口作为参数或者返回值类型时，当然可以将 ArrayList 的对象进行传递或返回。

请观察如下方法：**获取某集合中所有的偶数**。

定义方法：

```java
public static List<Integer> getEvenNum(List<Integer> list) {     
    // 创建保存偶数的集合     
    ArrayList<Integer> evenList = new ArrayList<>();     
    // 遍历集合list,判断元素为偶数,就添加到evenList中     
    for (int i = 0; i < list.size(); i++) {         
        Integer integer = list.get(i);         
        if (integer % 2 == 0) {             
            evenList.add(integer);         
        }     
    }     
    /*      
    返回偶数集合
    因为getEvenNum方法的返回值类型是List,而ArrayList是List的子类,       
    所以evenList可以返回       */        
    return evenList; 
}
```

调用方法：

```java
public class Test {     
    public static void main(String[] args) {         
        // 创建ArrayList集合,并添加数字         
        ArrayList<Integer> srcList = new ArrayList<>();         for (int i = 0; i < 10; i++) {             
            srcList.add(i);         
        }          
        /*         
        获取偶数集合           
        因为getEvenNum方法的参数是List,而ArrayList是List的子类,           
        所以srcList可以传递           
        */            
        List list = getEvenNum(srcList);         
        System.out.println(list);     
    } 
}
```

接口作为参数时，传递它的子类对象。
接口作为返回值类型时，返回它的子类对象。 



# 第19章 综合案例——发红包【界面版】 

红包文化源远流长。从古时的红色纸包，到手机App中的手气红包，红包作为一种独特的中华文化传承至今。之前 的课程中，我们也编写过程序，模拟发普通红包。那么今天，我们将整合基础班课程中所有的技术和知识，编写一 个带界面版的 发红包 案例。

目前，我们尚未学习过任何与界面相关的类。所以，界面相关代码，已经给出。请运用所学技术分析并使 用。 

![image-20201019155739700](D:\java学习\java笔记图片\image-20201019155739700.png)

![image-20201019155745522](D:\java学习\java笔记图片\image-20201019155745522.png)

![image-20201019155758016](D:\java学习\java笔记图片\image-20201019155758016.png)

![image-20201019155804479](D:\java学习\java笔记图片\image-20201019155804479.png)

详细见pdf

