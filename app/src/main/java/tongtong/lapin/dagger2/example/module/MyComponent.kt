package tongtong.lapin.dagger2.example.module

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MyModule::class])
interface MyComponent {
    fun inject(myClass: MyClass)
}