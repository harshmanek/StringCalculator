# StringCalculator

A simple, robust Java string calculator with full Maven and JUnit support.

## 🚀 Features

- 🆓 **Handles empty input**: Returns 0 for an empty string.
- ➕ **Sum numbers**: Adds numbers separated by commas (`,`) or newlines (`\n`).
- 🏷️ **Custom delimiters**: Supports custom single, multi-character, and multiple delimiters (e.g. `//[***][%%]\n1***2%%3`).
- 🚫 **Negative number detection**: Throws an exception listing all negative numbers in the input.
- ⏩ **Ignores large numbers**: Numbers >= 1000 are ignored in the sum.

## 📁 Project Structure

```
StringCalculator/
├── src/
│   ├── main/java/com/harsh/stringCalculator/StringCalculator.java
│   └── test/java/com/harsh/stringCalculator/StringCalculatorTest.java
├── pom.xml
└── Readme.md
```

## 🛠️ Requirements

- Java 21
- Maven

## 🏗️ Build

```sh
mvn clean install
```

## 🧪 Run Tests

```sh
mvn test
```

## 📝 Usage Example

```java
import com.harsh.stringCalculator.StringCalculator;

public class Example {
    public static void main(String[] args) throws Exception {
        StringCalculator calc = new StringCalculator();
        System.out.println(calc.add("1,2,3")); // Output: 6
        System.out.println(calc.add("//[***]\n1***2***3")); // Output: 6
    }
}
```

## ✅ Test Cases

- 🆓 **Empty string**: Returns 0
- 1️⃣ **Single number**: Returns the number itself
- ➕ **Two or more numbers**: Returns their sum
- 🏷️ **Custom delimiter**: Handles custom single/multi/multiple delimiters
- 🔢 **Newline as delimiter**: Handles newlines as valid delimiters
- 🚫 **Negative numbers**: Throws exception listing all negatives
- ⏩ **Numbers >= 1000**: Ignored in the sum

## 📚 Example Test Cases

| Input                  | Output / Behavior                |
| ---------------------- | -------------------------------- |
| `""`                   | `0`                              |
| `"5"`                  | `5`                              |
| `"1,2,3"`              | `6`                              |
| `"1\n2,3"`             | `6`                              |
| `"//;\n1;2"`           | `3`                              |
| `"//[***]\n1***2***3"` | `6`                              |
| `"//[*][%]\n1*2%3"`    | `6`                              |
| `"-1,2"`               | Exception: Negatives not allowed |
| `"2,1001"`             | `2`                              |

## 🧑‍💻 Author

- Harsh
