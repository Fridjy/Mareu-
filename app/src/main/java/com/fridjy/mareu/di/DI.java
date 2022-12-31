package com.fridjy.mareu.di;

import com.fridjy.mareu.service.DummyMeetingsApiService;
import com.fridjy.mareu.service.MeetingsApiService;

/**
 * Dependency injector to get instances of services
 */
public class DI {
    private static MeetingsApiService sMeetingsApiService = new DummyMeetingsApiService();

    /**
     * get instance of @{@link MeetingsApiService}
     *
     * @return @{@link MeetingsApiService}
     */
    public static MeetingsApiService getMeetingsApiService() {
        return sMeetingsApiService;
    }

    /**
     * get a new instance of @{@link MeetingsApiService}
     *
     * @return @{@link MeetingsApiService}
     */
    public static MeetingsApiService getNewInstanceMeetingsApiService() {
        sMeetingsApiService = new DummyMeetingsApiService();
        return sMeetingsApiService;
    }
}
