/*
 * Copyright (C) 2015 Twitter, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.digits.sdk.android;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

public class AccentButton extends Button {
    public AccentButton(Context context) {
        this(context, null);
    }

    public AccentButton(Context context, AttributeSet attrs) {
        this(context, attrs, android.R.attr.buttonStyle);
    }

    public AccentButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init();
    }

    private void init() {
        final int accentColor = ThemeUtils.getAccentColor(getResources(), getContext().getTheme());
        final ButtonThemer buttonThemer = new ButtonThemer(getResources());

        buttonThemer.disableDropShadow(this);
        buttonThemer.setBackgroundAccentColor(this, accentColor);
        buttonThemer.setTextAccentColor(this, accentColor);
    }
}
