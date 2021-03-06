/*
 * Copyright 2017 Julian Ostarek
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.julianostarek.music.databases;

import android.provider.BaseColumns;

public class PlaybackStatisticsContract {

    public PlaybackStatisticsContract() {
    }

    public static class PlaybackStatisticsEntry implements BaseColumns {
        public static final String TABLE_NAME = "playback_statistics";
        public static final String COLUMN_NAME_MEDIA_ID = "media_id";
        public static final String COLUMN_NAME_PLAYED_VALUE = "played_value";
    }

}
