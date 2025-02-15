import wemi.Keys.runDirectory
import wemi.*
import wemi.dependency.Jitpack
import wemi.dependency.NoClassifier
import wemi.dependency.ProjectDependency
import wemi.publish.artifacts

val NknSdk by project {

    projectName set { "NknSdk" }
    projectGroup set { "cz.jsmith.nkn" }
    projectVersion set { "0.1.2-SNAPSHOT" }

    repositories add { Jitpack }

    libraryDependencies add { dependency("org.slf4j:slf4j-api:1.7.22") } // Logging backend

    libraryDependencies add { dependency("org.json:json:20180130") } // JSON Parser and generator

    libraryDependencies add { dependency("com.github.Darkyenus:DaveWebb:v1.2") } // Rest API
    libraryDependencies add { dependency("com.google.protobuf:protobuf-java:3.6.1") } // Proto-buffer implementation

    libraryDependencies add { dependency("net.i2p.crypto:eddsa:0.3.0") } // Crypto, Ed25519
    libraryDependencies add { dependency("org.bouncycastle:bcprov-jdk15on:1.61") } // Crypto, The rest

    publishArtifacts set { artifacts(NoClassifier, includeSources = true, includeDocumentation = false) }

}

val SimpleExample by project(path("examples")) {

    projectDependencies add { ProjectDependency(NknSdk, false) }

    repositories add { Jitpack }
    libraryDependencies add { dependency("com.github.Darkyenus:tproll:v1.3.1") } // Logging frontend

    mainClass set { "jsmith.nknsdk.examples.SimpleEx" }

    runDirectory set { projectRoot.get() }

}

val DropBenchmarkExample by project(path("examples")) {

    projectDependencies add { ProjectDependency(NknSdk, false) }

    repositories add { Jitpack }
    libraryDependencies add { dependency("com.github.Darkyenus:tproll:v1.3.1") } // Logging frontend

    mainClass set { "jsmith.nknsdk.examples.DropBenchmarkEx" }

    runDirectory set { projectRoot.get() }

}

val MulticastExample by project(path("examples")) {

    projectDependencies add { ProjectDependency(NknSdk, false) }

    repositories add { Jitpack }
    libraryDependencies add { dependency("com.github.Darkyenus:tproll:v1.3.1") } // Logging frontend

    mainClass set { "jsmith.nknsdk.examples.MulticastEx" }

    runDirectory set { projectRoot.get() }

}


val WalletExample by project(path("examples")) {

    projectDependencies add { ProjectDependency(NknSdk, false) }

    repositories add { Jitpack }
    libraryDependencies add { dependency("com.github.Darkyenus:tproll:v1.3.1") } // Logging frontend

    mainClass set { "jsmith.nknsdk.examples.WalletEx" }

    runDirectory set { projectRoot.get() }

}

val PubSubExample by project(path("examples")) {

    projectDependencies add { ProjectDependency(NknSdk, false) }

    repositories add { Jitpack }
    libraryDependencies add { dependency("com.github.Darkyenus:tproll:v1.3.1") } // Logging frontend

    mainClass set { "jsmith.nknsdk.examples.PubSubEx" }

    runDirectory set { projectRoot.get() }

}
