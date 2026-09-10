# Java 学习进度

## 当前阶段

截至 2026-09-10：Java 基础、面向对象、集合、异常、字符串、日期时间、文件读写、方法重载和参数传递已完成并经过对话 Review。Maven 项目结构与 JUnit 第一个测试已完成（3 个测试全部通过）。

## 已完成

- Java 程序结构与 `main` 方法
- `String`、`int`、`double`、`boolean`
- 整数除法与小数除法
- 自动类型转换与强制类型转换
- `Integer.parseInt`
- 算术、比较、逻辑运算符
- `if / else if / else`
- 条件边界判断
- 普通 `for`、增强 `for` 与 `while`
- 数组初始化、遍历、求和、平均分、计数和最大值
- 方法定义、参数、返回值和调用
- `void` 方法与 `double` 返回值方法
- 在方法中处理零人数边界条件
- 方法模块测试
- 类、对象、字段、构造方法与 `this`
- 封装：`private`、getter/setter 与分数范围校验
- 实例成员与 `static` 成员的区别
- `extends` 继承、`super` 构造调用与父类方法调用
- `@Override` 方法重写与多态
- `implements` 接口实现、接口类型参数与不同实现的调用
- `ArrayList` 的创建、增删改查与增强 `for` 遍历
- `List` 接口、`ArrayList` 实现类与泛型 `List<Student>`
- 集合统计和 `size()` 的基本使用
- 异常：`try-catch`、具体异常类型、`throw` 与异常向上传递
- `String` 常用方法、字符串比较和不可变性
- `StringBuilder` 的追加与转换
- `LocalDate`、星期计算和下次生日日期计算
- `Path`、`Files` 文件创建目录、写入、读取和存在性判断
- 方法重载：按参数列表区分重载，不能只按返回类型区分
- Java 参数按值传递：基本类型复制值，对象参数复制引用值
- Maven 项目结构：`pom.xml`、`src/main` 与 `src/test` 分工、依赖坐标与 `scope=test`
- JUnit 5：`@Test`、`assertTrue` / `assertFalse` / `assertThrows`，测试类独立于 main 方法运行

## Maven 与 JUnit 练习记录（Maven-learn 项目）

- `junit-jupiter 5.11.4` 依赖已正常下载；IDEA 报"找不到依赖项"时通过加载 Maven 变更解决。
- 简化版 Student（name/age/score 字段、getScore/setScore/isQualified）放入 `src/main/java`，无包名。
- 构造方法与 `setScore` 都调用 `checkScore` 校验分数（fail fast），非法分数抛 `IllegalArgumentException`；学习者自己决定构造方法也校验。
- 第一个测试类 `StudentTest` 三个用例全部通过：85 分合格、59 分不合格、setScore(120) 与构造 150 分抛异常。

## 集合模块 Review

- `List<Student>` 中的 `Student` 限定列表元素类型，并帮助编译器检查类型。
- `List` 是接口，`ArrayList` 是具体实现；面向接口声明便于替换实现。
- 数组使用 `length` 字段，`List` 使用 `size()` 方法；数组长度固定，列表元素数量可以变化。
- `remove(0)` 删除下标为 `0` 的第一个元素。
- `student.isQualified()` 与 `student.getScore() >= 60` 当前结果相同，但前者把及格规则封装在 Student 内部，更容易维护。

## 当前练习与复习重点

- `People` 保存姓名、年龄并提供介绍方法；`Student` 继承它并重写介绍方法。
- `Student` 和 `Teacher` 实现 `Learnable`；`Main.startLearning(Learnable learner)` 统一调用 `study()`，该练习已通过代码 Review。
- 编译时根据声明类型检查可调用的方法；运行时被重写的实例方法根据实际对象选择实现。
- 子类没有重写时使用父类实现；`super` 不能绕过父类字段的 `private` 限制。
- 静态方法没有 `this`，与字段是否 `public` 无关。
- Student 构造方法仍可直接接收无效分数；待异常章节统一讨论创建和修改时的校验。
- 包装类型仅初步介绍；Java 按值传递、方法重载和调试尚未专题实践，后续补充。
- 对象参数可以修改同一个对象的内部状态，但在方法内重新赋值不会改变调用方引用。
- 测试方法应一个方法只验证一个行为，避免多个场景合并在一个测试方法里导致失败时无法定位。
- 校验方法成功时保持沉默、失败时抛异常（卫语句写法）；不混入打印输出。
- 本次进度依据对话中的代码和答题记录，未重新编译运行本地源码。
- `Files.writeString()` 默认覆盖文件内容；文件读写练习已确认使用具体的 `IOException` 捕获。

## 待学习

- Maven 常用命令补充（`mvn compile` / `test` / `package`）
- 基础调试补充
- Spring Boot
- 数据库
- Vue 对接 Java API

## 学习约定

- 学习者先思考和实现，除非主动要求，否则只提供提示。
- 每个功能完成后进行代码 Review。
- 发现问题时先解释原因，再给修改建议。
- 每个模块完成后安排 3～5 道测试题。
- Java 概念尽量类比 Vue 3、TypeScript 与 NestJS。
- 不为了显得高级而引入尚未学习的技术。
- 最后通过一个完整项目检验掌握程度。
- 先讲必要的理论和语法，再安排练习；已理解的重复输出、排版等小细节可以略过，核心概念错误仍需澄清。
- 新会话先读取本文件、LEARNING_PLAN.md 和 SESSION_LOG.md，按当前阶段继续；后续路线保留在 LEARNING_PLAN.md 中。
