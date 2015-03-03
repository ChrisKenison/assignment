
package views.html.auth

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
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[LegacyLoginForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(logForm: Form[LegacyLoginForm]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper.inputText
import helper.inputPassword
import helper._
import models.LegacyLoginForm

Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*7.1*/("""
"""),_display_(/*8.2*/main("Login")/*8.15*/{_display_(Seq[Any](format.raw/*8.16*/("""
    """),format.raw/*9.5*/("""<h1>TESTING</h1>

    <p>Please login:</p>
    <div class='containter'>
         """),_display_(/*13.11*/form(routes.Authentication.legacyLogin)/*13.50*/{_display_(Seq[Any](format.raw/*13.51*/("""
             """),_display_(/*14.15*/inputText(logForm("username"))),format.raw/*14.45*/("""
             """),_display_(/*15.15*/inputPassword(logForm("password"))),format.raw/*15.49*/("""
             """),format.raw/*16.14*/("""<button class="btn btn-primary btn-maincta" type="submit">Sign In</button>
         """)))}),format.raw/*17.11*/("""
    """),format.raw/*18.5*/("""</div>
""")))}),format.raw/*19.2*/("""
"""))}
  }

  def render(logForm:Form[LegacyLoginForm]): play.twirl.api.HtmlFormat.Appendable = apply(logForm)

  def f:((Form[LegacyLoginForm]) => play.twirl.api.HtmlFormat.Appendable) = (logForm) => apply(logForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 10 13:40:43 MST 2015
                  SOURCE: /Users/ckenison/git/assignment/app/views/auth/login.scala.html
                  HASH: cb8f41c62bb6922b0d8547455ed18b842116ec88
                  MATRIX: 743->1|960->33|988->137|1015->139|1036->152|1074->153|1105->158|1214->240|1262->279|1301->280|1343->295|1394->325|1436->340|1491->374|1533->388|1649->473|1681->478|1719->486
                  LINES: 26->1|32->1|34->7|35->8|35->8|35->8|36->9|40->13|40->13|40->13|41->14|41->14|42->15|42->15|43->16|44->17|45->18|46->19
                  -- GENERATED --
              */
          