 数组是一种数据结构,用来存储同一类型的集合。通过一个整形下标可以访问数组中的每一个值。
 * 数字数组创建后所有元素都初始化为0
 * boolean类型数组初始化为false;
 * 对象数组初始化为null;
 1、数组拷贝
 int[] ary=new int[5];
 int[] ary2=ary;
 此时2个数组皆指向同一个内存地址
 如果想拷贝一个数组的所有值到新数组,有2个方法
 (1) ary.clone();
 (2) public static int[] copyOf(int[] original, int newLength) 
 original为想拷贝的数组
 newLength为新数组的长度 
 
2、Arrays工具类
 
 Arrays.toString(ary);//打印数组内容
 Arrays.copyOfRange(ary,1,4);//复制数组从下标1开始,下标4结束,不包含结束下标
 Arrays.sort(ary);//采用优化的快速排序算法对数组进行排序
 
 Arrays.sort(ary);
 Arrays.binarySearch(ary,5);//正序的数组使用二分查找法找5在数组中的下标
 Arrays.binarySearch(int[] a, int fromIndex, int toIndex,int key) //从数组a的fromIndex下标开始,到toIndex下标结束不包含toindex
 Arrays.fill(int[] a, int val) //把数组a的值都初始化为val
 Arrays.deepToString(ary);//二维数组的快速打印方式
 
 
 