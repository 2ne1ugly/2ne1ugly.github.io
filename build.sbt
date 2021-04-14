import org.scalajs.linker.interface.{ModuleInitializer, ModuleSplitStyle}

name := "me"
scalaVersion := "2.13.4"

enablePlugins(ScalaJSPlugin)

lazy val root = (project in file("."))
  .settings(name := "me")
  .enablePlugins(ScalaJSPlugin)
  .settings(
    scalacOptions ++= Seq(
      "-unchecked",
      "-deprecation",
      "-feature",
      "-Xlint:nullary-unit,inaccessible,infer-any,missing-interpolator,private-shadow,type-parameter-shadow,poly-implicit-overload,option-implicit,delayedinit-select,stars-align",
      "-Xcheckinit",
      "-language:higherKinds",
      "-language:implicitConversions",
      "-Ymacro-annotations"
    ),
    libraryDependencies ++= Seq(
      "com.raquo"     %%% "laminar"     % "0.12.2",
      "com.raquo"     %%% "airstream"   % "0.12.2",
      "io.laminext"   %%% "core"        % "0.12.3",
      "io.frontroute" %%% "frontroute"  % "0.12.2",
      "dev.zio"       %%% "zio-prelude" % "1.0.0-RC3"
    ),
    scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.ESModule) },
    scalaJSLinkerConfig ~= { _.withModuleSplitStyle(ModuleSplitStyle.FewestModules) },
    scalaJSLinkerConfig ~= { _.withSourceMap(false) },
    addCommandAlias("dev", ";~fastLinkJS"),
    scalaJSUseMainModuleInitializer := true,
    scalaJSMainModuleInitializer := Some(ModuleInitializer.mainMethod("io._2ne1ugly.me.main.Main", "main"))
  )
