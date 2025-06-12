# RestAssured-Reqres-TestFramework

This is a lightweight and modular API testing framework built with **Java**, **RestAssured**, and **TestNG**, targeting the [Reqres.in](https://reqres.in) fake REST API. It demonstrates best practices in structuring API automation tests using utilities, models, and assertions.

## 🚀 Features

- API testing with **RestAssured**
- Test execution with **TestNG**
- Utilities for request setup and data handling
- **POJO-based request and response models** for serialization and deserialization
- Clean, scalable project structure using the Page Object-like pattern
- Basic validations for success and failure scenarios

## 📦 Technologies Used

- Java 11+
- Maven
- RestAssured
- TestNG
- Jackson / Gson (for POJOs)
- IntelliJ IDEA



## ✅ How to Run Tests

1. Clone the repository:
```bash
git clone https://github.com/your-username/RestAssured-Reqres-TestFramework.git
```

2. Navigate to the project directory:
```bash
cd RestAssured-Reqres-TestFramework
```

3. Run the tests using Maven:
```bash
mvn clean test
```

> Or run individual test classes using your IDE (TestNG support required).



## 🧾 Serialization & Deserialization

- Request models like `LoginRequestModel` and `CreateUserRequestModel` are implemented as POJOs and automatically serialized into JSON when making API calls.
- Response models like `SingleUserResponseModel` are used to deserialize and map JSON responses into Java objects for clean validation and handling.

This makes the framework extensible and aligns with real-world API testing strategies.

## 📚 Future Enhancements

- Data-driven testing using `@DataProvider`
- Allure or ExtentReports for HTML reporting
- GitHub Actions or Jenkins for CI/CD
- Parameterized environment configs
- Full CRUD coverage and more negative tests

