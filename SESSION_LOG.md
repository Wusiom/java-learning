# 学习记录

历史条目的“下一步”保留当时安排，最新续学入口以 PROGRESS.md 为准。

## 2026-09-04

### 本次完成

- 确认 JDK 21 和 IntelliJ IDEA 已安装并可用。
- 完成 Java 第一个程序：类、`main` 方法、变量声明和控制台输出。
- 理解 `String`、`int`、`double`、`boolean`。
- 理解整数除法、小数除法、强制类型转换和字符串转整数。
- 完成成绩判断练习。
- 理解 `&&`、`||` 和条件边界判断。

### 已暴露的问题

- 容易混淆整数除法和浮点除法。
- `Integer.parseInt()` 只能解析整数格式，例如 `"12"`，不能解析 `"12.0"`。
- 条件分支需要覆盖所有情况，避免局部条件导致变量可能未初始化。

### 下一步

- 学习方法。

## 2026-09-07（方法）

### 本次完成

- 定义并调用返回 `int` 的加法方法。
- 定义并调用返回 `boolean` 的及格判断方法。
- 理解 `Integer`、`Boolean` 包装类型与 `int`、`boolean` 基本类型的区别。

### 下一步

- 学习 `void` 方法、参数传递和方法调用过程。

### 后续完成

- 编写 `void` 欢迎方法并在 `main` 中调用。
- 编写平均分方法，在人数为 `0` 时返回 `0.0`。
- 修正方法名拼写并确保定义和调用一致。

### 下一步

- 完成方法模块测试。

## 2026-09-07

### 本次完成

- 完成数组初始化和增强 `for` 遍历。
- 完成数组总和、平均分、及格人数和最高分统计。
- 完成 `while` 循环输出 `1～10` 并计算总和。
- 理解数组下标从 `0` 开始、数组越界、整数除法和循环变量更新。
- 通过循环与数组模块测试。

### Review 记录

- 增强 `for` 直接提供元素值，不直接提供数组下标。
- 最大值初始化为 `0` 只适合当前非负分数场景，更通用的方式是使用第一个元素初始化。
- `i++` 是先使用当前值再自增，`++i` 是先自增再使用。

### 下一步

- 学习方法的定义、参数、返回值和调用。

## 2026-09-07（方法测试、面向对象与接口）

### 本次完成

- 方法测试通过，理解返回类型、参数、调用和 `return`。
- 完成 Student 类、构造方法、实例方法以及 Main 中创建对象的练习。
- 完成 getter/setter 校验，非法修改保留原分数；封装小测通过。
- 理解实例成员与静态成员：静态方法没有 `this`。
- 将姓名、年龄、介绍方法提取到 People，Student 使用 `extends` 与 `super`。
- 完成介绍方法重写，先调用父类实现再输出分数。
- 学习父类引用和接口引用的多态调用；纠正“没重写也会执行子类版本”的误解。
- 完成 Learnable 接口、Student/Teacher 实现，以及 startLearning 接口参数练习；接口问答与练习通过。

### 教学调整与待跟进

- 用户希望核心要点正确即可，重复输出等小细节可略过。
- 构造方法中的分数校验留待异常章节讨论。
- 参数按值传递、方法重载与调试尚未专题实践，不标记为已完成。
- 本次按对话提交的代码进行 Review，未重新运行本地代码。

### 下一步

- 先讲数组与 ArrayList 的区别，以及 List 接口和泛型的基础语法。
- 再安排集合练习，完成后 Review 并出 3～5 道模块测试题。

## 2026-09-08（集合与泛型）

### 本次完成

- 理解数组与 `ArrayList` 的区别。
- 使用 `ArrayList<Integer>` 完成添加、读取、修改、删除、遍历和求和。
- 使用 `List<Student>` 保存学生对象。
- 使用增强 `for` 调用学生方法并统计及格人数。
- 理解 `List` 接口、`ArrayList` 实现类和泛型元素类型。
- 集合模块测试通过；补充纠正 `size()` 与数组 `length` 的区别。

### Review 记录

- `size()` 是 `List` 的方法，表示当前元素数量；数组的 `length` 是字段，表示固定长度。
- `isQualified()` 与外部写 `getScore() >= 60` 当前结果相同，但 `isQualified()` 更好地封装了及格规则。

### 下一步

- 学习异常处理，以及如何处理非法输入、数组越界和除零问题。

## 2026-09-10（异常、字符串、日期与文件）

### 本次完成

