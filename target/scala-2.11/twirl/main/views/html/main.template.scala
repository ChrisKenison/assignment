
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css")),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png")),format.raw/*9.97*/("""">
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.at("javascripts/hello.js")),format.raw/*10.63*/("""" type="text/javascript"></script>
    </head>
    <body>
        <div id="header">
            <nav>
                <a class="home" href=""""),_display_(/*15.40*/routes/*15.46*/.Authentication.get()),format.raw/*15.67*/(""")">Home</a>
                <a class="about" href=""""),_display_(/*16.41*/routes/*16.47*/.Application.aboutPage()),format.raw/*16.71*/("""">About</a>
                <a class="contact" href=""""),_display_(/*17.43*/routes/*17.49*/.Application.contactPage()),format.raw/*17.75*/("""">Contact</a>
                <a class="rent" href=""""),_display_(/*18.40*/routes/*18.46*/.Application.rentPage()),format.raw/*18.69*/("""">Rent Movie</a>
                <a class="crud" href=""""),_display_(/*19.40*/routes/*19.46*/.Application.crudPage()),format.raw/*19.69*/("""">Crud</a>
            </nav>
        </div>
        <div id="content">
            """),_display_(/*23.14*/content),format.raw/*23.21*/("""
"""),format.raw/*24.1*/("""        </div>
    </body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 10 13:40:42 MST 2015
                  SOURCE: /Users/ckenison/git/assignment/app/views/main.scala.html
                  HASH: c05ca071fa145c19a20db6fffb672428d2c37697
                  MATRIX: 727->1|845->31|873->33|950->84|975->89|1063->151|1077->157|1131->191|1218->252|1232->258|1284->290|1336->315|1351->321|1406->355|1574->496|1589->502|1631->523|1710->575|1725->581|1770->605|1851->659|1866->665|1913->691|1993->744|2008->750|2052->773|2135->829|2150->835|2194->858|2306->943|2334->950|2362->951
                  LINES: 26->1|29->1|31->3|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|51->23|51->23|52->24
                  -- GENERATED --
              */
          