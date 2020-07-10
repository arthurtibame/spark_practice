name := "Spark"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.0.0"
libraryDependencies += "log4j" % "log4j" % "1.2.16"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.0.0"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.0.0"
libraryDependencies += "org.apache.spark" % "spark-streaming-kafka-0-8-assembly_2.11" % "2.0.0"