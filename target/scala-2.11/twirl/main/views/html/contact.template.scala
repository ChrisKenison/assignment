
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
object contact extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[LegacyContactForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(myForm: Form[LegacyContactForm]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper.inputText
import helper._
import models.LegacyContactForm

Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*6.1*/("""

"""),_display_(/*8.2*/main("Contact")/*8.17*/{_display_(Seq[Any](format.raw/*8.18*/("""
    """),format.raw/*9.5*/("""<h1>Contact</h1>
    
    <div class='container'>
        """),_display_(/*12.10*/form(routes.Application.contactComplete)/*12.50*/{_display_(Seq[Any](format.raw/*12.51*/("""
            """),_display_(/*13.14*/inputText(myForm("name"))),format.raw/*13.39*/("""
            """),_display_(/*14.14*/inputText(myForm("email"))),format.raw/*14.40*/("""
            """),format.raw/*15.13*/("""<button type="submit">Send Message</button>
        """)))}),format.raw/*16.10*/("""
    """),format.raw/*17.5*/("""</div>
""")))}),format.raw/*18.2*/("""
"""))}
  }

  def render(myForm:Form[LegacyContactForm]): play.twirl.api.HtmlFormat.Appendable = apply(myForm)

  def f:((Form[LegacyContactForm]) => play.twirl.api.HtmlFormat.Appendable) = (myForm) => apply(myForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 10 13:40:42 MST 2015
                  SOURCE: /Users/ckenison/git/assignment/app/views/contact.scala.html
                  HASH: d92af21455398786d2aed84e4f6ebadaa35fab3f
                  MATRIX: 742->1|934->34|962->111|990->114|1013->129|1051->130|1082->135|1168->194|1217->234|1256->235|1297->249|1343->274|1384->288|1431->314|1472->327|1556->380|1588->385|1626->393
                  LINES: 26->1|31->1|33->6|35->8|35->8|35->8|36->9|39->12|39->12|39->12|40->13|40->13|41->14|41->14|42->15|43->16|44->17|45->18
                  -- GENERATED --
              */
          