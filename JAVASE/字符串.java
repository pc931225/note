1、子串
String str="abcdefghijklmnopqrstuvwxyz";
str.subString(a,b); 满足条件 0<=a<b , b<=str.length() 截取字符串 截取的长度为 b-a

2、拼接
String a="hello";
String b=" word";
String c=a+b;## c="hello word";

3、检测字符串是否相等用equals
String a="hello";
String b=" word";
a.equals(b); false
"hello".equalsIgnoreCase("Hello"); true //不区分大小写

4、构造方法Constructor
//初始化新创建的字符串对象，使其表示空字符序列。注意，使用这个构造函数是不必要的，因为字符串是不可变的
public String() 
//初始化新创建的字符串对象，使其表示与参数相同的字符序列;换句话说，新创建的字符串是参数字符串的副本。
//除非需要显式复制original，否则无需使用此构造函数，因为字符串是不可变的。
public String(String original) 
//分配一个新字符串，以便它表示字符数组参数中当前包含的字符序列。复制字符数组的内容;字符数组的后续修改不影响新创建的字符串。
public String(char[] value)
//分配一个包含字符数组参数子数组中的字符的新字符串。
//offset参数是子数组第一个字符的索引，count参数指定子数组的长度。
//复制子数组的内容;字符数组的后续修改不影响新创建的字符串。
public String(char[] value,int offset,int count)
//分配一个包含Unicode代码点数组参数子数组中的字符的新字符串。
//offset参数是子数组的第一个代码点的索引，而count参数指定子数组的长度。
//将子数组的内容转换为字符;int数组的后续修改不影响新创建的字符串。
public String(int[] codePoints,int offset,int count)
//通过使用指定的字符集解码指定的字节子数组构造新的字符串。新字符串的长度是字符集的函数，因此可能不等于子数组的长度。
//当给定字符集中的给定字节无效时，此构造函数的行为是未指定的。当需要对解码过程进行更多控制时，应该使用CharsetDecoder类。
/***
参数:bytes  要解码为字符的字节
	 offset 要解码的第一个字节的索引
	 length 要解码的字节数
	 charsetName 支持的字符集的名称
*/
public String(byte[] bytes,int offset,int length,String charsetName) throws UnsupportedEncodingException
//分配一个包含字符串缓冲区参数中当前包含的字符序列的新字符串。
//复制字符串缓冲区的内容;字符串缓冲区的后续修改不影响新创建的字符串。
public String(StringBuffer buffer)
//分配一个包含字符串生成器参数中当前包含的字符序列的新字符串。
//复制字符串生成器的内容;字符串生成器的后续修改不影响新创建的字符串。
//提供这个构造函数是为了简化到StringBuilder的迁移。通过toString方法从字符串生成器获取字符串可能运行得更快，通常是首选方法。
public String(StringBuilder builder)


4、String方法

