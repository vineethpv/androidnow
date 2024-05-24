package com.learning.androidnow.core.common.network

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Dispatcher(val anDispatcher: AnDispatchers)

enum class AnDispatchers {
    Default,
    IO
}