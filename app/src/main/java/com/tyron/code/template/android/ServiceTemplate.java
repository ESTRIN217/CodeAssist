package com.tyron.code.template.android;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;
import com.tyron.code.template.java.JavaClassTemplate;

public class ServiceTemplate extends JavaClassTemplate {

    public ServiceTemplate() {
        super();
    }

    public ServiceTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "Service";
    }

    @Override
    public void setup() {
        setContents("package " + CodeTemplate.PACKAGE_NAME + ";\n\n" +
                "import android.app.Service;\n" +
                "import android.content.Intent;\n" +
                "import android.os.Binder;\n" +
                "import android.os.IBinder;\n" +
                "import androidx.annotation.Nullable;\n\n" +
                "public class " + CodeTemplate.CLASS_NAME + " extends Service {\n\n" +
                "   private final IBinder binder = new LocalBinder();\n\n" +
                "   public class LocalBinder extends Binder {\n" +
                "       " + CodeTemplate.CLASS_NAME + " getService() {\n" +
                "           return " + CodeTemplate.CLASS_NAME + ".this;\n" +
                "       }\n" +
                "   }\n\n" +
                "   @Override\n" +
                "   public int onStartCommand(Intent intent, int flags, int startId) {\n" +
                "       return START_STICKY;\n" +
                "   }\n\n" +
                "   @Nullable\n" +
                "   @Override\n" +
                "   public IBinder onBind(Intent intent) {\n" +
                "       return binder;\n" +
                "   }\n\n" +
                "   @Override\n" +
                "   public void onDestroy() {\n" +
                "       super.onDestroy();\n" +
                "   }\n" +
                "}");
    }
}