- 使用 `try-catch` 捕获 `NumberFormatException` 和 `ArithmeticException`。
- 使用 `throw new IllegalArgumentException` 校验分数，并理解异常交给调用者处理。
- 完成 `Set` 和 `Map` 基础练习及测试。
- 完成 `String` 比较、常用方法和不可变性练习。
- 使用 `StringBuilder` 循环拼接文本，并处理最后一个分隔符。
- 使用 `LocalDate` 和 `ChronoUnit` 计算日期及下次生日。
- 使用 `Path`、`Files` 完成目录创建、文件写入、读取和存在性判断。
- 文件读写模块测试通过。

### Review 记录

- `Path.of("data", "message.txt")` 是相对于程序 Working directory 的相对路径。
- `Files.writeString()` 不会自动创建缺失的父目录，需要先调用 `Files.createDirectories(path.getParent())`。
- `Files.writeString()` 默认覆盖已有文件内容。
- 文件操作使用具体的 `IOException` 捕获；包装成 `RuntimeException` 会把异常继续向外抛出。

### 下一步

- 学习方法重载、Java 参数按值传递和基础调试。

## 2026-09-10（方法重载与参数传递）

### 本次完成

- 使用相同方法名、不同参数类型完成方法重载。
- 理解不能仅通过返回类型区分重载。
- 验证基本类型参数在方法内修改不会影响外部变量。
- 验证对象参数可以修改同一个对象的字段。
- 验证方法内重新给对象参数赋值不会改变调用方引用。
- 方法重载与参数传递模块测试通过。

### Review 记录

- `add(1, 2)` 调用 `int` 版本，`add(1.0, 3.4)` 调用 `double` 版本。
- `Student` 参数传递的是引用值的副本，因此可以通过它修改原对象，但不能替换调用方变量指向的对象。

### 下一步

- 学习 Maven 项目结构和 JUnit 单元测试。

## 2026-09-10（Maven 与 JUnit 入门）

### 本次完成

- 排查并解决 IDEA"找不到依赖项 org.junit.jupiter"：依赖声明正确，本地仓库缺 jar，加载 Maven 变更后下载成功。
- 理解 `pom.xml` 与 `package.json`、`~/.m2/repository` 与 `node_modules` 的类比，`scope=test` 类比 devDependencies。
- 在 Maven-learn 项目创建无包名的简化版 Student，构造方法与 `setScore` 均调用 `checkScore`，非法分数抛 `IllegalArgumentException`（学习者自己决定构造方法也校验，理解 fail fast）。
- Review 指出：初版误引用旧项目的 People/Learnable 导致编译不过，已删除；校验方法去掉"分数合格"打印。
- 编写第一个 JUnit 测试类 StudentTest，三个用例（85 合格、59 不合格、非法分数抛异常）全部通过。
- Review 指出：一个测试方法只验证一个行为，构造校验与 setScore 校验应拆成两个测试。
- Maven 与 JUnit 模块测试通过（4 题对 3 题；scope 缺省为 compile、测试框架会进入正式包一题不清楚，已补讲，类比 devDependencies）。

### Review 记录

- 改完 `pom.xml` 需要加载 Maven 变更才会下载依赖，类似改 `package.json` 后要 `npm install`。
- 边界测试选 59 而不是 30：bug 最容易藏在边界（`>=` 误写为 `>`）。
- 校验方法成功时沉默、失败时抛异常；测试靠断言验证而非打印。

### 下一步

- 进入 Spring Boot 项目结构；Maven 常用命令（mvn compile/test/package）可在 Spring Boot 前顺带补一课。

## 2026-09-15（Spring Boot Web CRUD 入门）

### 本次完成

- 创建并启动 Spring Boot Web 项目，理解 starter、内嵌 Tomcat 和 8080 端口。
- 使用 `@RestController`、`@GetMapping`、`@PostMapping`、`@PutMapping`、`@DeleteMapping` 实现 Student CRUD。
- 使用 `@RequestParam`、`@PathVariable` 和 `@RequestBody` 完成请求参数绑定。
- 使用 `@Service` 与构造器注入划分 HTTP 层和业务层，内存 `List<Student>` 暂代数据库。
- 使用 `ResponseEntity` 返回 201、204、404 和 409；理解 400 与 405 的区别。
- 创建 Create/Update DTO，并使用 Jakarta Validation 校验姓名与分数。

### Review 记录

- Service 不返回 `ResponseEntity`；业务结果由 Controller 转换为 HTTP 状态。
- PUT 的资源 ID 来自路径，Update DTO 不包含 ID；真实项目创建 ID 通常由数据库或程序生成。
- 重复 ID 是业务规则，应在 Service 检查；当前内存练习由 Create DTO 提供 ID。
- 修改依赖或 Controller 后需重新加载 Maven 并重启应用，运行中的 JVM 不会自动使用新字节码。

### 下一步

- 完成 Spring Boot Web CRUD 模块测试题，再学习 Service 自动化测试和统一异常处理。
