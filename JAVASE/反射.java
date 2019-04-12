1、反射的定义

能够分析类能力的程序称为反射。反射机制的功能极其强大。
*反射机制的作用:
在运行时分析类的能力
在运行时查看对象
实现通用的数组操作代码
利用method对象。

2、class类
Integer a=127;
Class class1=  a.getClass();
String name=class1.getName();//java.lang.Integer
Class.forName("java.lang.Integer");//从类名加载类
class1.newInstance();//从类实例化对象
class1.getSuperclass();//获取父类的class对象

class1.getInterfaces();//获取当前类实现的接口的class对象

Field[] Fields=class1.getFields();//返回这个类及其父类公有的属性
Field[] Fields=class1.getDeclaredFields();//返回当前类的所有属性
Field Field=class1.getField(String name);//返回当前类的某一个属性

Method[] methods=class1.getMethods();//获取当前类及其所有父类的公有方法Method数组
Method[] methods=class1.getDeclaredMethods();//返回当前类的所有方法
Method method=class1.getMethod(String name, Class<?>... parameterTypes);//返回当前类的某一个方法

Constructor[] constructors=class1.getConstructors();//获取当前类及其所有父类的公有构造器
Constructor[] constructors=class1.getDeclaredConstructors();//获取当前类的所有构造方法
Constructor constructor=class1.getConstructor(Class<?>... parameterTypes);//获取当前类的某一个构造器

/***
打印某个类的所有构造器
*/
 public static void printConstructors(Class a){
	Constructor[] constructors=a.getConstructors();
	for (int i = 0; i < constructors.length; i++) {
		System.out.print("   ");
		Constructor c = constructors[i];
		String modifiers=Modifier.toString(c.getModifiers());
		System.out.print(modifiers+" ");
		String name2=c.getName();
		System.out.print(name2 +"(");
		Class[] paramTypes=c.getParameterTypes();
		for (int j = 0; j < paramTypes.length; j++) {
			Class paramType = paramTypes[j];
			if(j>0){
				System.out.print(", ");
			}
			System.out.print(paramType.getName());
		}
		System.out.println(")");
	}
}
/***
打印某个类的所有的方法
*/
public static void prinMethods(Class a){
	Method[] methods=a.getMethods();
	for (int i = 0; i < methods.length; i++) {
		System.out.print("   ");
		Method c = methods[i];
		Class retType = c.getReturnType();
		String modifiers=Modifier.toString(c.getModifiers());
		System.out.print(modifiers+" ");
		String name2=c.getName();
		System.out.print(retType.getName()+" "+name2 +"(");
		Class[] paramTypes=c.getParameterTypes();
		for (int j = 0; j < paramTypes.length; j++) {
			Class paramType = paramTypes[j];
			if(j>0){
				System.out.print(", ");
			}
			System.out.print(paramType.getName());
		}
		System.out.println(")");
	}
}



3、Constructor
Integer a=127;
Class class1=  a.getClass();
Constructor[] constructors=class1.getConstructors();
Constructor constructor=constructors[0];
constructor.getDeclaringClass();//返回表示该类或接口的类对象，该类或接口声明由该对象表示的可执行文件
constructor.getExceptionTypes();//返回一个类对象数组,该数组表示由该对象表示的底层可执行程序声明要抛出的异常类型
constructor.getGenericExceptionTypes();//返回一个类型对象数组，该数组表示此可执行对象声明要抛出的异常
constructorc.getModifiers();//返回构造器的修饰符的整型表示，可用Modifier.toString()方法解析

4、Modifier
Modifier.toString(int mod);  //解析字符串

static boolean	isAbstract(int mod)
static boolean	isFinal(int mod)
static boolean	isInterface(int mod)
static boolean	isNative(int mod)
static boolean	isPrivate(int mod)
static boolean	isProtected(int mod)
static boolean	isPublic(int mod)
static boolean	isStatic(int mod)
static boolean	isStrict(int mod)
static boolean	isSynchronized(int mod)
static boolean	isTransient(int mod)
static boolean	isVolatile(int mod)

以上方法可检测方法名中对应的修饰符在Modifiers值中的位。


