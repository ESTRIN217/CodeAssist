package com.tyron.layoutpreview.inflate;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.flipkart.android.proteus.ProteusContext;
import com.flipkart.android.proteus.ProteusParserFactory;
import com.flipkart.android.proteus.ViewTypeParser;

import java.util.HashMap;
import java.util.Map;

public class MaterialParserFactory implements ProteusParserFactory {

    private static final Map<String, String> sMappings = new HashMap<>();

    static {
        // Material Button Components
        sMappings.put("Button", "com.google.android.material.button.MaterialButton");
        sMappings.put("MaterialButton", "com.google.android.material.button.MaterialButton");
        
        // Material Text Input Components
        sMappings.put("EditText", "com.google.android.material.textfield.TextInputEditText");
        sMappings.put("TextInputEditText", "com.google.android.material.textfield.TextInputEditText");
        sMappings.put("TextInputLayout", "com.google.android.material.textfield.TextInputLayout");
        sMappings.put("MaterialAutoCompleteTextView", "com.google.android.material.textfield.MaterialAutoCompleteTextView");
        
        // Material Card Components
        sMappings.put("CardView", "com.google.android.material.card.MaterialCardView");
        sMappings.put("MaterialCardView", "com.google.android.material.card.MaterialCardView");
        
        // Material FloatingActionButton
        sMappings.put("FloatingActionButton", "com.google.android.material.floatingactionbutton.FloatingActionButton");
        sMappings.put("ExtendedFloatingActionButton", "com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton");
        
        // Material CheckBox
        sMappings.put("CheckBox", "com.google.android.material.checkbox.MaterialCheckBox");
        sMappings.put("MaterialCheckBox", "com.google.android.material.checkbox.MaterialCheckBox");
        
        // Material RadioButton
        sMappings.put("RadioButton", "com.google.android.material.radiobutton.MaterialRadioButton");
        sMappings.put("MaterialRadioButton", "com.google.android.material.radiobutton.MaterialRadioButton");
        
        // Material Slider
        sMappings.put("Slider", "com.google.android.material.slider.Slider");
        sMappings.put("RangeSlider", "com.google.android.material.slider.RangeSlider");
        
        // Material Switch
        sMappings.put("Switch", "com.google.android.material.switchmaterial.SwitchMaterial");
        sMappings.put("SwitchMaterial", "com.google.android.material.switchmaterial.SwitchMaterial");
        
        // Material AppBarLayout
        sMappings.put("AppBarLayout", "com.google.android.material.appbar.AppBarLayout");
        sMappings.put("CollapsingToolbarLayout", "com.google.android.material.appbar.CollapsingToolbarLayout");
        
        // Material BottomAppBar
        sMappings.put("BottomAppBar", "com.google.android.material.bottomappbar.BottomAppBar");
        
        // Material NavigationView
        sMappings.put("NavigationView", "com.google.android.material.navigation.NavigationView");
        
        // Material BottomNavigationView
        sMappings.put("BottomNavigationView", "com.google.android.material.bottomnavigation.BottomNavigationView");
        
        // Material TabLayout
        sMappings.put("TabLayout", "com.google.android.material.tabs.TabLayout");
        
        // Material ChipGroup
        sMappings.put("ChipGroup", "com.google.android.material.chip.ChipGroup");
        sMappings.put("Chip", "com.google.android.material.chip.Chip");
    }

    private final ProteusContext mContext;

    public MaterialParserFactory(ProteusContext context) {
        mContext = context;
    }

    @Nullable
    @Override
    public <T extends View> ViewTypeParser<T> getParser(@NonNull String type) {
        if (type.contains(".")) {
            return null;
        }
        String parser = sMappings.get(type);
        if (parser == null) {
            return null;
        }
        return mContext.getParser(parser);
    }
}
