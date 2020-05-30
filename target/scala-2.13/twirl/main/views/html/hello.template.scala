
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("Hello")/*1.15*/ {_display_(Seq[Any](format.raw/*1.17*/("""
    """),format.raw/*2.5*/("""<section id="content">
      <div class="wrapper doc">
        <article>
          <h1>Kanigon! Welocome to home with Kabi-Chibi-Yukabi-Kazugon!</h1>
        </article>  
        <aside>
          """),_display_(/*8.12*/commonSidebar()),format.raw/*8.27*/("""
        """),format.raw/*9.9*/("""</aside>
      </div>
    </section>
  """)))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-29T09:47:52.609775900
                  SOURCE: C:/work/play-samples-play-scala-hello-world-tutorial/app/views/hello.scala.html
                  HASH: 8f2d86b555d974a097237367998b395e5b0501f6
                  MATRIX: 811->1|832->14|871->16|903->22|1133->226|1168->241|1204->251
                  LINES: 26->1|26->1|26->1|27->2|33->8|33->8|34->9
                  -- GENERATED --
              */
          