```groovy
def myMethod(Closure closure) {
  closure.call()
}

myMethod { println "Hello" }

myMethod { println it }
```