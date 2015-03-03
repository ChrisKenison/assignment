// @SOURCE:/Users/ckenison/git/assignment/conf/routes
// @HASH:dbeaf1ce08bde78395fd99ca19ae559b0fbfba62
// @DATE:Tue Feb 10 13:40:42 MST 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Authentication_get0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Authentication_get0_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Authentication]).get(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "get", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Authentication_legacyLogin1_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Authentication_legacyLogin1_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Authentication]).legacyLogin(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "legacyLogin", Nil,"POST", """""", Routes.prefix + """"""))
        

// @LINE:9
private[this] lazy val controllers_Application_get2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dashboard"))))
private[this] lazy val controllers_Application_get2_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).get(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "get", Nil,"GET", """""", Routes.prefix + """dashboard"""))
        

// @LINE:10
private[this] lazy val controllers_Application_contactPage3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contact"))))
private[this] lazy val controllers_Application_contactPage3_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).contactPage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "contactPage", Nil,"GET", """""", Routes.prefix + """contact"""))
        

// @LINE:11
private[this] lazy val controllers_Application_contactComplete4_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contact"))))
private[this] lazy val controllers_Application_contactComplete4_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).contactComplete(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "contactComplete", Nil,"POST", """""", Routes.prefix + """contact"""))
        

// @LINE:12
private[this] lazy val controllers_Application_aboutPage5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("about"))))
private[this] lazy val controllers_Application_aboutPage5_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).aboutPage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "aboutPage", Nil,"GET", """""", Routes.prefix + """about"""))
        

// @LINE:13
private[this] lazy val controllers_Application_rentPage6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("rent"))))
private[this] lazy val controllers_Application_rentPage6_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).rentPage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "rentPage", Nil,"GET", """""", Routes.prefix + """rent"""))
        

// @LINE:14
private[this] lazy val controllers_Application_crudPage7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud"))))
private[this] lazy val controllers_Application_crudPage7_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).crudPage(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "crudPage", Nil,"GET", """""", Routes.prefix + """crud"""))
        

// @LINE:15
private[this] lazy val controllers_Application_removeMovie8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud"))))
private[this] lazy val controllers_Application_removeMovie8_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).removeMovie(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "removeMovie", Seq(classOf[Long]),"GET", """""", Routes.prefix + """crud"""))
        

// @LINE:16
private[this] lazy val controllers_Application_addMovie9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("crud"))))
private[this] lazy val controllers_Application_addMovie9_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).addMovie(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addMovie", Nil,"POST", """""", Routes.prefix + """crud"""))
        

// @LINE:18
private[this] lazy val controllers_Application_captcha10_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("captcha"))))
private[this] lazy val controllers_Application_captcha10_invoker = createInvoker(
play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).captcha(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "captcha", Seq(classOf[Long]),"GET", """""", Routes.prefix + """captcha"""))
        

// @LINE:21
private[this] lazy val controllers_Assets_at11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at11_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""@controllers.Authentication@.get()"""),("""POST""", prefix,"""@controllers.Authentication@.legacyLogin()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dashboard""","""@controllers.Application@.get()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contact""","""@controllers.Application@.contactPage()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contact""","""@controllers.Application@.contactComplete()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """about""","""@controllers.Application@.aboutPage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """rent""","""@controllers.Application@.rentPage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud""","""@controllers.Application@.crudPage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud""","""@controllers.Application@.removeMovie(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """crud""","""@controllers.Application@.addMovie()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """captcha""","""@controllers.Application@.captcha(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Authentication_get0_route(params) => {
   call { 
        controllers_Authentication_get0_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Authentication]).get())
   }
}
        

// @LINE:7
case controllers_Authentication_legacyLogin1_route(params) => {
   call { 
        controllers_Authentication_legacyLogin1_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Authentication]).legacyLogin())
   }
}
        

// @LINE:9
case controllers_Application_get2_route(params) => {
   call { 
        controllers_Application_get2_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).get())
   }
}
        

// @LINE:10
case controllers_Application_contactPage3_route(params) => {
   call { 
        controllers_Application_contactPage3_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).contactPage())
   }
}
        

// @LINE:11
case controllers_Application_contactComplete4_route(params) => {
   call { 
        controllers_Application_contactComplete4_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).contactComplete())
   }
}
        

// @LINE:12
case controllers_Application_aboutPage5_route(params) => {
   call { 
        controllers_Application_aboutPage5_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).aboutPage())
   }
}
        

// @LINE:13
case controllers_Application_rentPage6_route(params) => {
   call { 
        controllers_Application_rentPage6_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).rentPage())
   }
}
        

// @LINE:14
case controllers_Application_crudPage7_route(params) => {
   call { 
        controllers_Application_crudPage7_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).crudPage())
   }
}
        

// @LINE:15
case controllers_Application_removeMovie8_route(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_Application_removeMovie8_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).removeMovie(id))
   }
}
        

// @LINE:16
case controllers_Application_addMovie9_route(params) => {
   call { 
        controllers_Application_addMovie9_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).addMovie())
   }
}
        

// @LINE:18
case controllers_Application_captcha10_route(params) => {
   call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_Application_captcha10_invoker.call(play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).captcha(id))
   }
}
        

// @LINE:21
case controllers_Assets_at11_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at11_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     