String str="hello world";
String str2="2hello world";
String str3="2Hello World";
char[] dst=new char[11];
str.getChars(0,11,dst, 0);
//返回此字符串的长度。长度等于字符串中Unicode代码单元的数量。
System.out.println("public int length():"+(str.length()));
//当且仅当length()为0时返回true
System.out.println("public boolean isEmpty():"+(str.isEmpty()));
//下标从0开始,结果为o
System.out.println("public char charAt:"+(str.charAt(7)));
//将字符串中的字符复制到目标字符数组中。
System.out.println("public void getChars(int srcBegin,int srcEnd,char[] dst,int dstBegin)():"+(dst));
//使用指定的字符集将该字符串编码为一个字节序列，并将结果存储到一个新的字节数组中。
System.out.println("public byte[] getBytes(String charsetName):"+(str.getBytes("UTF-8")));
//使用给定的字符集将该字符串编码为一个字节序列，并将结果存储到一个新的字节数组中。
System.out.println("public byte[] getBytes(Charset charset):"+(str.getBytes(Charset.forName("UTF-8"))));
//使用平台的默认字符集将该字符串编码为一个字节序列，并将结果存储到一个新的字节数组中。
System.out.println("public byte[] getBytes():"+(str.getBytes()));
//将此字符串与指定的对象进行比较。当且仅当参数不为空且为表示与此对象相同字符序列的字符串对象时，结果为真。
System.out.println("public boolean equals(Object anObject):"+(str.equals("hello world")));
//将此字符串与指定的StringBuffer进行比较。当且仅当此字符串表示与指定的StringBuffer相同的字符序列时，结果为true。
System.out.println("public boolean contentEquals(StringBuffer sb):"+(str.contentEquals(new StringBuffer("hello world"))));
//将此字符串与指定的CharSequence进行比较。当且仅当此字符串表示与指定序列相同的char值序列时，结果才为真。
//注意，如果CharSequence是一个StringBuffer，那么该方法将对其进行同步。
CharSequence cs="hello world";
System.out.println("public boolean contentEquals(CharSequence cs):"+(str.contentEquals(cs)));
//将此字符串与另一个字符串进行比较，忽略大小写因素。如果两个字符串长度相同，且两个字符串中对应的字符相同，则认为它们是相等的忽略大小写。
System.out.println("public boolean equalsIgnoreCase(String anotherString):"+(str.equalsIgnoreCase("Hello World")));
//按词法比较两个字符串。比较基于字符串中每个字符的Unicode值。
// 用这个字符串对象表示的字符序列与用参数字符串表示的字符序列在字典上进行比较。
// 如果该字符串对象在参数字符串之前按字典顺序排列，则结果为负整数。
// 如果这个字符串对象按照字典顺序跟随参数字符串，则结果是一个正整数。
// 如果字符串相等，结果是零;compareTo恰好在equals(Object)方法返回true时返回0。
System.out.println("public int compareTo(String anotherString):"+(str.compareTo("world")));
//按字典顺序比较两个字符串，忽略大小写差异。
//该方法返回一个整数，其符号是调用compareTo与字符串的规范化版本的比较，
//其中通过对每个字符调用character.tolowercase(character.touppercase(character))来消除大小写差异。
System.out.println("public int compareToIgnoreCase(String str):"+(str.compareToIgnoreCase("World")));
//测试两个字符串区域是否相等
System.out.println("public boolean regionMatches(int toffset,String other,int ooffset,int len):"
		+(str.regionMatches(0,str2,1,11)));
System.out.println("public boolean regionMatches(boolean ignoreCase,int toffset,String other,int ooffset,int len):"
		+(str.regionMatches(true,0,str3,1,11)));
//测试从指定索引开始的这个字符串的子字符串是否以指定的前缀开始。
System.out.println("public boolean startsWith(String prefix,int toffset):"+(str.startsWith("world",6)));
//测试此字符串是否以指定的前缀开始。
System.out.println("public boolean startsWith(String prefix):"+(str.startsWith("hello")));
//测试此字符串是否以指定的后缀结束。
System.out.println("public boolean endsWith(String suffix):"+(str.endsWith("world")));
//返回此字符串的哈希码。字符串对象的哈希代码计算为s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
System.out.println("public int hashCode():"+(str.hashCode()));
//返回指定字符第一次出现的字符串中的索引
System.out.println("public int indexOf(int ch):"+(str.indexOf('o')));
//返回此字符串中指定字符第一次出现的索引，从指定索引处开始搜索。
System.out.println("public int indexOf(int ch,int fromIndex):"+(str.indexOf('o',6)));
System.out.println("public int lastIndexOf(int ch):"+(str.lastIndexOf('o')));
System.out.println("public int lastIndexOf(int ch):"+(str.lastIndexOf('o',6)));
System.out.println("public int indexOf(String str):"+(str.indexOf("world")));
System.out.println("public int indexOf(String str,int fromIndex):"+(str.indexOf("world",6)));
System.out.println("public int lastIndexOf(String str):"+(str.lastIndexOf("world")));
//指示此字符串是否与给定正则表达式匹配。
System.out.println("public boolean matches(String regex):"+(str.matches("/[a-z]+")));
//For example:
//     String message = String.join("-", "Java", "is", "cool");
//     returned is: "Java-is-cool"
System.out.println("public static String join(CharSequence delimiter,CharSequence... elements)():"+(str.length()));
