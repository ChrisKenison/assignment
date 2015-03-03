import com.sofi.spring.ContextManager;

import configs.AppConfig;
import configs.DataConfig;
import play.Application;
import play.GlobalSettings;
import play.Logger;

public class Global extends GlobalSettings {
    @Override
    public void onStart(Application app) {
        super.onStart(app);

        Logger.of("Global OnStart").error("onStart");

        ContextManager.start(AppConfig.class, DataConfig.class);
    }

    @Override
    //when play tries to create controller hooks to routers
    public <A> A getControllerInstance(Class<A> clazz) {
        Logger.of("Global OnStart").debug("getControllerInstance: " + clazz.getSimpleName());
        return ContextManager.getContext().getBean(clazz);
    }

    @Override
    public void onStop(Application arg0) {
        ContextManager.stop();
        super.onStop(arg0);
    }
}
