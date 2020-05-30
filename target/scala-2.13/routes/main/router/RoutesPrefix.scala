// @GENERATOR:play-routes-compiler
// @SOURCE:C:/work/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Fri May 29 09:27:28 JST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
