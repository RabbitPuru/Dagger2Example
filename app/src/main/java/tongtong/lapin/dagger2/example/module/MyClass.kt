package tongtong.lapin.dagger2.example.module

import javax.inject.Inject

class MyClass {
    @Inject
    lateinit var injectedValue: String
}