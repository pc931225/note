1、set
存储不重复元素的集合

2、set接口最常用的2个具体实现 hashSet和treeSet
(1) hashSet
hashSet是由hashMap实现的,key为hashSet的value

自定义对象比较方法:重写hashCode()、equals()

添加的数据是无序的

(2) treeSet
treeSet是由NavigableMap实现的,key为treeSet的value

自定义对象比较方法:实现Comparable接口

添加的数据是有序的


