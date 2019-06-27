1、Key

set Key value

del Key[Key...] //删除key  可删除多个key

exists Key //key是否存在

dump key //序列号key

expire key seconds //为key设置过期时间 seconds单位是秒 移除过期时间的命令有 del set getset

ttl key //查看剩余生存时间

EXPIREAT key timestamp //为key设置过期时间 timestamp是时间戳

KEYS pattern //查找所有符合pattern的key *代表多个任意符号  ?代表一个任意符号 [12]单个字符可选1,2

MIGRATE host port key destination-db timeout [COPY] [REPLACE] 
//这个命令是一个原子操作，它在执行的时候会阻塞进行迁移的两个实例，直到以下任意结果发生：迁移成
//功，迁移失败，等到超时。
• COPY ：不移除源实例上的key 。
• REPLACE ：替换目标实例上已存在的key 。



"redis.call('del', unpack(redis.call('keys','student_real_score__*')))" 0