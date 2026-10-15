/*
    Maven is a build automation tool for Java projects. It is a software project management and comprehension tool.

    Normal flow of a Java Application:

    Source code --> Compiler --> Bytecode --> Unit test --> JAR/War file --> Deployment


    Maven automates the compilation, testing, packaging of Java projects and also helps in dependency management.


    Maven Terminologies:

    java simple app command: mvn archetype:generate -DgroupId=com.abhishek -DartifactId=maven-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
    java web app command: mvn archetype:generate -DgroupId=com.abhishek -DartifactId=maven-web-app -DarchetypeArtifactId=maven-archetype-webapp -DarchetypeVersion=1.0 -DinteractiveMode=false


    Archetype: Is a template that defines the structure of a Maven project.

    Examples:
    - maven-archetype-quickstart -> Java stand-alone application
    - maven-archetype-webapp -> Java web application

    =========================================================================

    GroupId: Represents the organization or company that owns the project.

    Examples:
    - com.abhishek -> Abhishek's project
    - com.tcs -> TCS's project
    - com.ibm -> IBM's project

    Note: Group ID follows reverse domain name notation. Typically representing a company or organization.

    =========================================================================

    ArtifactId: Represents the name of the project/module.

    Examples:
    amazon-app, flipkart-app, google-app

    =========================================================================

    Version: Represents the version of the project.

    Examples:
    0.0.1-SNAPSHOT, 1.0-RELEASE

    SNAPSHOT- Under development, not yet released.

    RELEASE- Final version, delivered to the client.]

    =========================================================================

    Packaging type: Represents the packaging type of the project.

    Examples:
    jar, war

    Note: The default packaging type is jar if not specified.

    =========================================================================

    Maven Dependencies: Libraries or external modules required for the project development.

    Examples:
    spring, hibernate, junit, kafka, redis

    You can search for and find maven dependencies at: https://mvnrepository.com

    =========================================================================

    Maven Goals: Used to perform specific steps in the Maven build lifecycle.

    Examples:
    clean, compile, test, package, install, deploy

    =========================================================================

    Maven Repositories: Storage locations for Maven dependencies (artifacts/libraries).

    Examples:
    Central Repository, Local Repository, Remote Repository
*/