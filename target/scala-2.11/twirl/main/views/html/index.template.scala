
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Video Rental")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
"""),format.raw/*4.1*/("""    <h1>Welcome to a video rental</h1>

""")))}),format.raw/*6.2*/("""
"""))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 10 13:40:42 MST 2015
                  SOURCE: /Users/ckenison/git/assignment/app/views/index.scala.html
                  HASH: 32eefb2a188c0e55eb361a77e4ffb7876f4bd5d7
                  MATRIX: 723->1|828->18|856->21|884->41|923->43|950->44|1020->85
                  LINES: 26->1|29->1|31->3|31->3|31->3|32->4|34->6
                  -- GENERATED --
              */
          