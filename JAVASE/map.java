1、map
键值对存储

(1)HashMap

底层实现:数组和链表结构

最常用的Map,它根据键的HashCode 值存储数据,根据键可以直接获取它的值，具有很快的访问速度。
HashMap最多只允许一条记录的键为Null(多条会覆盖);允许多条记录的值为 Null。非同步的。

(2)TreeMap

底层实现:红黑树

能够把它保存的记录根据键(key)排序,默认是按升序排序，也可以指定排序的比较器，当用Iterator 遍历TreeMap时，
得到的记录是排过序的。TreeMap不允许key的值为null。非同步的。

(3)Hashtable
与 HashMap类似,不同的是:key和value的值均不允许为null;它支持线程的同步，即任一时刻只有一个线程能写Hashtable,
因此也导致了Hashtale在写入时会比较慢。

(4)LinkedHashMap
保存了记录的插入顺序，在用Iterator遍历LinkedHashMap时，先得到的记录肯定是先插入的.在遍历的时候会比HashMap慢。
key和value均允许为空，非同步的。

自行实现Map
一个用于帮助我们实现自己的Map类的抽象类 AbstractMap