# Java 学习进度

## 当前阶段

截至 2026-09-07：方法测试、面向对象基础和接口多态练习已完成并经过对话 Review。下一节从集合与泛型入门开始，先讲数组与 `ArrayList` 的区别，再安排练习。

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

## 当前练习与复习重点

- `People` 保存姓名、年龄并提供介绍方法；`Student` 继承它并重写介绍方法。
- `Student` 和 `Teacher` 实现 `Learnable`；`Main.startLearning(Learnable learner)` 统一调用 `study()`，该练习已通过代码 Review。
- 编译时根据声明类型检查可调用的方法；运行时被重写的实例方法根据实际对象选择实现。
- 子类没有重写时使用父类实现；`super` 不能绕过父类字段的 `private` 限制。
- 静态方法没有 `this`，与字段是否 `public` 无关。
- Student 构造方法仍可直接接收无效分数；待异常章节统一讨论创建和修改时的校验。
- 包装类型仅初步介绍；Java 按值传递、方法重载和调试尚未专题实践，后续补充。
- 本次进度依据对话中的代码和答题记录，未重新编译运行本地源码。

## 待学习

- 集合与泛型：先 `ArrayList` / `List`，再 `Set` / `Map`
- 异常处理
- 字符串、日期时间与文件操作
- 基础调试、方法重载与按值传递补充
- Maven 与 JUnit
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
