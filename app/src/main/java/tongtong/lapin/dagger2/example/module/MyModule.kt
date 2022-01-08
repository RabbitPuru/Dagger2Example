package tongtong.lapin.dagger2.example.module

import dagger.Module
import dagger.Provides

@Module
class MyModule {
    @Provides
    fun provideHelloWorld(): String {
        return "Bonjour Tous les mondes"
    }
}