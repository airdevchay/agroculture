package dependencies


object Deps
{
    object Firebase : Group("com.google.firebase") {
        val appIndexing = withArtifact("firebase-appindexing",VersionCode.appIndexing)
        val core = withArtifact("firebase-core", VersionCode.firebase)
        val messaging = withArtifact("firebase-messaging",VersionCode.messaging)
        val performance = withArtifact("firebase-perf-ktx",VersionCode.performance)
        val analytics = withArtifact("firebase-analytics-ktx",VersionCode.analytics)
        val crashlytics = withArtifact("firebase-crashlytics-ktx",VersionCode.crashlytics)
    }

    object Flipper : Group("com.facebook.flipper") {
        val core = withArtifact("flipper", VersionCode.flipper)
        val loader = dependency("com.facebook.soloader:soloader",VersionCode.soloader)
        val network = withArtifact("flipper-network-plugin", VersionCode.flipper)
        val noop = withArtifact("flipper-noop", VersionCode.flipper)
    }

    const val timber = "com.jakewharton.timber:timber:${VersionCode.timber}"


    abstract class Group(val group: String) {
        fun withArtifact(artifact: String, version: String): String = "$group:$artifact:$version"
    }

    private fun dependency(path: String, version: String, extension: String? = null): String =
            extension?.let {
                "$path:$version@$extension"
            } ?: "$path:$version"

}
object VersionCode
{
    const val crashlytics = ""
    const val analytics = ""
    const val performance = ""
    const val messaging = ""
    const val appIndexing = ""
    const val facebook = "8.1.0"
    const val firebase = "18.0.0"
    const val flipper = "0.87.0"
    const val soloader = "0.10.1"
    const val timber = "4.7.1"

}