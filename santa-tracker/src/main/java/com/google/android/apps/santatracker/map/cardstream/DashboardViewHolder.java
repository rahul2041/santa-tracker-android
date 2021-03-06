/*
 * Copyright (C) 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.apps.santatracker.map.cardstream;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextSwitcher;
import android.widget.TextView;

import com.google.android.apps.santatracker.R;

public class DashboardViewHolder extends CardViewHolder {

    public TextView locationLabel, countdownLabel;
    public TextSwitcher location, presents, countdown;
    public ViewGroup presentsContainer, countdownContainer;

    DashboardViewHolder(View itemView) {
        super(itemView);
        locationLabel = (TextView) itemView.findViewById(R.id.dash_location_label);
        location = (TextSwitcher) itemView.findViewById(R.id.dash_location);
        presentsContainer = (ViewGroup) itemView.findViewById(R.id.dash_presents_container);
        presents = (TextSwitcher) itemView.findViewById(R.id.dash_presents);
        countdownContainer = (ViewGroup) itemView.findViewById(R.id.dash_countdown_container);
        countdownLabel = (TextView) itemView.findViewById(R.id.dash_countdown_label);
        countdown = (TextSwitcher) itemView.findViewById(R.id.dash_countdown);
    }

    @Override
    public void setTypefaces(Typeface label, Typeface text) {
        setTypeface(new TextSwitcher[]{location, presents, countdown}, text);
    }

}
