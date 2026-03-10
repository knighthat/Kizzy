plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.serialization)
}

dependencies {
    api( projects.kizzyDomain )
    implementation( projects.kizzyDomain )
    implementation( libs.kotlinx.coroutines )
    implementation( libs.bundles.ktor )
    testImplementation( libs.junit4 )
}