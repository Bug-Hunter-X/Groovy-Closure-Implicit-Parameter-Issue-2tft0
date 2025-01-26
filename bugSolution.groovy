```groovy
def myMethod(Closure closure) {
  closure.call()
}

myMethod { println "Hello" }

myMethod { it -> println it }
```

In the solution, we explicitly define the implicit parameter `it` in the second closure call. This ensures that Groovy correctly binds the implicit parameter and produces the expected output.