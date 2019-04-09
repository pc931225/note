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

