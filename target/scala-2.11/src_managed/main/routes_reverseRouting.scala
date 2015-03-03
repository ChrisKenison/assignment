// @SOURCE:/Users/ckenison/git/assignment/conf/routes
// @HASH:dbeaf1ce08bde78395fd99ca19ae559b0fbfba62
// @DATE:Tue Feb 10 13:40:42 MST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:21
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers {

// @LINE:21
class ReverseAssets {


// @LINE:21
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {


// @LINE:18
def captcha(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "captcha" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                        

// @LINE:13
def rentPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "rent")
}
                        

// @LINE:15
def removeMovie(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "crud" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                        

// @LINE:16
def addMovie(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "crud")
}
                        

// @LINE:11
def contactComplete(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "contact")
}
                        

// @LINE:9
def get(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "dashboard")
}
                        

// @LINE:14
def crudPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "crud")
}
                        

// @LINE:10
def contactPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "contact")
}
                        

// @LINE:12
def aboutPage(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "about")
}
                        

}
                          

// @LINE:7
// @LINE:6
class ReverseAuthentication {


// @LINE:6
def get(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:7
def legacyLogin(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix)
}
                        

}
                          
}
                  


// @LINE:21
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:21
class ReverseAssets {


// @LINE:21
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {


// @LINE:18
def captcha : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.captcha",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "captcha" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:13
def rentPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.rentPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "rent"})
      }
   """
)
                        

// @LINE:15
def removeMovie : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.removeMovie",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:16
def addMovie : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addMovie",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "crud"})
      }
   """
)
                        

// @LINE:11
def contactComplete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.contactComplete",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
      }
   """
)
                        

// @LINE:9
def get : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.get",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard"})
      }
   """
)
                        

// @LINE:14
def crudPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.crudPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "crud"})
      }
   """
)
                        

// @LINE:10
def contactPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.contactPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
      }
   """
)
                        

// @LINE:12
def aboutPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.aboutPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
      }
   """
)
                        

}
              

// @LINE:7
// @LINE:6
class ReverseAuthentication {


// @LINE:6
def get : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.get",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:7
def legacyLogin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.legacyLogin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:21
// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:21
class ReverseAssets {


// @LINE:21
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:18
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
class ReverseApplication {


// @LINE:18
def captcha(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).captcha(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "captcha", Seq(classOf[Long]), "GET", """""", _prefix + """captcha""")
)
                      

// @LINE:13
def rentPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).rentPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "rentPage", Seq(), "GET", """""", _prefix + """rent""")
)
                      

// @LINE:15
def removeMovie(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).removeMovie(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "removeMovie", Seq(classOf[Long]), "GET", """""", _prefix + """crud""")
)
                      

// @LINE:16
def addMovie(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).addMovie(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addMovie", Seq(), "POST", """""", _prefix + """crud""")
)
                      

// @LINE:11
def contactComplete(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).contactComplete(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "contactComplete", Seq(), "POST", """""", _prefix + """contact""")
)
                      

// @LINE:9
def get(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).get(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "get", Seq(), "GET", """""", _prefix + """dashboard""")
)
                      

// @LINE:14
def crudPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).crudPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "crudPage", Seq(), "GET", """""", _prefix + """crud""")
)
                      

// @LINE:10
def contactPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).contactPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "contactPage", Seq(), "GET", """""", _prefix + """contact""")
)
                      

// @LINE:12
def aboutPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).aboutPage(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "aboutPage", Seq(), "GET", """""", _prefix + """about""")
)
                      

}
                          

// @LINE:7
// @LINE:6
class ReverseAuthentication {


// @LINE:6
def get(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Authentication]).get(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "get", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:7
def legacyLogin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Authentication]).legacyLogin(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "legacyLogin", Seq(), "POST", """""", _prefix + """""")
)
                      

}
                          
}
        
    