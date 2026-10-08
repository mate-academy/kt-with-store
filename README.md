# Update Store Stock Using `with`

## Build and test

Install JDK 21 and set `JAVA_HOME` to its installation directory.
In IntelliJ IDEA, select JDK 21 for both Project SDK and Gradle JVM.

Run `./gradlew build` (or `.\gradlew.bat build` on Windows) to compile the project,
run tests, and check the code with detekt.

In this task, you will work with a class `StoreService` that manages a store's inventory.

The store has three types of products: shoes, shirts, and jackets. Your task is to implement a function to update the stock for each product type,
using Kotlin's `with` construct to simplify code readability.

## Requirements

- Implement the method `updateStoreStock()` in the `StoreService` class.
- This method should take a `Store` object and additional quantities of shoes, shirts, and jackets to be added to the
  store's stock.
- Use the `with` function to access the store's properties and update the stock for shoes, shirts, and jackets.
