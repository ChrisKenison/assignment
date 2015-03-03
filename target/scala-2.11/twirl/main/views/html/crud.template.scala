
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
import com.sofi.models.Movie
/**/
object crud extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Movie],Form[AddMovieForm],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(mov: List[Movie], myForm : Form[AddMovieForm]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import models.AddMovieForm

Seq[Any](format.raw/*3.49*/("""

"""),format.raw/*7.1*/("""
"""),_display_(/*8.2*/main("test")/*8.14*/{_display_(Seq[Any](format.raw/*8.15*/("""
    """),format.raw/*9.5*/("""<h1>Crud</h1>

    """),_display_(/*11.6*/for(a<-mov) yield /*11.17*/ {_display_(Seq[Any](format.raw/*11.19*/("""
        """),format.raw/*12.9*/("""<div class='movieContainer'>
            <img src='"""),_display_(/*13.24*/routes/*13.30*/.Application.captcha(a.getId())),format.raw/*13.61*/("""'>
            <div class='containter'>
                <h1>"""),_display_(/*15.22*/a/*15.23*/.getName()),format.raw/*15.33*/("""</h1>
            </div>
            <div class='containter'>
                <p class='description'>"""),_display_(/*18.41*/a/*18.42*/.getDescription()),format.raw/*18.59*/("""</p>
            </div>
            <div class='container'>
                <p class='runLength'>"""),_display_(/*21.39*/a/*21.40*/.getRunLength()),format.raw/*21.55*/("""</p>
                <p class='rating'>"""),_display_(/*22.36*/a/*22.37*/.getRating()),format.raw/*22.49*/("""</p>
            </div>
            <div class='container'>
                """),_display_(/*25.18*/if(a.getIsRented())/*25.37*/{_display_(Seq[Any](format.raw/*25.38*/("""
                    """),format.raw/*26.21*/("""<p class='smallInctiveText'>Rented</p>
                """)))}/*27.18*/else/*27.23*/{_display_(Seq[Any](format.raw/*27.24*/("""
                    """),format.raw/*28.21*/("""<p class='smallActiveText'>Available</p>
                """)))}),format.raw/*29.18*/("""
                """),format.raw/*30.17*/("""<a href='"""),_display_(/*30.27*/routes/*30.33*/.Application.removeMovie(a.getId())),format.raw/*30.68*/("""' class='mallActiveText'>Delete</a>
            </div>
        </div>
    """)))}),format.raw/*33.6*/("""

    """),format.raw/*35.5*/("""<div class='movieContainer'>
        <img src='"""),_display_(/*36.20*/routes/*36.26*/.Assets.at("images/movie_add.png")),format.raw/*36.60*/("""' />
        """),_display_(/*37.10*/form(routes.Application.addMovie)/*37.43*/ {_display_(Seq[Any](format.raw/*37.45*/("""
            """),_display_(/*38.14*/inputText(myForm("name"))),format.raw/*38.39*/(""";
            """),_display_(/*39.14*/inputText(myForm("description"))),format.raw/*39.46*/(""";
            """),_display_(/*40.14*/inputText(myForm("rating"))),format.raw/*40.41*/(""";
            """),_display_(/*41.14*/inputText(myForm("runLength"))),format.raw/*41.44*/(""";
            """),_display_(/*42.14*/inputFile(myForm("movieImage"))),format.raw/*42.45*/(""";
            <button type="submit">Add Movie</button>
        """)))}),format.raw/*44.10*/("""
    """),format.raw/*45.5*/("""</div>
""")))}),format.raw/*46.2*/("""
"""))}
  }

  def render(mov:List[Movie],myForm:Form[AddMovieForm]): play.twirl.api.HtmlFormat.Appendable = apply(mov,myForm)

  def f:((List[Movie],Form[AddMovieForm]) => play.twirl.api.HtmlFormat.Appendable) = (mov,myForm) => apply(mov,myForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 10 13:42:47 MST 2015
                  SOURCE: /Users/ckenison/git/assignment/app/views/crud.scala.html
                  HASH: 9863749ac5f8f5fe6f8a448bfe286643ebf9c5af
                  MATRIX: 774->32|951->79|979->126|1006->128|1026->140|1064->141|1095->146|1141->166|1168->177|1208->179|1244->188|1323->240|1338->246|1390->277|1478->338|1488->339|1519->349|1648->451|1658->452|1696->469|1821->567|1831->568|1867->583|1934->623|1944->624|1977->636|2081->713|2109->732|2148->733|2197->754|2272->810|2285->815|2324->816|2373->837|2462->895|2507->912|2544->922|2559->928|2615->963|2720->1038|2753->1044|2828->1092|2843->1098|2898->1132|2939->1146|2981->1179|3021->1181|3062->1195|3108->1220|3150->1235|3203->1267|3245->1282|3293->1309|3335->1324|3386->1354|3428->1369|3480->1400|3575->1464|3607->1469|3645->1477
                  LINES: 26->3|30->3|32->7|33->8|33->8|33->8|34->9|36->11|36->11|36->11|37->12|38->13|38->13|38->13|40->15|40->15|40->15|43->18|43->18|43->18|46->21|46->21|46->21|47->22|47->22|47->22|50->25|50->25|50->25|51->26|52->27|52->27|52->27|53->28|54->29|55->30|55->30|55->30|55->30|58->33|60->35|61->36|61->36|61->36|62->37|62->37|62->37|63->38|63->38|64->39|64->39|65->40|65->40|66->41|66->41|67->42|67->42|69->44|70->45|71->46
                  -- GENERATED --
              */
          