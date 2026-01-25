package com.tyron.code.template.android;

import android.os.Parcel;

import com.tyron.code.template.CodeTemplate;
import com.tyron.code.template.java.JavaClassTemplate;

public class BroadcastReceiverTemplate extends JavaClassTemplate {

    public BroadcastReceiverTemplate() {
        super();
    }

    public BroadcastReceiverTemplate(Parcel in) {
        super(in);
    }

    @Override
    public String getName() {
        return "BroadcastReceiver";
    }

    @Override
    public void setup() {
        setContents("package " + CodeTemplate.PACKAGE_NAME + ";\n\n" +
                "import android.content.BroadcastReceiver;\n" +
                "import android.content.Context;\n" +
                "import android.content.Intent;\n" +
                "import android.util.Log;\n\n" +
                "public class " + CodeTemplate.CLASS_NAME + " extends BroadcastReceiver {\n\n" +
                "   private static final String TAG = \"" + CodeTemplate.CLASS_NAME + "\";\n\n" +
                "   @Override\n" +
                "   public void onReceive(Context context, Intent intent) {\n" +
                "       String action = intent.getAction();\n" +
                "       Log.d(TAG, \"Received broadcast: \" + action);\n\n" +
                "       if (Intent.ACTION_BOOT_COMPLETED.equals(action)) {\n" +
                "           // Handle boot completed\n" +
                "       }\n" +
                "   }\n" +
                "}");
    }
}
