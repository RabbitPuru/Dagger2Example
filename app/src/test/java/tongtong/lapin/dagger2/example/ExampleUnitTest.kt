package tongtong.lapin.dagger2.example

import org.junit.Test

import org.junit.Assert.*
import tongtong.lapin.dagger2.example.module.DaggerMyComponent
import tongtong.lapin.dagger2.example.module.MyClass
import tongtong.lapin.dagger2.example.module.MyComponent

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun testHelloWorld() {
        val myClass = MyClass()
        DaggerMyComponent.create().inject(myClass)
        System.out.println("result = ${myClass.injectedValue}")
    }
}