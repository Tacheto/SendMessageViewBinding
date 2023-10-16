package com.example.sendmessageviewbinding;

import static android.provider.Settings.System.getString;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.danielstone.materialaboutlibrary.MaterialAboutActivity;
import com.danielstone.materialaboutlibrary.model.MaterialAboutList;

class ExampleMaterialAboutActivity<MaterialAboutList> extends MaterialAboutActivity {

    @Override
    @NonNull
    protected MaterialAboutList getMaterialAboutList(@NonNull Context context) {
        return new MaterialAboutList.Builder()
                .build(); // This creates an empty screen, add cards with .addCard()
    }

    @Override
    protected CharSequence getActivityTitle() {
        return getString(R.string.Sobre_Mi);
    }

}
