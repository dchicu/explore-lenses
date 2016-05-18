name := """explore-lenses"""

version := "1.0"

scalaVersion := "2.11.8"

scalacOptions := Seq("-unchecked", "-feature", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val sprayJsonV  = "1.3.2"
  val jsonLensesV = "0.6.1"
  val scalaTestV  = "2.2.5"
  Seq(
    "io.spray"          %% "spray-json"   % sprayJsonV,
    "net.virtual-void"  %% "json-lenses"  % jsonLensesV,
    "org.scalatest"     %% "scalatest"    % scalaTestV    % "test"
  )
}


